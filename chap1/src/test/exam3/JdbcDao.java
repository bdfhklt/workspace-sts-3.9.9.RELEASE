package test.exam3;

import org.springframework.stereotype.Component;

@Component
public class JdbcDao {

	public void insert() {
		System.out.println("추가");
	}

	public void delete() {
		System.out.println("삭제");
	}
}
