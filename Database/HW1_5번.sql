-- HW1
-- 5번 (실행 시 결과 x)
select distinct instructor.name from instructor,teaches,section
where instructor.id=teaches.id
and teaches.course_id=section.course_id and teaches.sec_id=section.sec_id and teaches.semester=section.semester and teaches.year=section.year
and section.year=2022 and section.building="Smith Hall"
-- 5번 점검용
select distinct name, section.year, building from instructor,teaches,section
where instructor.id=teaches.id
and teaches.course_id=section.course_id and teaches.sec_id=section.sec_id and teaches.semester=section.semester and teaches.year=section.year
and section.year=2018 and section.building="Packard"