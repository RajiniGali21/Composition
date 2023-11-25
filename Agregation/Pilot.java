package com.kn.Agregation;

public class Pilot 
{
String name;

public void fly()
{
	System.out.println(this.name+" pilot is flying now.....");
	
}

public Pilot(String name)
{
	this.name = name;
}
}
