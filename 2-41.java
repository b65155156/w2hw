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

class Oval extends Circle
{
	double b = 0.0;
	double Pie() { //面積
		return 3.14*r*r*b;
	}
}
public class Week2.41
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
				oval[] c=new oval[100];
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
						c[count] = new oval(angle);
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
		}
	}
}