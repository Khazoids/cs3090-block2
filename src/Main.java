import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int NUM_PROMPTS = 2;
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int currentPrompt = 0;
        int passwordLength = 0;
        boolean includeSpecial = false;

        while(currentPrompt < NUM_PROMPTS) {
            switch(currentPrompt) {
                case(0):
                    System.out.println("How many characters long do you want your password to be (between 1 and 50)? ");
                    String input = scanner.nextLine();
                    try {
                        passwordLength = Integer.parseInt(input);
                        if(passwordLength > 0 && passwordLength <= 50) currentPrompt++;
                    } catch(Exception e) {
                        System.out.println("Please enter a valid integer between between 1 and 50");
                    }
                    break;
                case(1):
                    System.out.println("Should special characters be included? Type 'Yes' or 'No'. ");
                    String input2 = scanner.nextLine().toLowerCase().replaceAll("\\s+","");
                    if(input2.compareTo("yes") == 0) {
                        includeSpecial = true;
                        currentPrompt++;
                    } else if (input2.compareTo("no") == 0) {
                        includeSpecial = false;
                        currentPrompt++;
                    } else {
                        System.out.println("Please enter 'yes' or 'no'. ");
                    }
            }
        }

        if(includeSpecial) {
            System.out.println(genPassWithSpecialChars(passwordLength));
        } else {
            System.out.println(genNormalPassword(passwordLength));
        }

    }

    public static String genNormalPassword(int length) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < length; i++) {
            int num = rand.nextInt(10);
            if(num % 2 == 0) {
                str.append(num);
            } else {
                char c = (char)(rand.nextInt(26) + 'a');
                str.append(c);
            }
        }

        return str.toString();
    }

    public static String genPassWithSpecialChars(int length) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < length; i++) {
            int num = rand.nextInt(10);
            if(num % 2 == 0) {
                str.append(num);
            } else if (num % 3 == 0) {
                char s = (char)(rand.nextInt(15) + '!');
                str.append(s);
            }
            else {
                char c = (char)(rand.nextInt(26) + 'a');
                str.append(c);
            }
        }

        return str.toString();
    }
}