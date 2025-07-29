import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i=2;
        int j=8;
        String s="akhil";
//unckecked exception 
try {
    int div =j/i;
    System.out.println(div);
    
    System.out.println(s.length());
} catch (ArithmeticException e) {
    // TODO: handle exception
    // user defined exception
    System.out.println("value cannot be zero  ");
}catch(Exception a){
    System.out.println("string is empty "+ a);
}

//checked exception -- try catch is compulsory
try {
    File f = new File("file.txt");
    Scanner sc=new Scanner(f);// file not found exception
} catch (Exception e) {
    // TODO: handle exception
    System.out.println(e);
}

    }
    
}