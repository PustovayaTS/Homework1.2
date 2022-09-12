public class Main {
    public static void main(String[] args) {
       byte machinePerformance2min = 16;
       int machinePerformance1min = machinePerformance2min / 2;
       int machinePerformance20min = machinePerformance1min * 20;
       int machinePerformanceInDay = 24 * 60 * machinePerformance1min;
       int machinePerformanceIn3Day = machinePerformanceInDay * 3;
       int machinePerformancePerMonth = machinePerformanceInDay * 30;
       System.out.println("За 20 минут машина произвела бутылок " + machinePerformance20min + " штук");
       System.out.println("За сутки машина произвела бутылок " + machinePerformanceInDay + " штук");
       System.out.println("За 3 дня машина произвела бутылок " + machinePerformanceIn3Day + " штук");
       System.out.println("За месяц машина произвела бутылок " + machinePerformancePerMonth + " штук");
    }
}