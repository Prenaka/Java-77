
public class Account {
  long acno;
  String name;
  float bal;
  
  /*--- constructors ---*/
  Account() {}
  
  Account(long acno, String name, float bal) {	
	this.acno = acno;
	this.name = name;
	this.bal = bal;
  }
  
  void deposit(float amt) {
	  this.bal = this.bal + amt;
	  System.out.println("Rs."+amt+" CREDITED | BALANCE: "+this.bal);
  }
  
  void withdraw(float amt) {
	  if(this.bal >= amt) {
		  this.bal -= amt;
		  System.out.println("Rs."+amt+" DEBITED | BALANCE: "+this.bal);
	  }
	  else {
		  System.out.println("ERROR: INSUFFICIENT BALANCE");
	  }
  }
  
  void getDetails() {
	  System.out.println("A/C No: "+this.acno+" | NAME: "+this.name+" | BALANCE: "+this.bal);
  }
}
