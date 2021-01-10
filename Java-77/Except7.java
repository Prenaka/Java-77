class Except7 
{
	public static void main(String[] args) 
	{
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int res = x/y;
			System.out.println(x+" / "+y+" = "+res);
		}
		catch(Exception ex){
			System.out.println("Exception Occured");
			System.out.println("Message: "+ ex.getMessage());
			System.out.println("toString(): "+ ex.toString()); //exception_object_type: <message_of_exception>
			ex.printStackTrace(); //toString() + callstack

			if(ex instanceof ArrayIndexOutOfBoundsException){
				System.out.println("---- Invalid Array Index... Please provide sufficient Data ----");
			}
		}
		System.out.println("-- main method ends --");
	}
}
