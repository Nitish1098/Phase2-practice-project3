
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.basic.BasicIconFactory;



import product.HibernetUtil;
@WebServlet("/save")
public class Saveservlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String cost=request.getParameter("price");
		int price=Integer.parseInt(cost);
		String quant=request.getParameter("quantity");
		int quantity=Integer.parseInt(quant);
		BasicIconFactory factory=HibernetUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Product p= new Product(name, price, quantity);
		session.save(p);
		tx.commit();
		session.close();
		response.getWriter().print("<h1 align='center'>Data Saved</h1>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
