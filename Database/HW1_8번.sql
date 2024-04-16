-- HW1
-- 8번
select distinct student.name
from student, takes, teaches, instructor
where student.id=takes.id
and instructor.id=teaches.id
and takes.course_id=teaches.course_id and takes.sec_id=teaches.sec_id
and takes.semester=teaches.semester and takes.year=teaches.year
and instructor.name="Brandt"
except
select distinct student.name
from student, takes, teaches, instructor
where student.id=takes.id
and instructor.id=teaches.id
and takes.course_id=teaches.course_id and takes.sec_id=teaches.sec_id
and takes.semester=teaches.semester and takes.year=teaches.year
and instructor.name="Einstein";

-- 8번 점검
select distinct student.name
from student, takes, teaches, instructor
where student.id=takes.id
and instructor.id=teaches.id
and takes.course_id=teaches.course_id and takes.sec_id=teaches.sec_id
and takes.semester=teaches.semester and takes.year=teaches.year
and instructor.name="Srinivasan"
except
select distinct student.name
from student, takes, teaches, instructor
where student.id=takes.id
and instructor.id=teaches.id
and takes.course_id=teaches.course_id and takes.sec_id=teaches.sec_id
and takes.semester=teaches.semester and takes.year=teaches.year
and instructor.name="Brandt";

select distinct *
from student, takes, teaches, instructor
where student.id=takes.id
and instructor.id=teaches.id
and takes.course_id=teaches.course_id and takes.sec_id=teaches.sec_id
and takes.semester=teaches.semester and takes.year=teaches.year
and instructor.name="Einstein";

select distinct *
from student, takes, teaches, instructor
where student.id=takes.id
and instructor.id=teaches.id
and takes.course_id=teaches.course_id and takes.sec_id=teaches.sec_id
and takes.semester=teaches.semester and takes.year=teaches.year