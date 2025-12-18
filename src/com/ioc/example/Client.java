package com.ioc.example;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		
		//Create IOC Container
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		I_Sim sim = context.getBean("s1",I_Sim.class); //Create bean/object for Airtel class
		sim.Calling();
		sim.Browsing();
		
		
		/*
		I_Sim sim1=new Airtel(); // Programmer has created object..This should be
		sim1.Calling();          //done by Spring Framework
		sim1.Browsing();
		
		
		
		System.out.println("------------");
		I_Sim sim2=new Idea();
		sim2.Calling();
		sim2.Browsing();
		*/
		
		

	}

}
