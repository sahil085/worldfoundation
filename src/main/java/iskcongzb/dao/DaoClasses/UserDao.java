package iskcongzb.dao.DaoClasses;


import iskcongzb.domain.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
}

