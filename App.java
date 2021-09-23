package com.bridgelabz.SwapTwoNumbers;


import org.apache.logging.log4j.Logger;



import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger Log = LogManager.getLogger(App.class);

	private int FirstNumber;
	private int SecondNumber;
	public static void main( String[] args )
	{
		// this section of the code will generate log file and print log message on console
		String message="Welcome ";
		Log.debug(message + " will be printed on Debug");
		Log.info(message + " Will be printed on info");
		Log.warn(message + " will be printed on warn");
		Log.error(message + " will be printed on error");
		Log.fatal(message + " will be printed on fatal");
		Log.info("Appending String: {}.", message);
		System.out.println(message);
		App a = new App();
		a.setFirstNumber();
		a.setSecondNumber();
		System.out.println("number before swapping");
		a.display();
		System.out.println("number after swapping");
		a.swapNumbers();
		a.display();
	}

	public void setFirstNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of two numbers");
		this.FirstNumber = sc.nextInt();
	}

	public void setSecondNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter second number");
		this.SecondNumber = sc.nextInt();
	}

	public int getFirstNumber() {
		return this.FirstNumber;
	}

	public int getSecondNumber() {
		return this.SecondNumber;
	}

	public void display() {
		System.out.println("value of first number "+ this.FirstNumber);
		System.out.println("value of second number "+ this.SecondNumber);
	}

	public void swapNumbers() {
		int a= this.FirstNumber;
		this.FirstNumber=this.SecondNumber;
		this.SecondNumber=a;
	}


}
