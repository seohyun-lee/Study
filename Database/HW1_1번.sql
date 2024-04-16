-- HW1
-- 1. List the names and total credits of all students who have completed at least 100 credits.
-- 정답
select name,tot_cred from student where tot_cred >= 100;
-- 점검용
select * from student order by tot_cred desc;