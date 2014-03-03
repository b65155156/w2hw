import java.io.*;  
import java.util.Scanner;  
public class W2.2
{
	public static void main(String[] args)
	{
		string name;
		int y=0,m=0,d=0; 
		//op1
		double a=0.0,b=0.0,sum=0.0;
		while(ture)
		{
			system.out.print("1)練習一 2)練習二 3)練習三 4)練習四 5)離開");
			Scanner n = new Scanner(System.in);
			opt=n.nextInt();
 			if(opt==1)
			{
				BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("請輸入姓名:"); 
 				name=a.readline();
				Scanner y = new Scanner(System.in);
				Scanner m = new Scanner(System.in);
				Scanner d = new Scanner(System.in);
				y-=1911;
				System.out.println("您的名字:"+name+"\n生日 民國:"+y+"年"+m+"月"+d+"日");
			}
			if(opt==2)
			{
				while(ture)
				{
					system.out.print("1)+ 2)- 3)* 4)/ 5) 離開");
					Scanner n2 = new Scanner(System.in);
					opt2=n.nextInt();
					switch(opt)
					{
						case 1:
							sum=a+b;
							System.out.println("the answer is"+sum);
							break;	
						case 2:
							sum=a-b;
							System.out.println("the answer is"+sum);
							break;
						case 3:
							sum=a*b;
							System.out.println("the answer is"+sum);
							break;
						case 4:
							if(b==0)
							{
								System.out.println("error");
								break;
							}
							else
							{
								sum=a/b;
								System.out.println("the answer is"+sum);
								break;
							}
						case 5:
							break;
					}
				}
			}	
			if(opt==3)
 			{
				system.out.print("請輸入西元年:");
				Scanner n = new Scanner(System.in);
				wyn=n.nextInt();
				System.out.println("閏年:");
				for(i:year)
				{
					if(i%400==0||(i%4==0 && i%100!=0))
						System.out.print(i);
				}
			}	
			if(opt==4)
			{
				stu[] stu=new stu[100];
				int peonum=0,g=0;
				while(ture)
				{	
					system.out.print("1)新增 2)刪除 3)離開");
					Scanner n2 = new Scanner(System.in);
					opt2=n2.nextInt();
					if(opt==1)
					{
						while(ture)
						{
					 		System.out.println("請輸入學生姓名 以及成績:");
							string name2=a.readline();
							Scanner g = new Scanner(System.in);
							stu[pronum]=new stu(name2,g)
							pronum++;
						}
					}
					if(opt==2)
					{
						while(1)
						{
							System.out.println("輸入編號;");
							Scanner n = new Scanner(System.in);
							num2=n.nextInt();
							if(num2<=-1 || num2>pronum)
							{
								System.out.println("錯誤編號");
							}
							else
							{
								System.out.println("學生姓名"+"stu[num2].stuname+"學生成績"+stu[num2].stugra");
							}
						}
					}
				}
			}
			if(opt==5)
			{break;}		
		}		
	
	}
}
public class stu
{
	private string stuname;
	private int stugra;
	public stu(string name,int gra)
	{
		stuname=name;
		stugra=gra;
	}
}
