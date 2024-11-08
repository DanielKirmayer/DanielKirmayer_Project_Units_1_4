import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Horse {
    private String horseName;
    private int horseWeight;


    public Horse(String tier) throws FileNotFoundException {
        FileInputStream fs= null;
        Scanner sc = new Scanner(new File("data/data.txt"));
        List<String> lines = new ArrayList<>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        String[] arr = lines.toArray(new String[0]);

        int randomIndex = (int) (Math.random() * arr.length);
        horseName = (lines.get(randomIndex));

        if (tier.equals("S"))
            horseWeight = (int) (Math.random() * 10);
        if (tier.equals("A"))
            horseWeight = (int) (Math.random() * 8);
        if (tier.equals("B"))
            horseWeight = (int) (Math.random() * 6);
        if (tier.equals("C"))
            horseWeight = (int) (Math.random() * 5);
        if (tier.equals("D"))
            horseWeight = (int) (Math.random() * 4);
        if (tier.equals("E"))
            horseWeight = (int) (Math.random() * 2);



    }
    public String getHorseName(){
        return horseName;
    }
    public int getHorseWeight(){
        return horseWeight;
    }
}
