package kr.co.work_admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.work_admin.vo.WorkVO;

@Controller
public class AdminController {
  @Autowired
  @Qualifier("as")
  private AdminService service; 
  
  @RequestMapping("/")
  public String home()
  {
	  return "redirect:home";
  }
  @RequestMapping("/home")
  public String home2()
  {
	  return "/home";
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
}
