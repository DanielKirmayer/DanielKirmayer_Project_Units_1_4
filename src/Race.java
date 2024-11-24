import java.lang.*;
import java.util.ArrayList;

/**
 * The Race class simulates a horse race between six horses.
 * Each horse advances based on its weight and random selection during the race.
 * The class also tracks the progress, winner, and other race-related information.
 */
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
    private double totalWeight;
    private boolean raceOver;
    private int winner;

    /**
     * Constructs a Race object with six participating horses.
     *
     * @param s the horse in lane 1
     * @param a the horse in lane 2
     * @param b the horse in lane 3
     * @param c the horse in lane 4
     * @param d the horse in lane 5
     * @param e the horse in lane 6
     */
    Race(Horse s, Horse a, Horse b, Horse c, Horse d, Horse e) {
        sWeight = s.getHorseWeight();
        aWeight = a.getHorseWeight();
        bWeight = b.getHorseWeight();
        cWeight = c.getHorseWeight();
        dWeight = d.getHorseWeight();
        eWeight = e.getHorseWeight();
    }

    /**
     * Advances the race by determining which horse moves forward based on random weight distribution.
     * Updates the position of each horse and checks for a winner.
     *
     * @param s the horse in lane 1
     * @param a the horse in lane 2
     * @param b the horse in lane 3
     * @param c the horse in lane 4
     * @param d the horse in lane 5
     * @param e the horse in lane 6
     * @return a String representing the current state of the race or the winner if the race is over
     * @throws InterruptedException if the thread is interrupted during sleep
     */
    public String RaceAdvance(Horse s, Horse a, Horse b, Horse c, Horse d, Horse e) throws InterruptedException {
        totalWeight = (sWeight + aWeight + bWeight + cWeight + dWeight + eWeight);
        int randAdv = (int) (1 + (Math.random() * (totalWeight)));
        if (randAdv <= sWeight)
            sAdvance += 1;
        else if (randAdv <= aWeight + sWeight)
            aAdvance += 1;
        else if (randAdv <= bWeight + aWeight + sWeight)
            bAdvance += 1;
        else if (randAdv <= cWeight + bWeight + aWeight + sWeight)
            cAdvance += 1;
        else if (randAdv <= dWeight + cWeight + bWeight + aWeight + sWeight)
            dAdvance += 1;
        else
            eAdvance += 1;

        String StrLine = "---------\uD83C\uDFC1";
        String sStrF = StrLine.substring(0, sAdvance) + "\uD83D\uDC0E" + StrLine.substring(sAdvance);
        String aStrF = StrLine.substring(0, aAdvance) + "\uD83D\uDC0E" + StrLine.substring(aAdvance);
        String bStrF = StrLine.substring(0, bAdvance) + "\uD83D\uDC0E" + StrLine.substring(bAdvance);
        String cStrF = StrLine.substring(0, cAdvance) + "\uD83D\uDC0E" + StrLine.substring(cAdvance);
        String dStrF = StrLine.substring(0, dAdvance) + "\uD83D\uDC0E" + StrLine.substring(dAdvance);
        String eStrF = StrLine.substring(0, eAdvance) + "\uD83D\uDC0E" + StrLine.substring(eAdvance);
        Thread.sleep(300);

        if (sAdvance == 10 || aAdvance == 10 || bAdvance == 10 || cAdvance == 10 || dAdvance == 10 || eAdvance == 10)
            raceOver = true;

        if (!raceOver) {
            return sStrF + "\n"
                    + aStrF + "\n"
                    + bStrF + "\n"
                    + cStrF + "\n"
                    + dStrF + "\n"
                    + eStrF + "\n";
        } else {
            if (sAdvance == 10) {
                winner = 1;
                return "Victory for the horse in lane 1: " + s.getHorseName();
            }
            if (aAdvance == 10) {
                winner = 2;
                return "Victory for the horse in lane 2: " + a.getHorseName();
            }
            if (bAdvance == 10) {
                winner = 3;
                return "Victory for the horse in lane 3: " + b.getHorseName();
            }
            if (cAdvance == 10) {
                winner = 4;
                return "Victory for the horse in lane 4: " + c.getHorseName();
            }
            if (dAdvance == 10) {
                winner = 5;
                return "Victory for the horse in lane 5: " + d.getHorseName();
            } else {
                winner = 6;
                return "Victory for the horse in lane 6: " + e.getHorseName();
            }
        }
    }

    /**
     * Checks if the race is over.
     *
     * @return true if the race is over, false otherwise
     */
    public boolean isRaceOver() {
        return raceOver;
    }

    /**
     * Gets the lane number of the winning horse.
     *
     * @return an integer representing the lane number of the winner
     */
    public int getWinner() {
        return winner;
    }

    /**
     * Determines the horse with the highest weight (favorite to win).
     *
     * @return an integer representing the lane number of the horse with the highest weight
     */
    public int getFavorite() {
        int max = 0;

        if (sWeight > max)
            max = sWeight;
        if (aWeight > max)
            max = aWeight;
        if (bWeight > max)
            max = bWeight;
        if (cWeight > max)
            max = cWeight;
        if (dWeight > max)
            max = dWeight;
        if (eWeight > max)
            max = eWeight;

        if (eWeight == max)
            return 6;
        if (dWeight == max)
            return 5;
        if (cWeight == max)
            return 4;
        if (bWeight == max)
            return 3;
        if (aWeight == max)
            return 2;
        if (sWeight == max)
            return 1;

        return 0;
    }

    /**
     * Determines the horse with the lowest weight (least likely to win).
     *
     * @return an integer representing the lane number of the horse with the lowest weight
     */
    public int getHorseBad() {
        int min = 20;

        if (sWeight < min)
            min = sWeight;
        if (aWeight < min)
            min = aWeight;
        if (bWeight < min)
            min = bWeight;
        if (cWeight < min)
            min = cWeight;
        if (dWeight < min)
            min = dWeight;
        if (eWeight < min)
            min = eWeight;

        if (sWeight == min)
            return 1;
        if (aWeight == min)
            return 2;
        if (bWeight == min)
            return 3;
        if (cWeight == min)
            return 4;
        if (dWeight == min)
            return 5;
        if (eWeight == min)
            return 6;

        return 0;
    }
}
