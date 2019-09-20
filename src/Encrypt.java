import java.util.Scanner;

public class Encrypt {

    public static void main(String[] args) {
        binToInt();
    }

    private static String inputNumber() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type binary kod: ");
        String s = scan.nextLine();

        return s;
    }

    private static void binaryToInt(String s) {
        try {
            int a = Integer.parseInt(s, 2);

            System.out.println("\"" + s + "\" " + "-> " + a);

            char c = (char) a;

            System.out.println("\"" + a + "\" " + "-> " + c);

            int a2=((a&15)<<4) + ((a&240)>>4);

            System.out.println("\"" + a + "\" " + "-> " + a2);

        } catch (NumberFormatException e) {
            System.out.println("Wrong input!");
        }
    }

    public static char cont() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Restart program? Y/N:");
        String cont = scan.nextLine();

        char c;
        if(cont.length() > 0)
            c = cont.charAt(0);
        else {
            System.out.println("Wrong input!");
            return 'n';
        }

        return c;
    }

    public static void binToInt() {
        Scanner scan = new Scanner(System.in);

        char c;

        do {
            binaryToInt(inputNumber());

            c = cont();
        }while(c == 'y' || c == 'Y');
    }
}



