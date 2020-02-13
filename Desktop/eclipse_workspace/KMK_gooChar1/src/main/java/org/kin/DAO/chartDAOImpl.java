package org.kin.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kin.domain.cdTblVO;
import org.kin.domain.chartVO;
import org.kin.domain.searchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class chartDAOImpl implements chartDAO {

	@Autowired
	private SqlSession session;
	
	
	@Override
	public List<chartVO> list() {
		System.out.println("chartDAOImpl In");
		return session.selectList("boardMapper.chartList");
	}


	@Override
	public List<chartVO> searchList(searchVO vo) {
		System.out.println("searchList DAO In");
		System.out.println("searchVO.tostring()" + vo.toString());
		return session.selectList("boardMapper.searchList",vo);
	}


	@Override
	public List<cdTblVO> cdList() {
		System.out.println("cdList DAO In");
		List<cdTblVO> cdList = session.selectList("boardMapper.cdList");
		System.out.println("cdList[0] DAO toString : " + cdList.get(0).toString());
		
		return cdList;
	}

}
