package org.kin.service;

import java.util.List;

import org.kin.DAO.chartDAO;
import org.kin.domain.chartVO;
import org.kin.domain.searchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class chartImpl implements chartService {

	@Autowired
	private chartDAO dao;
	
	@Override
	public List<chartVO> list() {
		System.out.println("chartImpl In");
		return dao.list();
	}

	@Override
	public List<chartVO> searchList(searchVO vo) {
		System.out.println("searchList Service In");
		System.out.println("searchVO.tostring()" + vo.toString());
		return dao.searchList(vo);
	}

}
