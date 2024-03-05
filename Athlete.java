import java.util.ArrayList;

public class Athlete {
    String name;
    int age;
    int weight;
    int height;
    int salary;
    public Athlete(String name, int age, int weight, int height, int salary){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.salary=salary;
    }
    public String printInfo(){
        return ("Athlete-" + this.name + ",age-" + this.age + ",weight-" + this.weight + ",heihgt-" + this.height+",salary-"+this.salary+"\n");
    }
    public String premia(){
        return("premia-"+String.valueOf(premia2()+"\n"));

    }
    public double premia2(){

        double price=(salary*1.5);
        return price;
    }

    public void writeFile(ArrayList<Athlete> athlets) {
    }


}

