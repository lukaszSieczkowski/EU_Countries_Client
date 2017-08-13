package com.countries.client;

import java.util.Scanner;

import javax.persistence.NoResultException;

import com.countries.entity.UserEntity;
import com.countries.repository.UserRepository;
import com.countries.repository.UserRepositoryImpl;

public class Menu {
	
	private static String userName;
	private static String password;
	
	public static String getUserName() {
		return userName;
	}

	public static void setUserName(String userName) {
		Menu.userName = userName;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Menu.password = password;
	}



	public void showMainMenu() {
		System.out.println("1\t-\tShow country by country code (ex. PL,DE,NL)");
		System.out.println("2\t-\tShow all countries");
		System.out.println("3\t-\tShow country details by country code (ex. PL,DE,NL)");
		System.out.println("4\t-\tShow country details by country name");
		System.out.println("5\t-\tShow unemployment by country name");
		System.out.println("6\t-\tShow unemployment by country name and year");
		System.out.println("7\t-\tShow unemployment year");
		System.out.println("8\t-\tShow gros domestic product by country name");
		System.out.println("9\t-\tShow gros domestic product by country name and year");
		System.out.println("10\t-\tShow gros domestic product year");
		System.out.println("Enter value:");

		Scanner input = new Scanner(System.in);
		int value = input.nextInt();

		ClientOperations clientOperations = new ClientOperations();
		switch (value) {
		case 1: {
			clientOperations.showCountryByCountryCode();
			showMainMenu();
			break;
		}
		case 2: {
			clientOperations.showAllCountries();
			showMainMenu();
			break;
		}
		case 3: {
			clientOperations.getCountryDetailsByCountryCode();
			showMainMenu();
			break;
		}
		case 4: {
			clientOperations.getCountryDetailsByCountryName();
			showMainMenu();
			break;
		}
		case 5: {
			clientOperations.getUnemploymentByCountry();
			showMainMenu();
			break;
		}
		case 6: {
			clientOperations.getUnemploymentByCountryNameAndYear();
			showMainMenu();
			break;
		}
		case 7: {
			clientOperations.getUnemploymentByYear();
			showMainMenu();
			break;
		}
		case 8: {
			clientOperations.getGprByCountry();
			showMainMenu();
			break;
		}
		case 9: {
			clientOperations.getGprByCountryNameAndYear();
			showMainMenu();
			break;
		}
		case 10: {
			clientOperations.getGdpByYear();
			showMainMenu();
			break;
		}
		default: {
			showMainMenu();
		}
		}
	}

	public void loginMenu() {

		boolean looged = false;
		while (looged == false) {
			System.out.println("Enter your login");
			Scanner input = new Scanner(System.in);
			String login = input.nextLine();
			System.out.println("Enter your password:");
			String pass = input.nextLine();
			try {
				UserRepository repository = new UserRepositoryImpl();
				UserEntity user = repository.findUser(login, pass);
				if (user != null) {
					userName = login;
					password = pass;
					System.out.println("Login Successful....");
					System.out.println("Welcome " + user.getUserName());
					looged = true;
				}
			} catch (NoResultException e) {
				System.out.println("Incorrect login or password !!!");
			}
		}
	}
}
