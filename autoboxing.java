public class autoboxing {
    public static void main(String[] args) {
        
        byte b=8;
        Byte byteobj=new Byte(b);
        System.out.println("\nByte object byteobj: "+ byteobj);

        int i=20;
        Integer intobj=new Integer(i);

        System.out.println("\nInteger object intobj: "+ intobj);

        float f=12.890f;
        Float floatobj= new Float(f);
        System.out.println("\nFloat object floatobj: "+ floatobj);

        char c ='k';
        Character charobj=new Character(c);
        System.out.println("\nchar object charobj: "+ charobj);

        double d=39.08568;
        Double doubleobj=new Double(d);
        System.out.println("\nDouble object doubleobj: "+ doubleobj);
    }
}
