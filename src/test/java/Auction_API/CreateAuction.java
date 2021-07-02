package Auction_API;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateAuction {
	
	@Test
	public void createAuction() {
		 String token="MDRkOWI1NmU4YTg1YzJlYjlmM2M3Yzk2Y2I5YTU1Y2MyZTExN2UxYmIyOWZkMzdkOGI4ZTY5NzhjOTNjYmE2OA";
		 File file=new File("Resources/create_auction.json");
		 given().header("Authorization", "Bearer "+token)
			.baseUri("https://app-sp.webkul.com/auction-api/public").contentType(ContentType.JSON)
		  	.body(file).				
	    when()
	    	.post("/api/auctions.json").    	
	    then()
	    	.log().all().statusCode(200);     
	}
}
