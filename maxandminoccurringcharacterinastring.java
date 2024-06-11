public class maxandminoccurringcharacterinastring 
{
    public static void main(String[] args) 
    {    
        String s = "kanishka khandelwal";    
        int[] freq = new int[s.length()];    
        int i, j, min, max;
        char str[] = s.toCharArray(); 
        char min_char = s.charAt(0);
        char max_char = s.charAt(0);   
        for(i = 0; i < str.length; i++) 
        {    
            freq[i] = 1;    
            for(j = i+1; j < str.length; j++) 
            {    
                if(str[i] == str[j] && str[i] != ' ' && str[i] != '0') 
                {    
                    freq[i]++;   
                    str[j] = '0';    
                }    
            }    
        }      
        min = max = freq[0];    
        for(i = 0; i <freq.length; i++) 
        {    
            if(min > freq[i] && freq[i] != '0')
            {    
                min = freq[i];    
                min_char = str[i];    
            }    
            if(max < freq[i]) 
            {    
                max = freq[i];    
                max_char = str[i];    
            }    
        }    
            
        System.out.println("Minimum occurring character: " + min_char);    
        System.out.println("Maximum occurring character: " + max_char);    
    } 
}
