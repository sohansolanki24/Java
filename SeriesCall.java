// import java..io.*;
class Series
{
	int a=0,b=1,res;
	void cal(int n)
	{
		for(int i=0;i<=n;i++)
		{
			System.out.println(a +" ");
			res=a+b;
			a=b;
			b=res;
		}
	}
}
class SeriesCall
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		Series s=new Series();
		s.cal(n);
	}
}