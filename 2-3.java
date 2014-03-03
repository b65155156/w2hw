import java.io.*; 
import java.util.*;
import java.util.Scanner;
public class Week2.3 
{	
	public static void main(String args[])
	{
		while(ture)
		{
			System.out.println("1)練習一 2)練習二 3)離開:");
			Scanner n= new Scanner(System.in);
			opt=n.nextInt();
			if(opt==1)
			{
				circle[] c=new circle[100];
				int count=0;
				System.out.println("輸入半徑");
				while(ture)
				{
					Scanner n2= new Scanner(System.in);
					double angle= n2.nextDouble();
					if(angle==-1)
					{break;}
					else
					{
						c[count] = new circle(angle);
						System.out.println(c[count].output(angle));
						count++;
					}
				}
				while(ture)
				{
					System.out.print("編號(Exit -1):");
					id=n.nextInt();
					System.out.print("角度(Exit -1): ");
					angle=n.nextDouble();
					if(id== -1 || angle== -1)
						break;
					else
					{
						System.out.println(c[id].output(angle));
					}
				}
			}
			if(opt==2)
			{
				int y,m,d;
				Scanner scan=new Scanner(System.in);
				System.out.print("年:");
				y=scan.nextInt();
				System.out.print("月:");
				m=scan.nextInt();
				System.out.print("日:");
				d=scan.nextInt();
				currect cur=new currect(y,m,d); 
			}
			if(opt==3)
			{break;}
		}	
	}
}
class circle
{
	double r;
	double Arc(double angle) //hl
	{
		return 3.14*2*r*(angle/360);
	}	
	double Pie(double angle) //mg
	{
		return 3.14*r*r*(angle/360);
	}
	void output(double angle)
	{
		System.out.println("胡長:"+Arc(angle)+"面積"+Pie(angle));
	}
}
class currect
{
	int year , month, day;
	if(year<0)
	{
		System.out.println("year error");	
	}
	else
		System.out.println("year ok!");
	if(month>0&&month<=12)
		System.out.println("month ok!");
	else
		System.out.println("month error");
	while(ture)
	{
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			if(day>0&&day<=31)
				System.out.println("day ok!");
			else
				System.out.println("day error!");
		}
		if(month==2)
		{
			if(day>0&&day<=28)
				System.out.println("day ok!");
			else
				System.out.println("day error!");
		}
		if(month==4||month==6||month==9||month==11)
		{
			if(day>0&&day<=30)
				System.out.println("day ok!");
			else
				System.out.println("day error!");
		}
	}
}