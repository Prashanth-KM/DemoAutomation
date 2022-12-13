package Introduction;
interface  add{
    void addition();
}
interface sub{
    void subtraction();
}

interface multiply extends add,sub{
    void prod();
}

class output implements multiply{

    @Override
    public void addition() {

    }

    @Override
    public void subtraction() {

    }

    @Override
    public void prod() {

    }
}
class result implements add, sub{

    @Override
    public void addition() {
        System.out.println("addition");
    }

    @Override
    public void subtraction() {
        System.out.println("subtraction");
    }
}

public class MutlipleInheritence {
    public static void main(String[] args) {
        result obj= new result();
        obj.addition();
        obj.subtraction();
    }


}
