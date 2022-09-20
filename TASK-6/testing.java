package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Test {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.thesparksfoundationsingapore.org/";
        driver.manage().window().maximize();
        driver.get(url);
       if(driver.getTitle().contains("The Sparks Foundation")) 
				System.out.println("Title exists, title: " + driver.getTitle());
		  else 
				System.out.println("Title is not the same as expected.");
				
        Thread.sleep(7000);
        if(driver.findElement(By.xpath("//img[@src='/images/logo_small.png']")) != null) {
        	
				System.out.println("Logo exists.");
				
			}
		  else {
			  
				System.out.println("Logo does not exist.");
				
			}
        boolean navDisplayed = driver.findElement(By.tagName("nav")).isDisplayed();
		System.out.println("Navigation bar appears: " + navDisplayed);
		driver.findElement(By.linkText("2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("3")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("4")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("5")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("6")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("1")).click();
		Thread.sleep(1000);
	    driver.findElement(By.linkText("LINKS")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("AI in Education")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Resume Writing")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Contact Us")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("GRIP (Internship)")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Why Join Us")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("Name")).sendKeys("CHAITANYA KRISHNA PEDDI");
        Thread.sleep(5000);
        driver.findElement(By.name("Email")).sendKeys("chaitanya26peddi@gmail.com");
        Thread.sleep(5000);
        Select dropdown = new Select(driver.findElement(By.className("form-control")));
		dropdown.selectByVisibleText("Volunteer");
		Thread.sleep(5000);
		dropdown.selectByVisibleText("Advisor");
        driver.findElement(By.linkText("Brand Ambassador")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Expert Mentor")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Events Volunteer")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Management Volunteer")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("AINE AI")).click();
		Thread.sleep(7000);
        driver.findElement(By.linkText("Jobs at Tech in Asia Portal")).click();
        Thread.sleep(7000);
        driver.findElement(By.linkText("Jobs at Angel.co Portal")).click();
        Thread.sleep(7000);
        driver.findElement(By.linkText("The Sparks Foundation (Global)")).click();
        Thread.sleep(7000);
        driver.findElement(By.linkText("Internships at Internshala")).click();
        Thread.sleep(7000);
        driver.close();
        System.out.println("TESTING WAS SUCCESSFUL");
        driver.quit();
       
	}

}
