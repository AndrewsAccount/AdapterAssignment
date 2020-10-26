
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterfaced {


	OldCoffeeMachine oldMachine;
	
	
	public CoffeeTouchscreenAdapter(OldCoffeeMachine oldMachine) {
		super();
		this.oldMachine = oldMachine;
	}

	
	public OldCoffeeMachine getOldMachine() {
		return oldMachine;
	}


	public void setOldMachine(OldCoffeeMachine oldMachine) {
		this.oldMachine = oldMachine;
	}


	@Override
	public void chooseFirstSelection(){
		oldMachine.selectA();
	}
	
	@Override
	public void chooseSecondSelection(){
		oldMachine.selectB();
	}
}
