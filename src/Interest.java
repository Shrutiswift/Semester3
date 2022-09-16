import java.io.FileInputStream;
public class Interest{
    public static void main(String[] args) {
        try{
            FileInputStream a = new FileInputStream("D:\\File.txt");
            int i = 0;
            while((i = a.read())!= -1){
                System.out.print((char)i);
            }
            a.close();
        }catch (Exception e){
                System.out.println(e);
            }
    }
}