package sandbox.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sample.domain.Member;

public class jdbcDao {
	public void add(Member member) {
		try {
			Class.forName("org.hsql.jdbc.JDBCDriver");
			
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:hsqldb:memberdb", "SA","");
			statement = connection.prepareStatement("insert into members (id, name, joined) values(?,?,?)");
			
			statement.setInt(1, member.getId());
			statement.setString(2, member.getName());
			statement.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e){
					throw new RuntimeException(e);
				}
			} if(connection != null) {
				try  {
					connection.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
	
	public Member get(int id) {
		try {
			Class.forName("org.hsql.jdbc.JDBCDriver");
			
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:hsqldb:memberdb", "SA","");
			statement = connection.prepareStatement("select * from members where id = ?");
			statement.setInt(1, id);

			resultSet = statement.executeQuery();
			
			Member member = null;
			while(resultSet.next()) {
				member = new Member();
				member.setId(id);
				member.setName(resultSet.getString("name"));
			}
			
			return member;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e){
					throw new RuntimeException(e);
				}
			} if(connection != null) {
				try  {
					connection.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
}
