public class AbstractionDemo {
    public static void main(String[] args) {
        GraphicObject obj1 = new Circle();
        obj1.draw();
        obj2.resize();

        GraphicObject obj2 = new Rectangle();
        obj2.draw();
        obj2.resize();
    }
}
