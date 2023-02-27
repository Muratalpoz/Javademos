public class Main {
    public static void main(String[] args) {
        DiePlayer[] step = new DiePlayer[4];

        step[0] = new HoldAt20DiePlayer();
        step[1] = new HoldAt25DiePlayer();
        step[2] = new RaceToGoalDiePlayer();
        step[3] = new MyDiePlayer();

        int[] sayac = new int[4];
        for (int i = 0; i < 4; i++) {
            sayac[i] = 0;
        }
            for (int a = 0; a < 1000; a++) {

                DieGame dieGame = new DieGame(step);
                sayac[dieGame.play()]++;
                System.out.println("----------------");
            }
            for (int p = 0; p < 4; p++) {
                System.out.println(sayac[p]);
            }
        }
    }

