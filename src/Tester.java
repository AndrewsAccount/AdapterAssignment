
public class Tester {

	public static void main(String[] args) {
		
		System.out.println("Testing");

		OldCoffeeMachine anOldcoffeeMachine = new OldCoffeeMachine(); 
		CoffeeTouchscreenAdapter ctsa = new CoffeeTouchscreenAdapter(anOldcoffeeMachine);
		ctsa.setOldMachine(anOldcoffeeMachine);
		ctsa.chooseFirstSelection();
		ctsa.chooseFirstSelection();
		
		
	}
	
}
