package kr.co.work_admin;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.work_admin.vo.WorkVO;

@Controller
public class AdminController {
  @Autowired
  @Qualifier("as")
  private AdminService service; 
  
  @RequestMapping("/")
  public String root()
  {
	  return "redirect:/main/home";
  }
  @RequestMapping("/main/home")
	public String home(Model model,HttpServletRequest request)
	{
		return service.home(model,request);
	}
  @RequestMapping("/work_input")
  public String work_input()
  {
	  return "/work_input";
	  
  }
  @RequestMapping("/work_input_ok")
  public String work_input_ok(WorkVO wvo)
  {
	  return service.work_input_ok(wvo);
  }
  
  @RequestMapping("/apply_list")
  public String apply_list(Model model)
  {
	  return service.apply_list(model);
  }
}
