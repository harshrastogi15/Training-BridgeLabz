import java.util.Scanner;

class Harmonic{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value");
        int n = scn.nextInt();
        float harmonic = 1;
        for(int i=2; i<=n; i++){
            harmonic += (float)1/i;
        }
        System.out.println("Nth Harmonic number: " + harmonic);
        scn.close();
    }
}
