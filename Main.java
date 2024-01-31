import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        // Hypotenuse calculation ( 3  4 -->  5 )

        Scanner scanner = new Scanner(System.in);

        // lengths of legs

        System.out.println("Enter the length of the first leg...");
        int leg1= scanner.nextInt();
        System.out.println("Enter the length of the second leg...");
        int leg2= scanner.nextInt();

        double hypotenuse = Math.sqrt((leg1*leg1) + (leg2*leg2));

        //Operation to ensure that the result has only two digits after the comma
        DecimalFormat df = new DecimalFormat("#.##");

        String formatHypotenuse = df.format(hypotenuse);

        System.out.println(formatHypotenuse);
    }
}