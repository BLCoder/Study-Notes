
package runnableobject;

public class CustomRunnableObject implements Runnable{
    private int counter;
    private final String threadname;
    
    //---------------Constructor------------------
    public CustomRunnableObject(String threadname,int counter){
        this.threadname=threadname;
        this.counter=counter;
    }
    @Override
    public void run(){
        while(!Thread.currentThread().isInterrupted()){
            counter++;
            try{
                Thread.sleep(100);
            }catch(InterruptedException ex){
                break;
            }
        }
    }
    public int getcounter(){
        return counter;
    }
    public String getthreadname(){
        return threadname;
    }
}