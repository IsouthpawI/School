//Oleksandr Shulha

import java.util.*;

public class English {

    public static void main(String[] args) {
        new English().run();
    }

    public void run()
    {

        System.out.println("Input String:\n");////
        Scanner keyboardScanner = new Scanner(System.in);/////
        String inString = keyboardScanner.nextLine();/////
        String shortMessage = shortifyMessage(inString);
        System.out.println(shortMessage);
    }

    public String shortifyMessage(String str)
    {
        String s = str;
        s = s.replace("Pes", "Dog");
        s = s.replace("Macka", "Cat");
        s = s.replace("Vtak", "Bird");
        s = s.replace("Ryba", "Fish");
        s = s.replace("Kajman", "Aligator");

        return s;
    }

}
