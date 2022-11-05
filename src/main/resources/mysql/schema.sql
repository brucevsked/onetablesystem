DROP TABLE IF EXISTS `systemdata1`;

CREATE TABLE IF NOT EXISTS `systemdata1`
(
    `id`    integer auto_increment PRIMARY KEY,
    `r`     integer not null,
    `c`     VARCHAR(256) not null ,
    `v`     text,
    `t`     VARCHAR(256) not null
);
