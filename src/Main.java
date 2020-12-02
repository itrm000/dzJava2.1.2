public class Main {
    public static void main(String[] args) {

        long account = 380;
        long donat = 3252;
        long bonus;

        if (donat > 1000) {
                bonus = 1;
        } else {
            bonus = 0;
        }

        long sumBonus = bonus * donat / 100;
        account = account + donat + sumBonus;

        System.out.println(sumBonus);
        System.out.println(account);

    }

}