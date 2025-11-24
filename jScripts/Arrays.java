//java arrays
public class Arrays{
     public static void main(String[] args){
	String[] favCars = {"Subaru","Ford","Suzuki","BMW"};
	System.out.println("Most favourite brand is"+favCars[1]);

	//changing an element in an array
	favCars[3] = "Nissan";

	//an array length
	System.out.println("The length of my array is " + favCars.length);

	//using the new keyword to create an array with gixed size
	String[] continents = new String[7];
	continents[0] = "Australia";
	continents[1] = "Europe";
	continents[2] = "Africa";
	continents[3] = "South America";
	continents[4] = "Asia";
	continents[5] = "Antartica";
	continents[6] = "North America";
	System.out.println("We have 7 continents");

	//looping through an array
	for(int i = 0; i < continents.length; i++){
	   System.out.println("\t" + continents[i]);
	}
	//using for-each loop
	/*for(String continent : continents){
	     System.out.println(continent);
	   }*/

	//multidimensional arrays
	String[][] names = { {"Anto","Jamoh","Nduati"}, {"Moris","Denzel","Owtis"} };
	System.out.println("Element at row 1, col 2 is " + names[0][1]);
	System.out.println("My multidimensional array has " + names.length + " rows");
	System.out.println("First row has " + names[0].length + " columns");




     }
}
