import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String temp = s.nextLine();

        String reversed = "";

        for (int i = temp.length() - 1; i >= 0; i--) {
            reversed = reversed + temp.charAt(i);
        }


        if (reversed.equals(temp)){
            System.out.println("It is a palindrome.");
        }
        
        else {
            System.out.println("Not Palindrome");
        }

    }


}
