select * from tab;

drop table member;
drop table board;
drop sequence seq_board_num;

-- ȸ�� ���̺� �����
create table member(
    id varchar2(10) not null,
    pass varchar2(10) not null,
    name varchar2(30) not null,
    regidate date default sysdate not null,
    primary key (id)
);

-- ��1 ����� �Խ��� ���̺� �����

create table board(
num number primary key,
title varchar2(200) not null,
content varchar2(2000) not null,
id varchar2(10) not null,
postdate date default sysdate not null,
visitcount number(6)
);

-- �ܷ�Ű ����
alter table pjboard
    add constraint pjboard_mem_fk foreign key (id)
    references pjmember (id);

-- ������ ����
create sequence seq_board_num
    increment by 1 -- 1�� ����
    start with 1 -- ���۰��� 1
    minvalue 1 -- �ּҰ� 1
    nomaxvalue -- �ִ밪�� ���Ѵ�
    nocycle -- ��ȯ���� ����
    nocache; -- ĳ�þ���

-- ���� ������ �Է�
insert into member (id, pass, name) values('musthave','1234','�ӽ�Ʈ�غ�');
insert into board(num, title, content, id, postdate, visitcount)
    values(seq_board_num.nextval, '����1�Դϴ�','����1�Դϴ�','musthave',
    sysdate,0);
commit;

create table myfile (
    idx number primary key,
    name varchar2(50) not null,
    title varchar2(200) not null,
    cate varchar2(30),
    ofile varchar2(100) not null,
    sfile varchar2(30) not null,
    postdate date default sysdate not null
);
desc myfile;

drop table mvcboard;
-- ��2 ����� ����÷���� �Խ��� ���̺� ����
create table mvcboard (
    idx number primary key,
    name varchar2(50) not null,
    title varchar2(200) not null,
    content varchar2(2000) not null,
    postdate date default sysdate not null,
    ofile varchar2(200),
    sfile varchar2(30),
    downcount number(5) default 0 not null,
    pass varchar2(50) not null,
    visitcount number default 0 not null
);
desc mvcboard;

insert into mvcboard (idx, name, title, content, pass)
    values(seq_board_num.nextval, '������', '�ڷ�� ���� 1�Դϴ�.','����','1234');
insert into mvcboard (idx, name, title, content, pass)
    values(seq_board_num.nextval, '�庸��', '�ڷ�� ���� 2�Դϴ�.','����','1234');
insert into mvcboard (idx, name, title, content, pass)
    values(seq_board_num.nextval, '�̼���', '�ڷ�� ���� 3�Դϴ�.','����','1234');
insert into mvcboard (idx, name, title, content, pass)
    values(seq_board_num.nextval, '������', '�ڷ�� ���� 4�Դϴ�.','����','1234');
insert into mvcboard (idx, name, title, content, pass)
    values(seq_board_num.nextval, '������', '�ڷ�� ���� 5�Դϴ�.','����','1234');


-- ������Ʈ �Խ��� ���̺�
drop table pjboard;

create table pjboard (
    idx number primary key,
    id varchar2(50) not null,
    title varchar2(200) not null,
    content varchar2(2000) not null,
    postdate date default sysdate not null,
    ofile varchar2(200),
    sfile varchar2(30),
    downcount number(5) default 0 not null,
    pass varchar2(50) not null,
    visitcount number default 0 not null
);
desc mvcboard;

insert into pjboard (idx, id, title, content, pass)
    values(seq_board_num.nextval, 'jh00', '�ڷ�� ����1�Դϴ�.','����','1234');
insert into pjboard (idx, id, name, title, content, pass)
    values(seq_board_num.nextval, 'jh00', '�ڷ�� ����2�Դϴ�.','����','1234');
insert into pjboard (idx, id, name, title, content, pass)
    values(seq_board_num.nextval, 'jh00', '�ڷ�� ����3�Դϴ�.','����','1234');
insert into pjboard (idx, id, name, title, content, pass)
    values(seq_board_num.nextval, 'jh00', '�ڷ�� ����4�Դϴ�.','����','1234');
insert into pjboard (idx, id, name, title, content, pass)
    values(seq_board_num.nextval, 'jh00', '�ڷ�� ����5�Դϴ�.','����','1234');



create table pjmember(
    id varchar2(20) not null,
    pass varchar2(20) not null,
    name varchar2(30) not null,
    phone varchar2(30) not null,
    email varchar2(50) not null,
    gender char(1) check(gender in('m', 'f')),
    regidate date default sysdate not null,
    primary key (id)
);

create table pjboard (
    num number primary key,
    id varchar2(20) not null,
    title varchar2(200) not null,
    content varchar2(2000) not null,
    postdate date default sysdate not null,
    ofile varchar2(200),
    sfile varchar2(30),
    downcount number(5) default 0 not null,
    visitcount number default 0 not null
);
desc mvcboard;

create table noticeboard (
    num number primary key,
    id varchar2(20) not null,
    title varchar2(200) not null,
    content varchar2(2000) not null,
    postdate date default sysdate not null,
    ofile varchar2(200),
    sfile varchar2(30),
    downcount number(5) default 0 not null,
    visitcount number default 0 not null
);
desc mvcboard;


alter table pjboard
    add constraint board_mem_fk4 foreign key (id)
    references pjmember (id);


alter table noticeboard
    add constraint board_mem_fk4 foreign key (id)
    references pjmember (id);

drop table pjboard;
drop table pjmember;

insert into pjmember (id, pass, name, phone, email) 
values ('admin', '1234', '������', '01012345678', 'admin@naver.com');

commit;

SELECT * FROM pjmember WHERE id='admin' AND pass='1234';

delete from pjboard where title='123214fewfewefw';
DELETE FROM pjmember WHERE id='6666';

commit;