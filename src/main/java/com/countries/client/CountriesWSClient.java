package com.countries.client;

import javax.jws.HandlerChain;
import javax.xml.ws.WebServiceClient;

@WebServiceClient
@HandlerChain(file="soap-handler.xml")
public class CountriesWSClient {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		menu.loginMenu();
		menu.showMainMenu();
	}

}
