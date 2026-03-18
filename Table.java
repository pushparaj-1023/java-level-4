import java.io.*;

class Table
{
    public static void main(String args[]) throws IOException
{
        
    
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);

   System.out.println("Table program");
   System.out.println("enter the totalno");
   String s1=br.readLine();
   int a=Integer.parseInt(s1);
   System.out.println(a+"th table");

   for(int i=1;i<10;i++)
   {
    System.out.println(i+"x"+a+"="+(i*a));
   }
  }
}