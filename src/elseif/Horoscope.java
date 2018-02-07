package elseif;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		int s = JOptionPane.showOptionDialog(null, "What's your zodiac symbol?", "horoscope.exe", 0,
			JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"}, null);
		if(s==0) {
			JOptionPane.showMessageDialog(null, "Infinite riches await! ^_^");
		}
		else if(s==1) {
			JOptionPane.showMessageDialog(null, "You die tomorrow! ^_^");
		}
		else if(s==2) {
			JOptionPane.showMessageDialog(null, "Mr. Brooks will come in your room tonight! ^_^");
		}
		else if(s==3) {
			JOptionPane.showMessageDialog(null, "You will get Luke and Ally's GayJuice™ in your drink tomorrow! ^_^");
		}
		else if(s==4) {
			JOptionPane.showMessageDialog(null, "Ralph and Luke will throw you a surprise party! ^_^");
		}
		else if(s==5) {
			JOptionPane.showMessageDialog(null, "You will get a dog for your birthday! ^_^");
		}
		else if(s==6) {
			JOptionPane.showMessageDialog(null, "Cats will eat you in your sleep! ^_^");
		}
		else if(s==7) {
			JOptionPane.showMessageDialog(null, "Logan Paul will hang you for views tomorrow! ^_^");
		}
		else if(s==8) {
			JOptionPane.showMessageDialog(null, "Mr. Lumetta will give you infinite life! ^_^");
		}
		else if(s==9) {
			JOptionPane.showMessageDialog(null, "Dylan won't bother you any more! ^_^");
		}
		else if(s==10) {
			JOptionPane.showMessageDialog(null, "MineCraft Awesome Parodys will make a parody for you! ^_^");
		}
		else if(s==11) {
			JOptionPane.showMessageDialog(null, "Club Penguin will be back for 24 hours! ^_^");
		}
	}
}
