package Quizzes_Number_Two;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class Quiz2Test {

	@Test
	public void car_test_1()
	{
		
		try{
			int months = 60;
		
			double intRate = 0.1;
			double downPay = 0;
			double carCost = 35000;
			CarPayment sample1 = new CarPayment(carCost, intRate, downPay, months);
			System.out.println("The payment for each month is: $"+sample1.monthlyPayment());
			System.out.println("The total interest for the loan is : $"+sample1.totalInterest());
			
			
			months = 60;
			intRate = 0.1;
			carCost = 35000;
			downPay = 10000;
			
			CarPayment sample2 = new CarPayment(carCost, intRate, downPay, months);
			
			System.out.println("The numbers of months to repay loan is: " + months);
			System.out.println("The total cost of car is: $ " + carCost);
			System.out.println("The down payment of the car is: $ " + months);
			System.out.println("The interest rate for the loan is : "+intRate+"%");
			
			System.out.println("");
			System.out.println("The payment for each month is: $"+sample2.monthlyPayment());
			System.out.println("The total interest for the loan is : $"+sample2.totalInterest());
			System.out.println("");
		
		}catch (Exception e) {
			fail("Test failed to run program");
		
		
		}
	}
	
	@Test
	public void car_test_2() {
	try{
		int months = 72;
		double intRate = 0.1;
		double downPay = 1500;
		double carCost = 50000;
		CarPayment sample1 = new CarPayment(carCost, intRate, downPay, months);
		System.out.println("The payment for each month is: $"+sample1.monthlyPayment());
		System.out.println("The total interest for the loan is : $"+sample1.totalInterest());
		
		
		months = 60;
		intRate = 0.1;
		carCost = 35000;
		downPay = 10000;
		
		CarPayment sample2 = new CarPayment(carCost, intRate, downPay, months);
		
		System.out.println("The numbers of months to repay loan is: " + months);
		System.out.println("The total cost of car is: $ " + carCost);
		System.out.println("The down payment of the car is: $ " + months);
		System.out.println("The interest rate for the loan is : "+intRate+"%");
		
		System.out.println("");
		System.out.println("The payment for each month is: $"+sample2.monthlyPayment());
		System.out.println("The total interest for the loan is : $"+sample2.totalInterest());
		System.out.println("");
		
	}catch (Exception e) {
		fail("Test failed to run program");
	
	
	}
}
	
}
