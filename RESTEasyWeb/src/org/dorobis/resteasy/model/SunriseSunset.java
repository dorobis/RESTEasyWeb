package org.dorobis.resteasy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sunriseSunset")
public class SunriseSunset {

	private String sunrise;
	private String sunset;
	private String solar_noon;
	private String day_length;
	private String civil_twilight_begin;
	private String civil_twilight_end;
	private String nautical_twilight_begin;
	private String nautical_twilight_end;
	private String astronomical_twilight_begin;
	private String astronomical_twilight_end;

    @XmlElement
	public String getSunrise() {
		return sunrise;
	}

    @XmlElement
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

    @XmlElement
	public String getSunset() {
		return sunset;
	}

    @XmlElement
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

    @XmlElement
	public String getSolar_noon() {
		return solar_noon;
	}

    @XmlElement
	public void setSolar_noon(String solar_noon) {
		this.solar_noon = solar_noon;
	}

    @XmlElement
	public String getDay_length() {
		return day_length;
	}

    @XmlElement
	public void setDay_length(String day_length) {
		this.day_length = day_length;
	}

    @XmlElement
	public String getCivil_twilight_begin() {
		return civil_twilight_begin;
	}

    @XmlElement
	public void setCivil_twilight_begin(String civil_twilight_begin) {
		this.civil_twilight_begin = civil_twilight_begin;
	}

    @XmlElement
	public String getCivil_twilight_end() {
		return civil_twilight_end;
	}

    @XmlElement
	public void setCivil_twilight_end(String civil_twilight_end) {
		this.civil_twilight_end = civil_twilight_end;
	}

    @XmlElement
	public String getNautical_twilight_begin() {
		return nautical_twilight_begin;
	}

    @XmlElement
	public void setNautical_twilight_begin(String nautical_twilight_begin) {
		this.nautical_twilight_begin = nautical_twilight_begin;
	}

    @XmlElement
	public String getNautical_twilight_end() {
		return nautical_twilight_end;
	}

    @XmlElement
	public void setNautical_twilight_end(String nautical_twilight_end) {
		this.nautical_twilight_end = nautical_twilight_end;
	}

    @XmlElement
	public String getAstronomical_twilight_begin() {
		return astronomical_twilight_begin;
	}

    @XmlElement
	public void setAstronomical_twilight_begin(String astronomical_twilight_begin) {
		this.astronomical_twilight_begin = astronomical_twilight_begin;
	}

    @XmlElement
	public String getAstronomical_twilight_end() {
		return astronomical_twilight_end;
	}

    @XmlElement
	public void setAstronomical_twilight_end(String astronomical_twilight_end) {
		this.astronomical_twilight_end = astronomical_twilight_end;
	}
}
