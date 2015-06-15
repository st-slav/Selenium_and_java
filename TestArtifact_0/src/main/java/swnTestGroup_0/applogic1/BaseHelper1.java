package swnTestGroup_0.applogic1;

import swnTestGroup_0.applogic.BaseHelper;
import swnTestGroup_0.model.User;

public class BaseHelper1 extends DriverBasedHelper implements BaseHelper {
	
	public BaseHelper1(ApplicationManager1 manager){
		super(manager.getWebDriver());
	}
	
	@Override //���� � �������
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
	
	@Override //����� ���� �� ���������
	public void selectDefaultARM(){
		
	}
	
	@Override //����� ��
	public void selectMO(){
		
	}
	
	@Override //����� ����
	public void selectARM(){
		
	}
	
	@Override //����� ���� ����� �������� 
	public boolean startARM(){
		return true;//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
}
