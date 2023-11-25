package com.kn.Agregation;

public class AggregationDemo {

	public static void main(String[] args) 
	{

		Pilot pilot = new Pilot("john");
		AirLine airline = new AirLine("Emirates",pilot);
		airline.operator();
		airline = null;
		System.out.println("==> Airline has been shutdown.......!!");
		pilot.fly();
	}

}
