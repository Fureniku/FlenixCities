package co.uk.silvania.city;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CityConfig {
	
    private String value;
	
	public static int escalatorID;
	public static int travellatorID;
	public static int atmID;
	public static int fridgeID;
	public static int largeFridgeID;
	public static int schoolDeskID;
	public static int floatingShelvesID;
	public static int toiletID;
	public static int vendingMachineID;
	public static int keyboardBlockID;
	public static int laptopBlockID;
	public static int monitorSmallID;
	public static int monitorStandingLargeID;
	public static int monitorWallLargeID;
	public static int mouseBlockID;
	public static int mouseKeyboardBlockID;
	public static int serverRackID;
	public static int pcBlockID;
	public static int filingCabinetID;
	public static int floorBlocksID;
	
	public static int rubyOreID;
	public static int silverOreID;
	public static int tecmoniumOreID;
	public static int titaniumOreID;
	public static int skyscraperBlocksID;
	public static int stainedGlassID;
	public static int stainedGlassLitID;
	public static int streetBlocksID;
	public static int styledGlassID;
	public static int styledGlassLitID;
	public static int woolCeilingTileID;
	public static int woolStoneID;
	public static int woolWoodID;
	public static int copperOreID;
	public static int tinOreID;
	public static int crystalOreID;
	public static int plasticBlockID;
	public static int computerTowerID;
	
	public static int coin1ID;
	public static int coin2ID;
	public static int coin5ID;
	public static int coin10ID;
	public static int coin25ID;
	public static int coin50ID;
	public static int coin100ID;
	public static int note100ID;
	public static int note200ID;
	public static int note500ID;
	public static int note1000ID;
	public static int note2000ID;
	public static int note5000ID;
	public static int note10000ID;
	public static int prePaidCardID;
	public static int debitCardID;
	public static int atmItemID;
	
	public static int heroinItemID;
	public static int weedItemID;
	public static int groundPoppyID;
	public static int tobaccoItemID;
	public static int rollingPaperID;
	public static int syringeItemID;
	public static int needleItemID;
	
	public static int foodBurgerID;
	public static int foodHotDogID;
	public static int foodPizzaID;
	public static int foodNoodlesID;
	public static int foodChocolateBarID;
	public static int foodCrispsID;
	public static int foodEnergyBarID;
	public static int foodCheeseID;
	public static int foodTomatoID;
	public static int foodDonutID;
	public static int foodSweetsID;
	public static int foodFriesID;
	public static int foodPopcornID;
	public static int foodIceCreamID;
	public static int foodChickenWingsID;
	public static int foodChickenNuggetsID;
	public static int drinkAppleJuiceID;
	public static int drinkColaID;
	public static int drinkOrangeJuiceID;
	public static int drinkWaterBottleID;
	public static int drinkMilkBottleID;
	public static int drinkEnergyDrinkID;
	public static int drinkMilkshakeID;
	public static int drinkCoffeeID;
	public static int drinkHotChocolateID;
	
	public static int smallBulletCasingID;
	public static int medBulletCasingID;
	public static int largeBulletCasingID;
	public static int gunBarrelID;
	public static int gunMagazineID;
	public static int gunTriggerMechanismID;
	public static int gunStockID;
	public static int gunPumpID;
	public static int plasticItemID;
	public static int smallPCBID;
	public static int largePCBID;
	public static int spentShotgunRoundID;
	public static int smallFossilID;
	public static int largeFossilID;
	public static int ringItemID;
	public static int diamondRingID;
	public static int necklaceItemID;
	public static int rubyNecklaceID;
	public static int ancientSlabID;
	public static int crushedCanID;
	public static int crushedPlasticBottleID;
	public static int chocolateWrapperID;
	public static int emptyCrispPacketID;
	public static int wastePackagingID;
	public static int rubyItemID;
	public static int titaniumIngotID;
	public static int tecmoniumIngotID;
	public static int silverIngotID;
	public static int copperIngotID;
	public static int tinIngotID;
	public static int trainTicketID;
	public static int theatreTicketID;
	public static int alligatorLeatherID;
	public static int baseballBatID;
	public static int baseballItemID;
	public static int americanFootballID;
	public static int tennisBallID;
	public static int soccerBallID;
	public static int tennisRacquetID;
	
	public static String currencyLarge;
	public static String currencySmall;
	public static String currencyLargePlural;
	public static String currencySmallPlural;
	
	public static boolean isAdultMode;
	public static boolean generateCopper;
	public static boolean generateTin;
	public static boolean generateSilver;
	public static boolean generateTitanium;
	public static boolean generateRuby;
	
	
	public static void loadConfig(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		escalatorID = config.getBlock("Escalator", 1400).getInt();
		travellatorID = config.getBlock("Travellator", 1401).getInt();
		atmID = config.getBlock("ATM", 1402).getInt();
		fridgeID = config.getBlock("Fridge", 1437).getInt();
		largeFridgeID = config.getBlock("Large Fridge", 1438).getInt();
		schoolDeskID = config.getBlock("School Desk", 1420).getInt();
		floatingShelvesID = config.getBlock("Floating Shelves", 1418).getInt();
		toiletID = config.getBlock("Toilet", 1419).getInt();
		vendingMachineID = config.getBlock("Vending Machine", 1426).getInt();
		keyboardBlockID = config.getBlock("Keyboard", 1427).getInt();
		laptopBlockID = config.getBlock("Laptop", 1428).getInt();
		monitorSmallID = config.getBlock("Monitor (Small)", 1429).getInt();
		monitorStandingLargeID = config.getBlock("Monitor (Large)", 1430).getInt();
		monitorWallLargeID = config.getBlock("Monitor (Large, Wall)", 1431).getInt();
		mouseBlockID = config.getBlock("Mouse", 1432).getInt();
		mouseKeyboardBlockID = config.getBlock("Mouse/Keyboard", 1433).getInt();
		serverRackID = config.getBlock("Server Rack", 1434).getInt();
		pcBlockID = config.getBlock("Personal Computer", 1435).getInt();
		filingCabinetID = config.getBlock("Filing Cabinet", 1436).getInt();
		
		rubyOreID = config.getBlock("Ruby Ore", 1403).getInt();
		silverOreID = config.getBlock("Silver Ore", 1404).getInt();
		tecmoniumOreID = config.getBlock("Tecmonium Ore", 1405).getInt();
		titaniumOreID = config.getBlock("Titanium Ore", 1406).getInt();
		skyscraperBlocksID = config.getBlock("Skyscraper Blocks", 1421).getInt();
		stainedGlassID = config.getBlock("Stained Glass", 1416).getInt();
		stainedGlassLitID = config.getBlock("Stained Glass Lit", 1417).getInt();
		streetBlocksID = config.getBlock("Street Blocks", 1422).getInt();
		styledGlassID = config.getBlock("Styled Glass", 1411).getInt();
		styledGlassLitID = config.getBlock("Styled Glass Lit", 1412).getInt();
		woolCeilingTileID = config.getBlock("Wool Ceiling Tile", 1413).getInt();
		woolStoneID = config.getBlock("Wool Stone", 1414).getInt();
		woolWoodID = config.getBlock("Wool Wood", 1415).getInt();
		copperOreID = config.getBlock("Copper Ore", 1407).getInt();
		tinOreID = config.getBlock("Tin Ore", 1408).getInt();
		crystalOreID = config.getBlock("Crystal Ore", 1409).getInt();
		plasticBlockID = config.getBlock("Plastic Block", 1424).getInt();
		computerTowerID = config.getBlock("Computer Tower", 1425).getInt();
		floorBlocksID = config.getBlock("Floor Blocks", 1440).getInt();
		
		coin1ID = config.getItem("Coin (1)", 18000).getInt();
		coin2ID = config.getItem("Coin (2)", 18001).getInt();
		coin5ID = config.getItem("Coin (5)", 18002).getInt();
		coin10ID = config.getItem("Coin (10)", 18003).getInt();
		coin25ID = config.getItem("Coin (25)", 18004).getInt();
		coin50ID = config.getItem("Coin (50)", 18005).getInt();
		coin100ID = config.getItem("Coin (100)", 18006).getInt();
		note100ID = config.getItem("Note (100)", 18007).getInt();
		note200ID = config.getItem("Note (200)", 18008).getInt();
		note500ID = config.getItem("Note (500)", 18009).getInt();
		note1000ID = config.getItem("Note (1,000)", 18010).getInt();
		note2000ID = config.getItem("Note (2,000)", 18011).getInt();
		note5000ID = config.getItem("Note (5,000)", 18012).getInt();
		note10000ID = config.getItem("Note (10,000)", 18013).getInt();
		prePaidCardID = config.getItem("Pre-Paid Card", 18014).getInt();
		debitCardID = config.getItem("Debit Card", 18015).getInt();
		atmItemID = config.getItem("ATM Item", 18016).getInt();
		
		foodBurgerID = config.getItem("Burger", 18020).getInt();
		foodHotDogID = config.getItem("Hot Dog", 18021).getInt();
		foodPizzaID = config.getItem("Pizza", 18022).getInt();
		foodNoodlesID = config.getItem("Noodles", 18023).getInt();
		foodChocolateBarID = config.getItem("Chocolate Bar", 18024).getInt();
		foodCrispsID = config.getItem("Crisps", 18025).getInt();
		foodEnergyBarID = config.getItem("Energy Bar", 18026).getInt();
		foodCheeseID = config.getItem("Cheese", 18027).getInt();
		foodTomatoID = config.getItem("Tomato", 18028).getInt();
		foodDonutID = config.getItem("Donut", 18029).getInt();
		foodSweetsID = config.getItem("Sweets", 18030).getInt();
		foodFriesID = config.getItem("Fries", 18031).getInt();
		foodPopcornID = config.getItem("Popcorn", 18032).getInt();
		foodIceCreamID = config.getItem("Ice Cream", 18033).getInt();
		foodChickenWingsID = config.getItem("Chicken Wings", 18034).getInt();
		foodChickenNuggetsID = config.getItem("Chicken Nuggets", 18035).getInt();
		drinkAppleJuiceID = config.getItem("Apple Juice", 18036).getInt();
		drinkColaID = config.getItem("Cola", 18037).getInt();
		drinkOrangeJuiceID = config.getItem("Orange Juice", 18038).getInt();
		drinkWaterBottleID = config.getItem("Water Bottle", 18039).getInt();
		drinkMilkBottleID = config.getItem("Milk Bottle", 18040).getInt();
		drinkEnergyDrinkID = config.getItem("Energy Drink", 18041).getInt();
		drinkMilkshakeID = config.getItem("Milkshake", 18042).getInt();
		drinkCoffeeID = config.getItem("Coffee", 18043).getInt();
		drinkHotChocolateID = config.getItem("Hot Chocolate", 18044).getInt();
		
		smallBulletCasingID = config.getItem("Small Bullet Casing", 18050).getInt();
		medBulletCasingID = config.getItem("Med Bullet Casing", 18051).getInt();
		largeBulletCasingID = config.getItem("Large Bullet Casing", 18052).getInt();
		gunBarrelID = config.getItem("Gun Barrel", 18053).getInt();
		gunMagazineID = config.getItem("Gun Mag", 18054).getInt();
		gunTriggerMechanismID = config.getItem("Gun Trigger Mech", 18055).getInt();
		gunStockID = config.getItem("Gun Stock", 18056).getInt();
		gunPumpID = config.getItem("Gun Pump", 18057).getInt();
		plasticItemID = config.getItem("Plastic", 18058).getInt();
		smallPCBID = config.getItem("Small PCB", 18059).getInt();
		largePCBID = config.getItem("Large PCB", 18060).getInt();
		spentShotgunRoundID = config.getItem("Empty Shotgun Shell", 18061).getInt();
		smallFossilID = config.getItem("Small Fossil", 18062).getInt();
		largeFossilID = config.getItem("Large Fossil", 18063).getInt();
		ringItemID = config.getItem("Ring Item", 18064).getInt();
		diamondRingID = config.getItem("Diamond Ring", 18065).getInt();
		necklaceItemID = config.getItem("Necklace", 18066).getInt();
		rubyNecklaceID = config.getItem("Ruby Necklace", 18067).getInt();
		ancientSlabID = config.getItem("Ancient Slab", 18068).getInt();
		crushedCanID = config.getItem("Crushed Can", 18069).getInt();
		crushedPlasticBottleID = config.getItem("Crushed Plastic Bottle", 18070).getInt();
		chocolateWrapperID = config.getItem("Chocolate Wrapper", 18071).getInt();
		emptyCrispPacketID = config.getItem("Empty Crisp Packet", 18072).getInt();
		wastePackagingID = config.getItem("Waste Packaging", 18073).getInt();
		rubyItemID = config.getItem("Ruby Item", 18074).getInt();
		titaniumIngotID = config.getItem("Titanium Ingot", 18075).getInt();
		tecmoniumIngotID = config.getItem("Tecmonium Ingot", 18076).getInt();
		silverIngotID = config.getItem("Silver Ingot", 18077).getInt();
		copperIngotID = config.getItem("Copper Ingot", 18078).getInt();
		tinIngotID = config.getItem("Tin Ingot", 18079).getInt();
		trainTicketID = config.getItem("Train Ticket", 18080).getInt();
		theatreTicketID = config.getItem("Theatre Ticket", 18081).getInt();
		alligatorLeatherID = config.getItem("Alligator Leather", 18082).getInt();
		baseballBatID = config.getItem("Baseball Bat", 18083).getInt();
		baseballItemID = config.getItem("Baseball", 18084).getInt();
		americanFootballID = config.getItem("American Football", 18085).getInt();
		tennisBallID = config.getItem("Tennis Ball", 18086).getInt();
		soccerBallID = config.getItem("Soccer Ball", 18087).getInt();
		tennisRacquetID = config.getItem("Tennis Racquet", 18088).getInt();
		
		currencySmall = config.get("Currency Small", Configuration.CATEGORY_GENERAL, "Cent").getString();
		currencyLarge = config.get("Currency Large", Configuration.CATEGORY_GENERAL, "Dollar").getString();
		currencySmallPlural = config.get("Currency Small (Plural)", Configuration.CATEGORY_GENERAL, "Cents").getString();
		currencyLargePlural = config.get("Currency Large (Plural)", Configuration.CATEGORY_GENERAL, "Dollars").getString();
		
		isAdultMode = config.get(Configuration.CATEGORY_GENERAL, "isAdultMode", false).getBoolean(false);
		generateCopper = config.get(Configuration.CATEGORY_GENERAL, "generateCopper", true).getBoolean(true);
		generateTin = config.get(Configuration.CATEGORY_GENERAL, "generateTin", true).getBoolean(true);
		generateTitanium = config.get(Configuration.CATEGORY_GENERAL, "generateTitanium", true).getBoolean(true);
		generateSilver = config.get(Configuration.CATEGORY_GENERAL, "generateSilver", true).getBoolean(true);
		generateRuby = config.get(Configuration.CATEGORY_GENERAL, "generateRuby", true).getBoolean(true);
		
		heroinItemID = config.getItem("Heroin", 18100).getInt();
		weedItemID = config.getItem("Weed", 18101).getInt();
		groundPoppyID = config.getItem("Ground Poppy", 18102).getInt();
		tobaccoItemID = config.getItem("Tobacco", 18103).getInt();
		rollingPaperID = config.getItem("Rolling Paper", 18104).getInt();
		syringeItemID = config.getItem("Syringe", 18105).getInt();
		needleItemID = config.getItem("Needle", 18106).getInt();
		
		config.save();
	}

}
