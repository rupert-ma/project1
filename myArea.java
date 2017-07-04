package myArea;
import javax.swing.JOptionPane;

public class myArea {

	public static void main(String[] args) {
		int askWidth = 0;
		int askHeight = 0;
		JOptionPane.showMessageDialog(null, "We are going to Compute the area of a rectangle");
		boolean valid = false;
		while (!valid) {

			try {
				askWidth = Integer.parseInt(JOptionPane.showInputDialog("Enter The Width"));
				if (askWidth >= 0)
					valid = true;
			} 
			catch (NumberFormatException e) {
				JOptionPane.showInputDialog("That's not a number. Please try again.");
			}

			try {
				askHeight = Integer.parseInt(JOptionPane.showInputDialog("Enter The Height"));
				if (askHeight >= 0)
					valid = true;
			} 
			catch (NumberFormatException e) {
				JOptionPane.showInputDialog("That's not a number. Please try again.");
			}

			if (askWidth == askHeight) {

				JOptionPane.showMessageDialog(null, "The shape is a square");

			}

			JOptionPane.showMessageDialog(null, "The Area of the Rectangle is " + askWidth * askHeight, null, JOptionPane.INFORMATION_MESSAGE);
		}

	}

	
	/*
	 * if (askHeight == null) { JOptionPane.showMessageDialog(null,
	 * "User pressed cancel, exiting program now!"); System.exit(0); }
	 */
	
}

