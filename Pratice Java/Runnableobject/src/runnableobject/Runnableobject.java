

package runnableobject;
import java.util.*;

public class Runnableobject{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        CustomRunnableObject firstobject=new CustomRunnableObject("FIRST",0);
        CustomRunnableObject secondobject=new CustomRunnableObject("SECOND",100);
        CustomRunnableObject thirdobject=new CustomRunnableObject("THIRD",1000);
        
        Thread firstthread=new Thread(firstobject);
        Thread secondthread=new Thread(secondobject);
        Thread thirdthread=new Thread(thirdobject);
        Thread forththread=new Thread(firstobject);
        
        firstthread.start();
        secondthread.start();
        thirdthread.start();
        forththread.start();
        
        pl("Please write a Command : ");
        String commandstring = sc.nextLine();
        
        while(!commandstring.toLowerCase().equals("exits")){
            if(commandstring=="exits") break;
            else if(commandstring.equals("1")){
                pl("Counter in 1: "+firstobject.getcounter());
            }else if(commandstring.equals("2")){
                pl("Counter in 2: "+secondobject.getcounter());
            }else if(commandstring.equals("3")){
                pl("Counter in 3: "+thirdobject.getcounter());
            }else if(commandstring.equals("4")){
                pl("Counter in 4: "+firstobject.getcounter());
            }else if(commandstring.equals("1S")){
                firstthread.interrupt();
                pl("Thread 1 is stopped");
            }else if(commandstring.equals("2S")){
                secondthread.interrupt();
                pl("Thread 2 is stopped");
            }else if(commandstring.equals("3S")){
                thirdthread.interrupt();
                pl("Thread 3 is stopped");
            }else if(commandstring.equals("4S")){
                forththread.interrupt();
                pl("Thread 4 is stopped");
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
}