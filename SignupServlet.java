package Mypackge;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Umesha
 */
@WebServlet(name = "SignupServlet", urlPatterns = {"/SignupServlet"})
public class SignupServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("uname");
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        String cpwd = request.getParameter("cpwd");
    
        //Q3).
   // if(!hasSpecialCharacter(pwd)){
        //response.getWriter().println("<script>alert('Password must contain at least one special character.')</script> ");
       // return;
        
   // }
    //response.getWriter().println("Registration successful!");
    
   // }
     //private boolean hasSpecialCharacter(String pwd) {
         //return pwd.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
   
         //Q4).If not same password and confirm password
         if(!pwd.equals(cpwd)){
             response.getWriter().println("<script>alert('Password and Confirm password is not same')</script>");
             return;
         }
         
         else{
             response.getWriter().println("You are correct");
         }
     }
}
        
     //Q2).
        //Validate username(user can only enter a name with characters from a-z and 0-9)
   // if (!isValidUsername(name)) {
    //        response.getWriter().println("Invalid username. Username can only contain letters (a-z) and numbers (0-9).");
   //         return;
    //    }
      
    //response.getWriter().println("Registration successful!");
    //}

    //private boolean isValidUsername(String username) {
      //  String namee = "^[a-z0-9]+$";
        //return username.matches(namee);
    //}
//}




