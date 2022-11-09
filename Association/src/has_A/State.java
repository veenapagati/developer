package has_A;

public class State {
	public String name;
	public String cm;
	public String party;
	public String noOfDisstricts;
	
	public State(String name, String cm, String party, String noOfDisstricts) {
	
		this.name = name;
		this.cm = cm;
		this.party = party;
		this.noOfDisstricts = noOfDisstricts;
	}
	public void showOffstate() {
		System.out.println(name);
		System.out.println(cm);
		System.out.println(party);
		System.out.println(noOfDisstricts);
	}

}



















