package Adduser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   String baseURL = "https://dev.klaarhq.com";
		   WebDriver driver = new ChromeDriver();
				
		   
		    WebElement login = driver.findElement(By.xpath("//div[@data-cy='login-with-klaar-button']")).login-with-klaar-button.click();
		    WebElement usernameInput = driver.findElement(By.xpath("//input[@id='email-field']")).sendKeys("deepa.nayak@gamma.klaar.team");
	        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("Klaar2021"); 
	        WebElement loginButton = driver.findElement(By.xpath("//button[@id='login-btn']")).login-btn.click();
	        
	        
	        driver.findElement(By.xpath("//button[@data-cy='profile-nav-menu-button']"))
	        driver.findElement(By.xpath("//a[@href='/settings/workspace/User-List']")).click(); 
 	        
	        
	        WebElement addUserButton = driver.findElement(By.xpath("//button[@data-cy='settings-user-list-add-user-button']"));
	        addUserButton.click()
	        
	        WebElement nameField = driver.findElement(By.xpath("//input[@data-cy='settings-add-user-full-name-text-field']"));
	        nameField.sendKeys("Mary");

	        WebElement emailField = driver.findElement(By.xpath("//input[@data-cy='settings-add-user-email-text-field']"));
	        emailField.sendKeys("mary@xyz.com");
	        
	        WebElement departmentfield = driver.findElement(By.xpath("//input[@data-cy='settings-add-user-email-text-field']"));
	        departmentfield.sendKeys("HR");
	        
	        
	        
	        WebElement addbutton = driver.findElement(By.xpath("//button[@data-cy='modal-submit-button']"));
	        saveButton.click();
	        
	        
	        
	        WebElement backbutton = driver.findElement(By.xpath("//button[@routerlink='/settings/workspace/User-List']']"));
	        backbutton.click();
	        
	        WebElement userRow = driver.findElement(By.xpath("//td[@data-cy='user-list-user-id-field']/tbody/tr[contains(td,'mary@xyz.com')]"));
	        if (userRow.isDisplayed()) {
	            System.out.println("User added successfully and visible in the user list table.");
	        } else {
	            System.out.println("Failed to add user or user not visible in the user list table.");
	        }
	        
	        
	        driver.quit();
	}

}
