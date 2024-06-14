package general;

public class Car {
	public	 String company;
	 public int Speed;


	public Car(String company, int speed) {
		super();
		this.company = company;
		Speed = speed;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public int getSpeed() {
		return Speed;
	}

	public void getSpeed2() {
		System.out.println(getCompany()+" car's speed is "+ getSpeed()+"hm/hrs");
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}


	public static void main(String[] args) {
	
		Car honda = new Car("Honda",100);
		honda.getSpeed2();
		Car jeep = new Car("Jeep",500);
		jeep.getSpeed2();
		Car bmw = new Car("BMW",800);
		bmw.getSpeed2();
	}

}
