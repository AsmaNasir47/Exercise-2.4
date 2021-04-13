package BicycleSetterGetter;

import ProtonSetterGetter.Proton;

public class Main {

	public static void main(String[] args) {
		
    Bicycle b = new Bicycle();
    
		b.getBrand("SALSA");
		b.color("PINK");
		b.maxSpeed("100");
		b.weight("250.5");
		b.price("600");
		
		System.out.println("Brand : " + b.getBrand());
		System.out.println(b.getColor());
		System.out.println(b.getSpeed());
		System.out.println(b.getWeight());
		System.out.println(b.getPrice());
		
		b.fullThrottle();

	}

}
