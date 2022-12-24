
package hw1;

import java.util.Scanner;

public class CorrectingSignals {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        
        int num = in.nextInt();
        
        int x1 = num / 10000000;
        int x2 = num / 1000000 %10;
        int x3 = num / 100000 %10;
        int x4 = num / 10000 %10;
        int x5 = num / 1000 %10;
        int x6 = num / 100 %10;
        int x7 = num / 10 %10;
        int x8 = num % 10;  
        
        x8 =((int)(((x8 + 1) * x1) - 0.9) % 2) ^ x8 ^ ((x1 % 2) ^ ((x1 * (x8 + 1) - (x1 % 2)) % 2));
        
        
        x1 =0;
        
        System.out.println("" + x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8);
    }
}
