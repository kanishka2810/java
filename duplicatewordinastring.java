public class duplicatewordinastring 
{
    public static void main(String[] args) 
    {    
        String s = "IP address is a unique number assigned to a node of a network";    
        int count;    
        s = s.toLowerCase();       
        String str[] = s.split(" ");    
        System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < str.length; i++) 
        {    
            count = 1;    
            for(int j = i+1; j < str.length; j++) 
            {    
                if(str[i].equals(str[j])) 
                {    
                    count++;     
                    str[j] = "0";    
                }    
            }    
            if(count > 1 && str[i] != "0")    
                System.out.println(str[i]);  
        } 
    }    
}
