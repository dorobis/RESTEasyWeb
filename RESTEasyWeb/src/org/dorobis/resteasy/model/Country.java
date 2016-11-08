package org.dorobis.resteasy.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "country")
public class Country {
    
    private String name;
    private String alpha2_code;
    private String alpha3_code;
    
    @XmlElement
	public String getName() {
		return name;
	}

    @XmlElement
	public void setName(String name) {
		this.name = name;
	}

    @XmlElement
	public String getAlpha2_code() {
		return alpha2_code;
	}
    
    @XmlElement
	public void setAlpha2_code(String alpha2_code) {
		this.alpha2_code = alpha2_code;
	}
    
    @XmlElement
	public String getAlpha3_code() {
		return alpha3_code;
	}
    
    @XmlElement
	public void setAlpha3_code(String alpha3_code) {
		this.alpha3_code = alpha3_code;
	}

}
