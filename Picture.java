
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Date)
 * 
 */
import java.io.File;
import java.io.IOException;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("black");

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
        c2.makeVisible();
        Circle3 c3 = new Circle3();
        c3.makeVisible();
        Circle4 c4 = new Circle4();
        c4.makeVisible();
        Circle5 c5 = new Circle5();
        c5.makeVisible();
        Circle6 c6 = new Circle6();
        c6.makeVisible();
        Circle7 c7 = new Circle7();
        c7.makeVisible();
        Circle8 c8 = new Circle8();
        c8.makeVisible();
        Circle9 c9 = new Circle9();
        c9.makeVisible();
        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "MyPicture.png";
        }

        // Save the picture to a file
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}