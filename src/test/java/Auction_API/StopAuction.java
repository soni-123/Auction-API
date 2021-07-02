package Auction_API;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class StopAuction {
	@Test
	public void stopAuction() {
		 String token="MDRkOWI1NmU4YTg1YzJlYjlmM2M3Yzk2Y2I5YTU1Y2MyZTExN2UxYmIyOWZkMzdkOGI4ZTY5NzhjOTNjYmE2OA";
		 File file=new File("Resources/stop_auction.json");
		given().header("Authorization", "Bearer "+token)
			.baseUri("https://app-sp.webkul.com/auction-api/public").contentType(ContentType.JSON)
		  	.body(file).				
	    when()
	    	.post("/api/stop/353131.json").    	
	    then()
	    	.log().all().statusCode(200);     
	}

}
