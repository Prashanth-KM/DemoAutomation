package Interface;

interface student{
    void displayName(String name);
}
interface library {
    void displayNoOfBooks(int books);
}
class Office implements library,student{
    @Override
    public void displayName(String name) {
        System.out.println("Student name :"+name);
    }
    @Override
    public void displayNoOfBooks(int books) {
        System.out.println("No of books :"+books);
    }
}
public class MultipleInheritanceEx {
    public static void main(String[] args){
        Office obj= new Office();
        obj.displayName("Kiran");
        obj.displayNoOfBooks(1200);
    }
}
