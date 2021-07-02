package Auction_API;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAuction {
	
	@Test
	public void getAuction() {
		 String token="MDRkOWI1NmU4YTg1YzJlYjlmM2M3Yzk2Y2I5YTU1Y2MyZTExN2UxYmIyOWZkMzdkOGI4ZTY5NzhjOTNjYmE2OA";
		 
			Response res= given().header("Authorization", "Bearer "+token)
				.baseUri("https://app-sp.webkul.com/auction-api/public").contentType(ContentType.JSON).
		    when()
		    	.get("/api/auctions.json").
		    	
		    then()
				.extract().response();
			System.out.println(res.asString());
			
			System.out.println("Response time to get all auction: "+res.getTime());
			List<Long> idList = res.jsonPath().getList("auctions.id");
			System.out.println("Total auction count: "+idList);
		
			
	}

}
