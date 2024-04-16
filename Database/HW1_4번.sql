-- HW1
-- 4번
select title, credits from course where dept_name="Finance" and credits >= 3;
-- 4번 점검용
select * from course where dept_name like "F%";