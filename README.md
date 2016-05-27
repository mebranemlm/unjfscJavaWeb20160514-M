# unjfscJavaWeb20160514-M
Proyecto Java Web del 2016/05/14 - Madeleine

#BD Script - Oracle

drop table tbl_cliente;
commit;

create table tbl_cliente(
cliente varchar2(50) primary key not null,
clave varchar2(50),
tipo  varchar2(50),
estado int,
f_registro date);
commit;

insert into tbl_cliente values('123','123','a1',1,sysdate);
insert into tbl_cliente values('C001','123','a1',1,sysdate);
commit;
