package service;

import java.util.List;

import dao.UserDAO;
import vo.User;

public class UserServiceTmpl implements UserService {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public List<User> selectList() {
		// TODO Auto-generated method stub
		return userDAO.selectUser();
	}
}
