package swnTestGroup_0.applogic;

import swnTestGroup_0.model.User;

public interface BaseHelper {
	
	void LoginIn(User User);
    void logout();
	boolean isLogged();
	boolean isnotLogged();
}
