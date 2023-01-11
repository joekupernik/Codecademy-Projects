/* We’ve set up a robot workshop to build some droids. All that’s missing are the instructions on how to create the robots and what they’ll do.
*/

public class Droid {
  String name;
  int batteryLevel;
  public Droid(String droidName){
  name = droidName;
  batteryLevel = 100;
  
  }
  public String toString(){
    return "Hello, I’m the droid: " + name;
  }
  public void performTask(String task){
    System.out.println(name + "is preforming: " + task);
    batteryLevel = batteryLevel - 10;

  }
  public static void main (String[] args){
     Droid codey = new Droid("codey");
     System.out.println(codey);
     codey.performTask("jump");
  }
}
