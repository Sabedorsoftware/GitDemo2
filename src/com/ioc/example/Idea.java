package com.ioc.example;

public class Idea implements I_Sim
{

	
	public void Add()
	{
		int x =20;
		int y=30;
		int sum = x + y;
	}
	
	@Override
	public void Disconnect()
	{
		System.out.println("Disconnect Via Idea Sim....Free for local ,Rs10 for international");
		
	}
	
	@Override
	public void Calling() {
		System.out.println("Calling Via Idea Sim....Free for local ,Rs20 for international");
		
	}

	@Override
	public void Browsing() {
		System.out.println("Browsing Via Idea , 2GB downlaod speed...");
		System.out.println("Disconnect Via Airtel Sim....Free for local ,Rs10 for international");
		System.out.println("Disconnect Via Airtel Sim....Free for local ,Rs10 for international");
	}

}
