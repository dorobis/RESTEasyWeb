package org.dorobis.resteasy.client;

import java.net.URL;
import java.util.List;

import org.dorobis.resteasy.model.Employee;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MappingJsonFactory;

public class SampleClient {
	public static void main(String[] args) {
		URL url;
		MappingJsonFactory jsonFactory = new MappingJsonFactory(); 
		
		List<Employee> employees = null;
		try {
			url = new URL("http://localhost:8080/RESTEasyWeb/restful-services/sampleservice/json/employees");
			JsonParser jp = jsonFactory.createJsonParser(url);
			TypeReference<List<Employee>> employeeRef = new TypeReference<List<Employee>>() { };
			employees = jp.readValueAs(employeeRef);
			System.out.println("There are " + employees.size() + " employees");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
}
