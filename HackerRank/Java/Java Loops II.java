import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j = 0; j < n; j++){
                double s = a + (Math.pow(2, j)*b);
                System.out.printf("%.0f ", s);
                a = (int) s;
            }
            System.out.println();
        }
        in.close();
    }
}
