-- HW1
-- 10번
select distinct name from instructor,teaches,course
where instructor.id=teaches.id and teaches.course_id=course.course_id
and course.dept_name='Comp. Sci.'
intersect
select distinct name from instructor,teaches,course
where instructor.id=teaches.id and teaches.course_id=course.course_id
and course.dept_name='Mathematics';
-- 10번 점검
select distinct * from instructor,teaches,course
where instructor.id=teaches.id and teaches.course_id=course.course_id
and course.dept_name='Comp. Sci.';
select distinct * from instructor,teaches,course
where instructor.id=teaches.id and teaches.course_id=course.course_id
