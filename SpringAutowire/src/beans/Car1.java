package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Car1 {
@Autowired
	public Engine1 engine ;
	
	
	public void print() {
		System.out.println(engine.getModelName());
	}

}
