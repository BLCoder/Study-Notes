package reading;


public class SubCarClass extends NewCarClass{
    private float chargeinbattery;
    private String carcolor;
    public SubCarClass(){
        super();
    }
    public SubCarClass(String manu,String model,String key,int cc,float fuel,float charge,String color){
        super(manu,model,key,cc,fuel);
        manufacturename="Ferrari";
        chargeinbattery=charge;
        carcolor=color;
    }
    public SubCarClass(String manu,String model,String key,int cc,float fuel,int year,float charge,String color){
        super(manu,model,key,cc,fuel,year);
        manufacturename="Ferrari";
        chargeinbattery=charge;
        carcolor=color;
    }
    public float getchargeinbattery(){
        return chargeinbattery;
    }
    public String getcarcolor(){
        return carcolor;
    }
    @Override
    public void printAllinfo(){
        super.printAllinfo();
        pl("Charge interface battery : "+getchargeinbattery());
        pl("Color of car : "+getcarcolor());
    }
    static void pl(Object an){
        System.out.println(an);
    }
    static void p(Object an){
        System.out.print(an);
    }
}