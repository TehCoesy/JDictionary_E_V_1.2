import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryCommandLine {
    private static DictionaryManagement m_dictionary = new DictionaryManagement();
    private static List<String> ls_command = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void init() {
        ls_command.add("sayHello");
        ls_command.add("basic");
        ls_command.add("listAll");
    }

    public static int commandParse(String input) {
        for (String element : ls_command) {
            if (element.compareTo(input) == 0) {
                switch(ls_command.indexOf(element)) {
                    case 0: m_dictionary.sayHello();  break;
                    case 1: dictionaryBasic(); break;
                    case 2: showAllWord(); break;
                    case 3: break;
                }
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        init();
        String commandLine ;

        m_dictionary.insertFromCommandLine();

        boolean m_Loop = true;
        while (m_Loop) {
            commandLine = scanner.nextLine();
            if (commandLine.compareTo("exit") == 0) {
                m_Loop = false;
                break;
            } else if (commandParse(commandLine) == 1){

            } else {
                System.out.println("No such command.");
            }
        }
    }

    //Commands
    public static void dictionaryBasic() {
        m_dictionary.insertFromCommandLine();
        showAllWord();
    }

    public static void showAllWord() {
        m_dictionary.listAll();
    }
}
