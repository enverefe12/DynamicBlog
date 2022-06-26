package Controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete.file")
public class FileDeleteService extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String filePath="C:\\Users\\90551\\Desktop\\Eclipse Projeler\\2022 Yaz-Haziran Arsiv\\001JSPDeneme\\src\\main\\webapp\\yazi\\"
	      + req.getParameter("delThisFile") + ".html";
		
		File file=new File(filePath);
		
		if(file.exists()) {
			file.delete();
			req.setAttribute("delMessage", "Verilen Dosya Silindi");
		}else {
			req.setAttribute("delMessage", "Dosya Bulunamadý!!");
		}
		
		RequestDispatcher rd=req.getRequestDispatcher("delText.jsp");
		rd.forward(req, resp);
	}
}
