
import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the measured temperature from thermometer:");
        int temp = sc.nextInt();
        String f = (temp >= 100) ? "person is suffering form fever" : "Person's health is good";
        System.out.println(f);
    }
}
