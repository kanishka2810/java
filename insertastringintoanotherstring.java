public class insertastringintoanotherstring {
    public static void main(String[] args) 
	{ 
		String original = "kanika"; 
		String inserted = "sh"; 
		int index = 3; 
		String newString = new String(); 

		for (int i = 0; i < original.length(); i++) 
        { 
			newString += original.charAt(i); 

			if (i == index) 
            { 
				newString += inserted; 
			} 
		} 
		System.out.println("Original String: "+ original); 
						
		System.out.println("String to be inserted: "+ inserted); 
						
		System.out.println("String to be inserted at index: "+ index); 
						
		System.out.println("String to be inserted at index: "+newString); 
						
	} 
}
