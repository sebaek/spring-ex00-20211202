package org.zerock.mapper.project1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.project1.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTest {

	@Autowired
	public MemberMapper mapper;

	@Test
	public void insertTest() {
		MemberVO vo = new MemberVO();
		vo.setId("newMember1");
		vo.setPassword("newpassword");
		vo.setAddress("seoul");
		vo.setEmail("member1@google.com");
		
		int cnt = mapper.insert(vo);
		
		assertEquals(1, cnt);
	}
}










