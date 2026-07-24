package string;

/**
 * Given a string s, reverse the string without reversing its individual words. Words are separated by dots(.).
 */
public class ReverseWords {

    public String reverseWords(String input){
        String reversed ="";

        String []array = input.split("\\.");
        for(int i=array.length-1; i>=0; i--){
            reversed = reversed + array[i];

            reversed = reversed + ".";
        }

        return reversed;
    }

}
