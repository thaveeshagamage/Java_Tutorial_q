package Chapter8b;

import java.util.Scanner;

public class textProcessor {
    public static void main(String[] args) {
        String inputText;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in a sentenceto count the words");
        inputText = sc.nextLine();
        sc.close();
        
     
        countWords(inputText);
    
    }

    private static void countWords(String text) {
        var words = text.split(" ");
        int wordCount = words.length;
        System.out.println("The words are");
        for(String word:words){
            System.out.println(word);
        }

        String message = String.format("Total number of words is %d", wordCount);
        System.out.println(message);
        
        
    }

}
