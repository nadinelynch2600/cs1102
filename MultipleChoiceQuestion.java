package Week7;
import javax.swing.JOptionPane;
public class MultipleChoiceQuestion {
	private String correctAnswer;
	private String question;
	public MultipleChoiceQuestion() {
}
	public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        setQuestion(query, a, b, c, d, e);
        this.setCorrectAnswer(answer);
    } 
   
    public void setQuestion(String query, String a, String b, String c, String d, String e) {
        this.question = query + "\n";
        this.question += "A. " + a.toUpperCase() + "\n";
        this.question += "B. " + b.toUpperCase() + "\n";
        this.question += "C. " + c.toUpperCase() + "\n";
        this.question += "D. " + d.toUpperCase() + "\n";
        String string = "E. ";
		this.question += string + e.toUpperCase() + "\n";
    }
    
    public String ask() {
        String answer = null;
        while (true) {
            answer = JOptionPane.showInputDialog(this.question);
            answer = answer.toUpperCase();
            if (!(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")
                    || answer.equals("E"))) {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            } else {
                break;
            }
        }
        return answer;
    }


	public String getCorrectAnswer() {
		return correctAnswer;
	}


	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
}