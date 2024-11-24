import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The Horse class represents a horse with a randomly selected name and weight based on a specified tier.
 * The horse's name is chosen from a file, and its weight is determined by the tier provided.
 */
public class Horse {
    private String horseName;
    private int horseWeight;

    /**
     * Constructs a Horse object with a randomly selected name and weight determined by the specified tier.
     *
     * @param tier the tier of the horse, which determines its possible weight range.
     *             Valid values are "S", "A", "B", "C", "D", and "E".
     * @throws FileNotFoundException if the required data file is not found.
     */
    public Horse(String tier) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data/data.txt"));
        List<String> lines = new ArrayList<>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        // Convert the list of lines into an array for random selection
        String[] arr = lines.toArray(new String[0]);

        // Select a random horse name from the file
        int randomIndex = (int) (Math.random() * arr.length);
        horseName = (lines.get(randomIndex));

        // Assign horse weight based on the tier
        if (tier.equals("S"))
            horseWeight = (int) (1 + (Math.random() * 9));
        if (tier.equals("A"))
            horseWeight = (int) (1 + (Math.random() * 8));
        if (tier.equals("B"))
            horseWeight = (int) (1 + (Math.random() * 7));
        if (tier.equals("C"))
            horseWeight = (int) (1 + (Math.random() * 6));
        if (tier.equals("D"))
            horseWeight = (int) (1 + (Math.random() * 5));
        if (tier.equals("E"))
            horseWeight = (int) (1 + (Math.random() * 4));
    }

    /**
     * Gets the name of the horse.
     *
     * @return the name of the horse as a String.
     */
    public String getHorseName() {
        return horseName;
    }

    /**
     * Gets the weight of the horse.
     *
     * @return the weight of the horse as an integer.
     */
    public int getHorseWeight() {
        return horseWeight;
    }
}
