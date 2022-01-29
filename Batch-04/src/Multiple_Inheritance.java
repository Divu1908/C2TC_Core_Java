class car{
	public void display() {
		System.out.println("BMW");
	}
}
class Bike extends car{
	public void brand() {
		System.out.println("Suzuki");
	}
}
public class Multiple_Inheritance {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.display();
		b.brand();
	}

}
