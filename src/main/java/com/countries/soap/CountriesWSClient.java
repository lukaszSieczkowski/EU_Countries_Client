package com.countries.soap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CountriesWSClient {

	public static void main(String[] args) {
		try {
			CountryProcessorService service = new CountryProcessorService(
					new URL("http://localhost:8081/EU_Countries/services/countryProcessor?wsdl"));
			CountryProcessor countryProcessorPort = service.getCountryProcessorPort();
			CountriesRequest request = new CountriesRequest();
			CountriesResponse response = countryProcessorPort.getCountries(request);

			List<com.countries.soap.Country> countries = response.getCountries();
			for (Country country : countries) {
				System.out.println(country.getCountryName() + " " + country.getCountryCode());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
