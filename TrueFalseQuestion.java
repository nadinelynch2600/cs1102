package Week7;
import java.awt.event.*;
import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class TrueFalseQuestion  {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String showResult = null;
	private String question; 
	private String correctAnswer;

	public TrueFalseQuestion(){
		    
	    }
	    
	    public TrueFalseQuestion(String query, String answer){
	        this.question = "TRUE or FALSE: \n" + query + "\n"; ;
	        this.setCorrectAnswer(answer);
	    }
	    
	    public String ask() {
	        String answer = null;
	        while (true) {
	            answer = JOptionPane.showInputDialog(this.question);
	            //convert our answer into uppercase
	            answer = answer.toUpperCase();
	            //we check if our input is correct
	            if (!(answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")
	                    || answer.equals("T") || answer.equals("TRUE") || answer.equals("Y")|| answer.equals("YES"))) {
	                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
	            } else {
	                
	                switch(answer){
	                    case "F": case "FALSE": case "N": case "NO":
	                        answer = "FALSE";
	                        break;
	                    case "T": case "TRUE": case "Y": case "YES":
	                        answer = "TRUE";
	                        break;
	                }
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

		public void check() {
			
		}
	    
	}