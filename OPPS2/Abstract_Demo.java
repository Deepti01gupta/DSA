package OPPS2;

public abstract class Abstract_Demo {

	// ye method abstarct hai kyuki apne function to bana diya but iski implementation ko hide kr diya
	public abstract void Payment();  
	
	public abstract int No_of_item();
	
	// jaruri nhi method abstract hi ho abstract class k ander
	public void VIewitem() {
		
	}
}

// koi function ko initialze kr diya or body nahi di to vo method abstract hota hai
// or vo class bhi abstract ho jati hai

// jaruri nahi abstract class k ander sare method abstarct hi ho
// but abstarct method hamesha abstract class m hi hoga
