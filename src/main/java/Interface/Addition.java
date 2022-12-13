package Interface;

interface add{
    void add();
}

interface sub{
    void sub();
}

interface mult extends add, sub{
    void mult();
}
public class Addition implements mult{

    @Override
    public void add() {
        System.out.println("Add method");
    }

    @Override
    public void sub() {
        System.out.println("sub method");
    }

    @Override
    public void mult() {
        System.out.println("mult method");
    }

    public static void main(String[] args) {
        Addition obj= new Addition();
        obj.add();
        obj.sub();
        obj.mult();

        mult obj1= new Addition();
    }
}
