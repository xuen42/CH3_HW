package sample3_8;

public class Sample3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		car1.setNumGas(1234,20.5);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("調差樣品車時得知");
		System.out.println("將車號設爲"+number+"將汽油量設爲"+gasoline);

	}

}
class Car
{
	int num;
	double gas;
	
	int getNum()
	{
		System.out.println("調查車號");
		return num;
	}
	
	double getGas()
	{
		System.out.println("調查汽油量");
		return gas;
	}
	void setNumGas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設爲"+num+"將汽油量設爲"+gas);
	}
}
