package swnTestGroup_0.applogic0;

import swnTestGroup_0.applogic.ApplicationManager;
import swnTestGroup_0.applogic.BaseHelper;

public class ApplicationManager0 implements ApplicationManager {
	
	BaseHelper baseHelper = new BaseHelper0();
	
	@Override
	public BaseHelper getBaseHelper() {
		return baseHelper; //сделал так пока чтоб ошибки не было
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
	    
	}
}
