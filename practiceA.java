import java.util.Arrays;
import java.util.Scanner;

public class practiceA {
    public static int checkVowel(String str){
         int count =0;
         for(int i =0;i<str.length();i++){
             if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
                 count++;
             }
         }

       return count;
    }

    public static void main(String[] args){
    String str="i am good boy , i love a lot to my  miss chini...:)";
    System.out.println("No of vowel is :"+checkVowel(str));
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first string: ");
        String x = sc.nextLine();

        System.out.print("Enter the second string: ");
        String y = sc.nextLine();
    x=x.replace(" ","");
    y=y.replace(" ","");
    x=x.toLowerCase();
    y=y.toLowerCase();
    char a[]=x.toCharArray();
    char b[]=y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)){
            System.out.println("String are anagram");
        }else {
            System.out.println("Not anagram");
        }


}
}
