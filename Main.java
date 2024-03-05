import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


            Athlete p1=new Athlete("Alexandr ",23,85,195,2000 );
            Bplayer p2=new Bplayer("Lebron",18,75,180,150000,3000);
            Fplayer p3=new Fplayer("Messi",36,50,170,1000000,950);
            Swimmer p4=new Swimmer("Micheal",23,95,195,10000,44);


        System.out.println("ievadi");
        int a= input.nextInt();
        switch (a){
            case 1:
                System.out.println(p1.printInfo());
                break;

            case 2:
                System.out.println(p2.printInfo());
                break;


            case 3:
                System.out.println(p3.printInfo());
                break;


            case 4:
                System.out.println(p4.printInfo());
                break;
            default:
                System.out.println("Ievadiet pareizo skaitli!!!");
        }


        ArrayList<Athlete> athlets=new ArrayList<>();
        athlets.add(p1);
        athlets.add(p2);
        athlets.add(p3);
        athlets.add(p4);

        for (Athlete i:athlets) {
            i.writeFile(athlets);

        }


        String str="";
        for (Athlete i:athlets) {

            str=str+i.printInfo()+i.premia();
            //System.out.println(str);

            try {
                FileWriter fw=new FileWriter("athlets.txt");
                fw.write(str);

                fw.close();


            } catch (IOException e) {
                throw new RuntimeException(e);
            }


    }
}}