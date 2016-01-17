package org.dorobis.resteasy.client;

import java.net.URL;
import java.util.List;

import org.dorobis.resteasy.model.RestResponse;
import org.dorobis.resteasy.model.Country;
import org.dorobis.resteasy.model.RestMsgContent;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CountryClient {
	public RestMsgContent getCountryInfo() {
		URL url;
		MappingJsonFactory jsonFactory = new MappingJsonFactory(); 
		
		ObjectMapper mapper = new ObjectMapper();	
		TypeReference<RestMsgContent> restMsgContentRef = new TypeReference<RestMsgContent>() { };
		RestMsgContent restMsgContent= null;
	
		try {
			url = new URL("http://services.groupkt.com/country/get/all");
			restMsgContent = mapper.readValue(url, RestMsgContent.class);
			JsonParser jp = jsonFactory.createJsonParser(url);
			restMsgContent = jp.readValueAs(restMsgContentRef);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		return restMsgContent;
	}
}
