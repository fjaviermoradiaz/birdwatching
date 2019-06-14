

create table bird
(
  id bigint auto_increment,
  name varchar(255) not null unique ,
  size varchar(5) not null,
  photo varchar(255) not null,
  colour varchar(255) not null,

  primary key(id)
);

create table reserve
(
   id bigint auto_increment,
   name varchar(255) not null unique,
   region varchar(255) not null,
   primary key(id),
);

create table bird_reserve
(
   id bigint auto_increment,
   bird_id bigint not null,
   reserve_id bigint not null,
   visit_date date not null,
   percentage double not null,
   primary key(id),
   foreign key (bird_id) references bird(id),
   foreign key (reserve_id) references reserve(id)
)