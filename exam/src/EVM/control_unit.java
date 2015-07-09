package EVM;

public class control_unit {

	String onlmp;
	String busylmp;
	public String getOnlmp() {
		return onlmp;
	}
	public void setOnlmp(String onlmp) {
		this.onlmp = onlmp;
	}
	public String getBusylmp() {
		return busylmp;
	}
	public void setBusylmp(String busylmp) {
		this.busylmp = busylmp;
	}
	
	
	
	public int total(){
		
		
		return 0;
		
	}
	
	public void display(){
		if(onlmp=="on"){
			System.out.println("Red light glowed.The unit is on\n");
		}
		
		
		
	}
}
