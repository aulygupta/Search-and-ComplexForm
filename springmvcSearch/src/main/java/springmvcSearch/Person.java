package springmvcSearch;

import java.util.Date;
import java.util.List;

public class Person {
	
	private String email;
	private String exampleFormControlSelect1;
	private List<String> exampleFormControlSelect2;
	private String date1;
	private String desc;
	private Address address;
	
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExampleFormControlSelect1() {
		return exampleFormControlSelect1;
	}
	public void setExampleFormControlSelect1(String exampleFormControlSelect1) {
		this.exampleFormControlSelect1 = exampleFormControlSelect1;
	}
	public List<String> getExampleFormControlSelect2() {
		return exampleFormControlSelect2;
	}
	public void setExampleFormControlSelect2(List<String> exampleFormControlSelect2) {
		this.exampleFormControlSelect2 = exampleFormControlSelect2;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [email=" + email + ", exampleFormControlSelect1=" + exampleFormControlSelect1
				+ ", exampleFormControlSelect2=" + exampleFormControlSelect2 + ", date1=" + date1 + ", desc=" + desc
				+ ", address=" + address + "]";
	}
	
	

}
