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
			system.out.print("1)練習一 2)數字陣列 3)離開");
			Scanner n = new Scanner(System.in);
			opt=n.nextInt();
 			if(opt==1)
			{
				a=60*60+23*60+45;
				b=13*60*60+54*60+23;
				c=a-b;
				system.out.println("4點23分45秒到13點54分23秒之間總秒數等於:"+c+"秒");
			}
			if(opt==2)
			{
				for(double i : d)
				{sum+=i;}
				average=sum/d.length;
				system.out.println("總合:"+sum+"平均"+average);
			}
			if(opt==3)
 			{
				break;
			}			
		}		
	
	}
}
