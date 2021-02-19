package Week7;

import java.awt.event.*;
import javax.swing.*;
	public class QuestionDialogBox extends JDialog implements ActionListener {
	/**
		 * 
		 */
		private static final long serialVersionUID = -3688697665847505195L;
	String answer;
	public void actionPerformed(ActionEvent e) {
		answer = e.getActionCommand();
		dispose();
	}
}