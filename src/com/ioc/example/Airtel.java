package com.ioc.example;

public class Airtel implements I_Sim {

	
	@Override
	public void Disconnect()
	{
		System.out.println("Disconnect Via Airtel Sim....Free for local ,Rs10 for international");
		System.out.println("Disconnect Via Airtel Sim....Free for local ,Rs10 for international");
		System.out.println("Disconnect Via Airtel Sim....Free for local ,Rs10 for international");
	}
	
	@Override
	public void Calling() {
		System.out.println("Calling Via Airtel Sim....Free for local ,Rs10 for international");
		
	}

	@Override
	public void Browsing() {
		System.out.println("Browsing Via Airtel , 1GB downlaod speed...");
		
	}

	

	
	
}
