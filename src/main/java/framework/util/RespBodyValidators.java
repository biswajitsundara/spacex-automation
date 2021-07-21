package framework.util;

import io.restassured.path.json.JsonPath;


/**
 * This is the response body validator
 * @author Biswajit Sundara
 * @date 21/07/2021
 *
 */
public class RespBodyValidators {

	JsonPath jPath;

	public RespBodyValidators(String respData){
		jPath = new JsonPath(respData);
	}

	public String getStringNodeFieldValue(String field) {
		String value = jPath.getString(field);
		return value;
	}

	public int getNumberNodeFieldValue(String field) {
		int value = jPath.getInt(field);
		return value;
	}

	public String getChildFieldValue(String node, String field) {
		String value = jPath.getString(node.concat(".").concat(field));
		return value;
	}

	public int getNumberFieldFromArray(String nodeArray, int index, String field) {
		index--;
		int value = jPath.getInt(nodeArray.concat("["+index+"].").concat(field));
		return value;
	}

	public String getStringFieldFromArray(String nodeArray, int index, String field) {
		index--;
		String value = jPath.getString(nodeArray.concat("["+index+"].").concat(field));
		return value;
	}

	public Boolean getBooleanFieldFromArray(String nodeArray, int index, String field) {
		index--;
		Boolean value = jPath.getBoolean(nodeArray.concat("["+index+"].").concat(field));
		return value;
	}

	public Boolean getBooleanFieldValue(String fieldName) {
		Boolean value = jPath.getBoolean(fieldName);
		return value;
	}

}
