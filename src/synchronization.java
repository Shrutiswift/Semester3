public class synchronization extends Thread {
    synchronized public void printThread()
    {
        System.out.println("this is a printhead method");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Thread " + n
////                    + " is working...");
//            try {
//                Thread.sleep(600);
//            }
//            catch (Exception ex) {
//                System.out.println(ex.toString());
//            }
        System.out.println("--------------------------");
        try {
            Thread.sleep(6000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        synchronization s = new synchronization();
        s.printThread();
    }
}
