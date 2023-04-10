package com.bolsadeideas.springboot.di.app.models.service;

//@Component("miServicioPrincipal")
//@Primary
public class MiServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "ejecutando algún proceso importante simple...";
	}
}
