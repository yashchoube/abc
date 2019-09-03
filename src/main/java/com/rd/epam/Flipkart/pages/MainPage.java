package com.rd.epam.Flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class MainPage {

	WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Electronics')]")
	WebElement electronics;
	@FindBy(how = How.XPATH, using = "//a[@title='Mobiles']")
	WebElement mobiles;
	@FindBy(how = How.XPATH, using = "//a[@title='Mobile Accessories']")
	WebElement mobileAccessories;
	@FindBy(how = How.XPATH, using = "//a[@title='Laptops']")
	WebElement smartWearableTech;
	@FindBy(how = How.XPATH, using = "//a[@title='Televisions']")
	WebElement healthCareAppliances;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Deals of the Day')]")
	WebElement laptops;
	@FindBy(how = How.XPATH, using = "//a[@title='Desktop PCs']")
	WebElement desktopPCS;
	@FindBy(how = How.XPATH, using = "//a[@title='Gaming & Accessories']")
	WebElement gamesAndAccessories;
	@FindBy(how = How.XPATH, using = "//a[@title='Computer Accessories']")
	WebElement computerAccessories;
	@FindBy(how = How.XPATH, using = "//a[@title='Computer Peripherals']")
	WebElement computerPeripherals;
	@FindBy(how = How.XPATH, using = "//a[@title='Tablets']")
	WebElement tablets;
	@FindBy(how = How.XPATH, using = "//a[@title='Speakers']")
	WebElement speakers;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart Home Automation']")
	WebElement smartHomeAutomation;
	@FindBy(how = How.XPATH, using = "//a[@title='Camera']")
	WebElement camera;
	@FindBy(how = How.XPATH, using = "//a[@title='Camera Accessories']")
	WebElement cameraAccessories;
	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'TVs & Appliances')]")
	WebElement tVsAppliances;
	@FindBy(how = How.XPATH, using = "//a[@title='Television']")
	WebElement television;
	@FindBy(how = How.XPATH, using = "//a[@title='Android TVs']")
	WebElement androidTVs;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart & Ultra HD']")
	WebElement smartUltraHD;
	@FindBy(how = How.XPATH, using = "//a[@title='Washing Machine']")
	WebElement washingMachine;
	@FindBy(how = How.XPATH, using = "//a[@title='Air Conditioners']")
	WebElement airConditioners;
	@FindBy(how = How.XPATH, using = "//a[@title='Refrigerators']")
	WebElement refrigerators;
	@FindBy(how = How.XPATH, using = "//a[@title='Kitchen Appliances']")
	WebElement kitchenAppliances;
	@FindBy(how = How.XPATH, using = "//a[@title='Healthy Living Appliances']")
	WebElement healthyLivingAppliances;
	@FindBy(how = How.XPATH, using = "//a[@title='Small Home Appliances']")
	WebElement smallHomeAppliances;
	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Men')]")
	WebElement men;
	@FindBy(how = How.XPATH, using = "//a[@title='Footwear']")
	WebElement footwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Men's Grooming']")
	WebElement mensGrooming;
	@FindBy(how = How.XPATH, using = "//a[@title='Clothing']")
	WebElement clothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Top wear']")
	WebElement topWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Bottom wear']")
	WebElement bottomWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Ties, Socks, Caps & more']")
	WebElement tiesSocksCapsmore;
	@FindBy(how = How.XPATH, using = "//a[@title='Kurta, Pyjama & more']")
	WebElement kurtaPyjamamore;
	@FindBy(how = How.XPATH, using = "//a[@title='Fabrics']")
	WebElement fabrics;
	@FindBy(how = How.XPATH, using = "//a[@title='Seasonal Wear']")
	WebElement seasonalWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Sports wear']")
	WebElement sportsWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Innerwear & Sleepwear']")
	WebElement innerwearSleepwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Watches']")
	WebElement watches;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Sports & Fitness Store')]")
	WebElement sportsFitnessStore;
	@FindBy(how = How.XPATH, using = "//a[@title='Accessories']")
	WebElement accessories;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart Watches']")
	WebElement smartWatches;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart Bands']")
	WebElement smartBands;
	@FindBy(how = How.XPATH, using = "//a[@title='Personal Care Appliances']")
	WebElement personalCareAppliances;
	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Women')]")
	WebElement women;
	@FindBy(how = How.XPATH, using = "//a[@title='Clothing']")
	WebElement womenClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Western Wear']")
	WebElement westernWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Swim & Beachwear']")
	WebElement swimBeech;
	@FindBy(how = How.XPATH, using = "//a[@title='Winter & Seasonal Wear']")
	WebElement winterSeasonalWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Party Dresses']")
	WebElement partyDresses;
	@FindBy(how = How.XPATH, using = "//a[@title='Ethnic Wear']")
	WebElement ethnicWear;
	@FindBy(how = How.XPATH, using = "//a[@title='International Brands']")
	WebElement internationalBrands;
	@FindBy(how = How.XPATH, using = "//a[@title='Sports wear']")
	WebElement womenSportsWear;
	@FindBy(how = How.XPATH, using = "//a[@title='New arrivals !']")
	WebElement newArrivals;
	@FindBy(how = How.XPATH, using = "//a[@title='Under 499']")
	WebElement under499;
	@FindBy(how = How.XPATH, using = "//a[@title='Footwear']")
	WebElement womenFootwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Sandals']")
	WebElement sandals;
	@FindBy(how = How.XPATH, using = "//a[@title='Shoes']")
	WebElement womenShoes;
	@FindBy(how = How.XPATH, using = "//a[@title='Ballerinas']")
	WebElement ballerinas;
	@FindBy(how = How.XPATH, using = "//a[@title='Slippers & Flip- Flop's']")
	WebElement slippers;
//	@FindBy(how = How.XPATH, using = "//a[@title='Watches']")
//	WebElement watches;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart Watches']")
	WebElement womenSmartWatches;
	@FindBy(how = How.XPATH, using = "//a[@title='Personal Care Appliances']")
	WebElement personalCare;
	@FindBy(how = How.XPATH, using = "//a[@title='Beauty & Grooming']")
	WebElement beautyGrooming;
	@FindBy(how = How.XPATH, using = "//a[@title='Jewellery']")
	WebElement jewellery;
	@FindBy(how = How.XPATH, using = "//a[@title='Accessories']")
	WebElement womenAccessories;
	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Baby & Kids')]")
	WebElement babyKids;
	@FindBy(how = How.XPATH, using = "//a[@title='Kids Clothing']")
	WebElement kidsClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Boys' Clothing']")
	WebElement boysClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Girls' Clothing']")
	WebElement girlsClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Baby Boy Clothing']")
	WebElement babyBoyClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Baby Girl Clothing']")
	WebElement babyGirlClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Kids Footwear']")
	WebElement kidsFootwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Boys' Footwear']")
	WebElement boysFootwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Girls' Footwear']")
	WebElement girlsFootwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Baby Footwear']")
	WebElement babyFootwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Character Shoes']")
	WebElement characterShoes;
	@FindBy(how = How.XPATH, using = "//a[@title='Kids Winter Wear']")
	WebElement kidsWinterWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Toys']")
	WebElement toys;
	@FindBy(how = How.XPATH, using = "//a[@title='School Supplies']")
	WebElement schoolSupplies;
	@FindBy(how = How.XPATH, using = "//a[@title='Baby Care']")
	WebElement babyCare;
	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Home & Furniture')]")
	WebElement homeFurniture;
	@FindBy(how = How.XPATH, using = "//a[@title='Kitchen, Cookware & Serveware']")
	WebElement kitchenCookwareServeware;
	@FindBy(how = How.XPATH, using = "//a[@title='Tableware & Dinnerware']")
	WebElement tablewareDinnerware;
	@FindBy(how = How.XPATH, using = "//a[@title='Kitchen Storage']")
	WebElement kitchenStorage;

	@FindBy(how = How.XPATH, using = "//a[@title='Cleaning Supplies']")
	WebElement cleaningSupplies;

	@FindBy(how = How.XPATH, using = "//a[@title='Furniture']")
	WebElement furniture;

	@FindBy(how = How.XPATH, using = "//a[@title='Offers on Furniture']")
	WebElement offersonFurniture;

	@FindBy(how = How.XPATH, using = "//a[@title='Furniture Top Offers']")
	WebElement furnitureTopOffers;

	@FindBy(how = How.XPATH, using = "//a[@title='Furnishing']")
	WebElement furnishing;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart Home Automation']")
	WebElement furnitureSmartHomeAutomation;
	@FindBy(how = How.XPATH, using = "//a[@title='Home Improvement']")
	WebElement homeImprovement;
	@FindBy(how = How.XPATH, using = "//a[@title='Home Decor']")
	WebElement homeDecor;
	@FindBy(how = How.XPATH, using = "//a[@title='Home Lighting']")
	WebElement homeLighting;
	@FindBy(how = How.XPATH, using = "//a[@title='Festive Decor & Gifts']")
	WebElement festiveDecorGifts;
	@FindBy(how = How.XPATH, using = "//a[@title='Pet Supplies']")
	WebElement petSupplies;
	@FindBy(how = How.XPATH, using = "//a[@title='Durability Certified Furniture']")
	WebElement durabilityCertifiedFurniture;
	@FindBy(how = How.XPATH, using = "//a[@title='Rakhi & Rakhi Gifts']")
	WebElement rakhiRakhiGifts;
	@FindBy(how = How.XPATH, using = "//a[@title='Gardening Store']")
	WebElement gardeningStore;
	@FindBy(how = How.XPATH, using = "//a[@title='Perfect Home Store']")
	WebElement perfectHomeStore;

	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Sports, Books & More')]")
	WebElement sportsBooksMore;

	@FindBy(how = How.XPATH, using = "//a[@title='Food Essentials']")
	WebElement foodEssentials;
	@FindBy(how = How.XPATH, using = "//a[@title='Books']")
	WebElement books;
	@FindBy(how = How.XPATH, using = "//a[@title='Sports']")
	WebElement sports;
	@FindBy(how = How.XPATH, using = "//a[@title='Stationery']")
	WebElement stationery;
	@FindBy(how = How.XPATH, using = "//a[@title='Grocery (Only in Select Cities)']")
	WebElement groceryOnlyinCities;
	
	public void clickOnMobile() {
		mobiles.click();
	}

	public void clickOnMobileAccessories() {
		mobileAccessories.click();
	}
	
	
	public void clickOnSmartWearableTech() {
		smartWearableTech.click();
	}
	
	public void clickOnHealthCareAppliances() {
		healthCareAppliances.click();
	}
	public void clickOnLaptops() {
		laptops.click();
	}
	public void clickOnDesktopPCS() {
		desktopPCS.click();
	}
	public void clickOnGamesAndAccessories() {
		gamesAndAccessories.click();
	}
	public void clickOnComputerAccessories() {
		computerAccessories.click();
	}
	public void clickOnComputerPeripherals() {
		computerPeripherals.click();
	}
	public void clickOnTablets() {
		tablets.click();
	}
	public void clickOnSpeakers() {
		speakers.click();
	}
	public void clickOnSmartHomeAutomation() {
		smartHomeAutomation.click();
	}
	public void clickOnCamera() {
		camera.click();
	}
	public void clickOnCameraAccessories() {
		cameraAccessories.click();
	}
	public void clickOnTVsAppliances() {
		tVsAppliances.click();
	}
	public void clickOnTelevision() {
		television.click();
	}
	
	public void clickOnAndroidTVs() {
		androidTVs.click();
	}
	
	public void clickOnSmartUltraHD() {
		smartUltraHD.click();
	}
	
	public void clickOnWashingMachine() {
		washingMachine.click();
	}
	
	
	public void clickOnAirConditioners() {
		airConditioners.click();
	}
	
	
	public void clickOnRefrigerators() {
		refrigerators.click();
	}
	
	public void clickOnKitchenAppliances() {
		kitchenAppliances.click();
	}
	public void clickOnHealthyLivingAppliances() {
		healthyLivingAppliances.click();
	}
	
	public void clickOnSmallHomeAppliances() {
		smallHomeAppliances.click();
	}
	
	public void clickOnMen() {
		men.click();
	}
	
	
	public void clickOnFootwear() {
		footwear.click();
	}
	
	public void clickOnMensGrooming() {
		mensGrooming.click();
	}
	
	public void clickOnClothing() {
		clothing.click();
	}
	
	public void clickOnTopWear() {
		topWear.click();
	}
	
	public void clickOnBottomWear() {
		bottomWear.click();
	}
	
	public void clickOnTiesSocksCapsmore() {
		tiesSocksCapsmore.click();
	}
	
	public void clickOnKurtaPyjamamore() {
		kurtaPyjamamore.click();
	}
	
	public void clickOnFabrics() {
		fabrics.click();
	}
	
	public void clickOnSeasonalWear() {
		seasonalWear.click();
	}
	
	public void clickOnSportsWear() {
		sportsWear.click();
	}
	public void clickOnInnerwearSleepwear() {
		innerwearSleepwear.click();
	}
//	public void clickOnWatches() {
//		Watches.click();
//	}
	public void clickOnSportsFitnessStore() {
		sportsFitnessStore.click();
	}
	public void clickOnAccessories() {
		accessories.click();
	}
	public void clickOnSmartBands() {
		smartBands.click();
	}
	public void clickOnPersonalCareAppliances() {
		personalCareAppliances.click();
	}
	public void clickOnWomen() {
		women.click();
	}
	public void clickOnWomenClothing() {
		womenClothing.click();
	}
	public void clickOnWesternWear() {
		westernWear.click();
	}
	public void clickOnSwimBeech() {
		swimBeech.click();
	}
	
	public void clickOnWinterSeasonalWear() {
		winterSeasonalWear.click();
	}public void clickOnPartyDresses() {
		partyDresses.click();
	}
	public void clickOnEthnicWear() {
		ethnicWear.click();
	}
	public void clickOnInternationalBrands() {
		internationalBrands.click();
	}
	
	
	public void clickOnWomenSportsWear() {
		womenSportsWear.click();
	}
	
	public void clickOnNewArrivals() {
		newArrivals.click();
	}
	
	public void clickOnUnder499() {
		under499.click();
	}
	
	public void clickOnWomenFootwear() {
		womenFootwear.click();
	}
	
	public void clickOnSandals() {
		sandals.click();
	}
	
	public void clickOnWomenShoes() {
		womenShoes.click();
	}
	
	public void clickOnBallerinas() {
		ballerinas.click();
	}
	
	public void clickOnSlippers() {
		slippers.click();
	}
	
	public void clickOnWatches() {
		watches.click();
	}
	
	public void clickOnWomenSmartWatches() {
		womenSmartWatches.click();
	}
	
	public void clickOnPersonalCare() {
		personalCare.click();
	}
	
	public void clickOnBeautyGrooming() {
		beautyGrooming.click();
	}
	
	public void clickOnJewellery() {
		jewellery.click();
	}
	
	public void clickOnWomenAccessories() {
		womenAccessories.click();
	}
	
	
	public void clickOnBabyKids() {
		babyKids.click();
	}
	
	
	public void clickOnKidsClothing() {
		kidsClothing.click();
	}
	
	public void clickOnBoysClothing() {
		boysClothing.click();
	}
	
	public void clickOnGirlsClothing() {
		girlsClothing.click();
	}
	
	public void clickOnBabyBoyClothing() {
		babyBoyClothing.click();
	}
	
	public void BabyGirlClothing() {
		babyGirlClothing.click();
	}
	
	public void clickOnKidsFootwear() {
		kidsFootwear.click();
	}
	
	public void clickOnBoysFootwear() {
		boysFootwear.click();
	}
	
	public void clickOnGirlsFootwear() {
		girlsFootwear.click();
	}
	
	public void clickOnBabyFootwear() {
		babyFootwear.click();
	}
	
	public void clickOnCharacterShoes() {
		characterShoes.click();
	}
	
	public void clickOnKidsWinterWear() {
		kidsWinterWear.click();
	}
	
	public void clickOnToys() {
		toys.click();
	}
	public void clickOnSchoolSupplies() {
		schoolSupplies.click();
	}
	public void clickOnBabyCare() {
		babyCare.click();
	}
	public void clickOnHomeFurniture() {
		homeFurniture.click();
	}
	public void clickOnKitchenCookwareServeware() {
		kitchenCookwareServeware.click();
	}
	public void clickOnTablewareDinnerware() {
		tablewareDinnerware.click();
	}
	
	public void clickOnKitchenStorage() {
		kitchenStorage.click();
	}
	public void clickOnCleaningSupplies() {
		cleaningSupplies.click();
	}
	public void clickOnFurniture() {
		furniture.click();
	}
	public void clickOnOffersonFurniture() {
		offersonFurniture.click();
	}
	public void clickOnFurnitureTopOffers() {
		furnitureTopOffers.click();
	}
	public void clickOnFurnishing() {
		furnishing.click();
	}
	public void clickOnFurnitureSmartHomeAutomation() {
		furnitureSmartHomeAutomation.click();
	}
	public void clickOnHomeImprovement() {
		homeImprovement.click();
	}
	public void clickOnHomeDecor() {
		homeDecor.click();
	}
	public void clickOnHomeLighting() {
		homeLighting.click();
	}
	public void clickOnFestiveDecorGifts() {
		festiveDecorGifts.click();
	}
	public void clickOnPetSupplies() {
		petSupplies.click();
	}
	public void clickOnRakhiRakhiGifts() {
		rakhiRakhiGifts.click();
	}
	
	public void clickOnGardeningStore() {
		gardeningStore.click();
	}
	public void clickOnPerfectHomeStore() {
		perfectHomeStore.click();
	}
	public void clickOnSportsBooksMore() {
		sportsBooksMore.click();
	}
	public void clickOnFoodEssentials() {
		foodEssentials.click();
	}
	public void clickOnBooks() {
		books.click();
	}
	public void clickOnSports() {
		sports.click();
	}
	public void clickOnStationery() {
		stationery.click();
	}
	
	public void clickOnGroceryOnlyinCities() {
		groceryOnlyinCities.click();
	}
	public void clickOnElectronics() {
		electronics.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
