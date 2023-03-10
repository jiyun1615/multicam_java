CREATE TABLE DEPT
(
DEPTNO NUMBER(2),
DNAME VARCHAR2(14 BYTE),
LOC VARCHAR2(13 BYTE)
)


CREATE TABLE EMP
(
EMPNO NUMBER(4),
ENAME VARCHAR2(10 BYTE),
JOB VARCHAR2(9 BYTE),
MGR NUMBER(4),
HIREDATE DATE,
SAL NUMBER(7,2),
COMM NUMBER(7,2),
DEPTNO NUMBER(2)
)

CREATE TABLE SALGRADE
(
GRADE NUMBER,
LOSAL NUMBER,
HISAL NUMBER
)


SELECT * FROM EMP

SELECT deptno FROM EMP

SELECT DISTINCT deptno FROM EMP

SELECT ename, sal*12 FROM emp

SELECT * FROM emp
ORDER BY sal DESC

SELECT * FROM EMP
WHERE NOT deptno=30
ORDER BY empno DESC 


select * from emp where deptno = 30  or  job = 'SALESMAN'

select * from emp where sal between 2000 and 3000

select * from emp where job NOT IN ('MANAGER', 'SALESMAN', 'CLERK')

select * from emp where ENAME like '_L%'


CREATE TABLE dept_temp2 
AS
SELECT * FROM DEPT

SELECT * FROM DEPT_TEMP2 

UPDATE DEPT_TEMP2 
SET LOC = 'SEOUL'

UPDATE DEPT_TEMP2 
SET DNAME = 'DATABASE', LOC = 'BUSAN'
WHERE DEPTNO = 40


DELETE FROM  DEPT_TEMP2
WHERE DNAME = 'SALES'

