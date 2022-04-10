import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.println("What is the string?");
        String temp = s.nextLine(); // D o g

        String reversed = "";

        /** Method 1 */

        // char[] p = temp.toCharArray();
        // for (char c: p){
        // reversed = c + reversed;
        // }

        /** Method 2 */


        // for (int i = temp.length() - 1; i >= 0; i--) {
        //     reversed = reversed + temp.charAt(i);
        // }


        System.out.println(reversed);

    }
}
