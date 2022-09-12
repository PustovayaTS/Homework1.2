public class Main {
    public static void main(String[] args) {
        short weightBananas = 80 * 5;
        short weightMilk = 105 * 2;
        short weightIceCream = 100 * 2;
        short weightEgg = 70 * 4;
        int weightInGrams = weightBananas + weightMilk + weightIceCream + weightEgg;
        float weightInKilograms = weightInGrams / 1000F;
        System.out.println(weightInGrams);
        System.out.println(weightInKilograms);
    }
}