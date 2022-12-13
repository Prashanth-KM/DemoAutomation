package AbstractClass;

abstract class campus{//0 to 100
    abstract void displayCollegeName(String name);
    abstract void displayCityName(String name);
    void staff(){
        int teachingStaff=25;
        int nonTeachingStaff=18;
        int total=teachingStaff+nonTeachingStaff;
        System.out.println("Total staff :" +total);
    }
}
 class department extends campus{

    void displayBranch(){
        String branch="Mechanical";
        System.out.println("Branch name :"+branch);
    }

     void displayCollegeName(String name) {
         System.out.println("College name: "+name);
     }
     void displayCityName(String name) {
         System.out.println("College present in city: "+name);
     }
 }
public class College {
    public static void main(String[] args){
        department obj= new department();
        obj.displayCollegeName("BMS");
        obj.displayCityName("Bengaluru");
        obj.displayBranch();
        obj.staff();

        //creating object reference to abstract class
        campus obj1= new department();
        obj1.displayCollegeName("BMS");
        obj1.displayCityName("Bengaluru");
        obj1.staff();

    }
}
