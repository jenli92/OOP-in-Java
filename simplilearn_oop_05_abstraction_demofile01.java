public abstract class GraphicObject {
        //
        int x, y;
        
        //this constructor will be called when I create a child object and reference it with the parent object (line 3 and 7 in demofile04)
        GraphicObject(){
            System.out.println("Base abstract constructor");
        }

        void moveTo(int newX, int newY){
            System.out.println("Move to x: " + x + "and y: " + y);
        }
        abstract void draw();
        abstract void resize();
}
