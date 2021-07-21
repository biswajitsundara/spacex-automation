package appl.tests;

import org.testng.annotations.BeforeTest;

import appl.api.APIDetails;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

/**
 * This is the base class for request and response spec builder
 * @author Biswajit Sundara
 * @date 21/07/2021
 *
 */
public class BaseTest {

	 RequestSpecification reqspec;
     ResponseSpecification resspec;

     @BeforeTest
     public void setup() {
          RequestSpecBuilder reqbuilder = new RequestSpecBuilder();
          reqbuilder.setBaseUri(APIDetails.baseUrl);
          reqspec = reqbuilder.build();

          ResponseSpecBuilder resbuilder = new ResponseSpecBuilder();
          resspec = resbuilder.build();

     }
}
