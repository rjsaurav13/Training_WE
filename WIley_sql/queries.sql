select
    select_list
from
    table_name
order by
    column1 [asc];

--from select order by
select
    contactLastname,
    contactFirstname
from
    customers
order by
    contactLastname desc;

select
    orderNumber,
    orderlinenumber,
    quantityOrdered * priceEach as subtotal
from
    orderdetails
order by
    subtotal desc;


    select 
    orderNumber,status
    from orders
    order by field(status,"In process" , "On hold ","cancelled","resolved","shipped");