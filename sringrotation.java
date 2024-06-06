public class sringrotation 
{
    public static void main(String[] args) 
    {  
        String s = "kanishka";  
        String s2 = "shkakani"; 
        if (s.length() != s2.length()) 
        {  
            System.out.println("not possible beacuse length is not same");
        }              
        else
        {
            String st3 = s2 + s2;  
            if (st3.contains(s)) 
            {  
                System.out.println("Yes");  
            } 
            else 
            {  
                System.out.println("No");  
            }  
        }
    }
} 