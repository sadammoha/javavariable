public class sadam {

    static int staticVar=18;
    int instanceVar=12;

    public void demo() {
        int localVar = 16;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        new sadam().demo();
    }
}