import java.util.Scanner;

public class LongWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] words = new String[n];
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
            res[i] = shortener(n, words[i]);


            
        }
        for (String shorten : res){
            System.out.println(shorten);
        }
    }

    public static String shortener(int n, String word){
        String firstL = word.substring(0, 1);
        String lastL = word.substring(-2, -1);
        String shorten = firstL + lastL;
        return shorten;
    }
}