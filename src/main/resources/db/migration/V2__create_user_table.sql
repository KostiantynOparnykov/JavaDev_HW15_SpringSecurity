CREATE TABLE IF NOT EXISTS users (
    username VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(45) NOT NULL,
    enabled BOOLEAN DEFAULT false
);
