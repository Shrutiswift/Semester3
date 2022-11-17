import java.sql.SQLOutput;
import java.util.Scanner;

public class DobExcep{
    public static void main(String[] args) {
        System.out.println("Enter a number of elements: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        System.out.println("Enter the numbers: ");
//        for (int i = 0; i < n; i++) {
//            int b = in.nextInt();
//        }
        String s = Integer.toString(n);
        int count = s.length();
        System.out.println(count);
        try{
            Exception e = null;
            if(count != 8){
                throw e;
            }
        }
        catch(Exception e){
            System.out.println("Cannot be processed");
        }

    }
}
