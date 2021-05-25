package code._4_student_effort.two_fighters_one_winner;

public class BoxingMatch {

    private static final Fighter FIGHTER1 = new Fighter("John", 100, 70);
    private static final Fighter FIGHTER2 = new Fighter("Smith", 100, 20);

    public static String fight() {

        String winner = null;

        while (FIGHTER1.getHealth() > 0 && FIGHTER2.getHealth() > 0) {
            FIGHTER1.attack(FIGHTER2);
            FIGHTER2.attack(FIGHTER1);
            if (FIGHTER1.getHealth() <= 0) {
                winner = FIGHTER2.getName();
            } else if (FIGHTER2.getHealth() <= 0) {
                winner = FIGHTER1.getName();
            }
        }
        return winner;
    }
}
