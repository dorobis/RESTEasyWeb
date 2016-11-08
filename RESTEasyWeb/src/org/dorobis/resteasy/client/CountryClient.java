package org.dorobis.resteasy.client;

import java.net.URL;
import org.dorobis.resteasy.model.CountryContent;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CountryClient {
	public CountryClient() {
		super();
	}

	private String urlString = "http://services.groupkt.com/country/get/all";
	private URL url;
	
	public CountryContent getServiceInfo() {

		MappingJsonFactory jsonFactory = new MappingJsonFactory(); 
		
		ObjectMapper mapper = new ObjectMapper();	
		TypeReference<CountryContent> countryResponseRef = new TypeReference<CountryContent>() { };
		CountryContent countryResponseContent= null;
	
		try {
			url = new URL(urlString);
			countryResponseContent = mapper.readValue(url, CountryContent.class);
			JsonParser jp = jsonFactory.createJsonParser(url);
			countryResponseContent = jp.readValueAs(countryResponseRef);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		return countryResponseContent;
	}
}
