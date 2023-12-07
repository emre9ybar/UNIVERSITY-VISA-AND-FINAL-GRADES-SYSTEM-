import java.util.Scanner;

public class Diziler {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String student;
        double note1, finalNote2;

        System.out.println("OXFORD UNIVERSITY VISA AND FINAL GRADES SYSTEM");

        System.out.print("Öğrencinin İsmini Giriniz: ");
        student = scan.nextLine();

        System.out.print("Öğrencinin Vize Notu :");
        note1 = scan.nextDouble();

        System.out.print("Öğrencinin Final Notu :");
        finalNote2 = scan.nextDouble();

        double totalNote1 = note1 * 0.40;
        double totalNote2 = finalNote2 * 0.60;
        double total = totalNote1 + totalNote2;

        String grade;
        if (total >= 89) {
            grade = "AA";
        } else if (total > 85) {
            grade = "BA";
        } else if (total > 79) {
            grade = "BB";
        } else if (total > 74) {
            grade = "BC";
        } else if (total > 69) {
            grade = "CC";
        } else if (total > 60) {
            grade = "DC";
        } else if (total >= 49) {
            grade = "DD";
            System.out.println("Şartlı geçtiniz !");
        } else if (total<49){
            System.out.println("Sınıfta kaldınız..");
        }
// GRADE KISMINDA HATA ALMA
        System.out.println("Öğrencinin Adı ve Soyadı :" + student);
        System.out.println("Öğrencinin Not Toplamı :" + total);
        System.out.println("Öğrencinin Not derecesi :");

        String select;

        System.out.println();
        System.out.println("Öğrenci Büt Sınavına Girdi Mi ? ");
        System.out.print("'E' Veya 'H' Kullanınız ! :");
        select = scan.next();

        if (select.equalsIgnoreCase("E")) {
            System.out.print("Büt Sınavı Notu : ");
            double butExam = scan.nextDouble();

            double totalResult = butExam * 0.60;
            double totalResult1 = totalNote1 + totalResult;

            // büte giren öğrenci için harf notu hesaplama.
            if (totalResult1 >= 89) {
                grade = "AA";
            } else if (totalResult1 > 85) {
                grade = "BA";
            } else if (totalResult1 > 79) {
                grade = "BB";
            } else if (totalResult1 > 74) {
                grade = "BC";
            } else if (totalResult1 > 69) {
                grade = "CC";
            } else if (totalResult1 > 60) {
                grade = "DC";
            } else if (totalResult1 >= 49) {
                grade = "DD";
                System.out.println("Şartlı geçtiniz !");
            } else if (totalResult1<49){
                System.out.println("Sınıfta kaldınız..");
            }
// GRADE KISMINDA HATA ALMA
            System.out.println("Öğrencinin Adı ve Soyadı :" + student);
            System.out.println("Öğrencinin Not Toplamı :" + totalResult1);
            System.out.println("Öğrencinin Not derecesi :");


                
         } else if (select.equalsIgnoreCase("H")) {
            if (total < 49) {
                System.out.println("Sınıfta Kaldınız TOTAL :" + total);
            } else {
                System.out.println("Sınıfı geçtiniz  TOTAL : " + total);
            }
        }

    }
}
