public class HoldAt20DiePlayer implements DiePlayer {
    Die die = new Die();
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        if (die.nextRoll() != 1)
            return true;
        else if (turnTotal < 20)
            return true;
        else if (turnTotal + myScore < 100)
            return true;
        else {
            return false;
        }
    }
}