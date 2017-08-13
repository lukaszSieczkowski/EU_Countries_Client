package com.countries.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import com.countries.soap.CountriesRequest;
import com.countries.soap.CountriesResponse;
import com.countries.soap.Country;
import com.countries.soap.CountryCodeRequest;
import com.countries.soap.CountryDetailsResponse;
import com.countries.soap.CountryNameAndGdp;
import com.countries.soap.CountryNameAndUnemployment;
import com.countries.soap.CountryNameAndYear;
import com.countries.soap.CountryNameAndYearRequest;
import com.countries.soap.CountryNameRequest;
import com.countries.soap.CountryProcessor;
import com.countries.soap.CountryProcessorService;
import com.countries.soap.CountryResponse;
import com.countries.soap.GdpByCountryNameAndYearResponse;
import com.countries.soap.GdpByCountryNameResponse;
import com.countries.soap.GdpByYearResponse;
import com.countries.soap.UnemploymentByCountryNameAndYearResponse;
import com.countries.soap.UnemploymentByCountryNameResponse;
import com.countries.soap.UnemploymentByYearResponse;
import com.countries.soap.YearRequest;

public class ClientOperations {

	private CountryProcessorService service;
	private CountryProcessor countryProcessorPort;

	public ClientOperations() {
		try {
			service = new CountryProcessorService(
					new URL("http://localhost:8081/EU_Countries/services/countryProcessor?wsdl"));
			countryProcessorPort = service.getCountryProcessorPort();
			Client client = ClientProxy.getClient(countryProcessorPort);
			Endpoint endpoint = client.getEndpoint();

			Map<String, Object> props = new HashMap<String, Object>();
			props.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
			props.put(WSHandlerConstants.USER, Menu.getUserName());
			props.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
			props.put(WSHandlerConstants.PW_CALLBACK_CLASS, PasswordCallback.class.getName());
			WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(props);
			endpoint.getOutInterceptors().add(wssOut);
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
	}

	public void showCountryByCountryCode() {
		System.out.println("Enter Country Code:");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();

		CountryCodeRequest request = new CountryCodeRequest(value);
		CountryResponse countryResponse = countryProcessorPort.getCountryById(request);
		System.out.println("********************RESULT**********************");
		System.out.println(
				countryResponse.getCountry().getCountryName() + " " + countryResponse.getCountry().getCountryCode());
		System.out.println("************************************************");
		System.out.println();

	}

	public void showAllCountries() {

		CountriesRequest request = new CountriesRequest();
		CountriesResponse response = countryProcessorPort.getCountries(request);
		List<com.countries.soap.Country> countries = response.getCountries();
		System.out.println("********************RESULT**********************");
		for (Country country : countries) {
			System.out.println(country.getCountryName() + " " + country.getCountryCode());
		}
		System.out.println("************************************************");
		System.out.println();
		System.out.println(request.toString());
	}

	public void getCountryDetailsByCountryCode() {
		System.out.println("Enter Country Code:");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		CountryCodeRequest request = new CountryCodeRequest(value);
		CountryDetailsResponse response = countryProcessorPort.getCountryDetailsByCountryCode(request);
		System.out.println("********************RESULT**********************");
		System.out.println("Area - " + response.getCountryDetails().getArea());
		System.out.println("Capital City - " + response.getCountryDetails().getCapital());
		System.out.println("Curency - " + response.getCountryDetails().getCurrency());
		System.out.println("Gros Domestic Product (2012) - " + response.getCountryDetails().getGrosDomesticProduct());
		System.out.println("Gros Domestic Product per person (2012) - "
				+ response.getCountryDetails().getGrosDomesticProductPerPerson());
		System.out.println("************************************************");
		System.out.println();
	}

	public void getCountryDetailsByCountryName() {
		System.out.println("Enter Country Name:");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		CountryNameRequest request = new CountryNameRequest(value);
		CountryDetailsResponse response = countryProcessorPort.getCountryDetailsByCountryName(request);
		System.out.println("********************RESULT**********************");
		System.out.println("Area - " + response.getCountryDetails().getArea());
		System.out.println("Capital City - " + response.getCountryDetails().getCapital());
		System.out.println("Curency - " + response.getCountryDetails().getCurrency());
		System.out.println("Gros Domestic Product (2012) - " + response.getCountryDetails().getGrosDomesticProduct());
		System.out.println("Gros Domestic Product per person (2012) - "
				+ response.getCountryDetails().getGrosDomesticProductPerPerson());
		System.out.println("************************************************");
		System.out.println();
	}

	public void getUnemploymentByCountry() {
		System.out.println("Enter Country Name:");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		CountryNameRequest request = new CountryNameRequest(value);
		UnemploymentByCountryNameResponse response = countryProcessorPort.getUnemploymentByCountry(request);
		System.out.println("********************RESULT**********************");
		System.out.println("Unemployment in 2003 - " + response.getUnemployment().getUnemployment2003() + " %");
		System.out.println("Unemployment in 2004 - " + response.getUnemployment().getUnemployment2004() + " %");
		System.out.println("Unemployment in 2005 - " + response.getUnemployment().getUnemployment2005() + " %");
		System.out.println("Unemployment in 2006 - " + response.getUnemployment().getUnemployment2006() + " %");
		System.out.println("Unemployment in 2007 - " + response.getUnemployment().getUnemployment2007() + " %");
		System.out.println("Unemployment in 2008 - " + response.getUnemployment().getUnemployment2008() + " %");
		System.out.println("Unemployment in 2009 - " + response.getUnemployment().getUnemployment2009() + " %");
		System.out.println("Unemployment in 2010 - " + response.getUnemployment().getUnemployment2010() + " %");
		System.out.println("Unemployment in 2011 - " + response.getUnemployment().getUnemployment2011() + " %");
		System.out.println("Unemployment in 2012 - " + response.getUnemployment().getUnemployment2012() + " %");
		System.out.println("************************************************");
		System.out.println();
	}

	public void getUnemploymentByCountryNameAndYear() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Country Name:");
		String countryName = input.nextLine();
		System.out.println("Enter Year:");
		int year = input.nextInt();
		CountryNameAndYearRequest request = new CountryNameAndYearRequest(new CountryNameAndYear(countryName, year));
		UnemploymentByCountryNameAndYearResponse response = countryProcessorPort
				.getUnemploymentByCountryNameAndYear(request);
		System.out.println("********************RESULT**********************");
		System.out.println("Unemployment in " + countryName + " in year " + year + " - " + response.getUnemployment());
		System.out.println("************************************************");
	}

	public void getUnemploymentByYear() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Year:");
		int year = input.nextInt();
		YearRequest request = new YearRequest(year);
		UnemploymentByYearResponse response = countryProcessorPort.getUnemploymentByYear(request);
		System.out.println("********************RESULT**********************");
		List<CountryNameAndUnemployment> countries = response.getCountryNameAndYear();
		System.out.println("********************RESULT**********************");
		System.out.println("Unemployment in " + year);
		for (CountryNameAndUnemployment country : countries) {
			System.out.println(country.getCountryName() + " " + country.getUnemployment() + " %");
		}
		System.out.println("************************************************");
	}

	public void getGprByCountry() {
		System.out.println("Enter Country Name:");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		CountryNameRequest request = new CountryNameRequest(value);
		GdpByCountryNameResponse response = countryProcessorPort.getGprByCountry(request);
		System.out.println("********************RESULT**********************");
		System.out.println("Gros Domestic Product in 2003 - " + response.getGdp().getGdp2003() + " %");
		System.out.println("Gros Domestic Product in 2004 - " + response.getGdp().getGdp2004() + " %");
		System.out.println("Gros Domestic Product in 2005 - " + response.getGdp().getGdp2005() + " %");
		System.out.println("Gros Domestic Product in 2006 - " + response.getGdp().getGdp2006() + " %");
		System.out.println("Gros Domestic Product in 2007 - " + response.getGdp().getGdp2007() + " %");
		System.out.println("Gros Domestic Product in 2008 - " + response.getGdp().getGdp2008() + " %");
		System.out.println("Gros Domestic Product in 2009 - " + response.getGdp().getGdp2009() + " %");
		System.out.println("Gros Domestic Product in 2010 - " + response.getGdp().getGdp2010() + " %");
		System.out.println("Gros Domestic Product in 2011 - " + response.getGdp().getGdp2011() + " %");
		System.out.println("Gros Domestic Product in 2012 - " + response.getGdp().getGdp2012() + " %");
		System.out.println("Gros Domestic Product in 2013 - " + response.getGdp().getGdp2013() + " %");
		System.out.println("Gros Domestic Product in 2014 - " + response.getGdp().getGdp2014() + " %");
		System.out.println("************************************************");
		System.out.println();
	}

	public void getGprByCountryNameAndYear() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Country Name:");
		String countryName = input.nextLine();
		System.out.println("Enter Year:");
		int year = input.nextInt();
		CountryNameAndYearRequest request = new CountryNameAndYearRequest(new CountryNameAndYear(countryName, year));
		GdpByCountryNameAndYearResponse response = countryProcessorPort.getGprByCountryNameAndYear(request);
		System.out.println("********************RESULT**********************");
		System.out.println("Gros Domestic Product in " + countryName + " in year " + year + " - " + response.getGdp());
		System.out.println("************************************************");
	}

	public void getGdpByYear() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Year:");
		int year = input.nextInt();
		YearRequest request = new YearRequest(year);
		GdpByYearResponse response = countryProcessorPort.getGdpByYear(request);
		List<CountryNameAndGdp> countries = response.getCountryNameAndGdp();
		System.out.println("********************RESULT**********************");
		System.out.println("Gros Domestic Product in " + year);
		for (CountryNameAndGdp country : countries) {
			System.out.println(country.getCountryName() + " " + country.getGdp() + " %");
		}
		System.out.println("************************************************");
	}
}
