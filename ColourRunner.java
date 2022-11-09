class ColourRunner
{
	public static void main(Strin[] colourNames)
	{
		System.out.println("displaying colourNames ");
		 ColorDetails.save("blue");
		 ColorDetails.save("black");
		 ColorDetails.save("red");
		 ColorDetails.save("white");
		 ColorDetails.save("blue");
		 ColorDetails.save("orange");
		 ColorDetails.save("chocolate");
		 ColorDetails.displayDetails();
		 boolean note=ColorDetails.findname("pink" );
		 System.out.println("name found: "+note);
		 System.out.println("main end ");
		
		
	}
}