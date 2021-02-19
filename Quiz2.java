package CS1102;
import javax.swing.JOptionPane;
public class Quiz2 {
	static int nQuestions = 0;
	 static int nCorrect = 0;
	 static String ask(String question) {
	 while (true) {
	 String answer = JOptionPane.showInputDialog(question);
	 answer = answer.toUpperCase();
	 boolean valid = (answer.equals("A") || answer.equals("B") ||
	answer.equals("C") || answer.equals("D") || answer.equals("E"));
	 if (valid) return answer;
	 JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
	}
}
	 static void check(String question, String correctAnswer) {
	 nQuestions++;
	 String answer = ask(question);
	 if (answer.equals(correctAnswer)) {
	 JOptionPane.showMessageDialog(null,"Correct!");
	 nCorrect++;
	 } else {
	 JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
	 }
}
	 public static void main(String[] args) {
	 String question = "What is a quiz?\n";
	 question += "A. a test of knowledge, especially a brief informal test given to students\n";
	 question += "B. 42\n";
	 question += "C. a duck\n";
	 question += "D. to get to the other side\n";
	 question += "E. To be or not to be, that is the question.";
	 check(question,"A");

	 question = "When is a quiz?\n";
	 question += "A. a long, long ago\n";
	 question += "B. right now\n";
	 question += "C. the best of times\n";
	 question += "D. the worst of times\n";
	 question += "E. nevermore";
	 check(question,"B");

	 question = "Where is a quiz?\n";
	 question += "A. a galaxy far, far away\n";
	 question += "B. under the sea\n";
	 question += "C. right here\n";
	 question += "D. there and back again\n";
	 question += "E. the other side of the mountain";
	 check(question,"C");
	 
	 JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
	 }
}