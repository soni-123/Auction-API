package Auction_API;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateRate {
	
	@Test
	public void updateRate() {
		 String token="MDRkOWI1NmU4YTg1YzJlYjlmM2M3Yzk2Y2I5YTU1Y2MyZTExN2UxYmIyOWZkMzdkOGI4ZTY5NzhjOTNjYmE2OA";
		 File file=new File("Resources/update_rate.json");
		 given().header("Authorization", "Bearer "+token)
			.baseUri("https://app-sp.webkul.com/auction-api/public").contentType(ContentType.JSON)
		  	.body(file).				
	    when()
	    	.post("/api/update/rate").    	
	    then()
	    	.log().all().statusCode(200);     
	}

}
