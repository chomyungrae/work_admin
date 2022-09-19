package kr.co.work_admin;

import java.util.ArrayList;

import kr.co.work_admin.vo.WorkVO;

public interface AdminMapper {

	public ArrayList<WorkVO> work_list(String day);
	public void work_input_ok(WorkVO wvo);
	
	public ArrayList<WorkVO> apply_list();
}
