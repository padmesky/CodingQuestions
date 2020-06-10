import java.util.HashMap;

public class PalindromePermutation {
    public static Boolean IsPalindromePermutation(String input){

        HashMap<Character,Integer> charFrequency = new HashMap<Character, Integer>();
        input = input.toLowerCase();
        int count = 0;

        for(int i =0; i<input.length(); i++){
            if(Character.isAlphabetic(input.charAt(i))){
                if (charFrequency.get(input.charAt(i)) == null){
                    charFrequency.put(input.charAt(i),1);
                }else{
                    int val = charFrequency.get(input.charAt(i));
                    val += 1;
                    charFrequency.put(input.charAt(i),val);
                }
            }

        }

        for(int i :charFrequency.values()){
            if(i % 2==1){
                count++;
            }
        }
        if(count>1){
            return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        Boolean result = IsPalindromePermutation("Tact Coa");
        System.out.println(result.toString());
    }
}
