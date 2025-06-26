-- Create customers table
CREATE TABLE customers (
    customer_id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    age NUMBER,
    balance NUMBER,
    is_vip VARCHAR2(5) DEFAULT 'FALSE'
);

-- Sample data for customers table
BEGIN
    INSERT INTO customers (customer_id, name, age, balance) VALUES (1, 'John Doe', 65, 12000);
    INSERT INTO customers (customer_id, name, age, balance) VALUES (2, 'Jane Smith', 45, 8000);
    INSERT INTO customers (customer_id, name, age, balance) VALUES (3, 'Alice Johnson', 70, 15000);
    INSERT INTO customers (customer_id, name, age, balance) VALUES (4, 'Bob Lee', 30, 5000);
    INSERT INTO customers (customer_id, name, age, balance) VALUES (5, 'Chris Evans', 68, 10500);
    INSERT INTO customers (customer_id, name, age, balance) VALUES (6, 'Diana Prince', 59, 11000);
    INSERT INTO customers (customer_id, name, age, balance) VALUES (7, 'Clark Kent', 62, 2000);
    COMMIT;
END;
/

-- Create loans table
CREATE TABLE loans (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    interest_rate NUMBER(5,2),
    due_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

-- Sample data for loans table
BEGIN
    INSERT INTO loans (loan_id, customer_id, interest_rate, due_date) VALUES (101, 1, 7.5, SYSDATE + 10);
    INSERT INTO loans (loan_id, customer_id, interest_rate, due_date) VALUES (102, 2, 8.5, SYSDATE + 45);
    INSERT INTO loans (loan_id, customer_id, interest_rate, due_date) VALUES (103, 3, 9.0, SYSDATE + 5);
    INSERT INTO loans (loan_id, customer_id, interest_rate, due_date) VALUES (104, 4, 8.0, SYSDATE + 60);
    INSERT INTO loans (loan_id, customer_id, interest_rate, due_date) VALUES (105, 5, 7.2, SYSDATE + 15);
    INSERT INTO loans (loan_id, customer_id, interest_rate, due_date) VALUES (106, 6, 8.8, SYSDATE + 20);
    INSERT INTO loans (loan_id, customer_id, interest_rate, due_date) VALUES (107, 7, 9.1, SYSDATE + 3);
    COMMIT;
END;
/