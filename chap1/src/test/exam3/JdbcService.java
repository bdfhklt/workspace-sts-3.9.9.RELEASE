package test.exam3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JdbcService {

	@Autowired
	private JdbcDao jdbcDao;

//	public JdbcService(JdbcDao jdbcDao) {
//		this.jdbcDao = jdbcDao;
//	}

	public void serviceTest() {
		jdbcDao.insert();
		jdbcDao.delete();
	}
}
