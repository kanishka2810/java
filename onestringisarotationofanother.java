public class onestringisarotationofanother {
    public static void main(String[] args) 
    {
        String s="kanishka",str="anishka";
        if(s.length()!=str.length())
            System.out.println("Not rotation");
        else
        {
            s=s.concat(s);
            if(s.indexOf(str)!=-1)
                System.out.println("rotation");
            else
                System.out.println("no");
        }
    }
}
