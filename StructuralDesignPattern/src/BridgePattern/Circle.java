package BridgePattern;

public class Circle extends Shape {
	private float redius;

	public Circle(float redius, Renderer renderer) {
		super(renderer);
		this.redius = redius;
	}

	@Override
	public void drow() {
		renderer.renderCircle(redius);
	}

}
