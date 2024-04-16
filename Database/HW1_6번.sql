-- HW1
-- 6번
select distinct name from instructor, teaches, course
where instructor.id=teaches.id and teaches.course_id=course.course_id
and course.dept_name="Physics";
-- 6번 점검용
select * from instructor, teaches, course
where instructor.id=teaches.id and teaches.course_id=course.course_id
and course.dept_name="Physics";
select * from teaches where course_id='PHY-101';