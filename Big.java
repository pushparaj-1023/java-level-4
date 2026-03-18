import java.io.*;

class Big {
    public static void main(String args[]) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Find the biggest number");
        System.out.println("-----------------------");

        System.out.println("Enter a:");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter b:");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Enter c:");
        int c = Integer.parseInt(br.readLine());

        System.out.println("Enter d:");
        int d = Integer.parseInt(br.readLine());

        System.out.println("Result:");

        if (a > b && a > c && a > d) {
            System.out.println("Biggest number is " + a);
        } 
        else if (b > c && b > d) {
            System.out.println("Biggest number is " + b);
        } 
        else if (c > d) {
            System.out.println("Biggest number is " + c);
        } 
        else {
            System.out.println("Biggest number is " + d);
        }
    }
}