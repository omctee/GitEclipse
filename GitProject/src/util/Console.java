package util;

public class Console {

	public static void log(Object input) {
		// TODO Auto-generated method stub	
		System.out.println("---|_" + input.toString());
		return;
	}	
	
	public static void log(Object input, String label) {
		// TODO Auto-generated method stub	
		System.out.println(label + " ---|_" + input.toString());
		return;
	}	
	

}
