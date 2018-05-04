package facade;

import create.interfac.ComponentCreate;

public class WindowDecoration extends Decorator  {
	  public WindowDecoration(ComponentCreate component) {
	        super(component);
	    }

	    @Override
	    public void afterDraw() {
	        System.out.println(" ... add to Border");
	    }

	   
	}

