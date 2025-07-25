
class Arithmatic
{
	int res;
	void cal(int a,int b)
	{
		res=a+b;
			System.out.println("sum=" + res);
			res=a-b;
			System.out.println("sub=" + res);
			res=a*b;
			System.out.println("mul=" + res);
			res=a/b;
			System.out.println("div=" + res);
	}
}
class ArithCall
{
	public static void main(String args[])
	{
		int x=0,y=0;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		Arithmatic ob= new Arithmatic();
		ob.cal(x,y);
	}
}