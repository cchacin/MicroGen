create table todos
(
    id          serial                   not null,
    title       varchar(255)             not null,
    status      varchar(20)              not null,
    created_on timestamp with time zone not null default current_timestamp,
    done_at timestamp with time zone,
    primary key (id)
);