package org.kin.service;

import java.util.List;

import org.kin.DAO.chartDAO;
import org.kin.domain.chartVO;
import org.kin.domain.searchVO;
import org.kin.proxy.timeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class chartImpl implements chartService {

	@Autowired
	private chartDAO dao;
	
	@Autowired
	timeAdvice ta;
	
	@Override
	public List<chartVO> list() {
		System.out.println("chartImpl In");
		return dao.list();
	}

	@Override
	public List searchList(searchVO vo) {
		System.out.println("searchList Service In");
		System.out.println("searchVO.tostring()" + vo.toString());
		List search = dao.searchList(vo);
		System.out.println("DAO 측정 proxyTime : " + ta.getProxyTime());
		search.add(ta.getProxyTime());
		return search;
	}

}
