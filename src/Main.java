public class Main {
    public static void main(String[] args) {
        System.out.println(" задвние 1 .");

        for (int i = 1; i <= 10; i++) {
        System.out.println(i);
    }

        System.out.println(" задание 2.");

     for (int d = 10; d >= 1; d --) {
         System.out.println(d);
     }

     System.out.println(" задание 3 .");

     for (int a = 0; a <= 17; a = a + 2) {
         System.out.println(a);
     }
     System.out.println(" задание 4 .");

     for (int q = 10; q >= -10; q--) {
         System.out.println(q);
     }
     System.out.println(" задание 5 .");

     for (int year = 1904; year < 2096; year = year + 4) {
         System.out.println(year + " год является високосным .");
     }
     System.out.println(" задание 6 .");

     for (int s = 7; s <= 98; s = s + 7) {
         System.out.println(s);
     }
     System.out.println(" задание 7 .");

     for (int w = 1; w <= 512; w = w * 2) {
         System.out.println(w);
     }
     System.out.println(" задание 8 .");

     int rub = 29000;
     int total = 0;
     for (int z = 1; z <= 12; z++) {
         total = total + rub;
         System.out.println( z + " Месяц сумма накоплений равна " + total);
     }
     System.out.println(" задание 9 .");

     int monthlyDeposit = 29000;
     int totalSavings = 0;
     for (int h = 1; h <= 12; h++) {
         totalSavings = totalSavings + totalSavings/100;
         totalSavings = totalSavings + monthlyDeposit;
         System.out.println( h + " Месяц сумма накоплений равна " + totalSavings);
     }
     System.out.println(" задание 10 .");

     int tab = 2;
     for (int m = 2; m <= 10; m = m + 1) {
         System.out.println(tab + "*" + m + "=" + tab * m);
     }
    }
}