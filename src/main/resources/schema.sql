SET search_path TO clippa;

CREATE TABLE IF NOT EXISTS userAccount(
    id SERIAL PRIMARY KEY,
    username VARCHAR(25)
);