package SingleTon;

public class PreventSingleTonDesignPattern {
	
	private static PreventSingleTonDesignPattern instance;
	private static boolean instanceCreated = false;

	private PreventSingleTonDesignPattern() {
	    if (instanceCreated) {
	        throw new RuntimeException("Use getInstance() method to create");
	    }
	    instanceCreated = true;
	}
	
	public static synchronized PreventSingleTonDesignPattern getinstance() {
		if(instance==null) {
			instance=new PreventSingleTonDesignPattern();
		}
		return instance;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		throw new CloneNotSupportedException();
	}
	
	protected Object readResolve() {
	    return getinstance();
	}


}
