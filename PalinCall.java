class palindrom
{
	boolean ispalindrom(int n)
	{
			int original=n;
			int rev=0;
			while(n>0)
			{
			 	int res=n%10;
			 	rev=rev*10+res;
			 	n=n/10;
			}
			return original==rev;		
			
	}
	void print()
	{
		for(int i=1;i<=1000;i++)
		{
			if(ispalindrom(i))
				System.out.print(i +" ");
		}
	}
}
class PalinCall
{
	public static void main(String args[])
	{
		palindrom p=new palindrom();
		System.out.println("Palindrome number between 1 to 1000 are:");
		p.print();
	}
}