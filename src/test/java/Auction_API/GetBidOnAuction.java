package Auction_API;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetBidOnAuction {
	@Test
	public void getBidOnAuction() {
		String token="MDRkOWI1NmU4YTg1YzJlYjlmM2M3Yzk2Y2I5YTU1Y2MyZTExN2UxYmIyOWZkMzdkOGI4ZTY5NzhjOTNjYmE2OA";
		 
		Response res= given().header("Authorization", "Bearer "+token)
			.baseUri("https://app-sp.webkul.com/auction-api/public").contentType(ContentType.JSON).
	    when()
	    	.get("/api/bids/353131.json").
	    	
	    then()
			.extract().response();
		System.out.println(res.asString());
	}
}
