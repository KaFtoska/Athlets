public class Bplayer extends Athlete {

    int points;

    public Bplayer(String name, int age, int weight, int height, int salary,int points){

        super(name,age,weight,height,salary);
        this.points=points;
    }


    public String printInfo(){
        return ("Athlete-" + this.name + ",age-" + this.age + ",weight-" + this.weight + ",heihgt-" + this.height+",points-"+this.points+"\n");
    }
}
