class Circle 
{
	void area(int r)
	{	
		float res=(float)(3.14*r*r);
		System.out.println("Area=" + res);
	}
	void circumfrence(int r)
	{
		float res=(float)(2*3.14*r);
		System.out.println("Circumfrence=" + res);
	}	
}
class CircleCall
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		int r=Integer.parseInt(args[0]);
		c.area(r);
		c.circumfrence(r);
	}
}