package co.edureka;

import org.springframework.beans.factory.annotation.Autowired;

public class B {
	@Autowired
	A a;

	public void bMethod() {
		System.out.println("In class B method");
		a.aMethod();
	}
}
