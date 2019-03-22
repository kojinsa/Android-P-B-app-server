package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.User;

public class UserDAOTmpl implements UserDAO {

	private SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public List<User> selectUser() {
		// TODO Auto-generated method stub
		return session.selectList("user.selectUser");
	}

}// UserDAOTmpl
