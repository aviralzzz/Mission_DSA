# Write your MySQL query statement below
Select Employee.name,
Bonus.bonus
from Employee 
left join bonus
on Employee.empId=Bonus.empId
where (bonus<1000 || bonus is null) ;