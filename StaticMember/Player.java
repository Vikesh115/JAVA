package StaticMember;
public class Player {
    
    String name;
    int id;
    static int playercount = 0; // Static variable 

    Player(String name)
    {
      this.name = name;
      id = ++playercount; 
    } 

    void printDetails()
    {
        System.out.println(id +":"+ name);
    }

}
