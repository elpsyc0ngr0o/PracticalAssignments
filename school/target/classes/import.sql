create table if not exists 'Student'(
    St_ID int not null primary key ,
    St_name varchar(30),
    St_email varchar(70)
);

create table if not exists 'Teacher'(
    Tr_ID int not null primary key,
    Tr_name varchar(30),
    Tr_email varchar(70),
    Foreign key (St_ID) references Student(St_ID)
);

insert into Student (St_ID, St_name, St_email) Values (1, 'StuName', 'StuName@gmail.com')
insert into Teacher (Tr_ID, Tr_name, Tr_email, Tr_ID) Values (1, 'TeaName', 'TeaName@gmail.com', 1)