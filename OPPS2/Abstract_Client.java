package OPPS2;

public class Abstract_Client {

	// abstract class k object nahi banta hai
//	Abstract_Demo ab=new Abstract_Demo();
//	ab.Payment();
	
	// abstract class ko use krna hoga to ham usse dusre method m inherit krwake use krenge
//	Payment_Method ab=new Payment_Method();
//	ab.Payment();
	
	Abstract_Demo ab=new Abstract_Demo() {
		
		@Override
		public void Payment() {
			
		}
		
		@Override
		public int No_of_item() {
			return 0;
		}
	};
	
	
//	Abstract_Demo ab1=new Abstarct_Demo() {
//		
//	};
	
}


