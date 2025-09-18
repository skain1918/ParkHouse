CREATE TABLE IF NOT EXISTS customer(
    id INT NOT NULL,
    email VARCHAR(30) UNIQUE NOT NULL,
    password VARCHAR(30) NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    address VARCHAR(255) NOT NULL,
    company_name VARCHAR(40),
    CONSTRAINT pk_customer PRIMARY KEY (id)
);

    CREATE TABLE IF NOT EXISTS place(
    id INT NOT NULL,
    name VARCHAR(20) UNIQUE NOT NULL,
    price NUMERIC(10,2) NOT NULL,
    description VARCHAR(255) NOT NULL,
    CONSTRAINT pk_place PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS reservation(
    id INT NOT NULL,
    customer_id INT NOT NULL,
    place_id INT NOT NULL,
    start_time TIMESTAMP NOT NULL,
    end_time TIMESTAMP NOT NULL,
    CONSTRAINT pk_reservation PRIMARY KEY (id),
    CONSTRAINT fk_customer FOREIGN KEY (customer_id) REFERENCES customer(id),
    CONSTRAINT fk_place FOREIGN KEY (place_id) REFERENCES place(id)
);