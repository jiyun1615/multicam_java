-- JOIN : 검색을 하고 싶은데 항목들이 여러개의 테이블에 흩어져 있는 경우 사용

SELECT *
FROM "MEMBER" m, BBS b 
WHERE m.ID = b.WRITER


SELECT b.NO, title, name
FROM "MEMBER" m , BBS b 
WHERE m.ID = b.WRITER  


-- INNER JOIN 
--EMP와 DEPT 테이블 조인 공통된 값만 추출

SELECT *
FROM EMP E, DEPT D
WHERE EMP.DEPTNO = DEPT.DEPTNO
ORDER BY EMPNO

SELECT E.EMPNO, E.ENAME, E.JOB, E.DEPTNO, D.LOC
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO 

SELECT * FROM MEMBER M
LEFT OUTER JOIN BBS B
ON (M.ID = B.WRITER)


--EMP 테이블의 정보는 다 보이게 하고 싶음. DEPT는 맞는 것만 오른쪽에 붙여주고 싶음

SELECT *
FROM EMP E
LEFT OUTER JOIN DEPT D
ON (E.DEPTNO = D.DEPTNO)


-- DEPT테이블의 정보는 다 보이게, EMP는 맞는 것만 오른쪽에 붙여주고 싶음
SELECT * FROM EMP E
RIGHT OUTER JOIN DEPT D
ON(E.DEPTNO = D.DEPTNO)

-- member table과 bbs table의 inner join하시오.(조인 조건 bbs의 writer, member의 id)
SELECT * FROM MEMBER M
INNER JOIN BBS B
ON (M.ID = B.WRITER)

--member table과 bbs table의 left outer join하시오.(조인 조건 bbs의 writer, member의 id)
SELECT * FROM MEMBER M
LEFT OUTER JOIN BBS B 
ON(M.ID = B.WRITER)

--member table과 bbs table의 right outer join하시오.(조인 조건 bbs의 writer, member의 id)
SELECT * FROM MEMBER M
RIGHT OUTER JOIN BBS B 
ON (M.ID = B.WRITER)


CREATE TABLE COMPANY (
	ID VARCHAR2(200) PRIMARY KEY,
	NAME VARCHAR2(200),
	ADDR VARCHAR2(200),
	TEL VARCHAR2(200)
)

INSERT INTO COMPANY VALUES ('c100', 'good', 'seoul', '011')

INSERT INTO COMPANY VALUES ('c200', 'joa', 'busan', '012')

INSERT INTO COMPANY VALUES ('c300', 'maria', 'ulsan', '013')

INSERT INTO COMPANY VALUES ('c400', 'my', 'kwangju', '014')

SELECT * FROM COMPANY C
LEFT OUTER JOIN PRODUCT1 P
ON(P.COMPANY  = C.ID)


SELECT * FROM PRODUCT1 P
RIGHT OUTER JOIN COMPANY C
ON(P.COMPANY  = C.ID)

SELECT * FROM PRODUCT1 P
INNER JOIN COMPANY C 
ON (P.COMPANY = C.ID)
