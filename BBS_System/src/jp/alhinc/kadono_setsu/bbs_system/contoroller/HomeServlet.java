package jp.alhinc.kadono_setsu.bbs_system.contoroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import chapter6.beans.User;
//import chapter6.beans.UserMessage;
//import chapter6.service.MessageService;

@WebServlet(urlPatterns = { "/home" })
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {

/*		User user = (User) request.getSession().getAttribute("loginUser");
		boolean isShowMessageForm;
		if (user != null) {
			isShowMessageForm = true;
		} else {
			isShowMessageForm = false;
		}

		List<UserMessage> messages = new MessageService().getMessage();

		request.setAttribute("messages", messages);
		request.setAttribute("isShowMessageForm", isShowMessageForm);
*/
		request.getRequestDispatcher("/home.jsp").forward(request, response);
	}

}