import java.util.*;
public class PangramCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase(); // convert all characters to lowercase
        boolean[] isPresent = new boolean[26]; // to check if a letter is present or not
        int index;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){ // ignore spaces
                continue;
            }
            if(!Character.isLetter(ch)){ // if any non-letter character is present, print INVALID DATA
                System.out.println("INVALID DATA");
                return;
            }
            index = ch - 'a'; // get the index of the letter in the array
            isPresent[index] = true; // mark the letter as present
        }
        for(boolean b: isPresent){
            if(!b){ // if any letter is not present, print FALSE
                System.out.println("FALSE");
                return;
            }
        }
        System.out.println("TRUE"); // if all letters are present, print TRUE
    }
}
