package SingleTon;

public final class CustomSingleTonExample {
	
	private static CustomSingleTonExample instance;
	
	private CustomSingleTonExample() {
		
	}
	
	public synchronized static CustomSingleTonExample getInstance() {
		if(instance==null) {
			instance=new CustomSingleTonExample();
		}
		return instance;
	}

}
