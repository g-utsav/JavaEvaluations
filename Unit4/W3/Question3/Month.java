package Unit4.W3.Question3;

public enum Month {
	JAN {
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 1st Month of the Year January");
		}
	}, FEB{
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 2nd Month of the Year January");
		}
	}, MAR{
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 3rd Month of the Year January");
		}
	}, APR{
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 4th Month of the Year January");
		}
	}, MAY{
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 5th Month of the Year January");
		}
	}, JUN{
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 6th Month of the Year January");
		}
	}, JUL{
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 7th Month of the Year January");
		}
	}, AUG{
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 8th Month of the Year January");
		}
	}, SEP{
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 9th Month of the Year January");
		}
	}, OCT{
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 10th Month of the Year January");
		}
	}, NOV{
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 11th Month of the Year January");
		}
	}, DEC{
		@Override
		void monthDetails() {
			// TODO Auto-generated method stub
			System.out.println("This is the 12th Month of the Year January");
		}
	};
	
	abstract void monthDetails();
}
