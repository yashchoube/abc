package com.rd.epam.Flipkart.testCases;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rd.epam.Flipkart.pages.MainPage;

public class MainPageTest {

	WebDriver driver;
	MainPage mainPage;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void check() {
		driver.get("https://www.flipkart.com/search");
		mainPage = PageFactory.initElements(driver, MainPage.class);
		mainPage.clickOnWomen();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mainPage.clickOnWomenShoes();

	}

	@Test
	void testMobile() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles");
	}

	@Test
	void testMobileAccessories() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mobile-accessories/pr?sid=tyy,4mr&otracker=nmenu_sub_Electronics_0_Mobile%20Accessories");
	}

	@Test
	void testMobileSmartWearableTech() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/smart-wearables-store?otracker=nmenu_sub_Electronics_0_Smart%20Wearable%20Tech");

	}

	public void testOnHealthCareAppliances() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/health-and-appliances-store?otracker=nmenu_sub_Electronics_0_Health%20Care%20Appliances");
	}

	public void testOnLaptops() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/laptops-store?otracker=nmenu_sub_Electronics_0_Laptops");
	}

	public void testOnDesktopPCS() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/desktop-pc-store?otracker=nmenu_sub_Electronics_0_Desktop%20PCs");
	}

	public void testOnGamesAndAccessories() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/gaming-store?otracker=nmenu_sub_Electronics_0_Gaming%20%26%20Accessories");
	}

	public void testOnComputerAccessories() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/computer-accessories-store?otracker=nmenu_sub_Electronics_0_Computer%20Accessories");
	}

	public void testOnComputerPeripherals() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/peripherals-store?otracker=nmenu_sub_Electronics_0_Computer%20Peripherals");
	}

	public void testOnTablets() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/tablets-store?otracker=nmenu_sub_Electronics_0_Tablets");
	}

	public void testOnSpeakers() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/audio-video/speakers/pr?sid=0pm%2C0o7&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&otracker=categorytree&p%5B%5D=facets.serviceability%5B%5D%3Dtrue&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&otracker=nmenu_sub_Electronics_0_Speakers");

	}

	public void testOnSmartHomeAutomation() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/smart-home-automation-store?otracker=nmenu_sub_Electronics_0_Smart%20Home%20Automation");

	}

	public void testOnCamera() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/camera-clp-store?otracker=nmenu_sub_Electronics_0_Camera");

	}

	public void testOnCameraAccessories() {
		mainPage.clickOnElectronics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/cameras-accessories-store?otracker=nmenu_sub_Electronics_0_Camera%20Accessories");

	}
	// public void clickOnTVsAppliances() {
	// mainPage.clickOnElectronics();
	// assertEquals(driver.getCurrentUrl().toString(),"https://www.flipkart.com/smart-home-automation-store?otracker=nmenu_sub_Electronics_0_Smart%20Home%20Automation");

	// }
	public void testOnTelevision() {
		mainPage.clickOnTVsAppliances();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/television-store?otracker=nmenu_sub_TVs%20and%20Appliances_0_Televisions&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Television");

	}

	public void testOnAndroidTVs() {
		mainPage.clickOnTVsAppliances();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/television-store?otracker=nmenu_sub_TVs%20and%20Appliances_0_Televisions&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Television");

	}

	public void testOnSmartUltraHD() {
		mainPage.clickOnTVsAppliances();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/search?count=40&otracker=CLP_filters&p%5B%5D=facets.smart_tv%255B%255D%3DYes&p%5B%5D=facets.resolution%255B%255D%3DUltra%2BHD%2B%25284K%2529&sid=ckf%2Fczl&otracker=nmenu_sub_TVs%20and%20Appliances_0_Smart%20and%20Ultra%20HD&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Smart%20%26%20Ultra%20HD");

	}

	public void testOnWashingMachine() {
		mainPage.clickOnTVsAppliances();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/washing-machine-store?otracker=nmenu_sub_TVs%20%26%20Appliances_0_Washing%20Machine");

	}

	public void testOnAirConditioners() {
		mainPage.clickOnTVsAppliances();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/air-conditioners/pr?sid=j9e%2Cabm%2Cc54&p%5B%5D=facets.serviceability%5B%5D%3Dtrue&otracker=categorytree&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Air%20Conditioners");

	}

	public void testOnRefrigerators() {
		mainPage.clickOnTVsAppliances();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/refrigerator-store?otracker=nmenu_sub_TVs%20%26%20Appliances_0_Refrigerators");

	}

	public void testOnKitchenAppliances() {
		mainPage.clickOnTVsAppliances();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/kitchen-appliances-store?otracker=nmenu_sub_Appliances_0_Kitchen%20Appliances&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Kitchen%20Appliances");

	}

	public void testOnHealthyLivingAppliances() {
		mainPage.clickOnTVsAppliances();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/home-kitchen/~appliances-for-a-healthy-living/pr?sid=j9e&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Healthy%20Living%20Appliances");

	}

	public void testOnSmallHomeAppliances() {
		mainPage.clickOnTVsAppliances();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/home-appliance-store?otracker=nmenu_sub_Appliances_0_Small%20Home%20Appliances&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Small%20Home%20Appliances");
	}

	public void clickOnFootwear() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"flipkart.com/mens-footwear/pr?sid=osp,cil&otracker=nmenu_sub_Men_0_Footwear");

	}

	public void clickOnMensGrooming() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-grooming-store?otracker=nmenu_sub_Men_0_Men%27s%20Grooming");
	}

	public void clickOnClothing() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/pr?sid=2oq,s9b&otracker=categorytree&otracker=nmenu_sub_Men_0_Clothing");
	}

	public void clickOnTopWear() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/~mens-top-wear/pr?sid=2oq%2Cs9b&otracker=nmenu_sub_Men_0_Top%20wear");
	}

	public void clickOnBottomWear() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/~mens-bottom-wear/pr?sid=2oq%2Cs9b&otracker=nmenu_sub_Men_0_Bottom%20wear");
	}

	public void clickOnTiesSocksCapsmore() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/accessories-combo-sets/pr?sid=2oq,s9b,8jf&otracker=nmenu_sub_Men_0_Ties%2C%20Socks%2C%20Caps%20%26%20more");
	}

	public void clickOnKurtaPyjamamore() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/ethnic-wear/pr?sid=2oq,s9b,3a0&otracker=nmenu_sub_Men_0_Kurta%2C%20Pyjama%20%26%20more");
	}

	public void clickOnFabrics() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/fabrics/pr?sid=2oq,s9b,9hz&otracker=nmenu_sub_Men_0_Fabrics");
	}

	public void clickOnSeasonalWear() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/winter-seasonal-wear/pr?sid=2oq,s9b,qgu&otracker=nmenu_sub_Men_0_Seasonal%20Wear");
	}

	public void clickOnSportsWear() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/sports-wear/pr?sid=2oq,s9b,6gr&otracker=nmenu_sub_Men_0_Sports%20wear");
	}

	public void clickOnInnerwearSleepwear() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/inner-wear-sleep-wear/pr?sid=2oq,s9b,b1a&otracker=nmenu_sub_Men_0_Innerwear%20%26%20Sleepwear");
	}

	public void clickOnWatches() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-watches-store?otracker=nmenu_sub_Men_0_Watches");
	}

	public void clickOnSportsFitnessStore() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/sport-store?otracker=nmenu_sub_Men_0_Sports%20%26%20Fitness%20Store");
	}

	public void clickOnAccessories() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-bags-wallet-store?otracker=nmenu_sub_Men_0_Accessories");
	}

	public void clickOnSmartBands() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/wearable-smart-devices/smart-bands/pr?sid=ajy,q7p&otracker=nmenu_sub_Men_0_Smart%20Bands");
	}

	public void clickOnPersonalCareAppliances() {
		mainPage.clickOnMen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/personal-care-appliances-men-store?otracker=nmenu_sub_Men_0_Personal%20Care%20Appliances");
	}

//	public void clickOnWomen() {
//		mainPage.clickOnWomen();
//		assertEquals(driver.getCurrentUrl().toString(),"https://www.flipkart.com/personal-care-appliances-men-store?otracker=nmenu_sub_Men_0_Personal%20Care%20Appliances");
//
//	}
	public void clickOnWomenClothing() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/pr?sid=2oq,c1r&otracker=categorytree&otracker=nmenu_sub_Women_0_Clothing");
	}

	public void clickOnWesternWear() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/western-wear/pr?sid=2oq,c1r,ha6&p[]=facets.serviceability%5B%5D%3Dtrue&otracker=categorytree&otracker=nmenu_sub_Women_0_Western%20Wear");

	}

	public void clickOnSwimBeech() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/lingerie-sleep-swimwear/swim-beach-wear/pr?sid=2oq,c1r,tbt,wg3&p[]=facets.serviceability%5B%5D%3Dtrue&otracker=categorytree&otracker=nmenu_sub_Women_0_Swim%20%26%20Beachwear");

	}

	public void clickOnWinterSeasonalWear() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/winter-seasonal-wear/pr?sid=2oq,c1r,67x&otracker=nmenu_sub_Women_0_Winter%20and%20Seasonal%20Wear&otracker=nmenu_sub_Women_0_Winter%20%26%20Seasonal%20Wear&otracker=nmenu_sub_Women_0_Winter%20%26%20Seasonal%20Wear");

	}

	public void clickOnPartyDresses() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/women/dresses/party~occasion/pr?sid=2oq,c1r,ha6,xzt,3y0&otracker=nmenu_sub_Women_0_Party%20Dresses");

	}

	public void clickOnEthnicWear() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/ethnic-wear/pr?sid=2oq,c1r,3pj&otracker=nmenu_sub_Women_0_Ethnic%20Wear&otracker=nmenu_sub_Women_0_Ethnic%20Wear");

	}

	public void clickOnInternationalBrands() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/pr?sid=2oq%2Cc1r&otracker=categorytree&p%5B%5D=facets.brand%255B%255D%3DVero%2BModa&p%5B%5D=facets.brand%255B%255D%3DOnly&p%5B%5D=facets.brand%255B%255D%3DLevi%2527s&p%5B%5D=facets.brand%255B%255D%3DPepe%2BJeans&p%5B%5D=facets.brand%255B%255D%3DLee&p%5B%5D=facets.brand%255B%255D%3DForever%2B21&p%5B%5D=facets.brand%255B%255D%3DADIDAS&p%5B%5D=facets.brand%255B%255D%3DPuma&p%5B%5D=facets.brand%255B%255D%3DNike&p%5B%5D=facets.brand%255B%255D%3DUnited%2BColors%2Bof%2BBenetton&otracker=nmenu_sub_Women_0_International%20Brands");
	}

	public void clickOnWomenSportsWear() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/sports-gym-wear/pr?sid=2oq,c1r,6p8&otracker=nmenu_sub_Women_0_Sports%20Wear&otracker=nmenu_sub_Women_0_Sports%20Wear");

	}

	public void clickOnNewArrivals() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/pr?count=40&otracker=categorytree&p%5B%5D=facets.brand%255B%255D%3DRemanika&p%5B%5D=facets.brand%255B%255D%3DRain%2Band%2Brainbow&p%5B%5D=facets.brand%255B%255D%3DRain%2Band%2BRainbow&p%5B%5D=facets.brand%255B%255D%3DNGT&p%5B%5D=facets.brand%255B%255D%3DPAMO&p%5B%5D=facets.brand%255B%255D%3DLGC&p%5B%5D=facets.brand%255B%255D%3DQuttos&sid=2oq%2Fc1r&otracker=nmenu_sub_Women_0_New%20arrivals%20!");
	}

	public void clickOnUnder499() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/pr?otracker=categorytree&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D500&sid=2oq%2Fc1r&otracker=nmenu_sub_Women_0_Under%20499&otracker=nmenu_sub_Women_0_Under%20499");
	}

	public void clickOnWomenFootwear() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-footwear/pr?sid=osp,iko&otracker=nmenu_sub_Women_0_Footwear");
	}

	public void clickOnSandals() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-footwear/~womens-sandals/pr?sid=osp,iko&otracker=nmenu_sub_Women_0_Sandals");
	}

	public void clickOnWomenShoes() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-footwear/~sports-casual-shoes/pr?&sid=osp%2Ciko&otracker=nmenu_sub_Women_0_Shoes");
	}

	public void clickOnBallerinas() {

		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-footwear/ballerinas/pr?sid=osp,iko,974&otracker=nmenu_sub_Women_0_Ballerinas");
	}

	public void clickOnSlippers() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-footwear/slippers-flip-flops/pr?sid=osp,iko,iz7&otracker=nmenu_sub_Women_0_Slippers%20%26%20Flip-%20Flop%27s");
	}

//	public void clickOnWatches() {
//		mainPage.clickOnWomen();
//		assertEquals(driver.getCurrentUrl().toString(),"https://www.flipkart.com/womens-watches-store?otracker=nmenu_sub_Women_0_Watches");
//	}

	public void clickOnWomenSmartWatches() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/wearable-smart-devices/smart-watches/pr?sid=ajy,buh&p%5B%5D=facets.filter_standard%255B%255D%3D1&facets.availability[]=Exclude+Out+of+Stock&otracker=CLP_lhs&otracker=nmenu_sub_Women_0_Smart%20Watches");
	}

	public void clickOnPersonalCare() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/health-personal-care-appliances/personal-care-appliances/~personalcareforwomen/pr?sid=zlw%2C79s&otracker=nmenu_sub_Women_0_Personal%20Care%20Appliances");
	}

	public void clickOnBeautyGrooming() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/beauty-and-grooming/pr?sid=g9b&p[]=facets.serviceability%5B%5D%3Dtrue&otracker=categorytree&otracker=nmenu_sub_Women_0_Beauty%20%26%20Grooming");
	}

	public void clickOnJewellery() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/jewellery/pr?sid=mcr&otracker=nmenu_sub_Women_0_Jewellery");
	}

	public void clickOnWomenAccessories() {
		mainPage.clickOnWomen();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/women-handbags-store?otracker=nmenu_sub_Women_0_Accessories");
	}

	@AfterMethod
	public void screenShot(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
				Date date = new Date();
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("D:\\" + result.getName() + "dateFormat.format(date)" + ".png"));
				System.out.println("Successfully captured a screenshot");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
	}

}
