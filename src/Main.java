public class Main {
    public static void main(String[] args) {
        int a1 = 1;
        int b1 = 4;
        int a2 = 4;
        int b2 = 6;
        int a3 = Math.max(a1, a2);
        int b3 = Math.min(b1, b2);

        if (a3 < b3) {
            System.out.println(a3 + ", " + b3);
        } else if (a3 == b3) {
            System.out.println(a3);
        } else {
            System.out.println("Пересечений нет");
        }
    }
}