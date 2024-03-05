public class Swimmer extends Athlete{
    int time;
    public Swimmer(String name, int age, int weight,int height,int salary,int time){

        super(name,age,weight,height,salary);
        this.time=time;
    }
    public String printInfo(){
        return ("Athlete-" + this.name + ",age-" + this.age + ",weight-" + this.weight + ",heihgt-" + this.height+",best time-"+this.time+"\n");
    }
}
