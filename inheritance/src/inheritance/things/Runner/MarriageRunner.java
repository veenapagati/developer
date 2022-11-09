package inheritance.things.Runner;

import inheritance.things.LoveMarriage;
import inheritance.things.Marriage;

public class MarriageRunner {
	

		public static void main(String[] args) {

			
			
			Marriage mar = new LoveMarriage("love marriage", "Bangalore", 5636767);
			LoveMarriage love = (LoveMarriage)mar;
	        love.love();
			
			
			
			
			
		

		}

	}



