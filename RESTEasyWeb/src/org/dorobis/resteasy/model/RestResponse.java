package org.dorobis.resteasy.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RestResponse")
   public class RestResponse {
	private ArrayList<String> messages;
	private ArrayList<Country> result;
	
    @XmlElement
	public ArrayList<String> getMessages() {
		return messages;
	}
    
    @XmlElement
	public void setMessages(ArrayList<String> messages) {
		this.messages = messages;
	}
    
    @XmlElement
	public ArrayList<Country> getResult() {
		return result;
	}
    
    @XmlElement
	public void setResult(ArrayList<Country> result) {
		this.result = result;
	}
}
