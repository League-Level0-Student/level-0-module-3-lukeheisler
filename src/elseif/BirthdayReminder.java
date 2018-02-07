
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 2nd";
		String dadsBirthday = "October 30th";
		String myBirthday = "April 14th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		int day = JOptionPane.showOptionDialog(null, "What birthday do you want to know?", "Luke x Ralph <3", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Luke's Mom", "Luke's Dad", "Luke" }, null);
		// 3. Print out what the user typed
		System.out.println(day);
		// 4. if user asked for "mom"
		if(day==0) {
			//print mom's birthday
			JOptionPane.showMessageDialog(null, "Luke's mom's birthday is on " + momsBirthday + ".");
		}
		// 5. if user asked for "dad"
		else if(day==1) {
			// print dad's birthday
			JOptionPane.showMessageDialog(null, "Luke's dad's birthday is on " + dadsBirthday + ".");
		}
		// 6. if user asked for your name
		else {
			// print myBirthday
			JOptionPane.showMessageDialog(null, "Luke's birthday is on " + myBirthday + ".");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
