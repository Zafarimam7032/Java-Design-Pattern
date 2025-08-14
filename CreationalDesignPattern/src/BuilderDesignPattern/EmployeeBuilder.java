package BuilderDesignPattern;

public class EmployeeBuilder {
	
	private String name;
	private String id;
	private String address;
	private String companyName;
	public EmployeeBuilder name(String name) {
		this.name = name;
		return this;
	}
	public EmployeeBuilder id(String id) {
		this.id = id;
		return this;
	}
	public EmployeeBuilder address(String address) {
		this.address = address;
		return this;

	}
	public EmployeeBuilder companyName(String companyName) {
		this.companyName = companyName;
		return this;
	}
	
	public EmployeeBuilder build() {
		return new EmployeeBuilder(this.name,this.id,this.address,this.companyName);
	}
	private EmployeeBuilder(String name, String id, String address, String companyName) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.companyName = companyName;
	}
	public EmployeeBuilder() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeBuilder [name=" + name + ", id=" + id + ", address=" + address + ", companyName=" + companyName
				+ "]";
	}
	
	

}
