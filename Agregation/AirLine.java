package com.kn.Agregation;

public class AirLine 
{
String airlineName;
Pilot pilot;

public void operator()
{
	System.out.println(this.airlineName+" airline is operating now...");
	pilot.fly();
}

public AirLine(String airlineName,Pilot pilot)
{
	this.airlineName=airlineName;
	this.pilot=pilot;
}
}
