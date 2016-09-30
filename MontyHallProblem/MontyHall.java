/*
 *MontyHall.java
 *@author Lee Murray
 *19th Dec 2014
 */

 public class MontyHall{
	 private int user_door;
	 private int open_door;
	 private int other_door;
     private int prize_door;

     public MontyHall(){
		 user_door = 0;
		 open_door = 0;
		 other_door = 0;
		 prize_door = 0;
	 }

	 public void setOpen_door(int open_door){
		 this.open_door = open_door;
	 }

	  public void setOther_door(int other_door){
	 		 this.other_door = other_door;
	 }

	  public void setPrize_door(int prize_door){
	 		 this.prize_door = prize_door;
	 }

	  public void compute(){

	 }

		public int user_door(){
	 		 return user_door;
	 }

	 	public int  getopen_door(){
	 		 return open_door;
 	 }

	 	 public int getother_door(){
	 		 return other_door;
 	 }

 		public int getprize_door(){
			 return prize_door;
	 }


}
