import javax.swing.JOptionPane;
public class MultipleChoiceQuestion extends Question {
	public MultipleChoiceQuestion() {


    }
    
  
    public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        setQuestion(query, a, b, c, d, e);
        this.correctAnswer = answer;
    }


  
   
    public void setQuestion(String query, String a, String b, String c, String d, String e) {
        this.question = query + "\n";
        this.question += "A. " + a.toUpperCase() + "\n";
        this.question += "B. " + b.toUpperCase() + "\n";
        this.question += "C. " + c.toUpperCase() + "\n";
        this.question += "D. " + d.toUpperCase() + "\n";
        this.question += "E. " + e.toUpperCase() + "\n";
    }




    
    @Override
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
}