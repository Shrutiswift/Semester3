class thread extends Thread implements Runnable{
    public void run(){
        System.out.println("Run");
    }
    public void start(){
        System.out.println("This is start method");
        try{
            thread.sleep(8000);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        thread t = new thread();
        Runnable th = new thread();
        t.start();
//        t.sleep()
        th.run();
    }
}
