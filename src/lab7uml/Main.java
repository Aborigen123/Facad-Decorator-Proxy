package lab7uml;

import create.Border;
import create.Textview;
import create.Window;
import create.interfac.ComponentCreate;
import create.interfac.TypeBird;
import facade.BirdFacade;
import facade.Decorator;
import facade.WindowDecoration;
import proxy.ProxySkinBird;


public class Main {
	 private static ComponentCreate window;
	    private static ComponentCreate textView;
	    private static ComponentCreate button;
	    private static ComponentCreate skinBird;
	    
	public static void main(String[] args) {
		
BirdFacade birdFacade = new BirdFacade();
birdFacade.go();
/////////////////////////////////////////////////


    
    
    boolean showBorder = true;
    
    if (!showBorder){
        window = new Window();
        textView = new Textview();
        button = new Border();
    }else{
    	window = new WindowDecoration(new Window());
    	textView = new WindowDecoration(new Textview());
    	skinBird = new WindowDecoration(new ProxySkinBird("redSkin.png"));
    	button = new WindowDecoration(new Border());
    }
    
    
    window.draw();
    textView.draw();
  //  ComponentCreate typeBird = new ProxySkinBird("redSkin.png");
   // typeBird.draw();
    skinBird.draw();
    button.draw();
    
    
    

    
    
  
    
}
	}


