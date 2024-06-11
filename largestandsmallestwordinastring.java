public class largestandsmallestwordinastring 
{
    public static void main(String[] args)
    {     
        String s = "A protocol is a set of rules basically that is followed for communication";    
        String word = "", small = "", large="";    
        String[] str = new String[100];    
        int length = 0;    
        s = s + " ";    
          for(int i = 0; i < s.length(); i++){   
            if(s.charAt(i) != ' ')
            {    
                word = word + s.charAt(i);    
            }    
            else
            {      
                str[length] = word;    
                length++;    
                word = "";    
            }    
        }    
        small = large = str[0];       
        for(int k = 0; k < length; k++)
        {     
            if(small.length() > str[k].length())    
                small = str[k];    
            if(large.length() < str[k].length())    
                large = str[k];    
        }    
        System.out.println("Smallest word: " + small);    
        System.out.println("Largest word: " + large);    
    }   
}