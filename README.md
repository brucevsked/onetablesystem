# onetablesystem
we can use one table design any system like news management,database,operating system etc.  
let's start design news management now.

we can save any different table data to one special table.  
So I have great idea,we can design and implement any system only use one table.  
Like news management system,database softwre,operating system etc.  
May be we can build the universe  

By bruce vsked 20221104  
vsked@163.com  

First day someone create value.  
The value is smallest object in this world.  
Second day someone create column.
Because the new column.the value has type.  
Third day add row.  
Fourth day add id.  
Fifth day add tag.  
then world has created.  

May be we can use one column save the world.  
Like turing machine.  
In this turing machine.every 5 line is a data set.  
line 1 saved id.  
line 2 saved row.  
line 3 saved column.  
line 4 saved value.  
line 5 saved tag.  
so we can read and write any data in this world.  

Maybe we can create a AI.  
----------

select r as id,
GROUP_CONCAT(case when c=2 then v end SEPARATOR '') 'name',
GROUP_CONCAT(case when c=3 then v end SEPARATOR '') 'pass',
GROUP_CONCAT(case when c=4 then v end SEPARATOR '') 'regdate' from `systemdata1` where t='b1user' group by r;

select r as id,
GROUP_CONCAT(case when c=2 then v end ) 'name',
GROUP_CONCAT(case when c=3 then v end ) 'pass',
GROUP_CONCAT(case when c=4 then v end ) 'regdate' from `systemdata1` where t='b1user' group by r;

select max(r),t from `systemdata1` group by `t`
select max(r) from `systemdata1` where t='b1user' group by `t`

select * from (
select r as id,
GROUP_CONCAT(case when c='tableId' then v end ) tid,
GROUP_CONCAT(case when c='tableColumnName' then v end ) tcn,
GROUP_CONCAT(case when c='tableColumnDataTypeId' then v end ) tcdt from `systemdata1`
where t='s5tableColumn' group by r) tba where tba.tid=1;

-- db list 
select * from (
select r as id,
GROUP_CONCAT(case when c='databaseName' then v end ) dbname from `systemdata1`
where t='s3database' group by r) dblist;

-- table list by db id
select * from (
select r as id,
GROUP_CONCAT(case when c='tableName' then v end ) tname,
GROUP_CONCAT(case when c='databaseId' then v end ) dbId from `systemdata1`
where t='s4table' group by r) tba where dbId=1;

-- column list by table name
select * from (
select r as id,
GROUP_CONCAT(case when c='tableId' then v end ) tid,
GROUP_CONCAT(case when c='tableColumnName' then v end ) tcn,
GROUP_CONCAT(case when c='tableColumnDataTypeId' then v end ) tcdt from `systemdata1`
where t='s5tableColumn' group by r) tba where tba.tid=(select ttid from (
select r as ttid,
GROUP_CONCAT(case when c='tableName' then v end ) tname,
GROUP_CONCAT(case when c='databaseId' then v end ) dbId from `systemdata1`
where t='s4table' group by r) tblist where tblist.tname='b1User');



