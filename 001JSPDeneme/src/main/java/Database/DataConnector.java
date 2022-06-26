package Database;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataConnector {
	
	public Connection getDataConnection() {
		Properties pr= new Properties();
		InputStream is=getClass().getClassLoader().getResourceAsStream("db.properties");
		
		MysqlDataSource msd=null;
		try {
			pr.load(is);
			msd=new MysqlDataSource();
			msd.setURL(pr.getProperty("url"));
			msd.setUser(pr.getProperty("username"));
			msd.setPassword(pr.getProperty("password"));	
			
			Connection c=msd.getConnection();
			return c;
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
