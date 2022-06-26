package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.DataConnector;

@WebServlet("/checkAdmin")
public class AdminCheckServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String url=null;
         if(checkAdmin(username, password)) {
        	 Cookie cook=new Cookie("administrator",username);
        	 resp.addCookie(cook);
        	 req.setAttribute("adminName", username);
        	 
        	 LibUpload lp=new LibUpload();
        	 Map<String, String> fileMap=lp.getFileMap();
        	 
        	 req.getSession().setAttribute("files", fileMap);
        	 url="adminUserLib.jsp";
         }
         else {
        	 url="index.jsp";
         }
         RequestDispatcher rd=req.getRequestDispatcher(url);
    	 rd.forward(req, resp);
		
	}

	public boolean checkAdmin(String usr, String psw) {
		DataConnector dc=new DataConnector();
		Connection c=dc.getDataConnection();
        
		try {
			PreparedStatement ps=c.prepareStatement("SELECT * FROM jspdeneme1.admins WHERE username=? AND password=?");
			ps.setString(1, usr);
			ps.setString(2, psw);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
}
