package framework.util;

import io.restassured.response.ValidatableResponse;


/**
 * This is API level validations like status/content type
 * @author Biswajit Sundara
 * @date 21/07/2021
 *
 */
public class RespValidators {

	private ValidatableResponse valResp;

	public RespValidators(ValidatableResponse valResp){
		this.valResp = valResp;
	}

	public void successStatus() {
		valResp.statusCode(200);
	}
	
	public void contentTypeJson() {
		valResp.contentType("application/json");
	}

}
