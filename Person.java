package com.pp;

public class Person {
private int id;
private String name;
private String adrress;
private long phone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdrress() {
	return adrress;
}
public void setAdrress(String adrress) {
	this.adrress = adrress;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", adrress=" + adrress + ", phone=" + phone + "]";
}

}
