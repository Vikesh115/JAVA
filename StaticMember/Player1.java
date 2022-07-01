package StaticMember;

public class Player1 {
    String name;
    int id;
   private static int playercount = 0; // Static variable and Class variable

    Player1(String name) // Non-static method can access static member
    {
      this.name = name;
      id = ++playercount; 
    } 

    static int getplayercount() // static method cannot access any non-static member And class method
    {
        return playercount;
      //  this.name = name;  Static method do not access This reference
      
    }
}
