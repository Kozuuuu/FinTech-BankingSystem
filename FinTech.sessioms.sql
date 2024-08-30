=========================================
CREATE SEQUENCE customer_account_id_seq
START WITH 1
INCREMENT BY 1
MINVALUE 1
MAXVALUE 9999999999
CACHE 1;
--------------------------------------------------------------------
CREATE TABLE if not exists customers (
    customer_id VARCHAR(20)PRIMARY KEY DEFAULT ('110-' || LPAD(nextval('customer_account_id_seq')::text, 8, '0')),      
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

==========================================

CREATE TABLE customer_account(
    account_id VARCHAR(20) PRIMARY KEY DEFAULT ('220-' || LPAD(nextval('customer_account_id_seq')::text, 8, '0')),
    client_id VARCHAR(20) NOT NULL,
    account_type VARCHAR(10) NOT NULL,      
    balance DECIMAL(1000, 2) NOT NULL,
    currency VARCHAR(10) DEFAULT 'Peso',
    status VARCHAR(10) DEFAULT 'Active',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO customer_account (client_id, account_type, balance)
VALUES 
('110-00000001', 'Savings', 10000.50),
('110-00000002', 'Checking', 1500.75),
('110-00000003', 'Savings', 5000000.00);

=========================================
CREATE TABLE transactions(
    transaction_id VARCHAR(20) PRIMARY KEY DEFAULT ('777-' || LPAD(nextval('customer_account_id_seq')::text, 8, '0')),
    account_id VARCHAR(20) NOT NULL, 
    transaction_type VARCHAR(10) NOT NULL,      
    amount DECIMAL(1000, 2) NOT NULL,
    currency VARCHAR(10) DEFAULT 'Peso',
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO transactions (account_id, transaction_type, amount)
VALUES 
(
  (SELECT account_id FROM customer_account WHERE client_id = '110-00000001'),
  'Deposit', 1000.00
),
(
  (SELECT account_id FROM customer_account WHERE client_id = '110-00000002'),
  'Withdrawal', 200.00
),
(
  (SELECT account_id FROM customer_account WHERE client_id = '110-00000003'),
  'Transfer', 500.00
);

=========================================
CREATE TABLE loan(
    loan_id VARCHAR(20) PRIMARY KEY DEFAULT ('660-' || LPAD(nextval('customer_account_id_seq')::text, 8, '0')),
    client_id VARCHAR(20) NOT NULL,
    loan_type VARCHAR(10) NOT NULL,
    mortage VARCHAR(50) NOT NULL,      
    amount DECIMAL(1000, 2) NOT NULL,
    interest_rate DECIMAL(10, 2) NOT NULL,
    start_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    end_date DATE,
    status VARCHAR(10) DEFAULT 'Active'
);

INSERT INTO loan (client_id, loan_type, mortage, amount, interest_rate, end_date)
VALUES 
('110-00000001', 'Home', 'House', 250000.00, 3.75, '2030-12-31'),
('110-00000002', 'Car', 'Vehicle', 30000.00, 4.50, '2028-06-15'),
('110-00000003', 'Personal', 'None', 10000.00, 5.00, '2025-09-01');

=========================================

CREATE TABLE cards(
    card_id VARCHAR(20) PRIMARY KEY DEFAULT ('333-' || LPAD(nextval('customer_account_id_seq')::text, 8, '0')),
    account_id VARCHAR(20) NOT NULL, 
    start_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    exp_date DATE,
    security_code VARCHAR(16) NOT NULL,
    status_code VARCHAR(10) DEFAULT 'Active'
);

INSERT INTO cards (account_id, exp_date, security_code)
VALUES 
(
  (SELECT account_id FROM customer_account WHERE client_id = '110-00000001'),
  '2027-12-31', '1234'
),
(
  (SELECT account_id FROM customer_account WHERE client_id = '110-00000002'),
  '2026-11-30', '5678'
),
(
  (SELECT account_id FROM customer_account WHERE client_id = '110-00000003'),
  '2028-10-15', '9101'
);
