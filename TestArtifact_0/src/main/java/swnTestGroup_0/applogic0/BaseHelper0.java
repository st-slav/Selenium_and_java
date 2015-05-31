package swnTestGroup_0.applogic0;

import swnTestGroup_0.applogic.BaseHelper;
import swnTestGroup_0.model.User;

public class BaseHelper0 implements BaseHelper {
	
	private User user;
	
	@Override
	public void LoginIn(User user){
		this.user = user;
	}
	
	@Override
	public void logout(){
		this.user = null;
	}
	
	@Override
	public boolean isLogged(){
		return true;
	}
	
	@Override
	public boolean isnotLogged(){
		return true;
	}

}
