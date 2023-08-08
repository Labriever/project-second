create table jsontest(
	name		varchar2(20),
	email		varchar2(50),
	age			NUMBER	
);
drop table jsontest purge;

create table COMMENTTEST(
	NAME 		varchar2(20),
	CONTENT 	varchar2(1000),
	CommentDATE 		date
);

select * from commenttest;
insert into commenttest(name, content, commentdate) values('홍길동','코멘트 테스트',sysdate);
insert into commenttest(name, content, commentdate) values('강감찬','코멘트 테스트',sysdate);
insert into commenttest(name, content, commentdate) values('유재석','코멘트 테스트',sysdate);

select * from jsontest;

insert into jsontest(name, email, age) values("홍길동", "hong@gmail.com", 40) --?? 안됨...

INSERT INTO jsontest (name, email, age) VALUES ('홍길동', 'hong@gmail.com', 40);
INSERT INTO jsontest (name, email, age) VALUES ('강감찬', 'gang@gmail.com', 30);

SELECT JSON_VALUE(jsontest.name, '$.name') AS NAME
     , JSON_VALUE(jsontest.email, '$.name2') AS NAME2
  FROM jsontest
