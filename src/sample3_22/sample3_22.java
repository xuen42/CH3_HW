package sample3_22;

public class sample3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("宣告car1");
		Car car1;
		car1 = new Car();
		car1.setCar(1234,20.5);
		
		System.out.println("宣告car2");
		Car car2;
		
		System.out.println("將car1指定給car2");
		car2 = car1;
		
		System.out.println("car1的");
		car1.show();
		
		System.out.println("car2的");
		car2.show();
		
		System.out.println("改變car1的相關資料");
		car1.setCar(2345,30.5);
		
		System.out.println("car1的");
		car1.show();
		
		System.out.println("car2的");
		car2.show();
	}

}
class Car
{
	private int num;
	private double gas;
	
	public Car() 
	{
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	
	void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設爲"+num+"將汽油量設爲"+gas);
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}