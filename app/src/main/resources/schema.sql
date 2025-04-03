DROP TABLE IF EXISTS urls;

CREATE TABLE urls (
    id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    created_at TIMESTAMP
);