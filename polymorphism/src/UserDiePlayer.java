import java.util.Scanner;

public class UserDiePlayer implements DiePlayer {

    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        boolean deger;
        System.out.println("Bu tur içinde alınan skor: " + turnTotal);
        System.out.println("Holl or Hold ?");

        Scanner sc = new Scanner(System.in);
        String sonuc = sc.nextLine();
        if (sonuc == "") {
            deger = true;
        } else {
            deger = false;
        }
        return deger;
    }
}


