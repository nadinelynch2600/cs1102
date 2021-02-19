package CS1102;
import javax.swing.JOptionPane;
public class quiz {

	public static void main(String[] args) {
		
		String question = "What is a dolphin?\n";
		question += "A. a fish\n";
		question += "B. an aquatic mammal\n";
		question += "C. a furry four legged animal\n";
		question += "D. a reptile\n";
		question += "E. a bug\n";
		String answer = "";
		answer = answer.toUpperCase();
		while (!answer.equals("1")){
			answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if (answer.equals("A")||answer.equals("C")||answer.equals("D")||answer.equals("E")){
				JOptionPane.showMessageDialog(null,"Incorrect, try again.");
			}
			if (answer.equals("B")){
				JOptionPane.showMessageDialog(null,"That is Correct!");
				break;
			}
			if (answer != "A"||!answer.equals("C")||!answer.equals("D")||!answer.equals("E")){
				JOptionPane.showMessageDialog(null,"Invalid Input");
			}
		}
		JOptionPane.showMessageDialog(null,"Good Job!");

	}

}
