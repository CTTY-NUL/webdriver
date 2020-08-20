Selenium webdriver voor Chome

Ik heb de .JAR en Chromedriver.exe meegeleverd

https://chromedriver.chromium.org/downloads

I guess you are using selenium-java-2.25.0.jar.
 You should rather use selenium-server-standalone-2.25.0.jar, it will take care of all the dependencies (i.e. required jar files).

via https://www.npmjs.com/package/selenium-server-standalone-jar kwam ik op https://github.com/adamhooper/selenium-server-standalone-jar

hierin zat een .jar en toen heb ik een libs map aangemaakt, en in intellij met de rechtermuisknop add as library op de .JAR gedaan


Hier staat de uitleg van veel van de functionaliteit:
https://www.guru99.com/selenium-tutorial.html
