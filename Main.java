//practicing everything while learning
public class Main{
    public static void main(String[] args){
        
        //narrowing cast
        int num = 6;
        double mynum = num;
        
        System.out.println("Integer is "+num);
        System.out.println("The double is "+mynum);
        
        //widening cast
        double decimal = 93.774d;
        int integer = (int) decimal;
        
        System.out.println("\nMy double is "+ decimal);
        System.out.println("My integer is "+integer);
        
        //string concatination
        String fname = "John";
        String lname = "Doez";
        
        System.out.println("\nName of user is "+fname.concat(lname));
        
        //java maths
	System.out.println("\nMax btn 8 & 18 no is "+Math.max(18,8));
	System.out.println("Square root of 225 is "+Math.sqrt(225));
	System.out.println("Random number is " + (Math.random()*101));
    }
}
