package field;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class Customfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

	     
	        WebDriver driver = new ChromeDriver();

	        
	        driver.findElement(By.xpath("//button[@data-cy='profile-nav-menu-button']"))
	        driver.findElement(By.xpath("//a[@href='/settings/workspace/User-List']")).click(); 
 	       
	        driver.findElement(By.xpath("//div[@class='ant-tabs-tab ng-star-inserted ant-tabs-tab-active']")).click();

	         
	        driver.findElement(By.xpath("//button[@class='ant-btn tw-mr-4 ant-btn-primary']")).click();
	        
	        
	        driver.findElement(By.xpath("//input[@formcontrolname='fieldName']")).sendKeys("Date1");
	        
	        Select dropdown = new Select(driver.findElement(By.xpath("//nz-select[@formcontrolname='fieldType']")));
	        dropdown.selectByVisibleText("List");
	        
	        WebElement saveButton = driver.findElement(By.xpath("//button[@data-cy=\"modal-submit-button\"]"));
	        saveButton.click(); 

	        // Step 5: Verify that the added custom field is reflected in the user company details page
	        // Assuming verification logic here

	        WebElement dateField = driver.findElement(By.id("your_date_field_id")); 
	        String desiredDate = "02/27/2024";
	        dateField.sendKeys(desiredDate);
	        
	        driver.findElement(By.id("save-button")).click();

	        driver.get("https://dev.klaarhq.com/settings/workspace/User-List/user/edit/d299b176-5087-43ea-946d-d948be2036f8");
	        WebElement customField = driver.findElement(By.xpath("//input[@class=\"ng-tns-c177-1343 ng-pristine ng-valid ng-touched\"]"));
	        customField.clear();
	        customField.sendKeys("02/28/2024");
	        WebElement saveButton = driver.findElement(By.xpath("//button[@data-cy=\"settings-edit-user-save-button\"]"));
	        saveButton.click();
	     	           
	        
	        driver.findElement(By.xpath("//button[@class='ant-btn tw-mr-4 ant-btn-primary']")).click();
	        driver.findElement(By.xpath("//input[@formcontrolname='fieldName']")).sendKeys("List1");
	        driver.findElement(for select)
	        WebElement option1Input = driver.findElement(By.xpath("//button[@class='ant-btn tw-rounded-lg tw-text-purple4']")).sendKeys("R1");
	        WebElement option1Input = driver.findElement(By.xpath("//button[@class='ant-btn tw-rounded-lg tw-text-purple4']")).sendKeys("R2");
	        WebElement option1Input = driver.findElement(By.xpath("//button[@class='ant-btn tw-rounded-lg tw-text-purple4']")).sendKeys("R3");

	        WebElement saveButton = driver.findElement(By.xpath("//button[@data-cy=\"modal-submit-button\"]"));
	        saveButton.click(); 

	        
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement customFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='custom_field_container']/label[text()='Custom Field']")));
	        if(customFieldElement.isDisplayed()) {
	            System.out.println("Custom field is reflected in the user company details page.");
	        } else {
	            System.out.println("Custom field is not reflected in the user company details page.");
	        }
	       	       
	  
	        WebElement toggleSwitch = driver.findElement(By.id("toggle-switch"));
	        toggleSwitch.click();
	        //verification logic here
	        WebElement elementAfterToggle = driver.findElement(By.xpath(""));
	        String textAfterToggle = elementAfterToggle.getText();

	        if ("Expected_text_after_toggle".equals(textAfterToggle)) {
	            System.out.println("Toggle switch test passed!");
	        } else {
	            System.out.println("Toggle switch test failed!");
	        }

	        
	        driver.quit();
	}

}
