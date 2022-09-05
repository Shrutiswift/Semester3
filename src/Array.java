import java.util.ArrayList;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        ArrayList <Integer> a = new ArrayList<>();
        a.add(n.nextInt());
        System.out.println(a);
    }

}
