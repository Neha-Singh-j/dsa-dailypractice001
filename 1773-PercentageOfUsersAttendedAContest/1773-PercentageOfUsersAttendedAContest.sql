-- Last updated: 7/26/2026, 10:51:55 PM
# Write your MySQL query statement below
select r.contest_id, Round(count(u.user_id)*100/(select count(*) from users),2) as percentage  from users u left join register r on u.user_id=r.user_id 
where r.contest_id is not null
group by r.contest_id
order by percentage Desc, r.contest_id ASC