
public class Person
{ 
    import java.util.Scanner;
    private String UserName;
    private String Password;
    private String myRole;
    private String myNeed;
    private String Location;
    ArrayList <String> Roles = new ArrayList <String>();
    ArrayList <String> Needs = new ArrayList <String>();

    public Person(String name, String password, String r, String n, String L)
    {
        Username = name;
        Password = password;
        myRole = r;
        myNeed = n;
        Location = L;
    }

    public String addtolist(Person m)
    {
        if m.getRoles() == null
            m.getRoles() = "0";
        if m.getNeeds() == null
            m.getNeeds() = "0";

        Roles.add(m.getRoles());
        Needs.add(m.getNeeds());
    }

    public String getRoles()
        {return myRole;}

    public String getNeeds()
        {return myNeed;}

    public void AlertHealthcareWorker(Person x) //x is a person in need
    {
        input 
        String send = "";
        if button == true
            for (String y: Roles)
                if x.getNeeds() == y
                    send = x.getName() " needs help at " + Location;
        return send;
    }

    public static void main(String[]args)    
    {
        Person masa = new Person(masa,nnnn,rolee,needd,loc)
        System.out.print(masa.getName());
        Scanner buttoninput = new Scanner(System.in); //from stackoverflow
        System.out.println("Enter username");
        String Username = buttoninput.nextLine();
        System.out.print(UserName);
    }
    
}
