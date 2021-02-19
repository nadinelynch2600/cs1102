package CS1102;
import javax.swing.JOptionPane;
public class SuperPower {
	public static void main(String[] args) {
		String power = JOptionPane.showInputDialog("What is your power?");
		power = power.toUpperCase();
		JOptionPane.showMessageDialog(null,power+" TO THE RESCUE!");
	}

}
