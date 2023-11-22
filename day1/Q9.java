import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
    // public static void main(String[] args) {
    //     String vowels = "aeiouAEIOU";
    //     Scanner scn = new Scanner(System.in);
    //     System.out.println("Enter Value");
    //     String c = scn.next();
    //     if(vowels.indexOf(c) != -1){
    //         System.out.println(c + " is vowel");
    //     }else{
    //         System.out.println(c + " is not vowel");
    //     }
    //     scn.close();
    // }

    public static void main(String[] args) {
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        Arrays.sort(vowels);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value");
        char c = scn.next().charAt(0);
        int res = Arrays.binarySearch(vowels, c);
        if(res>=0){
            System.out.println(c + " is vowel");
        }else{
            System.out.println(c + " is not vowel");
        }
        scn.close();
    }
}
