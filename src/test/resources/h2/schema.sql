DROP TABLE IF EXISTS `onetablesystem`;

CREATE TABLE IF NOT EXISTS `onetablesystem`
(
    `id`         integer PRIMARY KEY,
    `row`        integer not null,
    `column`     VARCHAR(256) not null ,
    `value`      text,
    `tag`        VARCHAR(256) not null
);
