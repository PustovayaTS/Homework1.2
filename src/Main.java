public class Main {
    public static void main(String[] args) {
       short needToReset = 7 * 1000;
       int lose250Grams = needToReset / 250;
       int lose500Grams = needToReset / 500;
       int averageQuantity  = (lose250Grams + lose500Grams) / 2;
       System.out.println(lose250Grams);
       System.out.println(lose500Grams);
       System.out.println(averageQuantity);

    }
}