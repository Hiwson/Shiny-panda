public class Main {
	public static void main(String[] args) {
	    String Name = "Jeff";
    System.out.println("Hello world!" + " "+Name);
	System.out.println(55);	
	System.out.println(Name);
	
	//print() also works but the next value will not be on a new line
	boolean learningJava = true;
	boolean javaIsFun = false;
	System.out.println("Learning Java is "+learningJava +" "+"and" +" " + "Java is fun is " + javaIsFun);
	
	String first = "Ruth";
	String last ="David";
	System.out.println(first .concat(last));
	System.out.println(first + " " +last);
	
	String txt = "We are the so called \"Vikings\" from the north";
	System.out.println(txt);
	String txt2 = "Hello\tWorld!";
	System.out.println(txt2);
	}
}