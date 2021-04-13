package BicycleSetterGetter;

public class Bicycle {
	
	String brand;
	String color;
	int maxSpeed;
	double weight;
	double price;
	  
	 // Create Setter Method
	
	  public void setBrand(String brand) {
	    this.brand = brand;
	  }
	  
	  public void setColor(String color) {
		this.color = color;
	  }
	  
	  public void setSpeed(int maxSpeed) {
	    this.maxSpeed = maxSpeed;
	  }
	  
	  public void setWeight(double weight) {
		  this.weight = weight;
	  }
	  
	  public void setPrice(double price) {
		  this.price = price;
	  }
	  
	  // Create Getter Method
	  
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public String getColor() {
	 	  return this.color;
 	  }
	  
	  public Integer getSpeed() {
		  return this.maxSpeed;
	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  
	  public double getPrice() {
		  return this.price;
	  }
	  
	// Create a fullThrottle() method
		public void fullThrottle(){
		System.out.println("The bicycle is functioning well!");
	}

}
