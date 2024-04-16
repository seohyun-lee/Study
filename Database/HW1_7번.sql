-- HW1
-- 7번
select distinct course.course_id, course.title
from instructor, teaches, course
where instructor.id=teaches.id
and teaches.course_id=course.course_id
and name="Kim";
-- 7번 점검용
select distinct *
from instructor, teaches, course
where instructor.id=teaches.id
and teaches.course_id=course.course_id
and name="Kim"