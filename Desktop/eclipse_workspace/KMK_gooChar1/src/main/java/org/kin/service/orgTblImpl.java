package org.kin.service;

import java.util.List;

import org.kin.DAO.orgTblDAO;
import org.kin.domain.orgTblVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orgTblImpl implements orgTblService {

	@Autowired
	private orgTblDAO dao;
	
	@Override
	public List<orgTblVO> list() throws Exception {
		
		return dao.list();
	}

}
