package basicdatastructures.arrays;

public class GameEntry {
    private String name;    // name of the person earning this score
    private int score;      // the score value

    /** Constructs a game entry with given parameters */
    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /** Returns the name field */
    public String getName() {
        return name;
    }

    /** Returns the score field */
    public int getScore() {
        return score;
    }

    /** Returns a string representation of this entry. */
    @Override
    public String toString() {
        return "(" + name + ", " + score + ")";
    }
}
