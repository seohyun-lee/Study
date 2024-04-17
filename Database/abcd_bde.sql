drop table r;
drop table s;
create table r(
  A char(1),
  B int,
  C char(1),
  D char(1));
create table s(
  B int,
  D char(1),
  E char(1));
insert into r values ('a', 1,'a','a');
insert into r values ('b', 2,'r','a');
insert into r values ('r', 4,'b','b');
insert into r values ('a', 1,'r','a');
insert into r values ('d', 2,'b','b');
insert into s values (1,'a','a');
insert into s values (3,'a','b');
insert into s values (1,'a','r');
insert into s values (2,'b','d');
insert into s values (3,'b','e');

select * from r;
select * from s;
select A,C,E from r,s where r.D='b' and C=E;
select A,r.B,s.D,E from r,s where A=E and r.B='2';