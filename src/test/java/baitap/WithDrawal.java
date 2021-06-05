package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithDrawal {
    public void setUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/index.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr331784");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("hello@123");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
        int accID1 = 93448;
        int idSai = 93455;
        //Bỏ trống thong bao nhap lai
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys(""+idSai);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("Rut tien");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        //Nhap sai Account ID thi nhap lai
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys(""+idSai);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")).sendKeys("10000");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("Rut tien");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        //Nhap sai thi reset
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys(""+accID1);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")).sendKeys("10");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("Rut tn");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[2]")).click();
        //Rut thanh cong
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys(""+accID1);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")).sendKeys("10000");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("Rut tien");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]")).click();
    }

    public static void main(String[] args) throws InterruptedException {
        WithDrawal test = new WithDrawal();
        test.setUp();
    }
}
