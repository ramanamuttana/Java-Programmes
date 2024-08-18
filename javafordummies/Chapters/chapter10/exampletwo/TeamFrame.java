package tenthchapter.exampletwo;

import java.awt.GridLayout;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TeamFrame extends JFrame {

	public TeamFrame() throws IOException {
		Player player;
		Scanner keyboard =new Scanner(new FileReader("./Files/Hankees.txt")); // the one way to initialize the Object
		for(int num=1;num<=9;num++) {
			player =new Player(keyboard.nextLine(),keyboard.nextDouble());
			System.out.println(keyboard.nextLine()+"   values "+keyboard.nextDouble());
			keyboard.nextLine();  // to set the label for the next line or else the JLabel will add in the same line.
			addPlayerInfo(player); // directly we are sending the Object which has values to frame a Jlabel.
		}
		setTitle("The Hankees");
		setLayout(new GridLayout(9,2,20,3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		keyboard.close();  // close the scanner 
	}

	public void addPlayerInfo(Player player) {
		
		add(new JLabel(" "+player.getName()));
		add(new JLabel(player.getAverageString()));	// the method is trying to call the value of average which is set through the player object.
		
	}
}

/*
 * one way to avoid the arraylist is create each object in for loop and set the
 * data and do the required action and then assign the second Object , In this
 * way we can avoid Collections for Many similar kind of Objects
 */
