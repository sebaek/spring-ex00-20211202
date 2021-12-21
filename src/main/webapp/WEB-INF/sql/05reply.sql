USE test;

DESC Member;

CREATE TABLE Reply (
	id INT PRIMARY KEY AUTO_INCREMENT,
	boardId INT NOT NULL,
    reply VARCHAR(500) NOT NULL,
    memberId VARCHAR(30) NOT NULL,
    inserted DATETIME NOT NULL DEFAULT NOW(),
    updated DATETIME NOT NULL DEFAULT NOW()
);

SELECT * FROM Board ORDER BY id DESC; -- 429
SELECT * FROM Member ORDER BY inserted DESC; -- myid10

-- test 데이터 입력
INSERT INTO Reply (boardId, reply, memberId) VALUES (429, '테스트용 댓글!@!@!@!@', 'myid10');

SELECT * FROM Reply ORDER BY id DESC;














