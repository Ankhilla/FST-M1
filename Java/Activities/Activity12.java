package Activities;

interface addable{
    int add(int a, int b);
}
public class Activity12 {
    public static void main(String[] args) {
        addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
    };
}








