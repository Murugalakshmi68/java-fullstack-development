create database db1
create table table_name1(id int,name varchar(50),city varchar(50))
insert into table_name1 values(1,'Muruga','Madurai')
select * from table_name1
insert into table_name1(id,name) values(2,'lakshmi')
insert into table_name1(city) values('madurai')
create table table_name2(id int primary key,name varchar(50),city varchar(50))
insert into table_name2 values(1,'Muruga','Madurai')
select * from table_name2
insert into table_name2(name) values('lakshmi') 


create table table_name3(id int primary key identity(1,1),
name varchar(50),city varchar(50))
insert into table_name3 values('Muruga','Madurai')
select * from table_name3
drop table table_name1
insert into table_name3 values('Jeyasri','Madurai'),
('lakshmi','chennai'),('Renu','Trichy')
select * from table_name3
alter table table_name3 alter column name varchar(100)
alter table table_name3 add mob_no bigint
alter table table_name3 drop column mob_no


create table sqlclass(sid int primary key identity(1,1),sname varchar(50),mob_no bigint,city varchar(50),age tinyint,dob date)
insert into sqlclass values('Muruga',9025247084,'Madurai',20,'2005-08-06')
insert into sqlclass values('Renu',9092358726,'Ramanadhapuram',21,'2004-10-29')
insert into sqlclass values('Amirtha',9345212303,'Thanjavur',22,'2003-08-26')
insert into sqlclass values('Remy',9342440234,'Vellore',20,'2005-06-17')
insert into sqlclass values('Janany',7200114566,'Madurai',21,'2004-09-30')
insert into sqlclass values('Varsha',9361667996,'coimbatore',20,'2005-07-03')
insert into sqlclass values('Jeyasri',9629448502,'Trichy',22,'2003-09-25')
insert into sqlclass values('lakshmi',9894642583,'Chennai',23,'2002-10-04')
insert into sqlclass values('Dhanu sri',9342348069,'Salem',19,'2006-11-11')
insert into sqlclass values('Fathima',8248610332,'Theni',20,'2005-03-26')
select * from sqlclass

update sqlclass set city='Trichy'
update sqlclass set city='Madurai' where sid=2
update sqlclass set city='vellore' where sid in (4,6,8)
update sqlclass set city='Salem' where sid between 3 and 7
select * from sqlclass
truncate table sqlclass
delete from sqlclass
delete from sqlclass where sid=14
delete from sqlclass where sid in (17,19)
delete from sqlclass where sid between 16 and 18
select * from sqlclass where sid=12
select * from sqlclass where sid in (12,20)
select * from sqlclass where sid between 12 and 20
select sname,mob_no from sqlclass
select * from sqlclass
truncate table  sqlclass
begin tran
insert into sqlclass values('Muruga',9025247084,'Madurai',20,'2005-08-06')
save tran s1
begin tran
insert into sqlclass values('Renu',9092358726,'Ramanadhapuram',21,'2004-10-29')
save tran s2
begin tran
insert into sqlclass values('Amirtha',9345212303,'Thanjavur',22,'2003-08-26')
save tran s3
begin tran
insert into sqlclass values('Remy',9342440234,'Vellore',20,'2005-06-17')
save tran s4
begin tran
insert into sqlclass values('Janany',7200114566,'Madurai',21,'2004-09-30')
save tran s5
begin tran
insert into sqlclass values('Varsha',9361667996,'coimbatore',20,'2005-07-03')
save tran s6
begin tran
insert into sqlclass values('Jeyasri',9629448502,'Trichy',22,'2003-09-25')
save tran s7
commit
begin tran
insert into sqlclass values('lakshmi',9894642583,'Chennai',23,'2002-10-04')
save tran s8
begin tran
insert into sqlclass values('Dhanu sri',9342348069,'Salem',19,'2006-11-11')
save tran s9
begin tran 
insert into sqlclass values('Fathima',8248610332,'Theni',20,'2005-03-26')
save tran s10
select * from sqlclass
begin tran rollback tran s8
begin tran rollback tran s9
begin tran rollback tran s5


create table cons(id int primary key identity(1,1),name varchar(50) not null,
mob_no bigint unique,mail varchar(50) constraint uq_mail unique,
city varchar(50) constraint df_city default 'Madurai',
age tinyint constraint ck_age check(age>18))

insert into cons values('Muruga',9087657890,'muruga123@gmail.com','Salem',20)
select * from cons
insert into cons(mob_no,mail,age,city) values(9087657890,'muruga123@gmail.com','Salem',20)
insert into cons values('Muruga',9087657867,'muruga1234@gmail.com','Salem',20)
insert into cons(name,mob_no,mail,age) values('Renu',9187657890,'muruga@gmail.com',20)
insert into cons values('Janany',9086657890,'muruga12356@gmail.com','Salem',17)
alter table cons drop constraint [ck_age],[df_city],[uq_mail],[UQ__cons__B673ACFFE7FD0E7D]
alter table cons add constraint uq_mob_no unique(mob_no)
alter table cons add constraint df_city default 'Trichy' for city
alter table cons alter column name varchar(50) not null
alter table cons add constraint ck_age check(age>18)
alter table cons alter column name varchar(100)

create table student(sid int primary key identity(1,1),sname varchar(50) not null,sage tinyint,
smob_no bigint,scity varchar(50))
insert into student values('Muruga',20,9025247084,'Madurai')
insert into student values('Renu',21,9092358726,'Ramanadhapuram')
insert into student values('Amirtha',22,9345212303,'Thanjavur')
insert into student values('Remy',20,9342440234,'Vellore')
insert into student values('Janany',21,7200114566,'Madurai')
insert into student values('Varsha',20,9361667996,'coimbatore')
insert into student values('Jeyasri',22,9629448502,'Trichy')
insert into student values('lakshmi',23,9894642583,'Chennai')
insert into student values('Dhanu sri',19,9342348069,'Salem')
insert into student values('Fathima',20,8248610332,'Theni')
insert into student values('Bala',22,9678904532,'Tenkasi')
insert into student values('Kaviya',18,9134567284,'Madurai')
insert into student values('Vansika',21,9843892319,'Ramanadhapuram')
insert into student values('Kishore',18,8907654323,'salem')
insert into student values('Anushma',22,8735426792,'Thanjavur')
insert into student values('Bharath',21,9945637823,'Chennai')
insert into student values('Thrisha',19,9145874289,'Vellore')
insert into student values('Rubasri',19,7200114566,'Madurai')
insert into student values('Nirmal',20,8976564367,'Trichy')
insert into student values('Anandhi',21,9867542621,'Chennai')
insert into student values('Vanitha',21,9378547996,'coimbatore')
insert into student values('Priya',20,9667854302,'Trichy')
insert into student values('karthik',21,8789096543,'Tenkasi')
insert into student values('Anitha',21,8645367898,'Madurai')
insert into student values('Monika',20,9867452383,'Chennai')
insert into student values('Anshika',18,9176456378,'Madurai')
insert into student values('Surya',20,9134567867,'vellore')
insert into student values('Yalini',19,9343487909,'Salem')
insert into student values('Madhu',20,8248678932,'Theni')
insert into student values('Yuvasri',19,8756435634,'Thanjavur')
select * from student

create table department(did int primary key identity(101,1),dname varchar(50) not null)
insert into department values('CSE')
insert into department values('ECE')
insert into department values('AI and ML')
insert into department values('Agri')
insert into department values('EEE')
insert into department values('Aerospace')
insert into department values('AI and DS')
insert into department values('Mech')
insert into department values('Civil')
insert into department values('Architect')
select * from department

create table fees(fid int primary key identity(201,1),famount int)
insert into fees values(50000)
insert into fees values(100000)
insert into fees values(65000)
insert into fees values(80000)
insert into fees values(75000)
insert into fees values(55000)
insert into fees values(67000)
insert into fees values(93000)
insert into fees values(30000)
insert into fees values(45000)
select  * from fees

alter table student add did int constraint fk_dept foreign key 
references department(did)
select * from student
update student set did=102 where sid in (2,4,6,8)
update student set did=104 where sid in (3,5,7,9)
update student set did=106 where sid in (12,14,16,18)
update student set did=108 where sid in (10,15,20,25)
update student set did=110 where sid in (23,27,29,30)
alter table department add fid int constraint fk_fees foreign key
references fees(fid)
select * from department
update department set fid=201 where did=101
update department set fid=202 where did=102
update department set fid=203 where did=103
update department set fid=205 where did=105
update department set fid=206 where did=106
update department set fid=207 where did=107
update department set fid=208 where did=108
update department set fid=209 where did in (109,110)

select * from student inner join department on department.did=
student.did
select student.sname,department.dname from student inner join 
department on department.did=student.did
select s.sname,d.dname from student s inner join 
department d on d.did=s.did 
select s.sname,d.dname from student s left join 
department d on d.did=s.did 
select s.sname,d.dname from student s right join 
department d on d.did=s.did 
select s.sname,d.dname from student s full join 
department d on d.did=s.did 
select s.sname,d.dname from student s cross join 
department d 
select s.sname,d.did from student s inner join 
student d on d.did=s.did

select s.sname,d.dname,f.famount from student s inner join 
department d on d.did=s.did inner join fees f on f.fid=d.fid

select * from department d inner join fees f on f.fid=d.fid

select s.sname,d.dname,f.famount from student s inner join 
department d on d.did=s.did left join fees f on f.fid=d.fid

select s.sname,d.dname,f.famount from student s inner join 
department d on d.did=s.did right join fees f on f.fid=d.fid

--set function
select sid,sname from student union select did,dname from department
select sid from student union select did from department
select sid from student union all select did from department
select sid from student intersect select did from department
select sid from student except select did from department
select did from department except select sid from student

--top clause
select top(10) * from student
select top(5) * from student

--sorting
select * from student order by sname
select * from student order by sname asc
select * from student order by sname desc
--distinct
select distinct(scity) from student

--Functions or Methods
--aggregate functions
select sum(famount) from fees 
select avg(famount) from fees 
select count(famount) from fees
select max(famount) from fees 
select min(famount) from fees

--date and time function
select Current_Timestamp
select Getdate()
select Getutcdate()
select Sysdatetime()
select Sysdatetimeoffset()
select Sysutcdatetime()
select Dateadd(year,5,Getdate())
select Datediff(year,'2005-08-06',Getdate())
select Datename(year,Getdate())
select Datepart(year,Getdate())
select Datename(month,Getdate())
select Datepart(month,Getdate())
select Datename(weekday,Getdate())
select Datepart(weekday,Getdate())
select Datepart(dayofyear,Getdate())
select Datepart(day,Getdate())
select Day(Getdate())
select Month(Getdate())
select Year(Getdate())
select isdate('2026-02-29')
select isdate('2026-02-19')

--string functions
select sname,Ascii(sname) from student
select Char(77)
select sname,Charindex('c',sname) from student
select sname,Charindex('R',sname) from student
select sname,Charindex('a',sname,4) from student
select sname,Left(sname,4) from student
select sname,Right(sname,4) from student
select sname,Substring(sname,2,5) from student
select sname,Len(sname) from student
select sname,Datalength(sname) from student
select Len('    Muruga    ')
select Datalength('    Muruga    ')
select sname,Lower(sname) from student
select sname,Upper(sname) from student
select Trim('    Muruga    ')
select Ltrim('    Muruga    ')
select Rtrim('    Muruga    ')
select sname,Quotename(sname) from student
select sname,Quotename(sname,'()') from student
select sname,Quotename(sname,'''') from student
select sname,Replace(sname,'r','a') from student
select sname,Replicate(sname,2) from student
select sname,Reverse(sname) from student
select Concat(sid,sname,smob_no,scity) from student
select Concat_Ws(',',sid,sname,smob_no,scity) from student
select Concat_Ws(' ',sid,sname,smob_no,scity) from student

--operators
--Arithmetic operators
select sid,did,(sid+did) from student
select sid,did,(sid-did) from student
select sid,did,(sid*did) from student
select sid,did,(sid/did) from student
select sid,did,(sid%did) from student
select did,sid,(did%sid) from student
--Comparison operator
select * from student where sid=3
select * from student where sid!=3
select * from student where sid<=3
select * from student where sid<3
select * from student where sid>3
select * from student where sid>=3
--logical operator
--and,or,in,between,like,not,all,any,some,exists
select * from student where sid=3 and sname='Renu'
select * from student where sid=3 and sname='Amirtha'
select * from student where sid=3 or sname='Renu'
select * from student where sid=3 or sname='Amirtha'
select * from student where sid=31 and sname='Amir'
select * from student where sid in (2,4,6,8,10)
select * from student where sid between 2 and 10
select * from student where sname like '%R%'
select * from student where sname like 'R%'
select * from student where sname like '%a'
select * from student where sname like '__R%'
select * from student where sname not like '%R%'
select * from student where sid not in (2,4,6,8,10)
select * from student where sid not between 2 and 10
--subquery
select * from student where did=all(select did from department 
where dname='CSE')
select * from student where did=all(select did from department 
where dname='ECE')
select * from student where did=all(select did from department 
where dname='CS')
select * from student where did=all(select did from department 
where dname in ('ECE','Agri'))
select * from department
select * from student where did=any(select did from department 
where dname='CSE')
select * from student where did=any(select did from department 
where dname='ECE')
select * from student where did=any(select did from department 
where dname='CS')
select * from student where did=any(select did from department 
where dname in ('ECE','Agri'))
select * from student where did=some(select did from department 
where dname='CSE')
select * from student where did=some(select did from department 
where dname='ECE')
select * from student where did=some(select did from department 
where dname='CS')
select * from student where did=some(select did from department 
where dname in ('ECE','Agri'))
select * from student where exists (select did from department 
where dname='CSE')
select * from student where exists (select did from department 
where dname='ECE')
select * from student where exists (select did from department 
where dname='CS')
select * from student where exists (select did from department 
where dname in ('ECE','Agri'))

create table student_mark(sid int primary key identity(1,1),sname varchar(50),sdept varchar(50),smark int)
insert into student_mark values('Muruga','CSE',89)
insert into student_mark values('Renu','ECE',91)
insert into student_mark values('Amirtha','EEE',85)
insert into student_mark values('Remy','Agri',80)
insert into student_mark values('Janany','CSE',95)
insert into student_mark values('Varsha','Agri',78)
insert into student_mark values('Jeyasri','CSE',74)
insert into student_mark values('lakshmi','EEE',63)
insert into student_mark values('Dhanu sri','ECE',91)
insert into student_mark values('Fathima','ECE',85)
insert into student_mark values('Bala','CSE',95)
insert into student_mark values('Kaviya','EEE',85)
insert into student_mark values('Vansika','Agri',65)
insert into student_mark values('Kishore','Mech',73)
insert into student_mark values('Anushma','EEE',28)
insert into student_mark values('Bharath','Mech',80)
insert into student_mark values('Thrisha','Agri',79)
insert into student_mark values('Rubasri','ECE',65)
insert into student_mark values('Nirmal','Mech',30)
insert into student_mark values('Anandhi','EEE',95)
insert into student_mark values('Vanitha','ECE',81)
insert into student_mark values('Priya','ECE',85)
insert into student_mark values('karthik','Mech',29)
insert into student_mark values('Anitha','CSE',85)
insert into student_mark values('Monika','EEE',55)
insert into student_mark values('Anshika','ECE',79)
insert into student_mark values('Surya','Mech',68)
insert into student_mark values('Yalini','Agri',77)
insert into student_mark values('Madhu','CSE',82)
insert into student_mark values('Yuvasri','ECE',62)
select * from student_mark
--ranking function
--row_number(),rank(),dense_rank(),ntile()
select *,row_number() over(order by smark desc) from student_mark
select *,row_number() over(partition by smark order by smark desc) 
from student_mark
select *,row_number() over(partition by sdept order by smark desc) 
from student_mark
select *,rank() over(order by smark desc) from student_mark
select *,dense_rank() over(order by smark desc) from student_mark
select *,ntile(5) over(order by smark desc) from student_mark
select *,ntile(7) over(order by smark desc) from student_mark

--common table expression(CTE)
with new as (select *,rank() over (order by smark desc) as result
from student_mark) select result,count(sid) from new group by result

--table variable
declare @a int set @a=10
declare @table1 table(id int,name varchar(50),mob_no bigint)
insert into @table1 values(1,'Muruga',3456789087)
insert into @table1 values(2,'Renu',9086789087)
insert into @table1 values(3,'Janany',9989789087)
insert into @table1 values(4,'Varsha',5676789087) 
select * from @table1 
update @table1 set name='Vansika' where name='Varsha'
select * from @table1 

--temp table
--1)local temp table 
create table #table_1(id int,name varchar(50),city varchar(50))
insert into #table_1 values(1,'Muruga','Madurai')
insert into #table_1 values(2,'Renu','Trichy')
select * from #table_1
--2)global temp table
create table ##table_1(id int,name varchar(50),city varchar(50))
insert into ##table_1 values(1,'Muruga','Madurai')
insert into ##table_1 values(2,'Renu','Trichy')
select * from ##table_1

--Error Handling
--1) Compile time Error 2) Runtime Error
begin try
select 1/0
end try
begin catch
select ERROR_NUMBER(),ERROR_SEVERITY(),ERROR_STATE(),ERROR_LINE(),
ERROR_MESSAGE(),ERROR_PROCEDURE()
end catch

--Condition Statement
--1)Single Condition(if,else) 
declare @age tinyint 
set @age=(select sage from student where sid=1)
if(@age>18)
select('you are eligible for vote')
else
select('you are not eligible for vote')
select * from student

--2)Multiple Condition(if,else if,else)
declare @mark int
set @mark=(select smark from student_mark where sid=1)
if(@mark>=90 and @mark<=100)
select('A+')
else if(@mark>=80 and @mark<90)
select('A')
else if(@mark>=70 and @mark<80)
select('B')
else if(@mark>=50 and @mark<70)
select('C')
else if(@mark>=40 and @mark<50)
select('D')
else if(@mark<40)
select('Fail')
else
select('Please check your mark')

--3)case statement
select *,case when smark>=90 and smark<=100 then 'A+'
when smark>=80 and smark<90 then 'A' 
when smark>=70 and smark<80 then 'B'
when smark>=50 and smark<70 then 'C'
when smark>=40 and smark<50 then 'D' 
when smark<40 then 'Fail' else 'please check your mark' 
end from student_mark

--looping statement
declare @a int
set @a=10
while(@a>=1)
begin 
select @a
set @a=@a-1
end

--cursor
--static
declare @id int
declare @name varchar(50)
declare @dept varchar(50)
declare @mark int
declare c1 cursor static 
for select sid,sname,sdept,smark from student_mark
open c1
fetch first from c1 into @id,@name,@dept,@mark
while @@FETCH_STATUS=0
begin
select @id,@name,@dept,@mark
fetch next from c1 into @id,@name,@dept,@mark
end
close c1
deallocate c1

--forward_only or fast_forward
declare @id int
declare @name varchar(50)
declare @dept varchar(50)
declare @mark int
declare c1 cursor fast_forward 
for select sid,sname,sdept,smark from student_mark
open c1
fetch next from c1 into @id,@name,@dept,@mark
while @@FETCH_STATUS=0
begin
select @id,@name,@dept,@mark
fetch next from c1 into @id,@name,@dept,@mark
end
close c1
deallocate c1

--dynamic
declare @id int
declare @name varchar(50)
declare @dept varchar(50)
declare @mark int
declare c1 cursor dynamic
for select sid,sname,sdept,smark from student_mark where sid=10
open c1
fetch first from c1 into @id,@name,@dept,@mark
while @@FETCH_STATUS=0
begin
select @id,@name,@dept,@mark
fetch first from c1 into @id,@name,@dept,@mark
update student_mark set sname='Janany' where current of c1
end
close c1
deallocate c1

--print start_date to end_date
declare @start_date date 
set @start_date = '2026-02-01'
declare @end_date date
set @end_date = '2026-03-10'
while (@start_date <= @end_date)
begin
    select @start_date
    set @start_date = Dateadd(day,1,@start_date)
end

--UDF-user defined function
--1)scalar valued function 
--static funtion(Empty parameter function)
alter function func1() 
returns varchar(50)
as begin
return (select sname from student_mark where sid=1)
end    
select dbo.func1()
--dynamic funtion-parameter function
create function func2(@id int) 
returns varchar(50)
as begin
return (select sname from student_mark where sid=@id)
end    
select dbo.func2(2)

--2)Inline table valued function
create function inlinef1(@id int,@id1 int,@id2 int,@id3 int)
returns table
as
return select * from student_mark where sid in (@id,@id1,@id2,@id3)
 select * from inlinef1(2,4,6,8) 

--3)multi-table valued function
create function multitable_f1(@id int,@id1 int)
returns @table1 table(sid int,sname varchar(50),sdept varchar(50),
smark int,result varchar(50))
as begin
insert into @table1(sid,sname,sdept,smark) 
select sid,sname,sdept,smark from student_mark where sid between @id and @id1
return 
end
select * from multitable_f1(2,8)
alter function multitable_f1(@id int,@id1 int)
returns @table1 table(sid int,sname varchar(50),sdept varchar(50),
smark int,result varchar(50))
as begin
insert into @table1(sid,sname,sdept,smark) 
select sid,sname,sdept,smark from student_mark where sid between @id and @id1
update @table1 set result='Pass' 
return 
end
select * from multitable_f1(2,8)

--scalar function return multiple values
alter function func1() 
returns varchar(50)
as begin
return (select concat_ws(',',sname,sdept,smark) from student_mark where sid=1)
end    
select dbo.func1()

--view
--1)simple view 
alter view v1 
as 
select sname as Result1,smark as Result2 from student_mark 
select * from v1

--2)complex view
alter view v2 with encryption
as 
select student.sname as Name,department.dname as Dept from student 
inner join department on department.did=student.did
select * from v2
--Execute query
exec sp_helptext v2
--schema binding
alter view v2 with encryption,schemabinding
as 
select student.sname as Name,department.dname as Dept from dbo.student 
inner join dbo.department on department.did=student.did
select * from v2
drop table department

--trigger
--1)DDL 
create trigger trig_1 on database 
for
create_table,alter_table,drop_table
as
print 'you are not able to create,alter and drop tables in this db'
rollback
create table stud(id int,name varchar(50))
--2)DML
create table trig(sid int,sname varchar(50),sdept varchar(50),smark int,msg varchar(50),ins_date datetime)
--insert trigger(after insert)
create trigger ins_trig on student_mark
after insert
as begin
insert into trig 
select sid,sname,sdept,smark,'order booked',Getdate() from inserted
end
insert into student_mark values('Renuga','CSE',95)
select * from trig
--instead of insert
alter trigger ins_trig on student_mark
instead of insert
as begin
insert into trig 
select sid,sname,sdept,smark,'order booked',Getdate() from inserted
end
insert into student_mark values('varshini','ECE',85)
select * from trig
select * from student_mark
--update trigger
alter trigger update_trig on student_mark
instead of update
as begin
insert into trig 
select sid,sname,sdept,smark,'order booked',Getdate() from inserted
end
update student_mark set sname='Gayathri' where sid=10
select * from trig
--delete trigger(after delete)
alter trigger delete_trig on student_mark
after delete
as begin
insert into trig 
select sid,sname,sdept,smark,'order booked',Getdate() from deleted
end
delete from student_mark where sid=31
select * from trig
select * from student_mark
--instead of delete
alter trigger delete_trig on student_mark
instead of delete
as begin
insert into trig 
select sid,sname,sdept,smark,'order booked',Getdate() from deleted
end
delete from student_mark where sid=30
select * from trig
select * from student_mark

--stored procedure(sp)
--insert procedure
create procedure ins_pro1 
@sname varchar(50),@sdept varchar(50),@smark int
as begin
insert into student_mark values(@sname,@sdept,@smark)
select * from student_mark
end
exec ins_pro1 @sname='Rahini',@sdept='EEE',@smark=82

--update procedure
create procedure upd_pro1 
@sname varchar(50),@sid int
as begin
update student_mark set sname=@sname where sid=@sid
select * from student_mark where sid=@sid
end
exec upd_pro1 @sname='Ramya',@sid=32

--delete procedure
create procedure del_pro1 
@sid int
as begin
delete from student_mark where sid=@sid
select * from student_mark
end
exec del_pro1 @sid=32

--backup
 





































































































































