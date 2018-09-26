import java.util.Scanner;

public class DictionaryManagement {
    private static Scanner scan = new Scanner(System.in);
    private Dictionary dictionary = new Dictionary();

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void insertFromCommandLine() {
        System.out.print("English Word: ");
        String in1 = scan.nextLine();
        System.out.print("Explanation: ");
        String in2 = scan.nextLine();
        dictionary.addS(in1,in2);
    }

    public void listAll() {
        System.out.printf("%15s | %15s\n","Word","Explanation");
        int n = dictionary.getSize();
        for (int i = 0; i < n; i++) {
            System.out.println(dictionary.getWordS(i));
        }
    }
}
