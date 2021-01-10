package co.edureka.except;
class Calculator{
	public int divNum(int x, int y)  {
		int res = 0;
		if(y == 0) {
			//ArithmeticException aex = new ArithmeticException();
			ArithmeticException aex = new ArithmeticException("cannot divide by 0");
			throw aex;
			//throw new InterruptedException();
		}
		res=x/y;
		return res;
	}
}
public class ThrowTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		//System.out.println("Result = "+calc.divNum(10, 2));
		try{
			System.out.println("Result = "+calc.divNum(10, 0));
		}catch(Exception ex) {
			System.out.println("Message = " + ex.getMessage());
			System.out.println(ex.toString());
		}
		
	}
}
