package conko1;

public class Time_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time();
		System.out.println(time.toString());
		
		
		Time time2 = new Time(555550000);
		System.out.println(time2.toString());
		
		
		Time time3 = new Time(15, 49, 50);
		System.out.println(time3.toString());

	}

}
