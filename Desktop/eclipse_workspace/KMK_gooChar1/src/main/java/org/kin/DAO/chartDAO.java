package org.kin.DAO;

import java.util.List;

import org.kin.domain.cdTblVO;
import org.kin.domain.chartVO;
import org.kin.domain.searchVO;

public interface chartDAO {

	public List<chartVO> list();
	
	public List<chartVO> searchList(searchVO vo);
	
	public List<cdTblVO> cdList();
	
}
