import java.util.Scanner;

public class Math {

    public static void main(String[] args) {

        System.out.println("Type Int");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        char[]arr = a.toCharArray();

        for(int i=arr.length-1; i>=0; i--){
            System.out.printf("%s", arr[i]);
        }
        System.out.println();

                Scanner s = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int n = s.nextInt();
                if (isPrime(n)) {
                    System.out.println(n + " is a prime number");
                } else {
                    System.out.println(n + " is not a prime number");
                }
            }

            public static boolean isPrime(int n) {
                if (n <= 1) {
                    return false;
                }
                for (int i = 2; i < java.lang.Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
}