-- Last updated: 7/26/2026, 10:52:59 PM
# Write your MySQL query statement below
select  s.student_id ,
        s.student_name,
        sb.subject_name,
        count(e.student_id) as attended_exams from 
students s 
cross join subjects  sb
left join examinations e 
on s.student_id=e.student_id AND e.subject_name=sb.subject_name  
group by sb.subject_name ,s.student_id
order by s.student_id,s.student_name,sb.subject_name;