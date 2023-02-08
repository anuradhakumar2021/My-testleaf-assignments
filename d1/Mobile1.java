package week1.d1;

public class Mobile1 {
	public void makeCall() {
		String mobileModel = "Apple";
		float mobileWeight = 125.8f;
		System.out.println("The mobile model is " + mobileModel);
		System.out.println("The mobile weight is " + mobileWeight);
	}
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 25000;
		System.out.println("Is my mobile full charged? " + isFullCharged);
		System.out.println("My mobile cost is " + mobileCost);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile1 obj =new Mobile1();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my mobile");
	}

}
