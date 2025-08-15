package AdapterPattern;

public class TestMethod {
	
	public static void main(String[] args) {
		PrinterAdapter printerAdapter=new PrinterAdapter(new OldPrinter());
		
		printerAdapter.print();
		
		printerAdapter.getOldPrinter().print();
		
		
	}

}
