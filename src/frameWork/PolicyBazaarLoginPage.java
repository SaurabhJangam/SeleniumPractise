package frameWork;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazaarLoginPage {

//	Variable
	
	@FindBy(xpath = "//a[@class='sign-in']") private WebElement signInButtonHomePage;
	
	@FindBy (xpath = "(//input[@type='number'])[2]") private WebElement mobileNumberField;
	
	@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPass;
	
	@FindBy(name = "password") private WebElement passwordFields;
	
	@FindBy(xpath = "//span[text()='Sign in']") private WebElement SignInButton;
	
	@FindBy(xpath = "//div[@class='userprofile']") private WebElement myAccount;
	
	@FindBy(xpath = "//span[text()=' My profile ']") private WebElement myProfile;
	
	
//	Constructor
	
	public PolicyBazaarLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

//	methods
	
	public void clickOnSignInButton() {
		signInButtonHomePage.click();
	}
	
	public void enterMobNumber() {
		mobileNumberField.sendKeys("7972577435");
	}
	
	public void enterMobNumber(String mobNum) {
		mobileNumberField.sendKeys(mobNum);
	}
	
	public void clickOnSignInWithPasswordButton() {
		signInWithPass.click();
	}
	
	public void enterPassword() {
		passwordFields.sendKeys("SJ@123456");
	}
	
	public void enterPassword(String pass) {
		passwordFields.sendKeys(pass);
	}
	
	public void clickOnSignInButton2() {
		SignInButton.click();
	}
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	
	public void clickOnMyProfile() {
		myProfile.click();
	}

}
