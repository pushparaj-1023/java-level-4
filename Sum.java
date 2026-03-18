import java.io.*;

class Sum {
    public static void main(String args[]) throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the value of N:");
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}