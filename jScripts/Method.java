public class Method{

	/*this variable has a class scope hence can be 
	accessed by any method*/
	String devName = "Ulidev";
	int devAge = 23;


     static void myMethod(){
        System.out.println("Excecuted from a method/function");
	//accessing a variable with class scope
	Method dev = new Method();
	System.out.println("Details of developer: " + dev.devName + " " + dev.devAge);
     }

	//giving a method parameters
     static void names(String fname,String lname){
         System.out.println("The name of the person is " + fname + " " + lname );
     }


	//method overloading-makes it possible to have one method in different datatype
     static  int sum(int a,int b){
	return a + b; 
     }
     static double sum(double c,double d){
	return c + d;
     }
     public static void main(String[] args){
         myMethod();

	   //inputing arguments when calling a method
	 names("James","Huvo");
	 names("Mwambi","Njiru");

	int sumation = sum(7,8);
	System.out.println("The sum is: " + sumation);
	double  sumation2  = sum(8.3,9.5);
	System.out.println("The sum of a double is: " + sumation2);
     }
}
