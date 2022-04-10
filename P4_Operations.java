package Unit_01;

public class P4_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P4_Operations obj = new P4_Operations();
		
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperator();
		obj.RelationalOperator();
		obj.BitwiseAndLogicalOperator();
		obj.TernaryOperator();
		obj.AssignmentOperator();
		
		

	}

	private void AssignmentOperator() {
		// TODO Auto-generated method stub
		
	}

	private void TernaryOperator() {
		// TODO Auto-generated method stub
		
	}

	private void BitwiseAndLogicalOperator() {
		// TODO Auto-generated method stub
		
	}

	private void RelationalOperator() {
		// TODO Auto-generated method stub
		
	}

	private void ShiftOperator() {
		// TODO Auto-generated method stub
		
	}

	private void ArithmeticOperator() {
		// TODO Auto-generated method stub
		
	}

	private void UnaryOperator() {
		// TODO Auto-generated method stub
		
	}

}
 class Operators{
	 void UnaryOperator() {
			int a = 10;
			boolean b = false;
			System.out.println("Inside UnaryOperator");
			System.out.println(a++); //10
			System.out.println(a--); //11
			System.out.println(++a); //11
			System.out.println(--a); //10
			/*
			 * Bitwise Complement(~)
			 * This unary operator returns the one's complement representation of the input value
			 * with all bits inverted, which means it makes every 1 to 0 and every 0 to 1.  
			 */
			System.out.println(~a); // 1010 invert all bits=> 0101 2's complement=>1010+1=> 1011
			// 'NOT' Operator(!): It is used to reverse the value of an operand 
			System.out.println(!b); //true
			System.out.println("\n");
		}
 }
