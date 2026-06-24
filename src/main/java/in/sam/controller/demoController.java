package in.sam.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 * =========================================
 * CONTROLLER CLASS : demoController
 * =========================================
 *
 * Purpose:
 * --------
 * Handles incoming HTTP requests and
 * returns the appropriate JSP page.
 *
 * URL Mapping:
 * ------------
 * /welcome
 *
 * Technologies Used:
 * ------------------
 * Spring MVC
 * ModelAndView
 * JSP
 *
 * =========================================
 */

@Controller
public class demoController {

	/*
	 * =========================================
	 * HANDLER METHOD
	 * =========================================
	 *
	 * URL:
	 * ----
	 * http://localhost:4322/welcome
	 *
	 * Purpose:
	 * --------
	 * Creates a ModelAndView object,
	 * sends data to JSP page,
	 * and returns the view name.
	 */

	@GetMapping("/welcome")
	public ModelAndView Show() {

		// Create ModelAndView Object
		ModelAndView mv = new ModelAndView();

		// Add Data to Model
		mv.addObject("key", "Good Morning");

		// Set JSP Page Name
		// Resolves to: /view/index.jsp
		mv.setViewName("index");

		// Console Message
		System.out.println("Successfully Run WelCome");

		// Return Response to DispatcherServlet
		return mv;
	}
	
	@GetMapping("/date")
	public ModelAndView date() {

	    // Create ModelAndView object
	    ModelAndView mv = new ModelAndView();

	    // Get current system date
	    LocalDate dt = LocalDate.now();

	    // Send data to JSP page
	    mv.addObject("key", "Today's Date : " + dt);

	    // Set JSP page name
	    mv.setViewName("index");

	    // Console message
	    System.out.println("Successfully Run Date");

	    // Return response
	    return mv;
	}
	
	/*
	 * =========================================
	 * URL : /utube
	 * =========================================
	 *
	 * Purpose:
	 * --------
	 * Accepts user input from URL request
	 * parameters and displays the values
	 * on the JSP page.
	 *
	 * Example URL:
	 * ------------
	 * http://localhost:4322/utube?name=Samir&age=23
	 *
	 * Request Parameters:
	 * -------------------
	 * name -> User Name
	 * age  -> User Age
	 *
	 * Output:
	 * -------
	 * Hello : Samir Age : 23
	 *
	 * =========================================
	 */

	@GetMapping("/utube")
	public ModelAndView utube(
	        @RequestParam String name,
	        @RequestParam Integer age) {

	    // Create ModelAndView Object
	    ModelAndView mv = new ModelAndView();

	    // Add data to Model
	    mv.addObject(
	            "key",
	            "Hello : " + name + " Age : " + age);

	    // Set JSP View Name
	    mv.setViewName("index");

	    // Console Message
	    System.out.println("Successfully Run utube");

	    // Return Response
	    return mv;
	}
	
	/*
	 * =========================================
	 * URL : /path/{id}
	 * =========================================
	 *
	 * Purpose:
	 * --------
	 * Demonstrates the use of @PathVariable.
	 *
	 * Example:
	 * --------
	 * http://localhost:4322/path/60
	 *
	 * If id > 50
	 *    Green
	 *
	 * Else
	 *    Red
	 *
	 * =========================================
	 */

	@GetMapping("/path/{id}")
	public ModelAndView path(@PathVariable Integer id) {

	    // Create ModelAndView Object
	    ModelAndView mv = new ModelAndView();

	    String color = "";

	    // Check Condition
	    if (id > 50) {
	        color = "Green";
	    } else {
	        color = "Red";
	    }

	    // Send Data to JSP
	    mv.addObject(
	            "key",
	            "ID : " + id + " Color : " + color);

	    // Set JSP Page
	    mv.setViewName("index");

	    // Console Message
	    System.out.println("Successfully Run Path");

	    return mv;
	}
}