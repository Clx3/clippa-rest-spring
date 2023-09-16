CREATE SCHEMA IF NOT EXISTS clippa
    AUTHORIZATION postgres;

SET search_path TO clippa;

CREATE TABLE IF NOT EXISTS user_account(
    id BIGSERIAL PRIMARY KEY
);

ALTER TABLE user_account
ADD COLUMN IF NOT EXISTS email VARCHAR(300) NOT NULL UNIQUE,
ADD COLUMN IF NOT EXISTS username VARCHAR(30) UNIQUE;
