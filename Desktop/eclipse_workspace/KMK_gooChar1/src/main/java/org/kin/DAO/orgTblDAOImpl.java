package org.kin.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kin.domain.orgTblVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class orgTblDAOImpl implements orgTblDAO {

	@Autowired
	private SqlSession session;
	
	@Override
	public List<orgTblVO> list() throws Exception {
		
		return session.selectList("boardMapper.list");
		
	}

}
