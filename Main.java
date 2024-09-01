// Imam Baihaqqy
// 21120122130078
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("Area Rectangle: " + rect.getArea()); // Output: 200

        Rectangle square = new Square(10);
        System.out.println("Area Square: " + square.getArea()); // Output: 100

        // Masih valid jika menggunakan subclass Square
        rect.setWidth(30);
        rect.setHeight(40);
        System.out.println("Updated Area Rectangle: " + rect.getArea()); // Output: 1200

        square.setWidth(20);
        System.out.println("Updated Area Square: " + square.getArea()); // Output: 400
    }
}
