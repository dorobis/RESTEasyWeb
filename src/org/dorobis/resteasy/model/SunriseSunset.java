package org.dorobis.resteasy.model;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.lang.Long;


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
	
	private final ZoneId zoneId = ZoneId.of("America/New_York");
	private final DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a z").withZone(zoneId);

    @XmlElement
	public String getSunrise() {
		return sunrise;
	}

    //@XmlElement
	public void setSunrise(String sunrise) {
		this.sunrise = getISO_OFFSET_DATE_TIME_ET(sunrise);
	}

    @XmlElement
	public String getSunset() {
		return sunset;
	}

    //@XmlElement
	public void setSunset(String sunset) {
		this.sunset = getISO_OFFSET_DATE_TIME_ET(sunset);

	}

    @XmlElement
	public String getSolar_noon() {
		return solar_noon;
	}

    //@XmlElement
	public void setSolar_noon(String solar_noon) {
		this.solar_noon = getISO_OFFSET_DATE_TIME_ET(solar_noon);
	}

    @XmlElement
	public String getDay_length() {
		return day_length;
	}

    //@XmlElement
	public void setDay_length(String day_length) {
		Duration duration = Duration.ofSeconds(Long.parseLong(day_length));
		this.day_length = duration.toDays() + " days " 
				+ (duration.toHours() % 24) + " hours " 
				+ (duration.toMinutes() % 60) + " minutes " 
				+ ((duration.toMillis() / 1000) % 60) + " seconds ";
	}

    @XmlElement
	public String getCivil_twilight_begin() {
		return civil_twilight_begin;
	}

    //@XmlElement
	public void setCivil_twilight_begin(String civil_twilight_begin) {
		this.civil_twilight_begin = getISO_OFFSET_DATE_TIME_ET(civil_twilight_begin);
	}

    @XmlElement
	public String getCivil_twilight_end() {
		return civil_twilight_end;
	}

    //@XmlElement
	public void setCivil_twilight_end(String civil_twilight_end) {
		this.civil_twilight_end = getISO_OFFSET_DATE_TIME_ET(civil_twilight_end);
	}

    @XmlElement
	public String getNautical_twilight_begin() {
		return nautical_twilight_begin;
	}

    //@XmlElement
	public void setNautical_twilight_begin(String nautical_twilight_begin) {
		this.nautical_twilight_begin = getISO_OFFSET_DATE_TIME_ET(nautical_twilight_begin);
	}

    @XmlElement
	public String getNautical_twilight_end() {
		return nautical_twilight_end;
	}

    //@XmlElement
	public void setNautical_twilight_end(String nautical_twilight_end) {
		this.nautical_twilight_end = getISO_OFFSET_DATE_TIME_ET(nautical_twilight_end);
	}

    @XmlElement
	public String getAstronomical_twilight_begin() {
		return astronomical_twilight_begin;
	}

    //@XmlElement
	public void setAstronomical_twilight_begin(String astronomical_twilight_begin) {
		this.astronomical_twilight_begin = getISO_OFFSET_DATE_TIME_ET(astronomical_twilight_begin);
	}

    @XmlElement
	public String getAstronomical_twilight_end() {
		return astronomical_twilight_end;
	}

    //@XmlElement
	public void setAstronomical_twilight_end(String astronomical_twilight_end) {
		this.astronomical_twilight_end = getISO_OFFSET_DATE_TIME_ET(astronomical_twilight_end);
	}
	
	private String getISO_OFFSET_DATE_TIME_ET(String strDateTimeISO) {
		return  ZonedDateTime.parse(strDateTimeISO, DateTimeFormatter.ISO_OFFSET_DATE_TIME).format(format);
	}
}
