select * from MEMBER;
drop table member;
drop sequence member_id_seq;

insert into member
select id, name, message from member where name ='안녕임';

select id, name, message from member where name = '윤동웅';

SELECT id, name, message FROM MEMBER WHERE NAME = '윤동웅';