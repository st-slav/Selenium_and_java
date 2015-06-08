package swnTestGroup_0.applogic1;

import swnTestGroup_0.applogic.BaseHelper;
import swnTestGroup_0.model.User;

public class BaseHelper1 extends DriverBasedHelper implements BaseHelper {
	
	public BaseHelper1(ApplicationManager1 manager){
		super(manager.getWebDriver());
	}
	
	@Override
	public void LoginIn(User user){
		pages.startPage
			.ensurePageLoaded()
			.clickPromedLink()
			.ensurePageLoaded()
			.setLoginField(user.getLogin())
			.setPassField(user.getPassword())
			.clickAuthButton();
	}

	@Override
	public boolean isnotLogged(){

	}

	@Override
	public boolean isLogged(){
		return pages.topMenuClassic.waitPageLoaded();
	}
	
	@Override
	public void logout(){
		
	}

}
