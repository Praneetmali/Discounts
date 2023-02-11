import java.util.*;
public class Discount {
	public static void main(String[]args)
	{
		int unit;
		double tc,dis;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr quantity=");
		unit=sc.nextInt();
		tc=unit*100;
		System.out.println("total cost="+tc);
		if(tc>100)
		{
			dis=tc*10/100;
			tc=tc-dis;
			System.out.println("final cost="+tc);
		}
		else
		{
		System.out.println("final cost="+tc);
		}
	}

}
