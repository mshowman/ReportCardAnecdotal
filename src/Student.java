

/*
 * Student Class
 * 
 * Object that will contain all of the attributes of a student
 * Name, Gender, Grades
 * 
 */
public class Student {
		//Variables
		private String firstName,lastName,fullName;
		private char gender;
		private char[] grades;	
		private int age;
			
		public Student() {
			firstName = "";
			lastName = "";
			fullName = "";
			gender = 0;
			age = 0;
			grades = new char[5];
		}
		
		//Get Methods
		public String getFirstName(){
			return firstName;
		}
		public String getLastName(){
			return lastName;
		}
		public String getFullName(){
			return fullName;
		}
		public char getGender(){
			return gender;
		}
		public int getAge(){
			return age;
		}
		public char[] getGrades(){
			return grades;
		}
		
		//Set Methods
		public void setinfo(String fName, String lName, char gender, int age){
			this.firstName = fName;
			this.lastName = lName;
			this.gender = gender;
			this.age = age;
			this.fullName = fName + "" + lName;
		}
		public void setGrades(char general, char math, char ela, char science, char ss  ){
			grades[0] = general;
			grades[1] = math;
			grades[2] = ela;
			grades[3] = science;
			grades[4] = ss;	
		}
		
}
