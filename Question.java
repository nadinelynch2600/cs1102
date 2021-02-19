package Week7;

import javax.swing.JOptionPane;
public abstract class Question {
	static int nCorrectAnswer = 0;
    static int nQuestion = 0;
    protected String question;
    String correctAnswer;
    //abstract method ask
 public abstract String ask();
    //the same method
    @SuppressWarnings("static-access")
	public void check() {
        String answer = ask();
        this.nQuestion++;
        if (answer.equalsIgnoreCase(this.correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!");
            this.nCorrectAnswer++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect");
        }
    }
    public static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrectAnswer + " correct out of questions " + nQuestion);
    }
}

