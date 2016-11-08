package org.dorobis.resteasy.client;

import java.net.URL;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.dorobis.resteasy.model.SunriseSunset;
import org.dorobis.resteasy.model.SunriseSunsetContent;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

@ManagedBean(name="sunriseSetBean",eager=true)
@SessionScoped
public class SunriseSunsetClient  {
	//private String urlString = "http://api.sunrise-sunset.org/json?lat=40.4197481&lng=-74.105480";
	private String urlString = "http://api.sunrise-sunset.org/json?lat=40.419854&lng=-74.103248&formatted=0";
	private URL url;
	private SunriseSunset sunriseSunset;
	
	public SunriseSunsetClient() {
		super();
//		sunriseSunset = getServiceInfo().getResults();
	}
	
	
	public SunriseSunsetContent getServiceInfo() {
		ObjectMapper mapper = new ObjectMapper();	
		TypeReference<SunriseSunsetContent> sunriseSunsetResponseContentRef = new TypeReference<SunriseSunsetContent>() { };
		SunriseSunsetContent sunriseSunsetResponseContent= null;
	
		try {
			url = new URL(urlString);
			sunriseSunsetResponseContent = mapper.readValue(url, SunriseSunsetContent.class);
//			JsonParser jp = jsonFactory.createParser(url);
//			sunriseSunsetResponseContent = jp.readValueAs(sunriseSunsetResponseContentRef);
		} catch (Exception e) {
			System.out.println("SunriseSunsetClient.getServiceInfo:Exception: " + e.getMessage());
		}
		
		return sunriseSunsetResponseContent;
	}

	
	public SunriseSunset getSunriseSunset() {
		return sunriseSunset;
	}


	
	public void setSunriseSunset(SunriseSunset sunriseSunset) {
		this.sunriseSunset = sunriseSunset;
	}

}
