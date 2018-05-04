package proxy;

import create.interfac.ComponentCreate;
import create.interfac.TypeBird;

public class RealImage implements ComponentCreate {

	private String skinBird;
	
	
	
	public RealImage(String skinBird) {
		this.skinBird = skinBird;
		loadSkinBird(skinBird);
	}




	
	private void loadSkinBird(String skinBird) {
		System.out.println("Load" + skinBird);
	}



	@Override
	public void draw() {
		System.out.println("Displaying " + skinBird);
		
	}

}
