-- Last updated: 7/26/2026, 10:52:34 PM
# Write your MySQL query statement below
select employeeUNI.unique_id as unique_id , employees.name as name from employees 
left join employeeUNI on employees.id=employeeUNI.id ;