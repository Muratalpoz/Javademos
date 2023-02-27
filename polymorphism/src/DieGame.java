public class DieGame {
    public static final int GOAL_SCORE = 100;
    private DiePlayer[] players;
    private int[] scores;
    int myScore, turnTotal, maxScore, rolls;

    public DieGame(DiePlayer[] players) {
        scores = new int[players.length];
        this.players = players;
    }

    int playTurn(DiePlayer p, int playerNum) {
        Die x = new Die();
        int turToplam=0,y;
        boolean z = p.isRolling(myScore, turnTotal, maxScore, rolls);
        do {
            y = x.nextRoll();
            turToplam += y;
        }
        while (z && y != 1);
        if (z) {
            return turToplam;
        } else if (y == 1) {
            return 0;
        } else return 0;
    }

    public int play() {
        int kazananOyuncu = 0;
        while (getMaxScore() != 100) {
            for (int i = 0; i < players.length; i++) {
                scores[i] = playTurn(players[i], i);
            }
        }

        printScores();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == 100) {
                kazananOyuncu = i;
            }
        }
        return kazananOyuncu;
    }

    int getMaxScore() {
        int temp = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > temp)
                temp = scores[i];
        }
        return temp;
    }

    void printScores() {
        for (int i = 0; i < players.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
