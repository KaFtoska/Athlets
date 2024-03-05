public class Fplayer extends Athlete{
    int goals;
    public Fplayer(String name, int age, int weight,int height,int salary,int goals){

        super(name,age,weight,height,salary);
        this.goals=goals;
    }
    public String printInfo(){
        return ("Athlete-" + this.name + ",age-" + this.age + ",weight-" + this.weight + ",heihgt-" + this.height+",goals-"+this.goals+"\n");
    }
}
