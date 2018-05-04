package facade;

import create.Create;
import create.Fly;
import create.Preparation;
import create.interfac.ComponentCreate;
import proxy.ProxySkinBird;

public class BirdFacade {

	
	private Create create = new Create();
	
	private Fly fly = new Fly();
	
	private Preparation preparation = new Preparation();
	
	ComponentCreate typeBird = new ProxySkinBird("redSkin.png");
	
	public void go() {
		create.bild();
		preparation.preparation();
		fly.fly();
		 typeBird.draw();
	}
}
