import java.io.*;   
import java.util.Scanner; 
public class w2_1
{
	public static void main(String[] args)
	{
		int a,b,c;
		double sum=0.0,average=0.0;
		double[] d={1.0,2.0,3.0,4.0,5.0,6.0};
		while(true)
		{
			System.out.print("1)練習一 2)數字陣列 3)離開");
			Scanner scanner = new Scanner(System.in);
			int opt=scanner.nextInt();
 			if(opt==1)
			{
				a=60*60+23*60+45;
				b=13*60*60+54*60+23;
				c=a-b;
				 System.out.println("4點23分45秒到13點54分23秒之間總秒數等於:"+c+"秒");
			}
			if(opt==2)
			{
				for(double i : d)
				{sum+=i;}
				average=sum/d.length;
				 System.out.println("總合:"+sum+"平均"+average);
			}
			if(opt==3)
 			{
				break;
			}			
		}		
	
	}
}
