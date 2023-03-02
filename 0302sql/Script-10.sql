CREATE TABLE member22 
AS SELECT * FROM MEMBER


INSERT INTO member22 VALUES ('banana', 'banana','banana','banana', sysdate)

INSERT INTO member22 VALUES ('banana2', 'banana2','banana2','banana2', sysdate)

INSERT INTO member22 VALUES ('banana3', 'banana3','banana3','banana3', sysdate)

SELECT * FROM MEMBER22

INSERT INTO bbs3 values(bbs_id_seq.nextval, 'happy', 'happy day', 'ice')

INSERT INTO bbs3 values(bbs_id_seq.nextval, 'hello', 'hello HI', 'ice')

SELECT * FROM BBS3


CREATE SEQUENCE pd_id_seq
INCREMENT BY 1
START WITH 1

CREATE TABLE PRODUCT2 (
	id number(38,0),
	name varchar2(100)
)

INSERT INTO PRODUCT2 values(pd_id_seq.nextval, 'Jane')

SELECT * FROM product2

CREATE TABLE orderList3 (
	id number(38,0),
	title varchar2(100),
	price number(38,0)
)

CREATE SEQUENCE or_seq
INCREMENT BY 1
START WITH 1

INSERT INTO ORDERLIST3 values(or_seq.nextval, '제목1',10000)

INSERT INTO ORDERLIST3 values(or_seq.nextval, '제목2',20000)

INSERT INTO ORDERLIST3 values(or_seq.nextval, '제목3',30000)

INSERT INTO ORDERLIST3 values(or_seq.nextval, '제목4',10000)

INSERT INTO ORDERLIST3 values(or_seq.nextval, '제목5',20000)

SELECT * FROM ORDERLIST3
WHERE id >= 3
ORDER BY id desc
