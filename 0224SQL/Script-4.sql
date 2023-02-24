CREATE TABLE "HR"."NOTICE" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITEDATE" DATE, 
	"RECOMMEND_CNT" NUMBER(38,0), 
	"VIEW_CNT" NUMBER(38,0)
   )
   

-- 추천게시판(Recommend)
-- re_no 숫자
-- title, contents, writer, 
   
   
CREATE TABLE recommend (
   	RE_NO NUMBER(38,0),
   	TITLE VARCHAR2(100),
   	CONTENTS VARCHAR2(200),
   	WRITER VARCHAR2(100)
)

ALTER TABLE RECOMMEND MODIFY RE_NO NUMBER(20,0);


-- BOARD3 테이블 만들기
-- COLUMN TEST -> PERSIST

CREATE TABLE BOARD3 (
	TEST VARCHAR(100),
	TEST2 VARCHAR(100),
	TEST3 VARCHAR(100)
)

ALTER TABLE BOARD3 DROP COLUMN TEST;

ALTER TABLE BOARD3 DROP COLUMN TEST2;

ALTER TABLE BOARD3 DROP COLUMN TEST3;

ALTER TABLE BOARD3 ADD TEST1 VARCHAR2(100) NULL;

ALTER TABLE BOARD3 ADD TEST3 VARCHAR2(100) NULL;

ALTER TABLE BOARD3 DROP COLUMN TEST3;

ALTER TABLE BOARD3 ADD TEST4 NUMBER(10,0) NOT NULL;

DROP TABLE BOARD3;

DROP TABLE BBS2;

-- DCL : DB 관리/제어해주는 문법(계정생성, 계정권한부여, 백업, 복구)

CREATE USER APPLE IDENTIFIED BY 1234;

GRANT CONNECT, RESOURCE, DBA TO APPLE;

DROP TABLE BBS;

DROP TABLE "member";

DROP TABLE MEMBER2;


