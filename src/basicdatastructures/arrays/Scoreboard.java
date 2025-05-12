package basicdatastructures.arrays;

public class Scoreboard {
    private int numEntries = 0;     // number of actual entries
    private GameEntry[] board;      // array of game entries (names & scores)

    /** Constructs an empty scoreboard with the given capacity for storing entries */
    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    /** Attempt to add a new score to the collection (if it is high enough) */
    public void add(GameEntry e) {
        int newScore = e.getScore();

        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) {
                numEntries++;
            }

            int j = numEntries - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = e;
        }
    }
}
