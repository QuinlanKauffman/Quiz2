package Quizzes_Number_Two;

public class CarPayment {

		
		private double CarCost;
		private double InterestRate;
		private int Length;
		private double DownPayment;
		
		public CarPayment(double iCarCost, double iInterestRate, double iDownPayment, int iLength)
		{
			CarCost = iCarCost;
			InterestRate = iInterestRate;
			Length = iLength;
			DownPayment = iDownPayment;
		}
		

		public double monthlyPayment() {
			double PresentValue = CarCost-DownPayment;
			double costPerMonth = (InterestRate*PresentValue/12)/(1-Math.pow((1+InterestRate/12), -(Length/12)*12));
			return costPerMonth;
		}
		
		public double totalInterest() {
			double PresentValue = CarCost - DownPayment;
			double totInterest = monthlyPayment()*Length - PresentValue;
			return totInterest;
		}
	}

