package iskcongzb.services.ServiceClasses;


import iskcongzb.domain.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
}