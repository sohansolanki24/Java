import java.io.*;
class Overload 
{
	void area(double r)
	{
		System.out.println("Area of circle is:"+ 3.14*r*r);
	}
	void area(int l,int b)
	{
		System.out.println("Area of rectangle is:"+ l*b);
	}
	void area(int l)
	{
		System.out.println("Area of square is:"+ l*l);
	}
}
class OverCall
{
	public static void main(String args[]) throws IOException
	{
		int r,l,b,ch;
		Overload are=new Overload();
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===============================");
		System.out.println("what do you want to find");
		System.out.println("1.Area of circle");
		System.out.println("2.Area of Rctangle");
		System.out.println("3.Area of square");
		System.out.println("4.Exite");
		System.out.println("Enter your choice");
		ch=Integer.parseInt(rd.readLine());
		switch(ch)
		{
			case 1:
				System.out.println("Enetr radius:");	
				r=Integer.parseInt(rd.readLine());
				are.area(r);
				break;
			case 2:
				System.out.println("Enetr length:");	
				l=Integer.parseInt(rd.readLine());
				System.out.println("Enetr boundry:");
				b=Integer.parseInt(rd.readLine());	
				are.area(l,b);
				break;
			case 3:
				System.out.println("Enetr length:");	
				l=Integer.parseInt(rd.readLine());
				are.area(l);
				break;
			case 4:
				break;
			default:
				System.out.println("Enter valide opection");	
				break;

		}
	}
}








