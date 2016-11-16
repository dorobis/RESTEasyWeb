package org.dorobis.resteasy.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ManagedBean(name="SunriseSunsetContent",eager=true)
@SessionScoped
@XmlRootElement(name = "SunriseSunsetContent")
public class SunriseSunsetContent {
	private String status;
	private SunriseSunset results;
	
	public SunriseSunsetContent() {
		
	}

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
