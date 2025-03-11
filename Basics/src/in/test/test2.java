package in.test;
//Object : toString();



class Car{
	String carName = "Santro";
	public String toString() {
		return this.carName;
	}
	
}

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //classname objName = new className();
		Car c =new Car();
		System.out.println(c);
	}

}
