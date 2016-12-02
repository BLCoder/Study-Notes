

package thread1;

public class OurThread extends Thread{
    private final String threadname;
    private final int startpoint;
    private int counter;
    private final int adder;
    private final int timedifferent;
    private boolean threadaliveflag;
    private final OurThread dependthread;
    public OurThread(String threadname,int startpoint,OurThread dependthread,int adder,int timedifferent,boolean threadaliveflag){
        this.threadname=threadname;
        this.startpoint=startpoint;
        this.adder=adder;
        this.timedifferent=timedifferent;
        this.threadaliveflag=threadaliveflag;
        this.dependthread=dependthread;
    }
    @Override
    public void run(){
        counter=startpoint;
        if(dependthread!=null){
            try{
                dependthread.join();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }            
        }
        while(threadaliveflag){
            counter+=adder;
            try{
                sleep(timedifferent);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void stopthread(){
        threadaliveflag=false;
    }
    public int getcounter(){
        return counter;
    }
}