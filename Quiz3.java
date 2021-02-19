package Week7;

/*
 * this code is done by Nadine Lynch. (add new comments to the 
 */
import javax.swing.JOptionPane;
public class Quiz3 { // you can change the name to make it work (remove this comment )
	static int nQuestions = 0;
	 static int nCorrect = 0;
	private static QuestionDialog question;
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
	 String question = "simplify the following expression"
	 		+ "2x2 -2xy + 4xy?\n"; // practice question math number 10 practice quiz on GED Test, the x2 (x2 is x "2 is the squared" )
	 question += "A. x(x+y)\n";
	 question += "B. x(x-y)\n";
	 question += "C. 2x(x+y)\n";
	 question += "D. 2x(x-y)\n";
	 question += "E. none of the above.";
	 check(question,"D");

	 question = "which of the following best describes the authors' tone towards the US automakers?\n";  // practice question number 26 of the GED test Prep Book (English practice test)
	 question += "A. Critical\n";
	 question += "B. proud\n";
	 question += "C. approving\n";
	 question += "D. arrogant\n";
	 question += "E. nevermore";
	 check(question,"A");

	 question = "which of the following is among the body's first barriers against germs?\n";
	 question += "A. the immune system\n";
	 question += "B. antibiotics\n";
	 question += "C. antobodies\n";
	 question += "D. The Skin\n";
	 question += "E. none of the above";
	 check(question,"D"); // the skin
	 
	 question = "which of the following planets has the most moons?\n"; // Earth and Science lesson 4 Earth in the system (GED BOOK)
	 question += "A.Jupiter\n";
	 question += "B. Saturn\n";
	 question += "C. Uranus\n";
	 question += "D. Neptune\n";
	 question += "E. none of the above";
	 check(question,"B"); // Saturn has 53 moon 
	 
	 question = "who created this code??\n";
	 question += "B. Chibuye\n";
	 question += "C. Nadine Lynch\n";
	 question += "D. Victoria\n";
	 question += "E. Marcus";
	 check(question,"C"); // yes its me, i am using the same code structure as before i am trying my best though.
	 
	 JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
	 
        
        //here are the true or false questions i would like to use
        question = new TrueFalseQuestion("are Mermaids real?", "FALSE"); //answer is False, mermaids are a fantanst creature
        question.check();
        
        question = new TrueFalseQuestion("does Earth have 3 moons?", "FALSE"); // answer is 1 moon
        question.check();
        
        
        question = new TrueFalseQuestion("is Doctor Pepper a soft drink", "TRUE"); // answer is true
        question.check();
        //we show the results of the quiz
        question.showResu;
    }

} // end of the code

// final note from author: the same code is being used again but with different questions and answers.  
// i used my GED textbook for some of these new questions.