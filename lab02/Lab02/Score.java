package Lab02;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int AMaths , AScience , AEnglish;
        int BMaths , BScience , BEnglish;

        int ASum = 0;
        int BSum = 0;

        int APercent = 0;
        int BPercent = 0;
//Accept marks of A
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter marks obtained in Maths: ");
        AMaths = input.nextInt();
        System.out.println("\nEnter marks obtained in Science: ");
        AScience = input.nextInt();
        System.out.println("\nEnter marks obtained in English: ");
        AEnglish = input.nextInt();
//Accept marks of B
        System.out.println("\nEnter marks obtained in Maths: ");
        BMaths = input.nextInt();
        System.out.println("\nEnter marks obtained in Science: ");
        BScience= input.nextInt();
        System.out.println("\nEnter marks obtained in English: ");
        BEnglish= input.nextInt();
//Display marks of A
        System.out.println("\nMarks of A: ");
        System.out.println("Maths = "+AMaths);
        System.out.println("Science = "+AScience);
        System.out.println("English = "+AEnglish);

//Display marks of B
        System.out.println("\nMarks of B:");
        System.out.println("Maths = "+BMaths);
        System.out.println("Science = "+BScience);
        System.out.println("Emglish = "+BEnglish);
//Calculate total marks scored by both
        ASum = AMaths + AScience + AEnglish;
        BSum = BMaths + BScience + BEnglish;
//Calculate percentage scored by both
        APercent = ASum * 100 / 300;
        BPercent = BSum * 100 / 300;

        System.out.println("\nTotal marks scored by A = " + ASum);
        System.out.println("Percentage = " + APercent + "%");

        System.out.println("\nTotal marks scored by B = " + BSum);
        System.out.println("Percentage = " +BPercent + "%");

        System.out.print("\nIs A percentage lesser than B? ");
        System.out.println(APercent < BPercent ? "Yes" : "No");
        System.out.print("Is A percentage greater than B? ");
        System.out.println(APercent > BPercent ? "Yes" : "No");
        System.out.print("A and B percentage are equal? ");
        System.out.println(APercent == BPercent ? "Yes" : "No");

        System.out.print("\nScholarship Amount for A = $");
        System.out.println(APercent > 75 ? 20000 : (APercent >= 60 && APercent <= 75) ? 10000 : 0);
        System.out.print("Scholarship Amount for B = $");
        System.out.println(BPercent > 75 ? 20000 : (BPercent >= 60 && BPercent <= 75) ? 10000 : 0);
    }
}
