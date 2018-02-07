package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		int happy = JOptionPane.showOptionDialog(null, "Are you happy?", "Luke x Ralph <3", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No" }, null);
		if(happy==0) {
			JOptionPane.showMessageDialog(null, "Yay! ^_^");
		}
		else {
			int happy2 = JOptionPane.showOptionDialog(null, "Do you want to be happy?", "Luke x Ralph <3", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No" }, null);
			if(happy2==0) {
				JOptionPane.showMessageDialog(null, "Then change something! ^_^");
			}
			else {
				JOptionPane.showMessageDialog(null, "Keep doing what you're doing then! ^_^");
			}
		}
	}
}
