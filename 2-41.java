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
		System.out.println("�J��:"+Arc(angle)+"���n"+Pie(angle));
	}
}

class Oval extends Circle
{
	double b = 0.0;
	double Pie() { //���n
		return 3.14*r*r*b;
	}
}
public class Week2.41
{	
	public static void main(String args[])
	{
		while(ture)
		{
			System.out.println("1)�m�ߤ@ 2)�m�ߤG 3)���}:");
			Scanner n= new Scanner(System.in);
			opt=n.nextInt();
			if(opt==1)
			{
				oval[] c=new oval[100];
				int count=0;
				System.out.println("��J�b�|");
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
					System.out.print("�s��(Exit -1):");
					id=n.nextInt();
					System.out.print("����(Exit -1): ");
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