public class Main {
    public static void main(String[] args) {
       byte totalPaint = 120;
       byte whitePaint = 2;
       byte brownPaint = 4;
       int paintForOneClass = whitePaint + brownPaint;
       int totalClasses = totalPaint / paintForOneClass;
       int totalWhitePaint = whitePaint * totalClasses;
       int totalBrownPaint = brownPaint * totalClasses;
       System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }
}