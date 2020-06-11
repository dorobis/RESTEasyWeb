package org.dorobis.resteasy.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "CountryContent")
public class CountryContent {
	private RestResponse restResponse;

    //@XmlElement
    @JsonProperty("RestResponse")
	public RestResponse getRestResponse() {
		return restResponse;
	}

    //@XmlElement
    @JsonProperty("RestResponse")
	public void setRestResponse(RestResponse restResponse) {
		this.restResponse = restResponse;
	}
}
