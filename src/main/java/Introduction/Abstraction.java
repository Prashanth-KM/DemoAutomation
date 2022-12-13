package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

interface B{
    void add();
    void sub();
  abstract void display();
}
class A implements B{

    public void add() {

    }

    public void sub() {

    }

    public void display() {

    }
}

public class Abstraction {

    public static void main(String[] args) {
      A obj= new A();
      obj.add();
      obj.display();
      obj.sub();

      B obj1= new A();

        WebDriver driver= new ChromeDriver();
        WebElement element= driver.findElement(By.id(""));

    }
}

//abstract class
//1. 0 to 100 % abstraction




//interface
//100 % abstraction
