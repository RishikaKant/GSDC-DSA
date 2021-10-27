public class MaxOccChar {
    public static void main(String[] args) {

    }
    public static char getMaxOccuringChar(String line)
    {
        int[] count = new int[26];
        
        //counting the occurences of each char in the string
        for (int i=0;i<line.length();i++){
            count[line.charAt(i)-'a']++;
        }
        
        int max=-1;
        char result=0;
        
        //getting the max occuring char
        for(int i=0;i<26;i++){
            if(max<count[i]){
                max=count[i];
                result=(char)(i + 'a');
                
            }
        }
        return result;
        
        
            // Your code here
    }
}