public class GamblerUc2{
    public static final int INITIAL_BET_STAKE = 100;
    public static final int BET_AMT = 1;

    public static void main(String[] args) {
        int remaining_amount = INITIAL_BET_STAKE;
        double random = Math.floor(Math.random() * 10) % 2;
        System.out.println(random);
        if (random == 0) {
            remaining_amount = remaining_amount + BET_AMT;
            System.out.println("After winning bet" + remaining_amount);
        } else
            remaining_amount = remaining_amount - BET_AMT;
        System.out.println("After loosing bet" + remaining_amount);
    }
}
