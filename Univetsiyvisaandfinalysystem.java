import java.util.Scanner;

public class Diziler {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String student;
        double Footballnote1, FootballfinalyNote2;//MATH LESSON
        double athleticsnote1, athleticsnote2;
        double gymnasticsvisaexam, gymnasticsfinalyexam;
        double Anatomynote1, Anatomyfinalynote2;

        System.out.println("Oxford University Vısa And Fınal  Grades System");

        System.out.print("Student's Name and Surname :");
        student = scan.nextLine();
        System.out.println("\nVİSA GRADES");
        System.out.print("Student's Football lesson visa grade:");
        Footballnote1 = scan.nextDouble();
        System.out.print("Student's athletics lesson visa grade:");
        athleticsnote1 = scan.nextDouble();
        System.out.print("Student's gymnastics lesson visa grade:");
        gymnasticsvisaexam = scan.nextDouble();
        System.out.print("Student's Human Anatomy and Kinesiology lesson visa grade:");
        Anatomynote1 = scan.nextDouble();


        System.out.println("\nFİNALY GRADE");


        System.out.print("Student's Football lesson final grade:");
        FootballfinalyNote2 = scan.nextDouble();
        System.out.print("Student's athletics final grade:");
        athleticsnote2 = scan.nextDouble();
        System.out.print("Student's gymnastics lesson finaly grade:");
        gymnasticsfinalyexam = scan.nextDouble();
        System.out.print("Student's Human Anatomy and Kinesiology lesson visa grade:");
        Anatomyfinalynote2 = scan.nextDouble();
        System.out.println();
        double footbalvisa1 = Footballnote1 * 0.40;
        double footbalfinaly2 = FootballfinalyNote2 * 0.60;
        double footbaltotal = footbalvisa1 + footbalfinaly2;

        double atletichvisa = athleticsnote1 * 0.40;
        double atletichfinaly = athleticsnote2 * 0.60;
        double atletichtotal = atletichvisa + atletichfinaly;

        double gymnasticsvisa = gymnasticsvisaexam * 0.40;
        double gymnsaticsfinaly = gymnasticsfinalyexam * 0.60;
        double gymnastichtotal = gymnasticsvisa + gymnsaticsfinaly;

        double anatomyvisa = Anatomynote1 * 0.40;
        double anatomyfinaly = Anatomyfinalynote2 * 0.60;
        double anatomytotal = anatomyvisa + anatomyfinaly;

        // footbal lesson
        String grade =null;
        if (footbaltotal >= 89) {
            System.out.println("you passed the footbal lesson..");
            grade = "AA";
        } else if (footbaltotal > 85) {
            System.out.println("you passed the footbal lesson..");
            grade = "BA";
            System.out.println(grade);
        } else if (footbaltotal > 79) {
            System.out.println("you passed the footbal lesson..");
            grade = "BB";
        } else if (footbaltotal > 74) {
            System.out.println("you passed the footbal lesson..");
            grade = "BC";
        } else if (footbaltotal > 69) {
            System.out.println("you passed the footbal lesson..");
            grade = "CC";
        } else if (footbaltotal > 60) {
            System.out.println("you passed the footbal lesson..");
            grade = "DC";
        } else if (footbaltotal >= 49) {
            System.out.println("you passed the footbal lesson..");
            grade = "DD";
            System.out.println("You have conditionally passed the lesson footbal!!");
        } else if (footbaltotal < 49) {
            System.out.println("You failed the football lesson.");
        }
// GRADE KISMINDA HATA ALMA
        System.out.println("Student's Name and Surname :" + student);
        System.out.println("Student's grade footbal total :" + footbaltotal);
        System.out.println("Student's grade level :"+grade);
        System.out.println();
        //athletich grades
        if (atletichtotal >= 89) {
            System.out.println("you passed the athletich lesson..");
            grade = "AA";
        } else if (atletichtotal > 85) {
            System.out.println("you passed the athletich lesson..");
            grade = "BA";
        } else if (atletichtotal > 79) {
            System.out.println("you passed the athletich lesson..");
            grade = "BB";
        } else if (atletichtotal > 74) {
            System.out.println("you passed the athletich lesson..");
            grade = "BC";
        } else if (atletichtotal > 69) {
            System.out.println("you passed the athletich lesson..");
            grade = "CC";
        } else if (atletichtotal > 60) {
            System.out.println("you passed the athletich lesson..");
            grade = "DC";
        } else if (atletichtotal >= 49) {
            System.out.println("you passed the athletich lesson..");
            grade = "DD";
            System.out.println("You have conditionally passed the athletich lesson !!");
        } else if (atletichtotal < 49) {
            System.out.println("You failed the athletich lesson.");
        }
// GRADE KISMINDA HATA ALMA
        System.out.println("Student's Name and Surname :" + student);
        System.out.println("Student's grade athletics total :" + atletichtotal);
        System.out.println("Student's grade level :"+grade);
        System.out.println();
        //gymnsatics grades

        if (gymnastichtotal >= 89) {
            System.out.println("you passed the gymnsatic lesson..");
            grade = "AA";
        } else if (gymnastichtotal > 85) {
            System.out.println("you passed the gymnsatic  lesson..");
            grade = "BA";
        } else if (gymnastichtotal > 79) {
            System.out.println("you passed the gymnsatic lesson..");
            grade = "BB";
        } else if (gymnastichtotal > 74) {
            System.out.println("you passed the gymnsatic lesson..");
            grade = "BC";
        } else if (gymnastichtotal > 69) {
            System.out.println("you passed the  gymnsatic lesson..");
            grade = "CC";
        } else if (gymnastichtotal > 60) {
            System.out.println("you passed the  gymnsatic lesson..");
            grade = "DC";
        } else if (gymnastichtotal >= 49) {
            System.out.println("you passed the gymnsatic lesson..");
            grade = "DD";
            System.out.println("You have conditionally passed the gymnsatic lesson !!");
        } else if (gymnastichtotal < 49) {
            System.out.println("You failed the gymnastics lesson .");
        }

        System.out.println("Student's Name and Surname :" + student);
        System.out.println("Student's grade gymnastics total :" + gymnastichtotal);
        System.out.println("Student's grade level :"+grade);
        System.out.println();


        //anatomy grades
        if (anatomytotal >= 89) {
            System.out.println("you passed the anatomy lesson..");
            grade = "AA";
        } else if (anatomytotal > 85) {
            System.out.println("you passed the anatomy lesson..");
            grade = "BA";
        } else if (anatomytotal > 79) {
            System.out.println("you passed the anatomy lesson..");
            grade = "BB";
        } else if (anatomytotal > 74) {
            System.out.println("you passed the anatomy lesson..");
            grade = "BC";
        } else if (anatomytotal > 69) {
            System.out.println("you passed the anatomy lesson..");
            grade = "CC";
        } else if (anatomytotal > 60) {
            System.out.println("you passed the anatomy lesson..");
            grade = "DC";
        } else if (anatomytotal >= 49) {
            System.out.println("you passed the anatomy lesson..");
            grade = "DD";
            System.out.println("You have conditionally passed the anatomy lesson!!");
        } else if (anatomytotal < 49) {
            System.out.println("You failed the anatomy lesson.");
        }

        System.out.println("Student's Name and Surname :" + student);
        System.out.println("Student's grade anatomy total ::" + anatomytotal);
        System.out.println("Student's grade level :"+grade);
        System.out.println();

        String select;
        double footballbut;
            select=scan.nextLine();
        if (footbaltotal<89){
            System.out.println("Did I take the student football make-up exam?");
            System.out.print("Select YES 'Y - NO 'N'  :");
            select=scan.nextLine();}

            if (select.equalsIgnoreCase("y")){
                System.out.print("Butexam note :");
                footballbut=scan.nextDouble();

                double footbalbut =footballbut*0.60;
                double footbalbut1=footbalvisa1+footbalbut;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                if (footbalbut1 >= 89) {
                    System.out.println("you passed the footbal lesson..");
                    grade = "AA";
                } else if (footbalbut1> 85) {
                    System.out.println("you passed the footbal lesson..");
                    grade = "BA";
                } else if (footbalbut1> 79) {
                    System.out.println("you passed the footbal lesson..");
                    grade = "BB";
                } else if (footbalbut1> 74) {
                    System.out.println("you passed the footbal lesson..");
                    grade = "BC";
                } else if (footbalbut1> 69) {
                    System.out.println("you passed the footbal lesson..");
                    grade = "CC";
                } else if (footbalbut1 > 60) {
                    System.out.println("you passed the footbal lesson..");
                    grade = "DC";
                } else if (footbalbut1>= 49) {
                    System.out.println("you passed the footbal lesson..");
                    grade = "DD";
                    System.out.println("You have conditionally passed the lesson footbal!!");
                } else if (footbalbut1 < 49) {
                    System.out.println("You failed the football lesson.");
                }
// GRADE KISMINDA HATA ALMA
                System.out.println("Student's Name and Surname :" + student);
                System.out.println("Student's grade footbal total :" + footbalbut1);
                System.out.println("Student's grade level :"+grade);
                System.out.println();
            // buradaki kod parçasını sor !
            } else if (select.equalsIgnoreCase("N")) {
                System.out.println("Student's Name and Surname :" + student);
                System.out.println("Student's grade footbal total :" + footbaltotal);
                System.out.println("Student's grade level :"+grade);
                System.out.println();

            }
            double athleticbut;
           select=scan.nextLine();
            if (atletichtotal<89){
                System.out.println("Did I take the student athletic make-up exam???");
                System.out.print("Select YES 'Y - NO 'N'  :");
                select=scan.nextLine();}

                if (select.equalsIgnoreCase("y")){
                    System.out.print("Butexam note :");
                    athleticbut=scan.nextDouble();

                    double athleticbut0 =athleticbut*0.60;
                    double athleticbut1=atletichvisa+athleticbut0;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    if (athleticbut1 >= 89) {
                        System.out.println("you passed the athletic lesson..");
                        grade = "AA";
                    } else if (athleticbut1 > 85) {
                        System.out.println("you passed the athletic lesson..");
                        grade = "BA";
                    } else if (athleticbut1 > 79) {
                        System.out.println("you passed the athletic lesson..");
                        grade = "BB";
                    } else if (athleticbut1 > 74) {
                        System.out.println("you passed the athletic lesson..");
                        grade = "BC";
                    } else if (athleticbut1 > 69) {
                        System.out.println("you passed the athletic lesson..");
                        grade = "CC";
                    } else if (athleticbut1  > 60) {
                        System.out.println("you passed the athletic lesson..");
                        grade = "DC";
                    } else if (athleticbut1 >= 49) {
                        System.out.println("you passed the athletic lesson..");
                        grade = "DD";
                        System.out.println("You have conditionally passed the lesson athletic!!");
                    } else if (athleticbut1  < 49) {
                        System.out.println("You failed the atletic lesson.");
                    }
// GRADE KISMINDA HATA ALMA
                    System.out.println("Student's Name and Surname :" + student);
                    System.out.println("Student's grade athletic total :" + athleticbut1 );
                    System.out.println("Student's grade level :"+grade);
                    System.out.println();

                } else if (select.equalsIgnoreCase("N")) {
                    System.out.println("Student's Name and Surname :" + student);
                    System.out.println("Student's grade athletic total :" + atletichtotal);
                    System.out.println("Student's grade level :");
                    System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                }
                double gymnsaticbut;
                 select=scan.nextLine();
                if (gymnastichtotal<89){
                    System.out.println("Did I take the student gymnastic  make-up exam?");
                    System.out.print("Select YES 'Y - NO 'N'  :");
                    select=scan.nextLine();}

                    if (select.equalsIgnoreCase("y")){
                        System.out.print("Butexam note :");
                      gymnsaticbut =scan.nextDouble();

                        double gymnasticbut0=gymnsaticbut*0.60;
                        double gymnsaticbut1=gymnasticsvisa+gymnasticbut0;

                        if (gymnsaticbut1 >= 89) {
                            System.out.println("you passed the gymnsatic lesson..");
                            grade = "AA";
                        } else if (gymnsaticbut1 > 85) {
                            System.out.println("you passed the gymnsatic lesson..");
                            grade = "BA";
                        } else if (gymnsaticbut1  > 79) {
                            System.out.println("you passed the gymnsatic lesson..");
                            grade = "BB";
                        } else if (gymnsaticbut1  > 74) {
                            System.out.println("you passed the gymnsatic lesson..");
                            grade = "BC";
                        } else if (gymnsaticbut1 > 69) {
                            System.out.println("you passed the gymnsatic lesson..");
                            grade = "CC";
                        } else if (gymnsaticbut1  > 60) {
                            System.out.println("you passed the gymnsatic lesson..");
                            grade = "DC";
                        } else if (gymnsaticbut1 >= 49) {
                            System.out.println("you passed the gymnsatic lesson..");
                            grade = "DD";
                            System.out.println("You have conditionally passed the lesson gymnsatic!!");
                        } else if (gymnsaticbut1 < 49) {
                            System.out.println("You failed the gymnsatic lesson.");
                        }
// GRADE KISMINDA HATA ALMA
                        System.out.println("Student's Name and Surname :" + student);
                        System.out.println("Student's grade gymnastic total :" +gymnsaticbut1 );
                        System.out.println("Student's grade level :"+grade);
                        System.out.println();

                    } else if (select.equalsIgnoreCase("N")) {
                        System.out.println("Student's Name and Surname :" + student);
                        System.out.println("Student's grade gymnsatic total :" + gymnastichtotal);
                        System.out.println("Student's grade level :"+grade);
                        System.out.println();
                    }

                    double anotomybut;
                    select=scan.nextLine();
                    if (anatomytotal<89){
                        System.out.println("Did I take the student anatomy make-up exam?");
                        System.out.print("Select YES 'Y - NO 'N'  :");
                        select=scan.nextLine();}

                        if (select.equalsIgnoreCase("y")){
                            System.out.print("Butexam note :");
                          anotomybut =scan.nextDouble();

                            double anatomybut0=anotomybut*0.60;
                            double anatomybut1=anatomyvisa+anatomybut0;

                            if (anatomybut1 >= 89) {
                                System.out.println("you passed the anatomy lesson..");
                                grade = "AA";
                            } else if (anatomybut1 > 85) {
                                System.out.println("you passed the anatomy lesson..");
                                grade = "BA";
                            } else if (anatomybut1  > 79) {
                                System.out.println("you passed the anatomy lesson..");
                                grade = "BB";
                            } else if (anatomybut1  > 74) {
                                System.out.println("you passed the anatomy lesson..");
                                grade = "BC";
                            } else if (anatomybut1 > 69) {
                                System.out.println("you passed the anatomy lesson..");
                                grade = "CC";
                            } else if (anatomybut1  > 60) {
                                System.out.println("you passed the anatomy lesson..");
                                grade = "DC";
                            } else if (anatomybut1 >= 49) {
                                System.out.println("you passed the anatomy lesson..");
                                grade = "DD";
                                System.out.println("You have conditionally passed the lesson anatomy!!");
                            } else if (anatomybut1 < 49) {
                                System.out.println("You failed the anatomy lesson.");
                            }

                            System.out.println("Student's Name and Surname :" + student);
                            System.out.println("Student's grade anatomy total :" +anatomybut1 );
                            System.out.println("Student's grade level :"+grade);
                            System.out.println();

                        } else if (select.equalsIgnoreCase("N")) {
                            System.out.println("Student's Name and Surname :" + student);
                            System.out.println("Student's grade anatomy total :" + anatomytotal);
                            System.out.println("Student's grade level :"+grade);
                            System.out.println();

                    }

    }}




































