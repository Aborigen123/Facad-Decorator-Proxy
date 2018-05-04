package facade;

import create.interfac.ComponentCreate;


public abstract class Decorator implements ComponentCreate{

	 protected ComponentCreate componentCreate;
	    
	    public Decorator (ComponentCreate componentCreate) {
	        this.componentCreate = componentCreate;
	    }
	    
	    public abstract void afterDraw();

	    @Override
	    public void draw() {
	    	componentCreate.draw();
	        afterDraw();
	    }
	    
	}

