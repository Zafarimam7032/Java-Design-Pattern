package BridgePattern;

public class TestClass {
	
	public static void main(String[] args) {
		Circle circle=new Circle(10, new RenderCircle());
		circle.drow();
	}

}
