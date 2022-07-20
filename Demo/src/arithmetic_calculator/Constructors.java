package arithmetic_calculator;

class Constructor1 {

		int id;
		String name;
		

	void  display() {
		System.out.println(id+" "+name);
		}
}

public class Constructors {

	public static void main(String[] args) {

		Constructor1 emp1 =new Constructor1();
		Constructor1 emp2=new Constructor1();

		emp1.display();
		emp2.display();
		}
}