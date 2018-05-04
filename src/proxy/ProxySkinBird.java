package proxy;

import create.interfac.ComponentCreate;
import create.interfac.TypeBird;

public class ProxySkinBird implements ComponentCreate {
private RealImage realImage;
private String skinBird;



public ProxySkinBird( String skinBird) {
	this.skinBird = skinBird;
}







@Override
public void draw() {
	if(realImage == null) {
		realImage = new RealImage(skinBird);
	}
	realImage.draw();
}}
