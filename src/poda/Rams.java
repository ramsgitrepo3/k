package poda;



public class Rams {

	
	int a = 5;
	int b = a++ + ++a + a-- - --a;
	
	public static void main(String[] arg) {
		
		Rams cl=new Rams();
		System.out.println(cl.b);
	}
	
}

