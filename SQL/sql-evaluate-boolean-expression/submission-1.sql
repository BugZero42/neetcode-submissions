-- Write your query below
select 
e.left_operand,
e.operator,
e.right_operand,
case
    when lv.value > rv.value and e.operator = '>' then true
    when lv.value < rv.value and e.operator = '<' then true
    when lv.value = rv.value and e.operator = '=' then true
    else false
end as value
from expressions e 
join variables lv on e.left_operand = lv.name
join variables rv on e.right_operand = rv.name;
                
