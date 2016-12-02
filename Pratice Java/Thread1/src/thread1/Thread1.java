


package thread1;
import java.util.*;
public class Thread1{
    private static OurThread thread2=new OurThread("Child 1",0,null,1,500,true);
    private static OurThread thread3=new OurThread("Child 2",100,thread2,10,1000,true);
    private static OurThread thread4=new OurThread("Child 3",1000,thread3,100,2000,true);
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        thread2.start();
        thread3.start();
        thread4.start();
        
        pl("Please write a Command : ");
        
        String commandstring = sc.nextLine();
        
        while(!commandstring.toLowerCase().equals("exits")){
            if(commandstring=="exits") break;
            else if(commandstring.equals("1")){
                pl("Counter in 1: "+thread2.getcounter());
                threadalive();
            }else if(commandstring.equals("2")){
                pl("Counter in 2: "+thread3.getcounter());
                threadalive();
            }else if(commandstring.equals("3")){
                pl("Counter in 3: "+thread4.getcounter());
                threadalive();
            }else if(commandstring.equals("1S")){
                thread2.stopthread();
                pl("Thread 1 is stopped");
                threadalive();
            }else if(commandstring.equals("2S")){
                thread3.stopthread();
                pl("Thread 2 is stopped");
                threadalive();
            }else if(commandstring.equals("3S")){
                thread4.stopthread();
                pl("Thread 3 is stopped");
                threadalive();
            }else pl("Please give me a proper comand!!");
            commandstring=sc.nextLine();
        }
    }
    static void pl(Object an){
        System.out.println(an);
    }
    static void p(Object an){
        System.out.print(an);
    }
    private static void threadalive(){
        pl("Thread 1 is Alive : "+thread2.isAlive());
        pl("Thread 2 is Alive : "+thread3.isAlive());
        pl("Thread 3 is Alive : "+thread4.isAlive());
    }
}