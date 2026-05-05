import java . util . Scanner ;

 public class HelloUser {
 public static void main ( String [] args ) {
 // Create a Scanner to read keyboard input
 Scanner sc = new Scanner ( System . in );
 // Prompt for name
 System . out . print (" Enter your name : ");
 String name = sc . nextLine () ;
 // Display greeting
 System . out . println ("Hello , " + name + "!");
 sc . close () ;
 }
 }
 