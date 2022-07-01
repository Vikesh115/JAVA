package StaticMember;

public class Test {
    public static void main(String[] args)
    {
        Player p1 = new Player("xyz");
        Player p2 = new Player("abc");
        p1.printDetails();
        p2.printDetails();
        System.out.println(Player.playercount); // print static variable using class name
        System.out.println(Player.playercount); // print static variable using object

        System.out.println(Player1.getplayercount()); 
        // Static member can be accessed without creating an object
        // print static variable using method
        //Player1 p3 = new Player1("mno");
        System.out.println(Player1.getplayercount()); // print static variable using method

    
    }
}
