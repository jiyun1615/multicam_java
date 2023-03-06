CREATE TABLE subject(
	강좌이름 varchar2(100),
	강의실 varchar2(100)
)

CREATE TABLE record(
	학생번호 number(38,0),
	강좌이름 varchar2(100),
	성적 number(38,0)
)

CREATE TABLE department(
	학과 varchar2(100),
	학과사무실 varchar2(100)
)

CREATE TABLE student_information(
	학생번호 number(38,0),
	학생이름 varchar2(100),
	주소 varchar2(100),
	학과 varchar2(100)
)

INSERT INTO department values('AI', 'AI102')

INSERT INTO SUBJECT VALUES ('AIDeep', 'AI103')

INSERT INTO STUDENT_INFORMATION VALUES (2, 'Kim', 'Busan','AI')

INSERT INTO RECORD VALUES (2, 'AIDeep', 70.3)

UPDATE STUDENT_INFORMATION SET 주소 = 'JEJU' WHERE 주소 = 'Busan'

SELECT * FROM SUBJECT s 
INNER JOIN RECORD r  
ON (s.강좌이름 = r.강좌이름)

SELECT si.학생번호, si.학생이름  FROM STUDENT_INFORMATION si  
INNER JOIN RECORD r  
ON (si.학생번호  = r.학생번호)

SELECT * FROM STUDENT_INFORMATION WHERE 학생번호 IN (SELECT 학생번호 FROM RECORD WHERE 성적 = 85.5)

SELECT * FROM RECORD WHERE 강좌이름 = (SELECT 강좌이름 FROM SUBJECT WHERE 강의실 = 'AI103')
