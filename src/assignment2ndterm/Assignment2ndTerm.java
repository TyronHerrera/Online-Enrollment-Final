package assignment2ndterm;

import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Assignment2ndTerm {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void printHeader() {
        System.out.println("        \t +--------------------------------+");
        System.out.println("        \t |   Welcome to Enrollment 2018   |");
        System.out.println("        \t |  For IT , CS, and CE Students  |");
        System.out.println("        \t +--------------------------------+");
        System.out.println("");
        System.out.println("        \t      ASSESSMENT FORM");

    }

    public static void printPayment() {
        System.out.println("\nTuition Fee (P 939 X 15 Units)                     P  14,085.00");
        System.out.println("Registration Fee                                     P   821.00");
        System.out.println("Library Fee                                          P   622.00");
        System.out.println("ID Fee                                               P   231.00");
        System.out.println("Student Activity Fee                                 P   161.00");
        System.out.println("Athletic Development Fee                             P   193.00");
        System.out.println("Medical and Dental Fee                               P   147.00");
        System.out.println("Audio Visual Fee                                     P   191.00");
        System.out.println("Academic Community Advancement Fee                   P   231.00");
        System.out.println("Cultural Fee                                         P   170.00");
        System.out.println("Guidance Counselling Fee                             P   167.00");
        System.out.println("Development Fee                                      P 1,322.00");
        System.out.println("Internet Fee                                         P   241.00");
        System.out.println("Testing Materials Fee                                P   148.00");
        System.out.println("Insurance Fee                                        P    41.00");
        System.out.println("Energy Fee                                           P 1,827.00");
        System.out.println("Payment Type a (Per Subject Affected                 P 5,110.00");
        System.out.println("    (CCPRGG2l, CTHASOPL)");
        System.out.println("RLELL Fee a (Per Subject Affected                    P 1,782.00");
        System.out.println("    (CCPRGG21, CTHASOPL)");
        System.out.println("TOTAL AMOUNT                                         P 27,490.00\n");
    }

    public static String getStudentNum(String[] gstudentNum, int lol) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Student ID Year: ");
        gstudentNum[lol] = input.nextLine();
        return gstudentNum[lol];
    }

    public static String getStName(String[] gname, int lol) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        gname[lol] = input.nextLine();
        return gname[lol];
    }

    public static String getCitizenship(String[] gcitizen, int lol) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Citizenship: ");
        gcitizen[lol] = input.nextLine();
        return gcitizen[lol];
    }

    public static String getAddress(String[] gAddress, int lol) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Address: ");
        gAddress[lol] = input.nextLine();
        return gAddress[lol];
    }

    public static String getCourse(String[] gCourse, int lol) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Course: ");
        gCourse[lol] = input.nextLine();
        return gCourse[lol];
    }

    public static String getTerm(String[] gTerm, int lol) {
        Scanner input = new Scanner(System.in);
        System.out.print("What term are you applying for? ");
        gTerm[lol] = input.nextLine();
        return gTerm[lol];
    }

    public static String getGender(String[] gGender, int lol) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your gender?");
        System.out.println("1 - Male");
        System.out.println("2 - Female");
        System.out.print("CHOICE: ");
        char ans = input.next().charAt(0);
        if (ans == '1') {
            gGender[lol] = "Male";
        } else if (ans == '2') {
            gGender[lol] = "Female";
        } else {
            gGender[lol] = "OTHERS";
        }
        return gGender[lol];
    }

    public static double scholarship(double[] scho, int lol) {
        Scanner input = new Scanner(System.in);
        double totalTuition = 27490;
        double tuition = 14085;
        System.out.println("\nDo you have Scholarship? ");
        System.out.print("Answer: ");
        char ans = input.next().charAt(0);
        if (ans == 'Y' || ans == 'y') {
            System.out.println("\nWhat kind of Scholarship?");
            System.out.println("1 - Blue Scholar(100%)");
            System.out.println("2 - NSP(50%)");
            System.out.println("3 - PS(25%)");
            System.out.print("Choice: ");
            char ans2 = input.next().charAt(0);
            if (ans2 == '1') {
                return scho[lol] = 0.00;
            } else if (ans2 == '2') {
                return scho[lol] = tuition * .50 + 13405;
            } else if (ans2 == '3') {
                return scho[lol] = tuition * .75 + 13405;
            }
        } else {
            return scho[lol] = totalTuition;
        }
        return scho[lol] = totalTuition;
    }

    public static String getPayment(String[] gpayment, int lol, double[] scho) {
        Scanner input = new Scanner(System.in);
        double down1 = 0.0, down2 = 0.0;
        if (scho[lol] > 0) {
            down1 = 5000;
            down2 = 10000;
        }
        System.out.println("\tKINDS OF PAYMENT");
        System.out.println("1 - Full Payment CASH                 P" + df2.format(scho[lol]));
        System.out.println("");
        System.out.println("2 - INSTALLMENT PAYMENT 1");
        System.out.println("    Total Tuition                     P" + df2.format(scho[lol]));
        System.out.println("    INSTALLMENT PLAN:");
        System.out.println("    Downpayment         Period        P" + df2.format(down1) + "  Upon Enrollment");
        System.out.println("    1st Installment     October 2     P" + df2.format((scho[lol] - down1) / 3));
        System.out.println("    2nd Installment     November 2    P" + df2.format((scho[lol] - down1) / 3));
        System.out.println("    3rd Installment     December 2    P" + df2.format((scho[lol] - down1) / 3));
        System.out.println("    TOTAL                             P" + df2.format(scho[lol]));
        System.out.println("");
        System.out.println("3 - INSTALLMENT PAYMENT 2");
        System.out.println("    Total Tuition                     P" + df2.format(scho[lol]));
        System.out.println("    INSTALLMENT PLAN:");
        System.out.println("    Downpayment         Period        P" + df2.format(down2) + "  Upon Enrollment");
        System.out.println("    1st Installment     October 2     P" + df2.format((scho[lol] - down2) / 3));
        System.out.println("    2nd Installment     November 2    P" + df2.format((scho[lol] - down2) / 3));
        System.out.println("    3rd Installment     December 2    P" + df2.format((scho[lol] - down2) / 3));
        System.out.println("    TOTAL                             P" + df2.format(scho[lol]));
        System.out.print("CHOICE: ");
        char ans = input.next().charAt(0);
        if (ans == '1') {
            gpayment[lol] = "FULL PAYMENT";
        } else if (ans == '2') {
            gpayment[lol] = "INSTALLMENT PAYMENT 1";
        } else if (ans == '3') {
            gpayment[lol] = "INSTALLMENT PAYMENT 2";
        } else {
            gpayment[lol] = "OTHERS";
        }
        
        System.out.println("\n\tYOU'RE OFFICIALLY ENROLLED\n");
        return gpayment[lol];
    }
}