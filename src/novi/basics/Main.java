package novi.basics;


import org.openqa.selenium.WebDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {
        //https://chromedriver.chromium.org/downloads
        //I guess you are using selenium-java-2.25.0.jar.
        // You should rather use selenium-server-standalone-2.25.0.jar, it will take care of all the dependencies (i.e. required jar files).
        //https://github.com/adamhooper/selenium-server-standalone-jar
        //hierin zat een .jar en toen heb ik een libs map aangemaakt, en in intellij met de rechtermuisknop add as library op de .JAR gedaan
        //https://www.guru99.com/selenium-tutorial.html

        // declaration and instantiation of objects/variables
//        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Chrome
        driver.close();

    }

}
