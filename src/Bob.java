import java.util.Scanner;

public static void main(String[] args) {

    public class void talkToBob() {
        String textMessage = "";
        Scanner s = new Scanner(System.in);
        System.out.printf("\n\nBob is in. You can message him.\n");
        while (true) {
        System.out.print("\nType text to Bob: ");
        textMessage = s.nextLine();

        // empty text
        if (textMessage == null || textMessage.length() == 0) {
        System.out.println("Fine. Be that way!");
        continue;
        }
        if (textMessage.equals("Bye.")) {
        break;
        }

        // convert to letter
        char c = textMessage.charAt(textMessage.length()-1);
        switch (c) {
        case '?':
        System.out.println("Sure.");
        break;
        case '!':
        System.out.println("Whoa, chill out!");
        break;
default:
        System.out.println("Whatever.");
        break;
        }

        } while (textMessage.charAt(0) == 'y');
        System.out.printf("\n\nGoodbye\n\n");
        s.close();
        }
