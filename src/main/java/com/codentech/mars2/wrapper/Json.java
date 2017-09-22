package com.codentech.mars2.wrapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface Json {

	public static <T> T fromJson(JsonNode jsonNode, Class<T> clazz) {
		
		try {
			return new ObjectMapper().treeToValue(jsonNode, clazz);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
