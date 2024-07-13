package com.aman.springboot.homework1.CakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakeBakerApplication implements CommandLineRunner {

	private Frosting frosting;

	private Syrup syrup;

	@Autowired
	public  CakeBakerApplication(Frosting frosting,Syrup syrup){ //constructor dependency
		this.frosting = frosting;
		this.syrup = syrup;
	}

	String bakeCake(){
		return "Baking Cake";
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(frosting.getFrostingType());
		System.out.println(syrup.getSyrupType());
		System.out.println(bakeCake());
	}

	public static void main(String[] args) {
		SpringApplication.run(CakeBakerApplication.class, args);
	}

}
