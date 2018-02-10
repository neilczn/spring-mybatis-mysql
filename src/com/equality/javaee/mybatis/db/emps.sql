--oracle

create table emps(
	eid number(5) primary key,
	ename varchar2(20),
	esal number(8,2),
	esex varchar2(2)
);

--mysql
CREATE TABLE emps(
	eid int PRIMARY KEY,
	ename VARCHAR(20),
	esal DOUBLE(8,2),
	esex VARCHAR(2)
);

