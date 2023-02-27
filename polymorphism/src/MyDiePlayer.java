public class MyDiePlayer implements DiePlayer{
    Die die = new Die();
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        if (die.nextRoll() != 1)
            return true;
        else if (turnTotal < 15)
            return true;
        else if (turnTotal + myScore < 100)
            return true;
        else {
            return false;
        }
    }
}

