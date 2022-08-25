import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Shruti Sharma\n21BCS9445\n");
        System.out.println("Enter a number: ");
        int p = n.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.println(p + "*" + i + "=" + p*i);
        }
        n.close();
    }
}
