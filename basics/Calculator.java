
import java.io.*;

public class Calculator {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the operator:");
            char ch = (char) br.read();
            br.readLine();
            System.out.print("Enter the first number :");
            int a = Integer.parseInt(br.readLine());
            System.out.print("Enter the second number :");
            int b = Integer.parseInt(br.readLine());
            if (ch == '+') {
                System.out.println(a + b);
            } else if (ch == '-') {
                System.out.println(a - b);
            } else if (ch == '*') {
                System.out.println(a * b);

            } else if (ch == '/') {
                System.out.println(a / b);
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }
}