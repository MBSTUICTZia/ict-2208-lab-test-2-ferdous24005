public class ShapeMain {
    public static void main(String[] args) {
        // Create Rectangle and Circle objects
        Rectangle rect = new Rectangle("Red", true, 4.0, 5.0);
        Circle circle = new Circle("Blue", false, 3.0);

        // Print objects using toString()
        System.out.println(rect);
        System.out.println();
        System.out.println(circle);
        System.out.println();

        // Demonstrate downcasting
        System.out.println("--- Downcast Check ---");
        
        // Upcasting to Shape references
        Shape shape1 = rect;
        Shape shape2 = circle;

        // Downcasting back to Rectangle and Circle
        if (shape1 instanceof Rectangle) {
            Rectangle downcastRect = (Rectangle) shape1;
            System.out.println("Rectangle width=" + downcastRect.getWidth() + 
                             " length=" + downcastRect.getLength());
        }

        if (shape2 instanceof Circle) {
            Circle downcastCircle = (Circle) shape2;
            System.out.println("Circle radius=" + downcastCircle.getRadius());
        }
    }
}// Enter code here
