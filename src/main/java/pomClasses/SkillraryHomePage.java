package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**This class contains elements and respective business libraries of Skillrary Home Page
 * @author Vineeth
 *
 */
public class SkillraryHomePage {
//Declaration
	@FindBy(xpath="//img[@alt=\"SkillRary\"]")
	private WebElement logo;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsTab;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu')]/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement skillraryDemoAppLink;
	
	
	 
	
	//Initialization
	public SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	/**
	 * This Method returns SkillraryHome page logo
	 * @return
	 */
	public WebElement getLogo()
	{
		return logo;
	}
	/**
	 * This method is used to click on Gears Tab
	 */
	public void clickGearsTab()
	{
		gearsTab.click();
	}
	/**
	 * This method is used to click on Skillrary DemoApp Link
	 */
	public void clickSkillraryDemoAPP()
	{
		skillraryDemoAppLink.click();
	}
	
		
	}

