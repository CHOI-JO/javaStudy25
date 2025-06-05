desc emp; 
select * from emp ; -- emp테이블 전체 내용보기
select * from emp, dept order by empno;-- emp, dept테이블을 empno 순서대로 보기
desc dept;
select * from dept;-- dept테이블 전체 내용보기
select * from emp,dept where emp.deptno=dept.deptno order by empno; -- emp, dept테이블을 emp.deptno=dept.deptno가 같은 행만 empno 순서대로 보기
select * from emp e, dept d where e.deptno=d.deptno order by empno;-- emp, dept테이블을 emp.deptno=dept.deptno가 같은 행만 empno 순서대로 보기
select e.empno, d.dname from emp e, dept d where e.deptno = d.deptno order by empno;-- emp, dept테이블을 'e'와 'd'의 별칭으로 지정하고 emp.deptno=dept.deptno가 같은 행만 empno 순서대로 보기
select e.empno, e.ename, d.deptno, d.dname, d.loc from emp e, dept d where e.deptno=d.deptno and sal>=3000 order by d.deptno, e.empno;
select * from emp e, salgrade s where e.sal between s.losal and s.hisal;
select * from emp e, emp e1 where e.mgr=e1.empno;
select e.empno, e.ename, e.job, deptno, d.dname from emp e join dept d using (deptno) where sal >= 3000 order by deptno, e.empno; --emp e 와 dept d 테이블을 deptno열로 조인하기
select e.empno, e.ename, e.job, e.deptno, d.dname from emp e join dept d on (e.deptno=d.deptno) where sal >= 3000 order by deptno, e.empno; --emp.deptno=dept.deptno가 같은 행만 empno 순서대로 보기
select e1.empno, e2.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 left outer join emp e2 on (e1.mgr = e2.empno) order by e1.empno; -- 같은 테이블을 임시로 별칭으로 1개 더 만들고, empno는 ngr_empno이름으로 변경하고 e1을 기준으로 mgr과empno가 같은 행만 보기(왼쪽 외부 조인)
select e1.empno, e2.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 right outer join emp e2 on (e1.mgr = e2.empno) order by e1.empno; -- 같은 테이블을 임시로 별칭으로 1개 더 만들고, empno는 ngr_empno이름으로 변경하고 e2을 기준으로 mgr과empno가 같은 행 보기(오른쪽 외부 조인)
select e1.empno, e2.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 full outer join emp e2 on (e1.mgr = e2.empno) order by e1.empno; -- 같은 테이블을 임시로 별칭으로 1개 더 만들고, empno는 ngr_empno이름으로 변경하고 e1과 e2 모두를 기준으로 mgr과empno가 같은 행 보기(양쪽 외부 조인)

select * from emp where sal > (select sal from emp where ename='JONES'); -- 서브 쿼리로 jones의 급여보다 높은 급여를 받는 사원 출력하기
select * from emp where hiredate < (select hiredate from emp where ename = 'SCOTT'); --서브쿼리의 결과 값이 날짜형인 경우
select * from emp where deptno in (20,30); -- 부서 번호가 20이거나 30인 사원의 정보만 출력
select * from emp where sal in (select max(sal) from emp group by deptno);-- 각 부서별 최고 급여와 동일한 급여를 받는 사원 출력
select max(sal) from emp group by deptno;  --부서 번호 별로 최대 급여 출력
select min(sal) from emp group by deptno; -- 부서 번호 별로 최소 급여 출력
select * from emp where sal < any(select sal from emp where deptno=30) order by sal, empno; -- 'any'나 'some'는 한개라도 true이면 true를 출력, 즉 30번 부서 사원들의 최대 금여보다 적은 급여를 받는 사원 정보 출력
select * from emp where sal < all(select sal from emp where deptno=30) order by sal, empno; -- 'all'는 모두 true여야만 true를 출력, 즉 30번 부서 사원들의 최소 급여보다 적은 급여를 받는 사원 정보 출력
select * from emp where (deptno, sal) in (select deptno, max(sal) from emp group by deptno); -- 다중 열 서브쿼리 사용하기
select e10.empno, e10.ename, e10.deptno, d.dname, d.loc from (select * from emp where deptno = 10) e10, (select * from dept) d where e10.deptno = d.deptno; -- from으로 사용하는 서브쿼리
with e10 as (select * from emp where deptno = 10), d as(select * from dept) select e10.empno, e10.ename, e10.deptno, d.dname, d.loc from e10,d where e10.deptno = d.deptno; -- with으로 사용하는 서브쿼리 (from보다 번거롭지만, 다중 규모에서는 유용)
select empno, ename, job, sal, (select grade from salgrade where e.sal between losal and hisal) as salgrade, deptno, (select dname from dept where e.deptno=dept.deptno) as dname from emp e; -- select절에서도 서브쿼리 가능, 그러나 select절은 서브쿼리를 반드시 하나의 결과만 반환하도록 명시해야함

-- 테이블 생성 및 열 추가
create table jang_temp as select *from dept; 
insert into jang_temp(deptno, dname, loc) values(5,'jang','seoul');
select * from jang_temp; 
insert into jang_temp(deptno, dname, loc) values(9,'','ansan');
select * from jang_temp; 

create table jang_temp2 as select * from emp where 1<>1; -- 테이블 생성하기, emp에 있는 열을 모두 복사해서 만듬, 그러나 열메뉴만 가져오고 데이터는 비움
select * from jang_temp2;
insert into jang_temp2 (empno, ename, mgr, hiredate, sal, deptno) Values (2111, '장장', 999, to_date('08/01/2002', 'DD/MM/YYYY'), 4000,20); -- jang_temp2에 데이터 삽입, 
select * from jang_temp2;
insert into jang_temp2 (empno, ename, mgr, hiredate, sal, deptno) Values (9999, 'choichoi', 999, sysdate, 500,7); -- 데이터 삽입 그러나 sysdate를 사용해서 현재 시간으로 삽입
insert into jang_temp2(empno, ename, job, mgr, hiredate, sal, comm, deptno) select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno from emp e, salgrade s where e.sal between s.losal and s.hisal and s.grade =1; -- emp테이블에서 salgrade 테이블을 참조해서 금여등급이 1인 사원만 삽입하는 서브 쿼리(한번에 여러 데이터 추가), 서브쿼리시 values절은 사용하지 않음, 추가되는 테이블의 열 개수와 서브 쿼리의 열개수가 일치해야함(자료형도)

-- 수정
-- update jang_temp2 set deptno = 9;
rollback;
update jang_temp2 set deptno = 9 where deptno=30;
update jang_temp2 set(ename,job) = (select dname, loc from dept where deptno = 40) where deptno=9; -- 서브쿼리로 dept 테이블의 40번 부서를 조회하고, 그 결과로 나온 이름/지역을 jang 테이블 중 9번에 변경

--삭제
create table emp_temp2 as select * from emp;
delete from emp_temp2 where job = 'MANAGER';
select * from emp_temp2;
rollback;
delete from emp_temp2 where empno in (select e.empno from emp_temp2 e, salgrade s where e.sal between s.LOSAL and s.HISAL and s.grade=3 and deptno=30);


--복습
create table chap10hw_emp as select * from emp;
create table chap10hw_dept as select * from dept;
create table chap10hw_salgrade as select * from salgrade;

insert into chap10hw_dept(deptno, dname, loc) valueS(50,'ORACLE', 'BUSAN');
insert into chap10hw_dept(deptno, dname, loc) valueS(60,'SQL', 'LISAN');
insert into chap10hw_dept(deptno, dname, loc) valueS(70,'SELECT', 'INCHON');
insert into chap10hw_dept(deptno, dname, loc) valueS(80,'DML', 'BUNDANG');
SELECT * FROM chap10hw_dept;
SELECT * FROM chap10hw_salgrade;


insert into chap10hw_emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, deptno) values(7201,'TEST_USER1', 'MANAGER', 7788, '2016/01/02', 4500, NULL, 50);
insert into chap10hw_emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, deptno) values(7202,'TEST_USER2', 'CLERK', 7201, '2016/02/21', 1800, NULL, 50);
insert into chap10hw_emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, deptno) values(7203,'TEST_USER3', 'ANALYST', 7201, '2016/04/11', 3400, NULL, 60);
insert into chap10hw_emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, deptno) values(7204,'TEST_USER4', 'SALESMAN', 7201, '2016/05/31', 2700, 300, 60);
insert into chap10hw_emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, deptno) values(7205,'TEST_USER5', 'CLERK', 7201, '2016/07/20', 2600, NULL, 70);
insert into chap10hw_emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, deptno) values(7206,'TEST_USER6', 'CLERK', 7201, '2016/09/08', 2600, NULL, 70);
insert into chap10hw_emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, deptno) values(7207,'TEST_USER7', 'LECTURER', 7201, '2016/10/28', 2300, NULL, 80);
insert into chap10hw_emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, deptno) values(7208,'TEST_USER8', 'STUDENT', 7201, '2018/03/09', 1200, NULL, 80);
SELECT * FROM chap10hw_emp;

UPDATE chap10hw_emp SET DEPTNO=70 WHERE SAL > (SELECT AVG(SAL) FROM chap10hw_emp WHERE DEPTNO=50);
UPDATE chap10hw_emp SET DEPTNO=80, SAL=SAL*1.1 WHERE HIREDATE > (SELECT MIN(HIREDATE) FROM chap10hw_emp WHERE DEPTNO=60);

DELETE FROM chap10hw_emp WHERE EMPNO IN (SELECT E.EMPNO FROM chap10hw_salgrade S, chap10hw_emp E WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL AND S.GRADE=5);
COMMIT;

update chap10hw_emp set DEPTNO=70 where DEPTNO=80;
COMMIT;

create table emp_ddl(empno number(4),  ename varchar2(10), job varchar2(9), mgr number(4), hiredate date, sal number(7,2), comm number(7,2), deptno number(2));
desc emp_ddl;

create table dep_ddl as select * from dept;
select * from dep_ddl;

alter table dep_ddl add hp varchar2(20);
alter table dep_ddl rename column hp to tel;
alter table dep_ddl modify deptno number(5);
insert into dep_ddl(tel) values(0109999999);
alter table dep_ddl modify tel varchar2(20);
alter table dep_ddl drop column tel;

rename dep_ddl to jang_ddl;
select * from jang_ddl;

create table sequence as select * from dept where 1<>1;
create sequence seq_sequence  increment by 10  start with 10 maxvalue 90 minvalue 0 nocycle cache 2;
select * from user_sequences;

insert into sequence (deptno, dname, loc) values(seq_sequence.nextval, 'database', 'seoul');
select * from sequence order by deptno;


-- 제약조건
create table table_notnull(
login_id varchar2(20) not null,
login_pw varchar2(20) not null,
tel varchar2(30) );
desc table_notnull;
insert into table_notnull(login_id, login_pw, tel)
values('choi', '1234', null);

create table table_notnull2(
login_id varchar2(20) constraint talnn_id2_nn not null,
login_pw varchar2(20) constraint talnn_pw2_nn not null,
tel varchar2(30) );

update table_notnull set login_pw='567800000' where login_id='choi';
select * from table_notnull;
select * from user_constraints; -- 전체 제약 조건 보기
alter table table_notnull modify(tel not null); -- 제약조건만 변경
alter table table_notnull add age varchar2(20);
update table_notnull set tel='010-4655-0000' where login_id='choi';
update table_notnull set age='30' where login_id='choi';
alter table table_notnull modify(tel constraint talnn_tel_nn not null); --제약 조건에 이름 변경및 수정
alter table table_notnull rename constraint SYS_C0011053 to talnn_id_nn; -- 제약조건 이름 변경
alter table table_notnull rename constraint SYS_C0011054 to talnn_pw_nn;
alter table table_notnull modify(tel null);
alter table table_notnull drop constraint talnn_tel_nn; -- 해당 열의 제약조건 삭제
ALTER TABLE table_notnull modify(login_pw CHECK (LENGTH(login_pw) > 8)); -- 8이상만 가능
insert into table_notnull(login_id, login_pw, tel) values('park', '123411111', null);
ALTER TABLE table_notnull modify(age default '00'); -- default값 지정
insert into table_notnull(login_id, login_pw, tel) values('kim', '000011111', null);


-- 중복되지 않는 unique(null은 허용, 중복 허용안함)와 primary key(null, 중복 모두 허용 안함)
create table table_unique(
login_id varchar(20) constraint talunq_id_pr primary key,
login_pw varchar(20) constraint talunq_pw_nn not null,
login_nickname varchar(20) constraint talunq_id_unq unique,
tel varchar2(20)
);
desc table_unique;
select * from table_unique;
select * from user_constraints; -- 전체 제약 조건 보기
insert into table_unique(login_id, login_pw, tel)
values('jang', '1234', null);
select * from table_unique where login_id like 'ch%';

-- foreign key
select * from user_constraints where table_name in('emp', 'dept');
create table dept_fk(
deptno number(5) constraint deptfk_deptno_pk primary key,
dname varchar2(20) constraint deptfk_dname_nn not null,
loc varchar2(30) 
);
select * from dept_fk;

create table emp_fk(
empno number(6) constraint empfk_empno_pk primary key,
ename varchar2(20) constraint empfk_ename_nn not null,
job varchar2(9),
mgr number(10),
hiredate date,
sal number(10, 2) constraint empfk_sal_uqe unique,
comm number(10,2),
deptno number(2) constraint empfk_deptno_fk references dept_fk(deptno)
);
desc emp_fk;
insert into dept_fk values(10, 'jang', 'seoul');
insert into emp_fk values(9999,'choi', 'students', null, to_date('2020-01-01', 'yyyy-mm-dd'), 2000, null, 10);
select * from emp_fk;


create table dept_const(
deptno number(2) constraint deptconst_deptno_pk primary key,
dname varchar2(14) constraint deptconst_dname_inq unique,
loc varchar2(13) constraint deptconst_loc_nn not null
);
select * from dept_const;
desc dept_const;
select * from user_constraints; -- 전체 제약 조건 보기

create table emp_const(
empno number(4) constraint empconst_empno_pk primary key,
ename varchar(10) constraint empconst_ename_nn not null,
job varchar(9),
tel varchar(20) constraint empconst_tel_unq unique,
hiredate date,
sal number(7,2) constraint empconst_sal_chk check(1000<sal and sal<9999),
comm number(7,2),
deptno number(2) constraint empconst_deptno_fk references dept_const(deptno) 
);

commit;

-- 사용자 관리
select * from all_users;
select * from dba_users;
select * from dba_objects;

create user choi identified by jang default tablespace newtable temporary tablespace temptable;

commit;