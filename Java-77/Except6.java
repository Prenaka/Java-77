class Except6 
{
	public static void main(String[] args) 
	{
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int res = x/y;
			System.out.println(x+" / "+y+" = "+res);
		}
		catch(ArithmeticException ex){
			System.out.println("Cannot divide a number by zero!");
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Please provide minimum 2 cmd args");
		}
		catch(NumberFormatException e){
			System.out.println("Please provide numbers as cmd args");
		}
		System.out.println("-- main method ends --");
	}
}
