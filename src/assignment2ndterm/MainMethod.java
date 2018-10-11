package assignment2ndterm;

import static assignment2ndterm.Assignment2ndTerm.getAddress;
import static assignment2ndterm.Assignment2ndTerm.getCitizenship;
import static assignment2ndterm.Assignment2ndTerm.getCourse;
import static assignment2ndterm.Assignment2ndTerm.getGender;
import static assignment2ndterm.Assignment2ndTerm.getPayment;
import static assignment2ndterm.Assignment2ndTerm.getStName;
import static assignment2ndterm.Assignment2ndTerm.getStudentNum;
import static assignment2ndterm.Assignment2ndTerm.getTerm;
import static assignment2ndterm.Assignment2ndTerm.printHeader;
import static assignment2ndterm.Assignment2ndTerm.printPayment;
import static assignment2ndterm.Assignment2ndTerm.scholarship;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jerald
 */
public class MainMethod {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] snum = new String[3];
        String[] sname = new String[3];
        String[] scitizenship = new String[3];
        String[] saddress = new String[3];
        String[] scourse = new String[3];
        String[] sterm = new String[3];
        String[] sgender = new String[3];
        String[] spayment = new String[3];
        double[] sScho = new double[3];

        for (int x = 0; x < snum.length; x++) {
            printHeader();
            getStudentNum(snum, x);
            getStName(sname, x);
            getCitizenship(scitizenship, x);
            
            getAddress(saddress, x);
            getCourse(scourse, x);
            getTerm(sterm, x);
            getGender(sgender, x);
            printPayment();
            scholarship(sScho, x);
            getPayment(spayment, x, sScho);
        }

        System.out.println("");

        System.out.println("\tALL STUDENTS FOR THIS SCHOOL YEAR");
        for (int y = 0; y < snum.length; y++) {
            System.out.println("\n\tStudent #" + (y + 1));
            System.out.println("Student ID     : " + snum[y].toUpperCase());
            System.out.println("Name           : " + sname[y].toUpperCase());
            System.out.println("Citizenship    : " + scitizenship[y].toUpperCase());
            System.out.println("Address        : " + saddress[y].toUpperCase());
            System.out.println("Course         : " + scourse[y].toUpperCase());
            System.out.println("Term           : " + sterm[y].toUpperCase());
            System.out.println("Gender         : " + sgender[y].toUpperCase());
            System.out.println("Payment Method : " + spayment[y].toUpperCase());
            System.out.println("Total Payment  : P" + df2.format(sScho[y]));
        }
    }
}