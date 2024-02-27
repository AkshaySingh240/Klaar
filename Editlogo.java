package logo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import field.Select;

public class Editlogo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "/path/to/chromedriver");
		String baseURL = "https://dev.klaarhq.com";
        WebDriver driver = new ChromeDriver();
        
	    WebElement login = driver.findElement(By.xpath("//div[@data-cy='login-with-klaar-button']")).login-with-klaar-button.click(); 
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='email-field']")).sendKeys("deepa.nayak@gamma.klaar.team");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("Klaar2021"); 
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='login-btn']")).login-btn.click();
        
        
        driver.findElement(By.xpath("//button[@data-cy='settings-nav-menu-button']"))
        driver.findElement(By.xpath("//a[@href='/settings/workspace/details']")).click(); 
        
        
        String expectedTitle = "Workspace";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Page title is correct: " + expectedTitle);
        } else {
            System.out.println("Page title is incorrect. Expected: " + expectedTitle + ", Actual: " + actualTitle);
        }
        
     // Perform functionality testing (e.g., click buttons, fill forms, etc.)
        Select dropdown = new Select(driver.findElement(By.xpath("//nz-select[@data-cy='settings-select-organization-head-dropdown-area']")));
        dropdown.selectByVisibleText("Akshay");
        

        WebElement chooseFilesButton = driver.findElement(By.xpath("//div[@class='ant-upload ant-upload-btn']")); 
        chooseFilesButton.sendKeys("C:\\Users\\hp\\Desktop\\Solar.png");        
        
        WebElement saveButton = driver.findElement(By.xpath("//button[@data-cy='settings-workspace-logo-save-upload-button']"));
        saveButton.click();
        
        WebElement editButton = driver.findElement(By.xpath("//button[@data-cy='settings-workspace-logo-edit-button']"));
        editButton.click();
        editButton.sendKeys("C:\\Users\\hp\\Desktop\\Solar.png");
        
        WebElement newLogo = driver.findElement(By.xpath("//img[@alt='Workspace Logo']"));
        if(newLogo.isDisplayed()) {
            System.out.println("Logo updated successfully.");
        } else {
            System.out.println("Failed to update logo.");
        }
                
        
        WebElement deleteButton = driver.findElement(By.xpath("//button[@data-cy='settings-workspace-logo-delete-button']"));
        deleteButton.click();
        
        WebElement deleteButton = driver.findElement(By.xpath("//button[@data-cy='settings-workspace-logo-confirm-delete-button']"));
        deleteButton.click();
        
        driver.quit();
        
        
        
      
		// TODO Auto-generated method stub

	}

}
