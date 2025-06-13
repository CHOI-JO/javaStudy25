create table member(
mno number(20) not null,
id nvarchar2(30) primary key,
pw nvarchar2(10) not null,
mname nvarchar2(20) not null,
birthday number(20) not null,
phonenumber nvarchar2(50) not null,
email nvarchar2(50) not null,
address nvarchar2(50) not null,
regidate date default sysdate not null
)
create sequence board_seq increment by 1 start with 1 nocycle nocache

drop table member -- member ���̺� ����

insert into member (mno, id, pw, mname, birthday, phonenumber, email, address) 
values (board_seq.nextval, 'kkw','1234', '����', '000101', '010-1111-1111', 'aaaaa@gmail.com', '������ ���뱸')
insert into member (mno, id, pw, mname, birthday, phonenumber, email, address) 
values (board_seq.nextval, 'yjs', '1234', '������','010202', '010-2222-2222', 'bbbbb@gmail.com', '������ ��ȱ�')
insert into member (mno, id, pw, mname, birthday, phonenumber, email, address) 
values (board_seq.nextval, 'lej', '1234', '������', '030303', '010-3333-3333', 'ccccc@gmail.com', '���ν� ���ﱸ')
insert into member (mno, id, pw, mname, birthday, phonenumber, email, address) 
values (board_seq.nextval, 'cjo', '1234', '���ؿ�', '050505', '010-5555-5555', 'ddddd@gmail.com', '����� ���۱�')
insert into member (mno, id, pw, mname, birthday, phonenumber, email, address) 
values (board_seq.nextval, 'ljs', '1234', '�����', '060606', '010-6666-6666', 'eeeee@gmail.com', '����� ������')
insert into member (mno, id, pw, mname, birthday, phonenumber, email, address) 
values (board_seq.nextval, 'kch', '1234', '��ä��', '070707', '010-7777-7777', 'fffff@gmail.com', '������ �Ǽ���')
insert into member (mno, id, pw, mname, birthday, phonenumber, email, address) 
values (board_seq.nextval, 'jea', '1234', '������', '080808', '010-8888-8888', 'ggggg@gmail.com', '�Ⱦ�� ���ȱ�')


select * from member


------------------member�� �ڽ� board �ܷ�Ű ���� �ʼ�-------------------------
drop table board -- ������ board ���̺� ����

create table board(
bno number(5) primary key,
btitle nvarchar2(100) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) null,
bdate date not null
)

alter table board add constraint board_member_fk foreign key (bwriter) references member(id) on delete set null

delete from board

insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '���ο� �����Դϴ�.', '������ ���� ���׿�', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '���� �ݿ����Դϴ�.', '�� �ְ��� ��� ���Ҿ��', 'kch', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�ּ��� ���սô�.', '���θ� ���� ���ο� ������ �ɰſ���', 'cjo', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�����ƿ�.', '��� �� �ɰſ���', 'jo', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�����ȯ�� �ʿ��ؿ�~', '�� ������ ���� ������. ��� ��ȭ�� �ʿ��ؿ�', 'jea', sysdate)


select * from board;


