import java.io.File;
import java.io.IOException;

public class TestPic
{
    public static void main(String[] args)
    {
        // Get a reference to the canvas for this drawing and set its title.
        Canvas pic = Canvas.getCanvas();
        pic.setTitle("Shapes Constructor Test Picture");
        
        // Draw my picture
        Rect r = new Rect();
        r.makeVisible();
        Circle c = new Circle();
        c.makeVisible();
        Arc a = new Arc();
        a.makeVisible();
        Triangle t = new Triangle();
        t.makeVisible();
        Circle2 c2 = new Circle2();
        c.makeVisible();
        // Save the picture to a file
        String filename = "testpic.png";
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}