package swnTestGroup_0.applogic1;

import swnTestGroup_0.applogic.BaseHelper;
import swnTestGroup_0.model.User;

public class BaseHelper1 extends DriverBasedHelper implements BaseHelper {
	
	public BaseHelper1(ApplicationManager1 manager){
		super(manager.getWebDriver());
	}
	
	@Override //Вход в систему
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
		return true;
	}

	@Override
	public boolean isLogged(){
		return pages.selectionMOForm.waitPageLoaded();
	}
	
	@Override
	public void logout(){
		
	}
	
	@Override //выбор АРМа по умолчанию
	public void selectDefaultARM(){
		
	}
	
	@Override //Выбор МО
	public void selectMO(){
		
	}
	
	@Override //Выбор АРМа
	public void selectARM(){
		
	}
	
	@Override //Выбор АРМа после загрузки 
	public boolean startARM(){
		return true;//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
}
