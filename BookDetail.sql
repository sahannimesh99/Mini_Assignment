Create database BookDetail;
use BookDetail;
create table Book(
    isbn varchar (20) NOT NULL,
    b_name varchar (20) NOT NULL,
    author varchar (20) NOT NULL,
    category varchar (20) NOT NULL,
    primary key (isbn)
)engine=innodb;

create table Book(
    isbn varchar (20) NOT NULL,
    b_name varchar (20) NOT NULL,
    author varchar (20) NOT NULL,
    category varchar (20) NOT NULL,
    page varchar (20) NOT NULL,
    primary key (isbn)
)engine=innodb;

-- db dump on 2022-01-11 20.06 by Sahan Nimesha