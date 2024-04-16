-- HW1
-- 9번
select distinct name from instructor,teaches,course
where instructor.id=teaches.id and teaches.course_id=course.course_id
and salary>80000 and course.dept_name='Biology';
-- 9번 점검
select distinct * from instructor,teaches,course
where instructor.id=teaches.id and teaches.course_id=course.course_id
and salary>8000 and course.dept_name='Biology';