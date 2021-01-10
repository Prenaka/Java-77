package co.edureka.except;
/*
//checked excpeiton
public class InvalidAgeException extends Exception{
*/

/*-- unchecked Exception */
public class InvalidAgeException extends RuntimeException{
	
 public InvalidAgeException() {}
 
 public InvalidAgeException(String msg) {
	 super(msg);
 }
}
