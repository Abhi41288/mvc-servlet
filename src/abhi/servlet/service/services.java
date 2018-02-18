package abhi.servlet.service;

import abhi.servlet.entity.*;

public class services {
	
	public String validate(String name, String pass){
		
		System.out.println("validate name="+name+" pass="+pass);
		if(name.equalsIgnoreCase(name) && pass.equalsIgnoreCase(pass)){
			System.out.println("success");
			return ("success");
			
		}
		else{
			
			return ("unsuccess");
			
		}
		
			}
	public Entity getUser(String user, String pass){
		 Entity entity = new Entity();
		 entity.setName(user);
		
		return entity;
	}

}
