package org.dorobis.resteasy.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SunriseSunsetContent")
public class SunriseSunsetContent {
	private String status;
	private SunriseSunset results;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public SunriseSunset getResults() {
		return results;
	}

	public void setResultst(SunriseSunset results) {
		this.results = results;
	}
}
