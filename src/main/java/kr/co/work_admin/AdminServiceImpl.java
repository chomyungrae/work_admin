package kr.co.work_admin;

import java.sql.Date;
import java.time.LocalDate;

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
		return "redirect:/home";
	}
	
}
