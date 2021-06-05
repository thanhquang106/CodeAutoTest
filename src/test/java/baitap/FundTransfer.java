package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FundTransfer {
    public void setUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/index.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr331784");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("hello@123");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();

        int accID1 = 93448;
        int accID2 = 93494;
        int idSai = 93445;
        //Bo trong textfield thong bao nhap lai
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys(""+accID1);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")).sendKeys(""+accID2);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys("1000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        //Nhap sai Account ID
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys(""+idSai);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")).sendKeys(""+accID2);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys("1000");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")).sendKeys("Tra tien");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        //Nhap sai reset nhap lai
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys(""+accID1);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")).sendKeys(""+accID2);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys("1000");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")).sendKeys("Tra tien");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input[2]")).click();
        //Tai khoan chuyen va nhan tien giong nhau
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys(""+accID1);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")).sendKeys(""+accID1);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys("100");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")).sendKeys("Tra tien");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        //Chuyen tien thanh cong
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys(""+accID1);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")).sendKeys(""+accID2);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys("100");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")).sendKeys("Tra tien");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input[1]")).click();
    }

    public static void main(String[] args) throws InterruptedException {
        FundTransfer test = new FundTransfer();
        test.setUp();
    }
}
