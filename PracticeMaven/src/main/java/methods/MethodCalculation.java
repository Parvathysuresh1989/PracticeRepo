package methods;
//Question no 28 a)

public class MethodCalculation 
{

	public void calculation(int num1,int num2,int num3)
	{
		/*int a=num1;
		int b=num2;
		int c=num3;
		int sum=a+b+c;*/
		int sum=num1+num2+num3;
		int avg=sum/3;
		System.out.println("Average of integers= "+avg);
	
	}
	public void calculation(float a,float b,float c)
	{
		float sum=a+b+c;
		float av=sum/3;
		System.out.println("Average of floating nos= "+av);
	}
	public static void main(String[] args) 
	{
		MethodCalculation obj=new MethodCalculation();
		obj.calculation(2, 4, 6);
		obj.calculation(2.2f, 4.4f, 6.6f);
	}

}
