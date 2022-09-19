package kr.co.work_admin;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kr.co.work_admin.vo.WorkVO;

@Service
@Qualifier("as")
public class AdminServiceImpl implements AdminService{
 
	@Autowired
	private AdminMapper mapper;

	// 홈 리스트 출력
		@Override
		public String home(Model model,HttpServletRequest request) {
			
			String day;
			if(request.getParameter("day")==null)
			{
				day="";
			}
			else
				{
				day=request.getParameter("day");
				}
				
			ArrayList<WorkVO> wlist=mapper.work_list(day);
		  
			model.addAttribute("wlist",wlist);
			return "/main/home";
		}
	 
	@Override
	public String work_input_ok(WorkVO wvo) {
	 
		String[] imsi=wvo.getWorkday().split("-");
		int y=Integer.parseInt(imsi[0]);
		int m=Integer.parseInt(imsi[1]);
		int d=Integer.parseInt(imsi[2]);
		
		LocalDate dday=LocalDate.of(y,m,d);
		int yoil=dday.getDayOfWeek().getValue(); // 1~7까지 (7: 일요일)
		if(yoil==7)
			yoil=0;
		
		wvo.setDay(yoil); // 월,화,수,목..
		
	   mapper.work_input_ok(wvo);
		return "redirect:/main/home";
	}

	
	@Override // 회원 일자리 신청한거 확인
	public String apply_list(Model model) {
		
		ArrayList<WorkVO> list=mapper.apply_list();
		model.addAttribute("list",list);
		return "/apply_list";
	}
	
}
