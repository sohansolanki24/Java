//Armstrong number
import java.io.*;
class Armstrong
{
    void isarmstrong(int n)
    {
        int sum=0,original=n;
        while(n>0)
        {
            int rem=n%10;
            sum +=rem*rem*rem;
            n /=10;
        }
        //return sum==n;
        if(sum==original)
        {
            System.out.println(original+ " is Armstrong number");
        }
        else
        {
            System.out.println(original+ " is not Armstrong number");
        }
    }
}
class ArmCall
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number you want to check:");
        int n=Integer.parseInt(rd.readLine());
        Armstrong a=new Armstrong();
        a.isarmstrong(n);
    }
}