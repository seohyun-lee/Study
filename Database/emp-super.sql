delete from emp_super;
drop table emp_super;
create table emp_super (
  person varchar(10),
  supervisor varchar(10));

insert into emp_super values ('Bob', 'Alice');
insert into emp_super values ('Mary', 'Susan');
insert into emp_super values ('Alice', 'David');
insert into emp_super values ('David', 'Mary');
select * from emp_super;

-- Bob의 상급자 찾기
select supervisor from emp_super where person='Bob';
-- Bob의 상급자의 상급자 찾기
select s.supervisor from emp_super as t, emp_super as s where t.person='Bob' and t.supervisor=s.person;
-- 제일 높은 상급자 찾기
select d.supervisor from emp_super as a, emp_super as b, emp_super as c, emp_super as d
where a.person='Bob' and a.supervisor=b.person and b.supervisor=c.person and c.supervisor=d.person;