package org.zerock.domain.project1;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ReplyVO {

	private Integer id;
	private Integer boardId;
	private String memberId;
	private String reply;
	private LocalDateTime inserted;
	private LocalDateTime updated;
}
