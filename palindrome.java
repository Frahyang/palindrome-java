import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Stack<Character> palindromeCheck = new Stack<>(); // Create stack

        Scanner userInput = new Scanner(System.in); // Receive user input
        System.out.print("Enter text: ");
        String input = userInput.nextLine();

        boolean palindrome = true; // For checking palindrome validity 

        for (int i = 0; i < input.length(); i++) { // Loop to put stack from input in letters
            palindromeCheck.push(input.charAt(i));
        }

        for (int j = 0; j <= input.length()/2; j++) { // Loop to check letter at the end of word with start of word, and iterating towards the center
            char ch = palindromeCheck.pop();
            if (ch != input.charAt(j)) {
                System.out.println("This word is not a palyndrome");
                palindrome = false;
                break;
            }
        }
        if (palindrome == true) {
        System.out.println("This word is a palyndrome");
        }
        userInput.close();
    }
}