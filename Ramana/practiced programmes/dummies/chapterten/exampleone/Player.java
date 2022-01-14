package chapterten.exampleone;

import java.text.DecimalFormat;

public class Player {

		private String name;
		private double average;

		public Player(String name, double average) {
			super();
			this.name = name;
			this.average = average;
		}
		public String getName(){
			return name;
		}

		public double getAverage() {
			return average;
		}

		public String getAverageString() {
			DecimalFormat decFormat=new DecimalFormat();
			decFormat.setMaximumFractionDigits(0);
			decFormat.setMaximumFractionDigits(3);
			decFormat.setMinimumFractionDigits(3);
			return decFormat.format(average);
		}
	}
/*
 * this is example from 10.1 from dummies book Java Creating the Player class and
 * removing the default constructor
 */
