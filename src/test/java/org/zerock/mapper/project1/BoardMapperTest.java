package org.zerock.mapper.project1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.project1.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {

	@Autowired
	public BoardMapper mapper;

	@Test
	public void mapperTest() {
		assertNotNull(mapper);
	}

	@Test
	public void insertTest() {
		BoardVO vo = new BoardVO();
		vo.setTitle("test 용 제목");
		vo.setContent("test 용 본문");
		vo.setWriter("tester");

		int cnt = mapper.insert(vo);

		assertEquals(1, cnt);
	}

	@Test
	public void insertAndSelectTest() {
		BoardVO vo = new BoardVO();
		vo.setTitle("test 용 제목" + Math.random());
		vo.setContent("테스트 용 본문" + Math.random());
		vo.setWriter("tester");

		mapper.insert(vo);

		assertNotNull(vo.getId());
		assertNotEquals(0, vo.getId().intValue());

		BoardVO lastInserted = mapper.read(vo.getId());

		assertEquals(vo.getTitle(), lastInserted.getTitle());
		assertEquals(vo.getContent(), lastInserted.getContent());
		assertEquals(vo.getWriter(), lastInserted.getWriter());

	}

}
