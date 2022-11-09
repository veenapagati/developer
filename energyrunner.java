class EnergyRunner{
	public static void main(String []args){
		String food1="rice";
		String food2="maggie";
        String food3="palav";
        String food4="kesaribath";
        String food5="roti";
        String food6="sambar";
        String food7="palle";
        String food8="bisibelebath";
        String food9="chitranna";
        String food10="noodles";
        String food11="pongal";		
		String food12="uppittu";
		String food13="puliyogare";
		String food14="modaka";
		String[] food={food1,food2,food3,food4,food5,food6,food7,food8,food9,food10,food11,food12,food13};
            int count=food.length;
System.out.println("length of food" +food);
for(int item=0;item<food.length;item++)
{
	
	System.out.println(food[item]);
	
}
 food[3]="raagi";
 food[7]="jola";
 for(int item=0;item<food.length;item++)
{
	
	System.out.println(food[item]);
	
}
 
		}
		 
	}
