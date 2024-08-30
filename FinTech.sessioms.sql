
----- CREATE TABLE FOR TRANSACTION =======
CREATE TABLE transactions (
    transaction_id SERIAL PRIMARY KEY,         -- Unique identifier for each transaction
    account_id INTEGER NOT NULL,
    account_type INTEGER NOT NULL,
    client_id INTEGER NOT NULL,                  
    transaction_type VARCHAR(50) NOT NULL,     -- Type of transaction (e.g., deposit, withdrawal, transfer)
    amount DECIMAL(10, 2) NOT NULL,            -- The amount of money involved in the transaction
    currency VARCHAR(10) DEFAULT 'Peso',        -- Currency of the transaction
    status VARCHAR(50) DEFAULT 'pending',      -- Status of the transaction (e.g., pending, completed, failed)
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP-- Timestamp of when the transaction was created
);

------ INSERT DATA INTO TABLE TRANSACTION ------

INSERT INTO transactions (user_id, account_id, transaction_type, amount, currency, status, description)
VALUES (1, 101, 'deposit', 500.00, 'USD', 'completed', 'Initial deposit');


------------------------------
CREATE SEQUENCE custom_seq
START WITH 0
INCREMENT BY 1
NO MINVALUE
NO MAXVALUE
CACHE 1;

--

CREATE TABLE your_table (
    transaction_id VARCHAR(11) PRIMARY KEY DEFAULT ('880-' || LPAD(nextval('custom_seq')::text, 6, '0')),         -- Unique identifier for each transaction
    account_id INTEGER NOT NULL,
    account_type INTEGER NOT NULL,
    client_id INTEGER NOT NULL,                  
    transaction_type VARCHAR(50) NOT NULL,     -- Type of transaction (e.g., deposit, withdrawal, transfer)
    amount DECIMAL(10, 2) NOT NULL,            -- The amount of money involved in the transaction
    currency VARCHAR(10) DEFAULT 'Peso',        -- Currency of the transaction
    status VARCHAR(50) DEFAULT 'pending',      -- Status of the transaction (e.g., pending, completed, failed)
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

--

INSERT INTO your_table (account_id, account_type, client_id, transaction_type, amount, currency, status)
VALUES
    (123456, 1, 78910, 'deposit', 1500.00, 'Peso', 'completed'),
    (123457, 2, 78911, 'withdrawal', 500.00, 'Peso', 'pending'),
    (123458, 1, 78912, 'transfer', 2000.00, 'Peso', 'completed');
