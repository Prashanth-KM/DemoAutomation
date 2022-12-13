package AccessModifiers;
class depart{
     void display(){
         Branch obj= new Branch();
        obj.sub();
        obj.display();
        obj.show();
     }
}

public class Branch {
      private String name="Kiran";
    public static void main(String[] args){
        Branch obj= new Branch();
        obj.add();
        obj.sub();
        obj.display();
        obj.show();
    }
    private void add(){
        System.out.println("name from private method :" +name);
        System.out.println("Add");
    }
    void sub(){
        System.out.println("name from default method :" +name);
    }
    protected void display(){
        System.out.println("name from protected method :" +name);
    }

    public void show(){
        System.out.println("name from public method :" +name);
    }
}


/*
 * Private- can access only inside the class
 * default-inside and outside th class, inside the package, cant access outside the package
 * protected-inside, outside the class, inside the package, out side the package can be done by using sub class object
 * public--you can access inside and outside the class or package
 *
 * */