import java.util.Scanner;

public class UniversitySystem {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String student;

        System.out.println("OXFORT UNIVERSITY VISA AND FINAL GRADES SYSTEM");


        double note1, finalynote2;
//NOT : İSİM HARİCİ GİRİŞE HATA .

        System.out.print("\nÖğrencinin İsmini Giriniz :");
        student = scan.nextLine();

        System.out.print("Öğrencinin Vize Notu :");
        note1 = scan.nextDouble();

        System.out.print("Öğrencinin Final Notu :");
        finalynote2 = scan.nextDouble();


        double totalnot1 = note1 * 0.40;
        double totalnot2 = finalynote2 * 0.60;
        double total = totalnot1 + totalnot2;

        char grade;
//NOT : çift olarak değişiklik yapmak istiyorum. bd dc gibi


        if (total > 90) {
            grade = 'A';
        } else if (total > 80) {
            grade = 'B';
        } else if (total > 70) {
            grade = 'C';
        } else if (total > 60) {
            grade = 'D';
        } else if (total > 50) {
            grade = 'E';
            System.out.println("Şartlı geçtiniz ! ");
        }else {
            grade = 'F';
            System.out.println("KALDINIZ ");
        }


        System.out.println("Öğrencinin Adı ve Soyadı :" + student);
        System.out.println("Öğrencinin Not Toplamı :" + total);
        System.out.println("Öğrencinin Not derecesi :"+grade);

        String select;


        System.out.println();
        System.out.println("Öğrenci Büt Sınavına Girdi Mi ? ");

        System.out.print("'E' Veya 'H' Kullanınız ! :");
        select = scan.next();



            if (select.equalsIgnoreCase("E")) {
                System.out.print("Büt Sınavı Notu : ");
               double BUTEXAM = scan.nextDouble();

                double totalresult = BUTEXAM * 0.60;
                double totalresult1 = totalnot1 + totalresult;

                if (totalresult1<50){
                    System.out.println("Sınfta kaldınız :"+totalresult1);
                }else if (totalresult1>=50){
                    System.out.println("sınıfı geçtiniz "+totalresult1);
                }else {
                    System.out.println("hatalı giriş");}

                }  if (select.equalsIgnoreCase("h")){
                if (total<49){
                System.out.println("Sınıfta Kaldınız TOTAL :"+total);
            }else {
                System.out.println("Sınıfı geçtiniz  TOTAL : "+total);
            }

            }



    }}





