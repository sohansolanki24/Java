import java.io.*;
class prime
{
    void input() throws IOException
    {
        BufferedReader rd=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(rd.readLine());
      /*   while(n==1)
        {
            System.out.println("1 is a not prime number");
            break;
        }  */
        if(n%2==0)
            System.out.println("number is not prime number");
        else 
            System.out.println("number is prime");
    }

}
class PrimeCall
{
    public static void main(String args[]) throws IOException
    {
        prime p=new prime();
        p.input();
    }
}