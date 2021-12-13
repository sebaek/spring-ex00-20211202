package org.zerock.mapper.project1;

public interface MemberMapper {

	public int insert(MemberVO member);
	
	public MemberVO select(String id);
	
	public int update(MemberVO member);
	
	public int delete(String id);
	
	public List<MemberVO> list(); //
}
