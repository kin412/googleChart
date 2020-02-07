package org.kin.DAO;

import java.util.List;

import org.kin.domain.orgTblVO;

public interface orgTblDAO {
	
	public List<orgTblVO> list() throws Exception;
}
