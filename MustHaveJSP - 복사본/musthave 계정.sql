select * from tab;

drop table member;
drop table board;
drop sequence seq_board_num;

-- 회원 테이블 만들기
create table member(
    id varchar2(10) not null,
    pass varchar2(10) not null,
    name varchar2(30) not null,
    regidate date default sysdate not null,
    primary key (id)
);

-- 모델1 방식의 게시판 테이블 만들기

create table board(
num number primary key,
title varchar2(200) not null,
content varchar2(2000) not null,
id varchar2(10) not null,
postdate date default sysdate not null,
visitcount number(6)
);

-- 외래키 설정
alter table pjboard
    add constraint pjboard_mem_fk foreign key (id)
    references pjmember (id);

-- 시퀀스 생성
create sequence seq_board_num
    increment by 1 -- 1씩 증가
    start with 1 -- 시작값이 1
    minvalue 1 -- 최소값 1
    nomaxvalue -- 최대값은 무한대
    nocycle -- 순환하지 않음
    nocache; -- 캐시안함

-- 더미 데이터 입력
insert into member (id, pass, name) values('musthave','1234','머스트해브');
insert into board(num, title, content, id, postdate, visitcount)
    values(seq_board_num.nextval, '제목1입니다','내용1입니다','musthave',
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
-- 모델2 방식의 파일첨부형 게시판 테이블 생성
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
    values(seq_board_num.nextval, '김유신', '자료실 제목 1입니다.','내용','1234');
insert into mvcboard (idx, name, title, content, pass)
    values(seq_board_num.nextval, '장보고', '자료실 제목 2입니다.','내용','1234');
insert into mvcboard (idx, name, title, content, pass)
    values(seq_board_num.nextval, '이순신', '자료실 제목 3입니다.','내용','1234');
insert into mvcboard (idx, name, title, content, pass)
    values(seq_board_num.nextval, '강감찬', '자료실 제목 4입니다.','내용','1234');
insert into mvcboard (idx, name, title, content, pass)
    values(seq_board_num.nextval, '대조영', '자료실 제목 5입니다.','내용','1234');


-- 프로젝트 게시판 테이블
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
    values(seq_board_num.nextval, 'jh00', '자료실 제목1입니다.','내용','1234');
insert into pjboard (idx, id, name, title, content, pass)
    values(seq_board_num.nextval, 'jh00', '자료실 제목2입니다.','내용','1234');
insert into pjboard (idx, id, name, title, content, pass)
    values(seq_board_num.nextval, 'jh00', '자료실 제목3입니다.','내용','1234');
insert into pjboard (idx, id, name, title, content, pass)
    values(seq_board_num.nextval, 'jh00', '자료실 제목4입니다.','내용','1234');
insert into pjboard (idx, id, name, title, content, pass)
    values(seq_board_num.nextval, 'jh00', '자료실 제목5입니다.','내용','1234');



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
values ('admin', '1234', '관리자', '01012345678', 'admin@naver.com');

commit;

SELECT * FROM pjmember WHERE id='admin' AND pass='1234';

delete from pjboard where title='123214fewfewefw';
DELETE FROM pjmember WHERE id='6666';

commit;