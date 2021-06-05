package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAccount {
    public void setUp() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/index.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr331784");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("hello@123");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();

        //Nhap sai CustomerID thi quay ve nhap lai
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("54850");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")).sendKeys("Current");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("12000");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        //Nhap sai thi chon reset nhap lai
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("54850");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")).sendKeys("Current");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("12000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
        //Bo trong thi thong bao nhap lai
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("54850");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")).sendKeys("Current");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        //Nhap dung thi cho phep tao account
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("54840");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")).sendKeys("Current");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("12000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        NewAccount test = new NewAccount();
        test.setUp();
    }
}
