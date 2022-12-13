package Interface;

interface campus{//100%
    void displayName(String name);
    abstract void displayCity(String city);

}
class department implements campus{
    @Override
    public void displayName(String name) {
        System.out.println("Name :" +name);
    }
    @Override
    public void displayCity(String city) {
    System.out.println("City :" +city);
    }

    void displayBranch(String branch){
        System.out.println("Branch: " +branch);
    }
}
public class College {
    public static void main(String[] args){
        department obj= new department();
        obj.displayName("Kiran");
        obj.displayCity("Mysore");
        obj.displayBranch("CSE");

        campus obj1= new department();
        obj1.displayName("Praveen");
        obj1.displayCity("Mysore");
    }
}
//class extends class
//interface extends interface
//class implements interface