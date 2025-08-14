package Protype;

import java.util.Objects;

public class ProType implements Cloneable {
	
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProType other = (ProType) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name);
	}
	
	
	public ProType(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "ProType [name=" + name + ", address=" + address + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new ProType(this.name, this.address);
	}
	
	
	

}
