public class Pro8 {
    public static void main(String []args){
	  String text = "Albin";
	  System.out.println("\nGiven text is empty: "+text.isEmpty());
	  System.out.println("\nLength of text: "+text.length());
	  System.out.println("\nUpper Case: "+text.toUpperCase());
	  System.out.println("\nLower Case: "+text.toLowerCase());
	  System.out.println("\nReplace: "+text.replaceAll(text, "Adith"));
	  System.out.println("\nReplace first word: "+text.replaceFirst("Albin","Adith"));
	  System.out.println("\nReplace A with $: "+text.replace('A','$'));
	  System.out.println("\nConcatenation with: "+text.concat(" ").concat("T M"));
    }
}
