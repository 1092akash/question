import java.util.Scanner;
public class sStudent {
    int max = 100;
    int obtd;
}
     class student {


        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            sStudent s1 = new sStudent();
            s1.obtd = scn.nextInt();
            System.out.println("Enter the math marks");
            sStudent s2 = new sStudent();
            s2.obtd = scn.nextInt();
            System.out.println("Enter the english marks");
            sStudent s3 = new sStudent();
            s3.obtd = scn.nextInt();
            System.out.println("Enter the social science marks");
            sStudent s4 = new sStudent();
            s4.obtd = scn.nextInt();
            System.out.println("Enter the science marks ");
            sStudent s5 = new sStudent();
            s5.obtd = scn.nextInt();
            System.out.println("Enter the hindi marks");
            int sum = s1.obtd + s2.obtd + s3.obtd + s4.obtd + s5.obtd;
            int per = (sum * 100 / 500);
            System.out.println("Percentage Obtained:" + per);
        }

    }
