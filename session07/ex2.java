package session07;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        int i,j;
        int n,m;
        Scanner input = new Scanner(System.in);
        System.out.println("n");
        n = input.nextInt();
        System.out.println("m");
        m = input.nextInt();
        for (i = 1;i <= n;i++){
            for (j = 1;j <= m;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
