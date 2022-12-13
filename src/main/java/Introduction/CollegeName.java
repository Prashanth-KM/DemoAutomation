package Introduction;

public class CollegeName {
    public static void main(String[] args) {
        String S = "Java";
        S.concat("Program");

        System.out.println(S);//JavaProgram

        StringBuffer S1= new StringBuffer("Python");
        S1.append("Program");

        System.out.println(S1);
    }
}
