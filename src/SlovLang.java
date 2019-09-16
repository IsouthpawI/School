import java.util.Scanner;

public class SlovLang {

    public static void main(String[] args) {

        System.out.println("Type Text");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String k;
        String []s1 = s.split("\\.");

        for(int i=0;i<s1.length;i++)
        {
            String []mass = s1[i].split("\\ ");

            {
                for(int j=0;j<mass.length;j++){

                    {
                        if(j!=0) {
                            k = mass[j].toLowerCase();
                            System.out.print(k + " ");
                        }
                        else
                            System.out.print(mass[j]+" ");
                    }

                }
                System.out.print(".");
            }
        }

    }

}
