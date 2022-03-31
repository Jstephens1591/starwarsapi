package SWapi;

	import io.restassured.RestAssured;
	import static io.restassured.RestAssured.given;
	public class base {
	    public static String Base(){
	        RestAssured.baseURI = "https://swapi.dev/api";
	        String res = given().log().all().get("/people").then().log().all().assertThat().statusCode(200).extract()
	                .response().asString();
	        return res;
	    }
	}


