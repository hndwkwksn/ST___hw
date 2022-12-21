package app.service;

import java.sql.Connection;
import app.beans.User;

public class UserService {
	public void insert(User user) {
		Connection connection = null;

		try {
			connection = getConnection();
			new UserDao().insert(connection, user);
			CommitRollbackParser(connection);
		}  catch (Exception e) {
			System.out.println(e);
		} finally {
			close(connection);
		}
	}
}
