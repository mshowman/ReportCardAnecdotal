

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
		private char[] grades = new char[5];	
		private int age;
			
		public Student() {
			firstName = "";
			lastName = "";
			fullName = "";
			gender = 0;
			age = 0;
		}
		
		public Student(String firstName, String lastName, char gender, char[] grades, int age) {
			setinfo(firstName, lastName, gender, age);
			setGrades(grades);
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
		public void setGrades(char[] grades){
			for (int i = 0; i < grades.length; i++) {
				this.grades[i] = grades[i];
			}
		}
		
}
