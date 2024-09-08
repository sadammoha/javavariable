public class isse {

    static int staticVar=1;
    int instanceVar=1;

    public void demo() {
        int localVar = 5;

        localVar++;
        instanceVar++;
        staticVar++;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        new isse().demo();
    }
}