/*n this project, we’ll use Java to write a Mad Libs word game! Mad Libs have short stories with blank spaces that a player can fill in. The result is usually funny (or strange).

Mad Libs require:

A short story with blank spaces (asking for different types of words).
Words from the player to fill in those blanks.
*/

public class MadLibs {
  /*
 This program generates a mad libbed story.
 Author: Joe
 date: 1/2/2022
  */
  	public static void main(String[] args){
      
      String name1 = "bob";
      String adjective1 = "jucy";
      String adjective2 = "blue";
      String adjective3 = "scary";
      String verb1 = "salley";
      String noun1 = "boston";
      String noun2 = "table";
      String noun3 = "lamp";
      String noun4 = "chair";
      String noun5 = "dog";
      String noun6 = "oppie";
      String name2 = "carly";
      int number = 23;
      String place1 = "johnston";
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      
System.out.print(story);

    }       
}
