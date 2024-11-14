import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean run = true;
        double playerMoney = 100;
        double risk = 0;
        int choice = 0;
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
            Thread.sleep(750);
            System.out.println("You have $100 to start!");
            Thread.sleep(750);
            double reward = 0;
            while(run){
            Horse s = new Horse("S");
            Horse a = new Horse("A");
            Horse b = new Horse("B");
            Horse c = new Horse("C");
            Horse d = new Horse("D");
            Horse e = new Horse("E");
            Race race1 = new Race(s,a,b,c,d,e);
            System.out.println("Would you like to talk to the bar? \n1.Yes \n2.No");
                int talking = scan.nextInt();
                if(talking == 1){
                    int randomTalks = (int) (1 + (Math.random() * 100));

                    if (randomTalks == 1){
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠛⠛⠒⠲⠖⠒⠛⠓⣆⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀⢹⡄⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⣠⡴⠶⠶⠶⠶⠶⣧⣤⣟⣿⣿⣛⣛⣟⣿⣶⣤⣼⡶⠶⠶⠶⡶⣤⣀\n" +
                                "⢸⣿⣿⣿⣿⣶⣶⣦⣤⣤⣭⣭⣉⣭⣭⣩⣩⣧⣤⣶⣷⣶⣶⣿⣿⣿⣿\n" +
                                "⠀⠻⣿⣿⣿⣿⣿⢙⣿⠁⠺⠿⢷⡈⢹⡿⡯⠆⢙⣿⡉⣿⣿⣿⣿⣿⠏\n" +
                                "⠀⠀⠘⠻⣿⣿⡿⣼⣿⣤⡤⠴⠟⠋⠻⣧⣤⣀⣸⣿⣽⣿⣿⣿⠟⠁⠀\n" +
                                "⠀⠀⠀⢀⡴⣛⣷⣿⣗⡒⠒⠒⠂⠀⢰⣿⠟⢉⣤⣾⡿⢟⠋⠀⠀⠀⠀\n" +
                                "⠀⠀⢠⢏⣜⡵⡟⣿⢮⡉⠉⠉⠃⠀⣾⡏⠀⢉⣼⢿⡗⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠸⠞⠋⢀⣿⢹⣷⡍⠓⠦⠄⠀⢹⡇⢀⡾⣳⠋⡇⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⢸⣩⠟⢯⠻⡄⢦⠀⠀⠈⡇⠈⢠⠃⣸⠁⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠈⠀⠀⠈⢦⡁⠘⣧⠀⠀⡇⠀⢋⡼⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣄⢹⡆⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⠖⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                                "Don't tell anyone I told you this, but the horse in lane "+race1.getFavorite()+" is the favorite to win...");
                    }


                }




            System.out.println(
                    "1. "+s.getHorseName()+" Odds: 1.5-1 \n2. "+
                            a.getHorseName()+" Odds: 2-1 \n3. "+
                            b.getHorseName()+" Odds: 3-1 \n4. "+
                            c.getHorseName()+" Odds: 4-1 \n5. "+
                            d.getHorseName()+" Odds: 10-1 \n6. "+
                            e.getHorseName()+" Odds: 25-1 \n"+
                            "Choose a horse to bet on 1-6 (not a name): ");

            boolean playerIsChoosing = true;
                while (playerIsChoosing) {
                    try {
                        choice = scan.nextInt();
                        if (choice >= 1 && choice <= 6) {
                            playerIsChoosing = false;
                        } else {
                            System.out.println("Invalid choice, please try again.");
                        }
                    } catch (InputMismatchException exception) {
                        System.out.println("Invalid choice, please try again. Choose a number 1-6 (not a name)");
                        scan.nextLine();
                    }
                }

                boolean dialogue = true;


                while (risk > playerMoney || risk <= 0){
            System.out.println("How much would you like to bet?: ");
            try {
            risk = scan.nextDouble();
            risk = (double) Math.round(risk * 100) /100;}
            catch (InputMismatchException exception) {
                System.out.println("Invalid input, please enter a number.");
                scan.nextLine();
                dialogue = false;
            }
            if (risk > playerMoney || risk <= 0 && dialogue)
                System.out.println("You don't have enough money to bet that much or the bet is too small.");

            }

            playerMoney -= risk;






            while(!race1.isRaceOver()){
                String s1 = race1.RaceAdvance(s,a,b,c,d,e);
                System.out.println(s1);}

            if(race1.getWinner()==choice) {
                if(choice==1)
                    reward = risk*2.5;
                if(choice==2)
                    reward = risk*3;
                if(choice==3)
                    reward = risk*4;
                if(choice==4)
                    reward = risk*5;
                if(choice==5)
                    reward = risk*11;
                if(choice==6)
                    reward = risk*26;
                playerMoney += reward;
                System.out.println("You won, nice job!\n" + "Your bet returned $"+reward+".\n You now have $"+playerMoney);

            }
            else{
                System.out.println("You lost!\n"+"You now have $"+playerMoney);
            }
            risk = 0;



        }
    }
}