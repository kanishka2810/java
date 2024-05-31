public class multiplecatchblock {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        String s=null;
        try
        {
             System.out.println(s.length());
             System.out.println(a[7]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Airthmatic Exception");
        }
        catch(Exception e)
        {
            System.out.println("Other exception");
        }
        finally{
            System.out.println("Other");
        }
    }
}
