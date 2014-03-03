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
			System.out.print("1)絤策 2)计皚 3)瞒秨");
			Scanner scanner = new Scanner(System.in);
			int opt=scanner.nextInt();
 			if(opt==1)
			{
				a=60*60+23*60+45;
				b=13*60*60+54*60+23;
				c=a-b;
				 System.out.println("4翴23だ4513翴54だ23ぇ丁羆计单:"+c+"");
			}
			if(opt==2)
			{
				for(double i : d)
				{sum+=i;}
				average=sum/d.length;
				 System.out.println("羆:"+sum+"キА"+average);
			}
			if(opt==3)
 			{
				break;
			}			
		}		
	
	}
}
