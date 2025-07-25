import java.io.*;
class fact
{	
	void factoriyal(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact *=i;
			
		}
		System.out.println("Factoriyal=" + fact);
	}
}
class FactCall
{
	public static void main(String args[])
	{
		fact facto=new fact();
		int n=Integer.parseInt(args[0]);
		facto.factoriyal(n);
	}
}