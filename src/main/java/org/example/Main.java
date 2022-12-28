package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.Wait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        // init webdriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Martin\\IdeaProjects\\capstone_project\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //set URL
        driver.get("https://www.demoblaze.com/");

        //get page title
        String PageTitle = driver.getTitle();
        System.out.println(PageTitle);
        // SR-12111 When opening home page (https://www.demoblaze.com/) there must be three categories displayed
        System.out.println("***************************************");
        System.out.println("SR-12111");

        // check if elements exist
        String cat =driver.findElement(By.id("cat")).getText();
        System.out.println(cat);
        Thread.sleep(10);

        // check categories
        List <WebElement> elements = driver.findElements(By.id("itemc"));
        for (WebElement element : elements) {
            System.out.println("Item: " + element.getText());
        }
        //verify if exists
        List<WebElement> verify = driver.findElements(By.id("itemc"));
        for (WebElement present : verify){
            if (present.getText().contains("Phones")){
                System.out.println("Phones exists");
            }
            if (present.getText().contains("Laptops")){
                System.out.println("Laptops exists");
            }
            if (present.getText().contains("Monitors")){
                System.out.println("Monitors exists");
            }

        }
        //SR-12120 Clicking any of the products in the catalog displayed in the homepage will display
        WebElement texto = driver.findElement(By.linkText("Nokia lumia 1520"));
        texto.click();
        //SR-12121 Clicking add to cart button will display browser alert with below information
        //WebElement cart = driver.findElement(By.xpath("//[@id"));
        Thread.sleep(3000);
        WebElement btncart = driver.findElement(By.linkText("Add to cart"));
        //texto.click();

        btncart.click();


        WebElement cart = driver.findElement(By.linkText("Cart"));
        //texto.click();

        cart.click();
        //SR-12130 Clicking the cart link will display below information






    }
}