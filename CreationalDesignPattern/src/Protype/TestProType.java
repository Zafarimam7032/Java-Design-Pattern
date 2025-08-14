package Protype;

public class TestProType {
	
	public static void main(String[] args) throws Exception {
		
		ProType proType=new ProType("Zafar", "pune");
		
		System.out.println(proType);
		System.out.println(proType.hashCode());
		
		ProType clone = (ProType)proType.clone();
		
		System.out.println(clone);
		proType.setName("Manoj");
		System.out.println(clone.hashCode());
		
		System.out.println("==========");
		System.out.println(proType);
		System.out.println(clone);

	}

}
