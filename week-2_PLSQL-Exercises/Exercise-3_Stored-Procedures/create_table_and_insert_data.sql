-- Create 'accounts' table
CREATE TABLE accounts (
  account_id NUMBER PRIMARY KEY,
  customer_name VARCHAR2(100),
  account_type VARCHAR2(20),
  balance NUMBER(12, 2)
);
-- Insert into accounts
INSERT INTO accounts VALUES (101, 'Alice', 'savings', 10000);
INSERT INTO accounts VALUES (102, 'Bob', 'current', 20000);
INSERT INTO accounts VALUES (103, 'Charlie', 'savings', 15000);
INSERT INTO accounts VALUES (104, 'David', 'savings', 5000);

-- Create 'employees' table
CREATE TABLE employees (
  emp_id NUMBER PRIMARY KEY,
  emp_name VARCHAR2(100),
  department_id NUMBER,
  salary NUMBER(10, 2)
);

-- Insert into employees
INSERT INTO employees VALUES (1, 'John', 10, 50000);
INSERT INTO employees VALUES (2, 'Sarah', 20, 60000);
INSERT INTO employees VALUES (3, 'Mike', 10, 55000);
INSERT INTO employees VALUES (4, 'Linda', 30, 65000);

COMMIT;
