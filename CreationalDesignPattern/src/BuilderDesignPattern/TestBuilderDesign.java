package BuilderDesignPattern;

public class TestBuilderDesign {
	
	public static void main(String[] args) {
		EmployeeBuilder employeeBuilder = new EmployeeBuilder().name("Zafar")
		.id("1232")
		.address("pune")
		.companyName("Prolifics")
		.build();
		
		System.out.println(employeeBuilder);
	}

}
