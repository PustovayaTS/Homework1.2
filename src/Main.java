public class Main {
    public static void main(String[] args) {
        int salaryMasha = 67760;
        int salaryDen = 83690;
        int salaryKris = 76230;
        double newSalaryMasha = (salaryMasha * 0.1) + salaryMasha;
        double newSalaryDen = (salaryDen * 0.1) + salaryDen;
        double newSalaryKris = (salaryKris * 0.1) + salaryKris;
        double annualIncomeMasha = (newSalaryMasha * 12) - (salaryMasha * 12);
        double annualIncomeDen = (newSalaryDen * 12) - (salaryDen * 12);
        double annualIncomeKris = (newSalaryKris * 12) - (salaryKris * 12);
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + annualIncomeMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDen + " рублей. Годовой доход вырос на " + annualIncomeDen + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + annualIncomeKris + " рублей");
    }
}