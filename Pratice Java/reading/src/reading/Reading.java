

package reading;

public class Reading{
    public static void main(String[] args){
        NewCarClass ourcar=new NewCarClass();
        NewCarClass ouranothercar=new NewCarClass("TOYOTA","Allion","rtyfgh",10000,30);
        NewCarClass thirdcar=new NewCarClass("MASTA","Axela","ertdfg",1500,20);
        SubCarClass oursubclass=new SubCarClass("BMW","7 Serise","ewrert",3000,25,10,"Gray");
        
//        pl("Manufacturer : "+ouranothercar.manufacturename);
//        pl("Model Name : "+ouranothercar.getmodelname());
//        pl("Password Match : "+ouranothercar.matchpass("rtyfgH"));
//        pl("2nd car name : "+ouranothercar.enginecc);
//        pl("Amount of Fuel : "+ouranothercar.presentamountoffuel()+"L");
//        ouranothercar.addfuel(2);
//        pl("After adding 2L : "+ouranothercar.presentamountoffuel()+"L");
//        ouranothercar.runforsecond(60);
//        pl("Amount of Fuel after driving fro 60s : "+ouranothercar.presentamountoffuel()+"L");
        ouranothercar.printAllinfo();
        
        pl("-------------------------");
        
//        pl("Manufacturer : "+thirdcar.manufacturename);
//        pl("Model Name : "+thirdcar.getmodelname());
//        pl("Password Match : "+thirdcar.matchpass("rtyfgH"));
//        pl("2nd car name : "+thirdcar.enginecc);
//        pl("Amount of Fuel : "+thirdcar.presentamountoffuel()+"L");
//        thirdcar.addfuel(2);
//        pl("After adding 2L : "+thirdcar.presentamountoffuel()+"L");
//        thirdcar.runforsecond(60);
//        pl("Amount of Fuel after driving fro 60s : "+thirdcar.presentamountoffuel()+"L");
        thirdcar.printAllinfo();
        
        pl("---------------------");
        
//        pl("Manufacturer : "+oursubclass.manufacturename);
//        pl("Model Name : "+oursubclass.getmodelname());
//        pl("Password Match : "+oursubclass.matchpass("rtyfgH"));
//        pl("2nd car name : "+oursubclass.enginecc);
//        pl("Amount of Fuel : "+oursubclass.presentamountoffuel()+"L");
//        oursubclass.addfuel(2);
//        pl("After adding 2L : "+oursubclass.presentamountoffuel()+"L");
//        oursubclass.runforsecond(60);
//        pl("Amount of Fuel after driving fro 60s : "+oursubclass.presentamountoffuel()+"L");
//        pl("Charge interface battery : "+oursubclass.getchargeinbattery());
//        pl("Color of car : "+oursubclass.getcarcolor());
        oursubclass.printAllinfo();
    }
    static void pl(Object an){
        System.out.println(an);
    }
    static void p(Object an){
        System.out.print(an);
    }
}