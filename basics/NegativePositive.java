
import java.io.*;

public class NegativePositive {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the number :");
            int s = Integer.parseInt(br.readLine());
            String k = (s < 0) ? "Negative" : "Positive";
            System.out.println("Given number is " + k);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (NumberFormatException j) {
            System.out.println(j.getMessage());
        }
    }
}