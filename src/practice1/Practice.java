package practice1;
class Operation{
int a,b,sum;
Operation() {
	a=10;
	b=20;
}
Operation(int x, int y){
	a=x;
	b=y;
}
void setValue(int x, int y) {
	a=x;
	b=y;
}
void add() {
	sum = a+b;
}
void display() {
	System.out.println("sum is "+sum);
}
}




public class Practice {
	public static void main(String args[]) {
		Operation op1 = new Operation();										
		op1.display();
		
		Operation op2 = new Operation();							
		op2.add();		
		op2.display();
		
		Operation op3 = new Operation();		
		op3.setValue(100,200);	
		op3.add();		
		op3.display();
		
		Operation op4 = new Operation(11,22);					
		op4.add();			
		op4.display();
		
		Operation op5 = new Operation();
			op5.setValue(1,2);
			op5.setValue(3,4);
			op5.setValue(5,6);
			op5.add();
			op5.setValue(7,8);
			op5.add();
			op5.display();
		
		Operation op6 = new Operation(100,200);
			op6.setValue(2,3);
			op6.add();
			op6.display();
		}


}

