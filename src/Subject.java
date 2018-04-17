import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Subject {

	// private final Map<Integer, String> classs.getName()s = new HashMap<Integer,
	// String>();
	// private String classs.getName();
	// private ArrayList<String> anecdotals = new ArrayList<String>();
	// public Subject(int classIndex) {
	// classs.getName()s.put(0, "General");
	// classs.getName()s.put(1, "Math");
	// classs.getName()s.put(2, "ELA");
	// classs.getName()s.put(3, "Science");
	// classs.getName()s.put(4, "Social Studies");
	//
	// index = classIndex;
	// classs.getName() = classs.getName()s.get(classIndex);
	// }
	//
	// public void setAnecdotal(char grade, String msg) {
	//
	// }
	//

	private int index;
	private String P1 = "";
	private String P2 = "";
	private String P3 = "";
	private String P4 = "";

	public String getAnecdotal(Student s, int whichSubject) {

		index = whichSubject;

		// Get the gender for populating the pronouns in the anecdotes
		switch (s.getGender()) {
		case 'M':
			P1 = "She";
			P2 = "her";
			P3 = "her";
			P4 = "she";

			break;
		case 'F':
			P1 = "He";
			P2 = "his";
			P3 = "him";
			P4 = "he";

			break;
		}

		// Find the correct anecdote for the request
		switch (index) {

		case 0: // General Grade Anecdote
			switch (s.getGrades()[index]) {
			case 'P':
				return s.getFirstName() + "\n\n" + s.getFirstName()
						+ " comes in calmly and prepared for the day. With reminders from the teachers, " + P4
						+ " is able to complete our morning routines. " + s.getFirstName()
						+ " benefits from work requiring a partner/adult, utilizing the extra person to bounce ideas off of.  We look forward to seeing "
						+ P3 + " continue to progress as the year wraps up.";
			case 'M':
				return s.getFirstName() + "\n\n" + s.getFirstName()
						+ " always comes in excited to get to work. With a bit of reminding from the teachers, " + P4
						+ " follows the morning routines, unpacks " + P2
						+ " bag, and gets started on the morning work. " + s.getFirstName()
						+ " is always a great support to the peers around " + P3
						+ ". We can\'t wait to see all of the great things " + P4
						+ " does during the last part of the year together.";

			case 'E':
				return s.getFirstName() + "\n\n" + s.getFirstName() + " is a pleasure to have in class. " + P1
						+ " consistently follows the morning routine without requiring teacher support or reminders. "
						+ s.getFirstName() + " always works well with " + P2
						+ " peers and focuses on the task at hand.  We enjoy having " + P3 + " in class each day.";
			}

		case 1: // Math Grade Anecdote
			switch (s.getGrades()[index]) {
			case 'P':
				return "\n\nMath\n\n" + s.getFirstName() + " comes to math each day with an \"I can do it\" attitude. "
						+ P1 + " has continued to solidify " + P2
						+ " foundational skills when it comes to math facts in all four basic operations. "
						+ s.getFirstName()
						+ " can work through some activities independently with minimal teacher/peer assistance, while still requiring support for some activities. "
						+ P1 + " is getting better at asking for help on concepts " + P4
						+ " is not yet confident in, and moves forward successfully. " + P1
						+ " embraces our class challenges as long as " + P4
						+ " knows the support is there and available and is beginning to self-correct " + P2
						+ " mistakes without being prompted.\n\n" + s.getFirstName() + " has shown " + P2
						+ " understanding of place value, estimation, and addition & subtraction of multi-digit numbers through basic algorithms and complex word problems. "
						+ P1
						+ " can solve multi-digit equations in both multiplication and division, especially when manipulatives are available. "
						+ s.getFirstName() + " is continuing to develop " + P2
						+ " understanding of both the processes of multiplication and division and the inner workings (why and how these processes work). "
						+ s.getFirstName()
						+ " enjoys the math games and problem solving tasks presented in class and pushes " + P3
						+ "self to complete each task to the best of " + P2 + " ability. We are so proud of "
						+ s.getFirstName() + " for " + P2 + " hard work and determination as a mathematician!";
			case 'M':
				return "\n\nMath\n\n" + s.getFirstName() + " comes to math each day with an \"I can do it\" attitude. "
						+ P1 + " has a solid foundation in " + P2
						+ " math facts in all four basic operations, evidenced by the increasing accuracy of " + P2
						+ " computation. " + P1 + " clearly \"owns\" the multiplication tables and can draw upon " + P2
						+ " knowledge. " + s.getFirstName()
						+ " can work through most activities independently with some teacher/peer assistance. " + P1
						+ " will ask for clarification on concepts " + P4
						+ " is not yet confident in, and works to move forward successfully. " + P1
						+ " embraces our class challenges and can often self-correct " + P2
						+ " mistakes without being prompted.\n\n" + s.getFirstName() + " has shown " + P2
						+ " understanding of place value, estimation, and addition & subtraction of multi-digit numbers through basic algorithms and complex word problems. "
						+ P1
						+ " can solve multi-digit equations in both multiplication and division with only a few computational errors. "
						+ P1
						+ " understands both the processes of multiplication and division and is examining the inner workings (why and how these processes work). "
						+ s.getFirstName()
						+ " enjoys the math games and problem solving tasks presented in class. We look forward to watching as "
						+ P4 + " continues to develop as a mathematician.";
			case 'E':
				return "\n\nMath\n\n" + s.getFirstName()
						+ " comes to math each day with an \"I can do it\" attitude and an abundance of positive energy. "
						+ P1 + " has a solid foundation in " + P2
						+ " math facts in all four basic operations, evidenced by the accuracy of " + P2
						+ " computation. " + P1 + " clearly \"owns\" the multiplication tables and can draw upon " + P2
						+ " knowledge. " + s.getFirstName()
						+ " can work through most activities independently with minimal teacher/peer assistance. " + P1
						+ " will consistently ask for clarification on concepts " + P4
						+ " is not yet confident in, and immediately moves forward successfully once it\'s been explained. "
						+ P1 + " embraces our class challenges and can self-correct " + P2
						+ " occasional mistakes without being prompted.\n\n" + s.getFirstName() + " has shown " + P2
						+ " understanding of place value, estimation, and addition & subtraction of multi-digit "
						+ "numbers through basic algorithms and complex word problems. " + P1
						+ " can solve multi-digit equations in both multiplication and division with only an occasional computational error. "
						+ P1
						+ " understands both the processes of multiplication and division, and the inner workings (why and how these processes work). "
						+ s.getFirstName()
						+ " embraces the math games and problem solving tasks presented in class, and pushes " + P3
						+ "self to complete each task neatly and correctly. We see " + s.getFirstName()
						+ " as a model of determination and look forward to watching as " + P4
						+ " continues to develop as a mathematician.";
			}

		case 2: // ELA Reading Grade Anecdote
			switch (s.getGrades()[index]) {
			case 'P':
				return "\n\nReading\n\nOur second unit of the year explored the elements of nonfiction text, culminating with "
						+ "students creating a nonfiction text in collaboration with a small group of peers. During this unit, our "
						+ "focus was on text features, both identifying and utilizing within their own text. We also taught note "
						+ "taking structure through the nonfiction signposts. In order to complete their books, students had to "
						+ "learn and apply research skills and time management techniques. " + s.getFirstName()
						+ ", with teacher support, was engaged and focused, requiring some support in keeping materials in order. "
						+ P1
						+ " was able to research information through trade books from the library as well as through online "
						+ "content. Currently, we are hard at work studying characters, their traits, and author\'s craft through "
						+ "various fiction texts. We will able to share more of our work during conferences."
						+ "\n\nWriting\n\nWith support, " + s.getFirstName()
						+ " is able to construct a topic sentence and provide supporting details as well as a closing sentence. "
						+ s.getFirstName() + " can generate ideas for " + P2
						+ " writing, occasionally requiring adult support in constructing outlines and story maps "
						+ "before beginning writing. Teachers post anchor charts and model a sample to reinforce and support students. Throughout the nonfiction "
						+ "unit (in combination with social studies and science), " + s.getFirstName()
						+ " has worked hard through the writing process using rubrics "
						+ "and checklists to enable self reflection and editing skills.";
			case 'M':
				return "\n\nReading\n\n" + s.getFirstName()
						+ " is engaged in our novel studies.  Our second unit explored the elements of "
						+ "nonfiction text, culminating with students creating a nonfiction text in collaboration with a small group of "
						+ "peers. During this unit, our focus was on text features, both identifying and utilizing within their own text. "
						+ "We also taught note taking structure through the nonfiction signposts. In order to complete their books, "
						+ "students had to learn and apply research skills and time management techniques. "
						+ s.getFirstName()
						+ " was engaged and focused, requiring little support keeping materials in order. " + P1
						+ " was a supportive member of " + P2 + " team through " + P2
						+ " collaboration with teammates. "
						+ "Currently, we are hard at work studying characters, their traits, and author\'s craft through "
						+ "various fiction texts. We will able to share more of our work during conferences."
						+ "\n\nWriting\n\n" + P1
						+ " is learning to develop a topic sentence with several supporting details and a closing sentence.  "
						+ "With some assistance from the teacher, " + s.getFirstName() + " can generate ideas for " + P2
						+ " writing, constructing outlines and story maps "
						+ "before beginning writing.  Throughout the nonfiction unit (in combination with social studies and science), "
						+ s.getFirstName()
						+ " has worked through the writing process using rubrics and checklists to enable self reflection and editing skills.";
			case 'E':
				return "\n\nReading\n\n" + s.getFirstName()
						+ " is very engaged in our novel studies.  Our second unit explored the "
						+ "elements of nonfiction text, culminating with students creating a nonfiction text in collaboration"
						+ " with a small group of peers. During this unit, our focus was on text features, both identifying"
						+ " them in books they read and utilizing them within their own text. We also taught note taking "
						+ "strategies through the nonfiction signposts. In order to complete their books, students had to "
						+ "learn and apply research skills and time management techniques. " + s.getFirstName()
						+ " was highly engaged and focused, requiring minimal support and keeping " + P2
						+ " materials in order. " + P1 + " was a supportive member of " + P2
						+ " team, showing leadership qualities through collaboration, innovation, and creativity. "
						+ "Currently, we are hard at work studying characters, their traits, and author\'s craft "
						+ "through various fiction texts. We will able to share more of our work in this area during conferences."
						+ "\n\nWriting\n\nIn writing, " + s.getFirstName()
						+ " is learning to develop a strong topic sentence with several supporting "
						+ "details and a closing sentence.  With minimal assistance from the teacher, "
						+ s.getFirstName() + " can generate ideas for " + P2
						+ " writing, constructing outlines and story maps before beginning writing.  Throughout the nonfiction unit (in combination with social studies and science), "
						+ s.getFirstName()
						+ " has worked through the writing process using rubrics and checklists to enable self reflection and editing skills.";
			}

		case 3: // ELA Writing Grade Anecdote
			switch (s.getGrades()[index]) {
			case 'P':

			case 'M':

			case 'E':

			}

		case 4: // Science Grade Anecdote
			switch (s.getGrades()[index]) {
			default:
				return "\n\nScience\n\nOur first science unit focused on \"Energy and Electricity\". Through hands-on experiences, "
						+ s.getFirstName()
						+ " explored the concepts of kinetic and potential energy, sources of energy in terms of electricity, and how simple circuits function. "
						+ s.getFirstName()
						+ " engaged in these \"experiments\" head on, happily problem solving any issues and creating new variations when appropriate. "
						+ "Our culminating project was to create an electric car able to travel a certain distance, pull an object of a certain weight, and jump "
						+ "a specific distance. While as a class, we did not find much success with any of these goals, let alone getting our cars to move, "
						+ s.getFirstName() + " refused to give up. " + P1
						+ " exhausted every possible idea before finally \"throwing in the white towel\".\n\nOur "
						+ "second science unit is \"Rocks and Minerals\", something that " + s.getFirstName()
						+ " is very excited to begin. We began our study by "
						+ "looking at the process of weathering (wearing down rocks through constant interaction with wind, water, and ice). The "
						+ "students were assigned to a team and asked to develop an experiment to observe the process, while including their own "
						+ "purpose (which one weathered faster, would different liquids affect the process, etc.). Through this process, "
						+ s.getFirstName()
						+ " worked through the scientific method with minimal support from the teacher. "
						+ s.getFirstName() + " and " + P2
						+ " group worked together to develop and document their plans, revise and edit those plans based on reflection, "
						+ "new information, or limitations, and finally run their experiment. I look forward to seeing what new and exciting things "
						+ P4 + " comes up with as we continue in our study of \"Rocks and Minerals\".";
			}

		default:
			return "Please try again";
		}

	}
}
