package Chapter13b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling{
    public static void main(String[] args) throws IOException {

        createNewFileRethrow();
        numbersExceptionHandling();
           }

    private static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        Scanner fileRead = null;
        try{
            fileRead = new Scanner(file);
            while(fileRead.hasNextLine()){
                double num = fileRead.nextDouble();
                System.out.println("Number: " + num);
            }
            
    }catch (FileNotFoundException | InputMismatchException e){
        e.printStackTrace();

    }finally{
        fileRead.close();
    }
    }
    private static void createNewFile() {
        // TODO Auto-generated method stub
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
            
        } catch (IOException e) {
            System.out.println("Direcrtory does not exist ");
            e.printStackTrace();
        }
    }
    private static void createNewFileRethrow() throws IOException {
        // TODO Auto-generated method stub
        File file = new File("resources/nonexistent.txt");
        
            file.createNewFile();
            
         
    }
}
