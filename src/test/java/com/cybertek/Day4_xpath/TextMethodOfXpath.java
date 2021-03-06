package com.cybertek.Day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextMethodOfXpath {
    public static void main(String[] args) {

        /*
        go to http://practice.cybertekschool.com/context_menu
        verify Context Menu is on the page

        Formula = tagName[text()='exact Text']

         */

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        //locate the element Context Menu

        WebElement text = driver.findElement(By.xpath("//h3[text()='Context Menu']"));

                String expected = "Context Menu";
        String actual = text.getText();

        if(expected.equals(actual)){
            System.out.println("Pass");

        }else {

            System.out.println("Fail");
        }

    }
}
