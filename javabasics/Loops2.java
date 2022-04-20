import java.io.*;
import java.util.*;
import java.lang.Math;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        
        while(q>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            double dsum = 0;
            
            for(int i=0;i<n;i++){
                dsum = a + b*(2*((1-Math.pow(2,(i)))/(1-2))+1);
                int sum = (int) dsum;
                System.out.print(sum + " ");
            }
            System.out.println();
            q--;
        }
    }
}
