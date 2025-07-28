package ReadExcelData;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

public class UpdatePassed {

    String CsvPath = "C:\\Apache POI\\CSVTestData.csv";
    WebDriver driver;

    @BeforeTest
    public void setup() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
    }

    @Test
    public void locatorsTestingBlog() throws Exception {
        CSVReader reader = new CSVReader(new FileReader(CsvPath));
        List<String[]> allRows = reader.readAll();
        reader.close();

        List<String[]> updatedRows = new ArrayList<>();

        for (int i = 0; i < allRows.size(); i++) {
            String[] csvCell = allRows.get(i);

            // If header row, just keep it as is (or add "Status" column)
            if (i == 0) {
                String[] header = new String[csvCell.length + 1];
                System.arraycopy(csvCell, 0, header, 0, csvCell.length);
                header[csvCell.length] = "Status";
                updatedRows.add(header);
                continue;
            }

            String FName = csvCell[0];
            String LName = csvCell[1];
            String Email = csvCell[2];
            String MNum = csvCell[3];
            String CName = csvCell[4];

            // Fill the form
            driver.findElement(By.name("FirstName")).clear();
            driver.findElement(By.name("FirstName")).sendKeys(FName);

            driver.findElement(By.name("LastName")).clear();
            driver.findElement(By.name("LastName")).sendKeys(LName);

            driver.findElement(By.name("EmailID")).clear();
            driver.findElement(By.name("EmailID")).sendKeys(Email);

            driver.findElement(By.name("MobNo")).clear();
            driver.findElement(By.name("MobNo")).sendKeys(MNum);

            driver.findElement(By.name("Company")).clear();
            driver.findElement(By.name("Company")).sendKeys(CName);

            Thread.sleep(2000);

            // Add "Passed" status to row
            String[] updatedRow = new String[csvCell.length + 1];
            System.arraycopy(csvCell, 0, updatedRow, 0, csvCell.length);
            updatedRow[csvCell.length] = "Passed";

            updatedRows.add(updatedRow);
        }

        // Overwrite the CSV with updated rows
        CSVWriter writer = new CSVWriter(new FileWriter(CsvPath));
        writer.writeAll(updatedRows);
        writer.close();
    }
}
