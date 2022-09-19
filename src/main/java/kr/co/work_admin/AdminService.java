package kr.co.work_admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import kr.co.work_admin.vo.WorkVO;

public interface AdminService {

	public String home(Model model,HttpServletRequest request);
	 public String work_input_ok(WorkVO wvo);
	  public String apply_list(Model model);

}
