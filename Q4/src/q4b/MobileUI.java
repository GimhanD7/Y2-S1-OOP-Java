package q4b;

public class MobileUI {
	private Command command[];

	public MobileUI() {
		super();
		command = new Command[6];
	}
	public void setCommand(int index,Command comObj) {
		command[index]=comObj;
	}
	public void commandPress(int index) {
		command[index].execute();
	}
}
