package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLabraries.WebDriverUtility;
/**
 * THis class contains elements and respective business libraries of skillraryDemo App particulars
 * @author Vineeth
 *
 */

public class SkillraryDemoAppPage {
//Declaration
	@FindBy(xpath="//a[@class=\"navbar-brand\"]")
	private WebElement logo;
	
	@FindBy(xpath="//a[@id=\"course\"]")
	private WebElement courseTab;
	
	@FindBy(xpath="//span/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	
	@FindBy(name="addresstype")
	private WebElement catagoryDD;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	//initialization
	public SkillraryDemoAppPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	/**
	 * This method is used to return text on the logo
	 * @return
	 */
	public String getLogoText()
	{
		return logo.getText();
	}
	/**
	 * This method is used to mouse hover on course tab
	 * @param web
	 */
	public void mouseHoverToCourse(WebDriverUtility web)
	{
		web.mouseOver(courseTab);
	}
	/**
	 * This method is used to click on Selenium Training
	 */
	public void clickSeleniumTraining()
	{
		seleniumTrainingLink.click();
	}
	/**
	 * This method is used to select category from drop down based on index
	 * @param web
	 * @param index
	 */
	public void selectCategory(WebDriverUtility web, int index)
	{
		web.dropdown(catagoryDD,index);
	}
	/**
	 * This  method is used to return contact us link 
	 * @return
	 */
	public WebElement getContactUs()
	{
		return contactUsLink;
	}
	/** 
	 * This method is used to click on contact us link
	 */
	public void clickContactUs()
	{
		contactUsLink.click();
	}
}
