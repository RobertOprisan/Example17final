import java.util.Scanner;
public class Example17final {
    public static void main(String[] args) {
        int h, m, s;
        System.out.println("Hours");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        h = inputValue.nextInt();

        System.out.println("minutes");
        inputValue = new Scanner(System.in);
        m = inputValue.nextInt();

        System.out.println("seconds");
        inputValue = new Scanner(System.in);
        s = inputValue.nextInt();

        s = s + 1;

        if ( s >= 60 ) {
            m = m + 1;
            s = s - 60;

        }
        if (m >= 60) {
            h = h + 1;
            m = m - 60;
        }

        System.out.println("The hour is: " + h + ":" + m + ":" + s);

    }
}
