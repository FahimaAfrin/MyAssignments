package week1.day1;

public class Mobile {

	public void makeCall(String mobileModel,float mobileWeight) {
		System.out.println("My Mobile Model");
	}
	
	public void sendMsg(boolean isFullCharged,int mobileCost) {
		System.out.println("My Mobile Cost");
	}
	public static void main(String[] args) {

	Mobile mymobile = new Mobile();
	mymobile.makeCall("Samsung", 2.12f);
	mymobile.sendMsg(true, 30000);
	System.out.println("This is my mobile");
	}

}
