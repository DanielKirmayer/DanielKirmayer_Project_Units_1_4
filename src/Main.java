import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean run = true;
        double playerMoney = 100;
            Scanner scan = new Scanner(System.in);
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⣀⣀⣀⣠⠔⠊⠑⠒⣷⠆⢸⢳⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⢀⠔⠋⠁⠀⠀⠉⠁⠒⠤⣄⠋⠀⠈⢧⡇⠀⠀⣰⣶⢆⠀\n" +
                    "⠀⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢉⣐⠒⠼⠿⠔⣊⣿⣿⢸⠀\n" +
                    "⠀⠀⡇⠀⠀⠀⠀⢀⣤⡒⠋⣩⢉⠙⠛⢿⣿⡶⣾⣿⣿⣿⡌⠀\n" +
                    "⠀⠀⠹⡄⠀⠀⢀⣾⣾⠁⢘⣭⣷⣶⠃⣿⣾⣷⣿⣿⣟⠝⠀⠀\n" +
                    "⠀⠀⠀⠈⠢⣀⣸⢳⠛⡄⠀⠀⠀⠁⠀⣧⡀⢸⡽⠗⠁⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠈⠳⡄⠁⢠⠀⠀⠋⢱⢿⣷⡿⠁⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⡿⠀⢀⠐⠀⢭⣭⣽⣩⡇⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⢀⣴⡇⠑⢬⣀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⢀⠎⠹⡕⠠⢀⣈⠻⢿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⣀⠤⠒⠒⡇⠀⠀⠈⠢⣔⣭⣙⣛⣿⣽⣇⡏⣣⣀⠀⠀⠀⠀\n" +
                    "⠉⠀⠀⠀⠀⠘⡄⠀⠀⣠⠴⡟⠍⡻⠟⣿⠘⣷⣇⢧⡉⠉⠉⠁\n" +
                    "⠀⠀⠀⠀⠀⠀⣇⣠⠾⠃⠀⠓⠤⢔⣄⢣⠃⡇⣿⠚⠉⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠉⢧⠁⡇⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠀⠛⠀⠀⠀⠀⠀⠀");

            System.out.println("Howdy partner, ready to gamble? ");
            String firstInteraction = scan.next();
            System.out.println(firstInteraction);
            double reward = 0;
            while(run){
            Horse s = new Horse("S");
            Horse a = new Horse("A");
            Horse b = new Horse("B");
            Horse c = new Horse("C");
            Horse d = new Horse("D");
            Horse e = new Horse("E");

            Race race1 = new Race(s,a,b,c,d,e);

            System.out.println(
                    "1. "+s.getHorseName()+" Odds: 2-1 \n2. "+
                            a.getHorseName()+" Odds: 2.5-1 \n3. "+
                            b.getHorseName()+" Odds: 3-1 \n4. "+
                            c.getHorseName()+" Odds: 4-1 \n5. "+
                            d.getHorseName()+" Odds: 5-1 \n6. "+
                            e.getHorseName()+" Odds: 10-1 \n"+
                            "Choose a horse to bet on: ");
            int choice = scan.nextInt();
            System.out.println("How much would you like to bet?: ");
            int risk = scan.nextInt();

            playerMoney -= risk;






            while(!race1.isRaceOver()){
                String s1 = race1.RaceAdvance(s,a,b,c,d,e);
                System.out.println(s1);}

            if(race1.getWinner()==choice) {
                if(choice==1)
                    reward = risk*3;
                if(choice==2)
                    reward = risk*3.5;
                if(choice==3)
                    reward = risk*4;
                if(choice==4)
                    reward = risk*5;
                if(choice==5)
                    reward = risk*6;
                if(choice==6)
                    reward = risk*11;
                playerMoney += reward;
                System.out.println("You won, nice job!\n" + "Your bet returned $"+reward+".\n You now have $"+playerMoney);

            }
            else{
                System.out.println("You lost!\n"+"You now have $"+playerMoney);
            }
        }
    }
}