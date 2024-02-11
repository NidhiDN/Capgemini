import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Vowel")
public class Vowel extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Vowel() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");

	        PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<body>");
             
	        String str = request.getParameter("s");
	        int count=0;
	        if (str != null) {
	            try {
	                
	                out.println("<p>"+ count+ "</p>");
	            } catch (NumberFormatException e) {
	                out.println("<p>Please enter a valid integer</p>");
	            }
	        }
	        
	        for(int i=0;i<=str.length()-1;i++) {
		    	   
				if(str.charAt(i) == "a" ||str.charAt(i)=="e" ||str.charAt(i)=="i" ||str.charAt(i)=="o" || s.charAt(i)=="u" ||str.charAt(i)=="A" ||str.charAt(i)=="E"||str.charAt(i)=="I"||str.charAt(i)=="O"||str.charAt(i)=="U") {
		    		   count++;
		    	   }
		    	   
		        System.out.println(count);
			}
	        
	        out.println("<form action='' method='get'>");
	        out.println("Enter s: <input type='text' name='n' />");
	        out.println("<input type='submit' value='generate' />");
	        out.println("</form>");

	        out.println("</body>");
	        out.println("</html>");
	 
		       
	       }
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

