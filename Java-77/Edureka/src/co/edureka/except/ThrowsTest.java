package co.edureka.except;
class Logic{
	void bLogic() throws InterruptedException {
		System.out.println("-- busness logic --");
		//logic
	}
}

public class ThrowsTest {
	public static void main(String[] args) throws InterruptedException {
		Logic log = new Logic();
		try {
			log.bLogic();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.bLogic();
	}
}
