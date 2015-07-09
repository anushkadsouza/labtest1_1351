package EVM;

public class closing {

	
	String closebuttn;

	public String getClosebuttn() {
		return closebuttn;
	}

	public void setClosebuttn(String closebuttn) {
		this.closebuttn = closebuttn;
	}
	
	
	void display(){
		if(closebuttn=="removed")
		System.out.println("\nThe closing button is pressed.\nThe unit is swiched off\n");
	}
}
