import java.io.*;

class Marklist {
    public static void main(String args[]) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
       
        System.out.println("student mark list");
        System.out.println("_________________");
        System.out.println("enter the enorollment no");
 	String s1=br.readLine();
	System.out.println("enter the name");
 	String s2=br.readLine();
 	System.out.println("enter java mark");
	String s3=br.readLine();
	int m1=Integer.parseInt(s3);
	System.out.println("enter the cws");
	String s4=br.readLine();
	int m2=Integer.parseInt(s4);
	
	System.out.println("enter os mark");
        String s5=br.readLine();
	int m3=Integer.parseInt(s5);

	int Total = m1+m2+m3;
        System.out.println("Total mark:"+Total);
	int Average= Total / 3;
	System.out.println("Average mark:"+Average);
	
	if(m1 >=35 && m2 >=35 )
	
	    System.out.println("result:parse");
	else
	    System.out.println("Fail");
	if(Total>=250)
 	    System.out.println("O");
        else 
         if(Total>=200)
            System.out.println("A+");
	else 
         if(Total>100)
	    System.out.println("A");
       }
   }
