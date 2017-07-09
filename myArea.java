package myArea;

import javax.swing.JOptionPane;

public class myArea2 {
	private static final int parsedMeasure = 0;
	public static String askMeasure;

	public myArea2() {
	}
	public int userData(int askMeasure) {
		return askMeasure;
	}
	public int userInput2() {
		return Integer.parseInt(askMeasure);
	}
	public int userInput1() {
		return Integer.parseInt(askMeasure);
	}

	// ******User Input Class with error handling ******
	public int userData() {

		boolean validM = false;
		while (!validM) {
			try {
				String askMeasure = JOptionPane.showInputDialog(null, "Enter the measurement");
				//askMeasure = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the measurement"));
					if (askMeasure == null) { JOptionPane.showMessageDialog(null, "You pressed cancel, exiting program now!"); System.exit(0); }
					
					if (Integer.parseInt(askMeasure) >= 0) {
					validM = true;
					int parsedMeasure = Integer.parseInt(askMeasure);
					return parsedMeasure;

					}
					
			}

			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "That's not a number. Please try again.",null, JOptionPane.ERROR_MESSAGE);
			}
	 
		}
		return parsedMeasure;
	}

	// ********Main Method*******
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "We are going to Compute the area of a rectangle");
		myArea2 userInput1 = new myArea2();
		//userInput1.userData();
		int parsedMeasure = userInput1.userData();
		int length = userInput1.userData(parsedMeasure);

		myArea2 userInput2 = new myArea2();
		//userInput2.userData();
		int parsedMeasure2 = userInput2.userData();
		int width = userInput2.userData(parsedMeasure2);
		
		int area = length * width;
		
		if (width == length) {

			JOptionPane.showMessageDialog(null, "The shape is a square");

		}
		
		JOptionPane.showMessageDialog(null, "The Area of the Rectangle is " + area, null,
				JOptionPane.INFORMATION_MESSAGE);

	}

}
