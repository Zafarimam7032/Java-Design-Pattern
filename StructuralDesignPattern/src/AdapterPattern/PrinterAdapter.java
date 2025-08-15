package AdapterPattern;

public class PrinterAdapter implements Printer {
	
	private OldPrinter oldPrinter;
	

	public PrinterAdapter(OldPrinter oldPrinter) {
		super();
		this.oldPrinter = oldPrinter;
	}

	@Override
	public void print() {		
		System.out.println("new  printer ");
		
	}

	public OldPrinter getOldPrinter() {
		return oldPrinter;
	}	

}
