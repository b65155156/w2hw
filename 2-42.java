import java.util.Scanner;
abstract class Shape 
{
	abstract void print();
}
class Circle extends Shape 	
{
	Circle (double r)
	{
		this.r=a;
	}
	public void print()
	{
		System.out.println ("Circle  ,area:"+r*r*3.14);
	}
}
class Oval extends Shape 	
{
	Oval (double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public void print()
	{
		System.out.println ("Oval ,area:"+a*b*3.14);
	}
}
class Rectangle extends Shape 	
{
	Rectangle (double a,double b)
	{
		this.a=a;
		this.b=b;
	}	
	public void print()
	{
		System.out.println("Rectangle ,area:"+a*b);
	}
}
class Triangle extends Shape 	
{
	double a, b;
	Triangle(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public void print()
	{
		System.out.println("Triangle ,area:"+a*b/2);
	}
}

public class Week2_42 
{
	public static void main(String[] args) 
	{	
		double a=0.0 , b=0.0;
		ArrayList<Shape> arrayList=new ArrayList<Shape>();
		Scanner scan=new Scanner(System.in);
		int opt=0,c=0;
		while(ture)
		{
			System.out.printIn("1)Triangle 2)Rectangle 3)Circle 4)Oval 5)exit:");
			opt=scan.nextInt();
			if(opt==1)
			{
				Triangle tri;
				System.out.println("請輸入底:");
				a=scan.nextDouble();
				System.out.println("請輸入高:");
				b=scan.nextDouble();
				tri=new Triangle(a,b);
				arrayList.add(tri);
				tri=null;
				c++;
			}
			if(opt==2)
			{
				Rectangle rec;
				System.out.println("請輸入長:");
				a=scan.nextDouble();
				System.out.println("請輸入寬:");
				b=scan.nextDouble();
				rec=new Rectangle (a,b);
				arrayList.add(rec);
				rec=null;
				c++;				
			}
			if(opt==3)
			{
				Circle cir;
				System.out.println("請輸入半徑:");
				a=scan.nextDouble();
				cir=new Circle (a);
				arrayList.add(cir);
				cir=null;
				c++;				
			}
			if(opt==4)
			{
				Oval ova;
				System.out.println("請輸入長:");
				a=scan.nextDouble();
				System.out.println("請輸入寬:");
				b=scan.nextDouble();
				ova=new Oval(a,b);
				arrayList.add(ova);
				ova=null;
				c++;	
			}
			if(opt==5)
			{break;}
			
		}
		for(int i=0;i<count;i++)
		{
			arrayList.get(i).show();
		}
	}
}