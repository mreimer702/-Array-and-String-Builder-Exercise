import java.util.Scanner;

public class StringBuilderProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence of your choosing: ");
        String sentence = scanner.nextLine();
        String [] words = sentence.split(" ");
        StringBuilder [] reverse = new StringBuilder[words.length];
        int count = 0;
        for(String word:words){
            StringBuilder w = new StringBuilder (word);
            reverse[count] = w.reverse();
            count += 1;
        }
        String reverseSentence = String.join(" ", reverse);
        System.out.println(reverseSentence);
    }
}
