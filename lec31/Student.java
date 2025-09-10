package lec31;

public class Student {

	String name="kaju";
	int age=20;
	
	@Override
	public String toString() {
		return name+" "+age;
	}
	
}

// har class k parent class by default object class
// agar koi class kisi class ko inherit nahi kr rha hoga to vo object class ko inherit krta hai

// koi bhi refernce variable ko print krte ho to ek hexadecimal value aati h