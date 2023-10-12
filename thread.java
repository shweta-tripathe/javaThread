class MyThread implements Runnable
{
    public void run()
    {
        for(int i=1; i<=10; i++){
            System.out.println("print the value of " + i );
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }

    public static void main (String args[]){
        MyThread th = new MyThread();
        Thread t1 = new Thread(th);
        t1.start();   
    }

} 