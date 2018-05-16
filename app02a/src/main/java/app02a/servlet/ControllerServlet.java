package app02a.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9111454017486497956L;
	
	public void doGet(HttpServletRequest req,HttpServletResponse rep){
		process(req, rep);
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse rep){
		process(req, rep);
	}
	
	private void process(HttpServletRequest req,HttpServletResponse rep){
		String url = req.getRequestURI();
		int lastIndex = url.lastIndexOf("/");
		
	}

}
