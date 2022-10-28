package com.xwokz.simple.things;

public class jewellery {
	
	public String type;
	public boolean quality;
	public long price;
	public float weight;
	public char size;
	
	public String[] gold;
	public String[] silver;
	public String[] platinum;
	public String[] diamond;
	public String[] metallic;
	public String[] oxidized;
	
	 public jewellery(String type, boolean quality,long price, float weight,char size,String[] gold, String[] silver, String[] platinum, String[] diamond,String[] metallic,String[] oxidized) {
     this.type=type;
	 this.quality=quality;
	 this.price=price;
	 this.weight=weight;
	 this.size=size;
	 this.gold=gold;
	 this.silver=silver;
	 this.platinum=platinum;
	 this.diamond=diamond;
	 this.metallic=metallic;
	 this.oxidized=oxidized;
	 }
	 
	 

 public void display() {
	 System.out.println(this.gold);
	 for( int i= 0; i<=gold.length;i++) {
		 String ref= gold[i];
		 System.out.println(ref);
	 }
	 System.out.println(this.silver);
	 for(int i=0;i<=silver.length;i++) {
		 String ref = silver[i];
		 System.out.println(ref);
	 }
	 System.out.println(this.platinum);
	 for(int i=0;i<=platinum.length;i++) {
		 String ref= platinum[i];
		 System.out.println(ref);
		 
	 }
	 System.out.println(this.diamond);
	 for(int i =0;i<=diamond.length;i++) {
		 String ref=diamond[i];
		 System.out.println(ref);
	 }
	 System.out.println(this.metallic);
	 for(int i=0; i<=metallic.length;i++) {
		 String ref=metallic[i];
		 System.out.println(ref);
	 }
	 System.out.println(this.oxidized);
	 for(int i=0;i<=oxidized.length;i++) {
		 String ref=oxidized[i];
		 System.out.println(ref);
	 }
 }
}



