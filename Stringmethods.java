
public class Stringmethods {

	public static void main(String[] args) {
		String name = "Bro";
		
		boolean result = name.equalsIgnoreCase("bro");
		int result = name.length();
		char result = name.charAt(0);
		int result = name.indexOf("o");
		boolean result = name.isEmpty();
		String result = name.toUpperCase();
		String result = name.trim();
		String result = name.replace('0', 'a') ;//where to replace
        System.out.println(result);
	}

}
