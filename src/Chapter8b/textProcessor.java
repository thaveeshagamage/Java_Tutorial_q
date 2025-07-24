package Chapter8b;

import java.util.Scanner;

public class textProcessor {
    public static void main(String[] args) {
        String inputText;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in a sentence to count the words");
        inputText = sc.nextLine();
        sc.close();
        
     
        countWords(inputText);
        reverseString(inputText);
        addSpace("ThisisAStringWithoutSpaces");
    
    }

    private static void addSpace(String wOSpace) {
        var spacedString = new StringBuilder(wOSpace);
        System.out.println("size of wOSpace is" + wOSpace.length());
        for(int i = 0; i < spacedString.length(); i++){
            System.out.println("i before IF Condition is" + i);
                if(i !=0 && Character.isUpperCase(spacedString.charAt(i))) {
                    System.out.println("Adding space before " + spacedString.charAt(i) + " at index " + i);
                    spacedString.insert(i, " ");
                    i++;
                }
        }
        System.out.println("The string with spaces is " + spacedString.toString());
    }

    public static void reverseString(String inputText) {
        //String reverse;
        for(int i = inputText.length()-1; i>=0; i--){
          System.out.print(inputText.charAt(i));  
            
        }
    }

    public static void countWords(String text) {
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
