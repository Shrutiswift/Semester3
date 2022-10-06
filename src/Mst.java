import java.util.ArrayList;
import java.util.Scanner;

public class Mst {
    static void print(int p, int q){
        int n = 10;
        for(int i = 1; i < 11; i++) {
            System.out.println((p*i) + "*" + (q*i)+ "=" + (p*i)*(q*n));
        }
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a num1 and num2: ");
        ArrayList<Integer> a = new ArrayList<>();
        int p = n.nextInt();
        int q = n.nextInt();
        print(p, q);
        a.add((p*i)*(q*n));
    }
}
