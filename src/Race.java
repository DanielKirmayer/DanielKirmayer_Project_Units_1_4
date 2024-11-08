import java.io.*;
import java.lang.*;

public class Race {

    private int sAdvance;
    private int aAdvance;
    private int bAdvance;
    private int cAdvance;
    private int dAdvance;
    private int eAdvance;
    private int sWeight;
    private int aWeight;
    private int bWeight;
    private int cWeight;
    private int dWeight;
    private int eWeight;
    private int totalWeight;




    Race(Horse s,Horse a,Horse b,Horse c,Horse d,Horse e){
        int sWeight = s.getHorseWeight();
        int aWeight = a.getHorseWeight();
        int bWeight = b.getHorseWeight();
        int cWeight = c.getHorseWeight();
        int dWeight = d.getHorseWeight();
        int eWeight = e.getHorseWeight();





    }

    public String RaceAdvance(){
        totalWeight = sWeight + aWeight + bWeight + cWeight + dWeight + eWeight;
        int randAdv = (int) (Math.random() * (totalWeight));
        if (randAdv <= sWeight)
            sAdvance += 1;
        else if (randAdv <= aWeight)
            sAdvance += 1;
        else if (randAdv <= bWeight)
            sAdvance += 1;
        else if (randAdv <= cWeight)
            sAdvance += 1;
        else if (randAdv <= dWeight)
            sAdvance += 1;
        else if (randAdv <= eWeight)
            sAdvance += 1;

            String sStr = "----------";


            return "";
    }
}
