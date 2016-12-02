package reading;

public class NewCarClass{
    public String manufacturename;
    private String modelname;
    private String passkey;
    int enginecc;
    private float fuelamount;
    final private float amountoffuelconsumepersecond=0.02f;
    protected int manufactureyear;
    public NewCarClass(){
        manufacturename=new String();
        modelname=new String();
        enginecc=1000;
        fuelamount=0;
        manufactureyear=0;
    }
    public NewCarClass(String carname){
        manufacturename=new String(carname);
        modelname=new String();
        enginecc=0;
        fuelamount=0;
        manufactureyear=0;
    }
    public NewCarClass(String manu,String model,String key,int enginecc,float fuel){
        manufacturename=manu;
        modelname=model;
        passkey=key;
        this.enginecc=enginecc;
        fuelamount=fuel;
        manufactureyear=0;
    }
    public NewCarClass(String manu,String model,String key,int enginecc,float fuel,int year){
        this(manu,model,key,enginecc,fuel);
        manufactureyear=year;
    }
    public float presentamountoffuel(){
        return fuelamount;
    }
    public String getmanufacturename(){
        return manufacturename;
    }
    public String getmodelname(){
        return modelname;
    }
    public void addfuel(float fuelamount){
        this.fuelamount+=fuelamount;
    }
    public void runforsecond(int timeinsecond){
        float usedfuel=timeinsecond*amountoffuelconsumepersecond;
        fuelamount-=usedfuel;
    }
    public boolean matchpass(String userinput){
        return userinput.equals(passkey);
    }
    public void printAllinfo(){
        pl("Manufacturer : "+manufacturename);
        pl("Model Name : "+getmodelname());
        pl("Password Match : "+matchpass("rtyfgH"));
        pl("2nd car name : "+enginecc);
        pl("Amount of Fuel : "+presentamountoffuel()+"L");
        addfuel(2);
        pl("After adding 2L : "+presentamountoffuel()+"L");
        runforsecond(60);
        pl("Amount of Fuel after driving fro 60s : "+presentamountoffuel()+"L");
    }
    static void pl(Object an){
        System.out.println(an);
    }
    static void p(Object an){
        System.out.print(an);
    }
} 