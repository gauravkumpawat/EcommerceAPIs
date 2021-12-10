CREATE TABLE ITEM (ID Number, itemname varchar2(20));
create table deals(id number primary key, itemid number, expTime date, price number, numberofitems number);

insert into item(id, itemname) values (1, 'ITEM1');
insert into item(id, itemname) values(2, 'item2');

insert into deals values(10, 1, TO_DATE('01/01/2022', 'DD/MM/YYYY'), 1000, 100);
insert into deals values (11, 2, TO_DATE('02/01/2022', 'DD/MM/YYYY'), 50, 500);
