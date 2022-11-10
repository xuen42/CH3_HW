package sample3_6;


public class Sample3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		car1.setNum(1234);
		car1.setGas(20.5);

	}

}
class Car
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num=n;
		System.out.println("將車號設爲"+num);
	}
	void setGas(double g)
	{
		gas=g;
		System.out.println("將汽油量設爲"+gas);
	}
}
