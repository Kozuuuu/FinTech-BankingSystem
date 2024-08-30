=========================================
CREATE SEQUENCE customer_seq
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9999999999
CACHE 1;
---------------------------

CREATE TABLE if not exists customers (
    customer_id VARCHAR(20)PRIMARY KEY DEFAULT ('110-' || LPAD(nextval('customer_seq')::text, 8, '0')),      
    last_name VARCHAR(100) NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    gender VARCHAR(5) NOT NULL,
    street VARCHAR(30),
    city VARCHAR(100) NOT NULL,
    region VARCHAR(30) NOT NULL,
    country VARCHAR(100) NOT NULL,
    zip_code VARCHAR(10) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    approved_by INTEGER NOT NULL
);

INSERT INTO customers (last_name, first_name, email, phone, gender, street, city, region, country, zip_code, approved_by)
VALUES 
('Smith', 'John', 'john.smith@example.com', '123-456-7890', 'M', 'Arazo Street', 'Gingoog', 'Misamis Oriental', 'Philippines', '9014', 1),
('Doe', 'Jane', 'jane.doe@example.com', '234-567-8901', 'F', 'Gomez Street', 'Los Angeles', 'California', 'USA', '90001', 2),
('Brown', 'Michael', 'michael.brown@example.com', '345-678-9012', 'M', 'Balagulan Street', 'Makati', 'Metro Manila', 'Philippines', '1017  ', 3);
