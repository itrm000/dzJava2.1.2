public class Main {
    public static void main(String[] args) {

        long account = 380;
        long donat = 1675;
        long sumBonus;

        if (donat > 1000) {
            sumBonus = 1 * donat / 100;
        } else {
            sumBonus = 0;
        }

 //       long sumBonus = bonus * donat / 100;
        account = account + donat + sumBonus;

        System.out.println(sumBonus);
        System.out.println(account);

    }

}