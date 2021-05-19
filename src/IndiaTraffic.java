
public class IndiaTraffic implements TrafficControl {

	public static void main(String[] args) {
		
	TrafficControl a=new IndiaTraffic();
	a.RedStop();
	a.GreenGo();
	a.InterfaceRun();
	a.YellowWait();
		
	}

	@Override
	public void RedStop() {
		
		System.out.println("RedStop");
	}

	@Override
	public void GreenGo() {
		
		System.out.println("GreenGo");
	}

	@Override
	public void InterfaceRun() {
	
		System.out.println("InterfaceRun");
	}

	@Override
	public void YellowWait() {
		
		System.out.println("YellowWait");
	}
	
}
