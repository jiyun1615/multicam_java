SELECT LENGTH(ename) FROM emp

SELECT substr(ename, 2) FROM EMP

SELECT substr(ename, 1, 2) FROM EMP

SELECT REPLACE(ename, 'L', 'N') FROM EMP

SELECT concat(EMPNO, ename) FROM EMP

SELECT trim('W' FROM ename) FROM emp

SELECT trim (' hong ') FROM emp



-- 정리문제 1
SELECT length(ename) FROM EMP

-- 정리문제 2
SELECT length(ename) FROM emp WHERE job='MANAGER'

-- 정리문제 3
SELECT ename, job FROM emp WHERE comm IS NULL

-- 정리문제 4
SELECT hiredate FROM emp WHERE comm IS NOT NULL 

-- 정리문제 5
SELECT substr(ename, 2) FROM emp 

-- 정리문제 6
SELECT SUBSTR(ename, 1, 3) FROM emp 

-- 정리문제 7
SELECT REPLACE(ename, 'K', 'P') FROM emp

-- 정리문제 8
SELECT empno ||'번은 '|| ename || '입니다' FROM EMP 

-- 정리문제 9
SELECT SUBSTR(hiredate, 4, 2)||'월 '||SUBSTR(hiredate, 7, 2)||'일' FROM emp

-- 정리문제 10
SELECT 
	CASE job
		WHEN 'MANAGER' THEN 'LEVEL 1'
		WHEN 'SALESMAN' THEN 'LEVEL 2'
		ELSE 'LEVEL 3'
	END AS LEVEL_RESULT
	FROM EMP