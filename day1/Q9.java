import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        String vowels = "aeiouAEIOU";
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value");
        String c = scn.next();
        if(vowels.indexOf(c) != -1){
            System.out.println(c + " is vowel");
        }else{
            System.out.println(c + " is not vowel");
        }
        scn.close();
    }
}
