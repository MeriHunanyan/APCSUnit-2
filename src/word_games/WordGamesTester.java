package word_games;
import java.util.Scanner;

public class WordGamesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for a word
        System.out.println("Give me a word: ");
        String UserWorld = input.nextLine();
        WordGames game = new WordGames(UserWorld);
        // Scramble it
        String ScrambleWord = game.scramble();
        // Print out scrambled word
        System.out.println(ScrambleWord);


        // Ask for an index
        System.out.println("Give me an index(int): ");
        int insertIdx = input.nextInt();
        // Ask for random word
        System.out.println("Give me a word");
        String ogString = input.nextLine();


        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String insertText = input.nextLine();

        // Add random word at index
        String wordAtIdx = game.bananaSplit(insertIdx, insertText, ogString);
        // Print out the word
        System.out.println(wordAtIdx);

        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word

    }
}
