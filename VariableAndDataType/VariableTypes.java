package VariableAndDataType;

public class VariableTypes {
	public static void main(String[] args) {
		point p = new point(); //Non-primitive data type
		p.x = 10;
		p.y = 20;
		//int w;
		boolean isValid = true; // Primitive data type
		byte marks = 90;
		float pi = 3.14f;
		float div = 15.0f/4.0f;
		long views = 1000000000;
		char gender = 'M';
		char gender1 = gender;
		gender1 = 'F';
		   System.out.println(isValid);
		   System.out.println(marks);
		   System.out.println(pi);
		   System.out.println(div);
		   System.out.println(views);
		   System.out.println(gender);
		  // System.out.println(w);      Primitive data type get compiler error 
		                               //if we don't initialize it
		   System.out.println(gender1); // primitive data types are not references
		   System.out.println(p.x+" "+p.y);
		   System.out.println(p.z); //Non-primitive data type get default value 
		                            //if we not initialize
	}
}
class point {
   int x;      
   int y;
   int z;
}



