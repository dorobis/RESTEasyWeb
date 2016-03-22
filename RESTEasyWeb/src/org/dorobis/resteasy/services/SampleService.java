package org.dorobis.resteasy.services;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.dorobis.resteasy.client.CountryClient;
import org.dorobis.resteasy.client.SunriseSunsetClient;
import org.dorobis.resteasy.model.CountryContent;
import org.dorobis.resteasy.model.Employee;
import org.dorobis.resteasy.model.SunriseSunset;
import org.dorobis.resteasy.model.SunriseSunsetContent;

@Path("/sampleservice")
public class SampleService {
    
    private static Map<String, Employee> employees = new HashMap<String, Employee>();
    
    static {
        
        Employee employee1 = new Employee();
        employee1.setEmployeeId("1");
        employee1.setEmployeeName("Fabrizio");
        employee1.setJob("Software Engineer");
        employees.put(employee1.getEmployeeId(), employee1);
        
        Employee employee2 = new Employee();
        employee2.setEmployeeId("2");
        employee2.setEmployeeName("Justin");
        employee2.setJob("Business Analyst");
        employees.put(employee2.getEmployeeId(), employee2);
        
        Employee employee3 = new Employee();
        employee3.setEmployeeId("3");
        employee3.setEmployeeName("Gronf");
        employee3.setJob("Akdjujen");
        employees.put(employee3.getEmployeeId(), employee3);
        
        Employee employee4 = new Employee();
        employee4.setEmployeeId("4");
        employee4.setEmployeeName("Fernando");
        employee4.setJob("U/X Designer");
        employees.put(employee4.getEmployeeId(), employee4);
        
        Employee employee5 = new Employee();
        employee5.setEmployeeId("5");
        employee5.setEmployeeName("Bruce");
        employee5.setJob("Generalist");
        employees.put(employee5.getEmployeeId(), employee5);
        
    }

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello(){
        return "Hello World";    
    }
    
    @GET
    @Path("/echo/{message}")
    @Produces("text/plain")
    public String echo(@PathParam("message")String message){
        return message;    
    }
    
    @GET
    @Path("/employees")
    @Produces("application/xml")
    public List<Employee> listEmployees(){
        return new ArrayList<Employee>(employees.values());
    }
    
    @GET
    @Path("/employee/{employeeid}")
    @Produces("application/xml")
    public Employee getEmployee(@PathParam("employeeid")String employeeId){
        return employees.get(employeeId);        
    }
    
    @GET
    @Path("/json/employees/")
    @Produces("application/json")
    public List<Employee> listEmployeesJSON(){
        return new ArrayList<Employee>(employees.values());
    }

    @GET
    @Path("/json/employee/{employeeid}")
    @Produces("application/json")
    public Employee getEmployeeJSON(@PathParam("employeeid")String employeeId){
        return employees.get(employeeId);        
    }
    
    @GET
    @Path("/json/countryNames/")
    @Produces("application/json")
    public List<String> listCountryNamesJSON(){
    	CountryClient countryServiceClient = new CountryClient();
    	CountryContent countryResponseContent = new CountryContent();
    	ArrayList<String> countryNames = new ArrayList<String>();
    	
    	countryResponseContent = countryServiceClient.getServiceInfo();
    	Iterator<?> iterator = countryResponseContent.getRestResponse().getResult().iterator();
    	while(iterator.hasNext()) {
    		LinkedHashMap<?,?> lhm = (LinkedHashMap<?,?>)(iterator.next());
    		countryNames.add((String)(lhm.get("name")));
    	}
        return countryNames;
    }
    
    @GET
    @Path("/json/sunRiseAndSetTimes/")
    @Produces("application/json")
    public SunriseSunset listSunRiseAndSetTimesJSON(){
    	SunriseSunsetClient sunriseSunsetClient = new SunriseSunsetClient();
    	SunriseSunsetContent sunriseSunsetResponseContent = new SunriseSunsetContent();
    	
    	sunriseSunsetResponseContent = sunriseSunsetClient.getServiceInfo();
    	SunriseSunset SunriseSunset = sunriseSunsetResponseContent.getResults();
        return SunriseSunset;
    }
   
}