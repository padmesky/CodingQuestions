public class URLMake {
    public static String replaceString(String str, int num){
        String newString="";
        for(int i=0; i<str.length(); i++){
            if(Character.isSpaceChar(str.charAt(i)) && i<num){
                newString = newString + "%20";
            }
            else{
                newString = newString + str.charAt(i);
            }
        }
        return newString;
    }
    public static void main(String args[]) {
        String testString = "I have a giant head   ";
        String newString = replaceString(testString, 18);
        System.out.println(newString);
    }

}
