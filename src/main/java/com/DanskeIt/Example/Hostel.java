package com.DanskeIt.Example;

public class Hostel {
public String hostelName;
public String city;

public Hostel()
{
	
}
public String getHostelName() {
	return hostelName;
}
public void setHostelName(String hostelName) {
	this.hostelName = hostelName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Hostel [hostelName=" + hostelName + ", city=" + city + "]";
}

public void display()
{
	System.out.println("Inside Hostel");
}

}
