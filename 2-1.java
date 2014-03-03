import java.io.*;    
public class W2.1
{
	public static void main(String[] args)
	{
		int a,b,c,n;
		double sum=0.0,average=0.0;
		double[] d={1.0,2.0,3.0,4.0,5.0,6.0};
		while(ture)
		{
			system.out.print("1)絤策 2)计皚 3)瞒秨");
			Scanner n = new Scanner(System.in);
			opt=n.nextInt();
 			if(opt==1)
			{
				a=60*60+23*60+45;
				b=13*60*60+54*60+23;
				c=a-b;
				system.out.println("4翴23だ4513翴54だ23ぇ丁羆计单:"+c+"");
			}
			if(opt==2)
			{
				for(double i : d)
				{sum+=i;}
				average=sum/d.length;
				system.out.println("羆:"+sum+"キА"+average);
			}
			if(opt==3)
 			{
				break;
			}			
		}		
	
	}
}
