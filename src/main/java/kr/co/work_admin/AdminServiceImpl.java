package kr.co.work_admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.co.work_admin.vo.WorkVO;

@Service
@Qualifier("as")
public class AdminServiceImpl implements AdminService{
 
	@Autowired
	private AdminMapper mapper;

	@Override
	public String work_input_ok(WorkVO wvo) {
		mapper.work_input_ok(wvo);
		return "redirect:/home";
	}
	
}
