package test240729.object1;

import java.util.Objects;

public class Lottery {
	private String name;
	private String phone;
	public Lottery() {
		super();
	}
	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Lottery [name=" + name + ", phone=" + phone + "]";
	}
	@Override
	public int hashCode() {
		return (name + phone).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Lottery) {
			Lottery l = (Lottery)obj;
			if(this.name.equals(l.getName()) && this.phone.equals(l.getPhone())) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	
}
