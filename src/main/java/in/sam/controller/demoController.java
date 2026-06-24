package in.sam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
		System.out.println("Successfully Run");

		// Return Response to DispatcherServlet
		return mv;
	}
}