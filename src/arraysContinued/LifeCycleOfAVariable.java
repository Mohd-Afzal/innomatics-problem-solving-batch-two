package arraysContinued;

public class LifeCycleOfAVariable {

    public static void update(int a) {
        a = a + 10;
    }

    public static void main(String[] args) {

        int a = 40;
        System.out.println("Before calling Update function: " + a);
        update(a);
        System.out.println("After calling Update function: " + a);

        int i = 10;
        int j = 20;

        while (true) {

        }

//        i = 100

    }

}
