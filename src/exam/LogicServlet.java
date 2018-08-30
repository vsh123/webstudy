package exam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogicServlet
 */
@WebServlet("/Logic")
public class LogicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int[] random = new int[2];
		random[0] = (int)(Math.random()*100)+1;
		random[1] = (int)(Math.random()*100)+1;
		System.out.println(random[0]);
		System.out.println(random[1]);
		int sum = random[0]+random[1];
		request.setAttribute("sum", sum);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/result.jsp");
		requestDispatcher.forward(request, response);
	}

}
