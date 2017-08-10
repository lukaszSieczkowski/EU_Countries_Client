package com.countries.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.countries.soap.CountriesRequest;
import com.countries.soap.CountriesResponse;
import com.countries.soap.Country;
import com.countries.soap.CountryProcessor;
import com.countries.soap.CountryProcessorService;

public class CountriesWSClient {

	public static void main(String[] args) {

		Menu menu = new Menu();
		menu.showMainMenu();
	}

}
