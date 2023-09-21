create sequence savings_account_SEQ start with 1 increment by 50;
create sequence Transaction_SEQ start with 1 increment by 50;
create sequence users_SEQ start with 1 increment by 50;
create table savings_account (account_id bigint not null, balance bigint not null, user_id bigint unique, account_number varchar(255), primary key (account_id));
create table Transaction (fk_account_id bigint, time_Stamp timestamp(6), transaction_id bigint not null, transaction_amount varchar(255), transaction_type varchar(255), primary key (transaction_id));
create table users (user_id bigint not null, password varchar(255) not null, username varchar(255) not null, primary key (user_id));
alter table if exists savings_account add constraint FKqlm56kt53g7rn6bndfjfuc5kd foreign key (user_id) references users;
alter table if exists Transaction add constraint FKde9e7t0xdtwio6435i52gog8g foreign key (fk_account_id) references savings_account;
