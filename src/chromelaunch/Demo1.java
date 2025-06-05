package chromelaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Driver/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("1st Line");
		System.out.println("2nd Line");
	}

}
