/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square grass;
    private Square sky;
    private Square band;
    private Square band2;
    private Square goggles;
    private Square goggles2;
    private Triangle hat;
    private Circle head;
    private Person body;
    private Square blowDart; 
    private Square blowDart2; 
    private Square blowDart3; 
    private Square blowDart4; 
    private Square blowDart5; 
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        band = new Square();
        band2 = new Square();
        goggles= new Square();
        goggles2= new Square();
        hat = new Triangle();  
        head = new Circle();
        body = new Person();
        blowDart = new Square();
        blowDart2 = new Square();
        blowDart3 = new Square();
        blowDart4 = new Square();
        blowDart5 = new Square();
        grass = new Square();
        sky = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            grass.changeColor("green");
            grass.moveHorizontal(-300);
            grass.moveVertical(90);
            grass.changeSize(800);
            grass.makeVisible();
            
            sky.changeColor("blue");
            sky.moveHorizontal(-300);
            sky.moveVertical(-700);
            sky.changeSize(800);
            sky.makeVisible();
            head.changeColor("yellow");
            head.moveHorizontal(40);
            head.moveVertical(-30);
            head.changeSize(80);
            head.makeVisible();
            
            body.changeColor("yellow");
            body.moveHorizontal(32);
            body.moveVertical(-55);
            body.changeSize(120,60);
            body.makeVisible();
            
            hat.changeSize(60,90);
            hat.moveHorizontal(100);
            hat.moveVertical(-110);
            hat.makeVisible();
    
            band.moveHorizontal(0);
            band.moveVertical(-52);
            band.changeSize(26);
            band.makeVisible();
            band2.changeColor("red");
            band2.moveHorizontal(-26);
            band2.moveVertical(-52);
            band2.changeSize(26);
            band2.makeVisible();
            
            goggles.changeColor("blue");
            goggles.moveHorizontal(5);
            goggles.moveVertical(-47);
            goggles.changeSize(16);
            goggles.makeVisible();
            
            goggles2.changeColor("blue");
            goggles2.moveHorizontal(-20);
            goggles2.moveVertical(-47);
            goggles2.changeSize(16);
            goggles2.makeVisible();
            
            blowDart.changeColor("brown");
            blowDart.moveHorizontal(28);
            blowDart.moveVertical(40);
            blowDart.changeSize(8);
            blowDart.makeVisible();
            
            blowDart2.changeColor("brown");
            blowDart2.moveHorizontal(28);
            blowDart2.moveVertical(32);
            blowDart2.changeSize(8);
            blowDart2.makeVisible();
            
            blowDart3.changeColor("brown");
            blowDart3.moveHorizontal(28);
            blowDart3.moveVertical(24);
            blowDart3.changeSize(8);
            blowDart3.makeVisible();
            
            blowDart4.changeColor("brown");
            blowDart4.moveHorizontal(28);
            blowDart4.moveVertical(16);
            blowDart4.changeSize(8);
            blowDart4.makeVisible();
            
            blowDart5.changeColor("brown");
            blowDart5.moveHorizontal(28);
            blowDart5.moveVertical(48);
            blowDart5.changeSize(8);
            blowDart5.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("white");
        grass.changeColor("black");
        head.changeColor("gray");
        hat.changeColor("black");  
        band.changeColor("white");
        band2.changeColor("white");
        goggles.changeColor("black");
        goggles2.changeColor("black");
        body.changeColor("gray");
        blowDart.changeColor("black");
        blowDart2.changeColor("black");
        blowDart3.changeColor("black");
        blowDart4.changeColor("black");
        blowDart5.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        grass.changeColor("green");
        head.changeColor("yellow");
        hat.changeColor("green");  
        band.changeColor("red");
        band2.changeColor("red");
        goggles.changeColor("blue");
        goggles2.changeColor("blue");
        body.changeColor("yellow");
        blowDart.changeColor("brown");
        blowDart2.changeColor("brown");
        blowDart3.changeColor("brown");
        blowDart4.changeColor("brown");
        blowDart5.changeColor("brown");
    }
}
