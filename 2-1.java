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
			system.out.print("1)�m�ߤ@ 2)�Ʀr�}�C 3)���}");
			Scanner n = new Scanner(System.in);
			opt=n.nextInt();
 			if(opt==1)
			{
				a=60*60+23*60+45;
				b=13*60*60+54*60+23;
				c=a-b;
				system.out.println("4�I23��45���13�I54��23�����`��Ƶ���:"+c+"��");
			}
			if(opt==2)
			{
				for(double i : d)
				{sum+=i;}
				average=sum/d.length;
				system.out.println("�`�X:"+sum+"����"+average);
			}
			if(opt==3)
 			{
				break;
			}			
		}		
	
	}
}
