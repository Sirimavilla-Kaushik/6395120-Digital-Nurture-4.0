# Stored Procedure
    1.This project demonstrates the use of **PL/SQL stored procedures** to automate essential banking operations.  
    2.Using modular and parameterized procedures, we simulate real-world functionality such as interest crediting, 
    employee bonus handling, and secure fund transfers.

  ## Project Summary
   This simulation covers three banking scenarios using:
      - Relational database design
      - Stored procedures with input/output logic
      - Transactional updates
      - Data validation and exception handling

  
  ## Key Functionalities

   ### 1️⃣ Monthly Interest Crediting for Savings Accounts  
   **Goal**: Apply **1% monthly interest** to all accounts with `account_type = 'savings'`.

   > Why it matters: Simulates passive interest calculations done periodically in real-world banking core systems.


   ### 2️⃣ Department-Wise Bonus Allocation  
   **Goal**: Increase salaries of employees in a selected department by a given **bonus percentage**.

   > Why it matters: Automates bulk compensation updates and models internal HR-banking workflows.

   ### 3️⃣ Secure Fund Transfers Between Accounts  
   **Goal**: Transfer funds between two customer accounts with checks for **sufficient balance** and proper exception messages.

   > Why it matters: Captures the essential logic of safe fund movement in core banking, including validations and transaction management.


 ## System Design Overview

   ### Tables Used
   - **`accounts`**: Holds customer details, account type, and current balance
   - **`employees`**: Stores employee records including department and salary

   ### Logic Design

   | Component             | Description                                                              |
   |-----------------------|--------------------------------------------------------------------------|
   | Stored Procedures     | Encapsulated operations for reusability and better security              |
   | Input Parameters      | Used to control execution logic (like bonus %, department, transfer IDs) |
   | Conditional Logic     | Checks like `IF balance < amount THEN RAISE ERROR` in fund transfers     |
   | Transaction Control   | `COMMIT` statements ensure data consistency post-updates                 |
   | Exception Handling    | Gracefully handles invalid IDs, insufficient funds, etc.                 |



 ## File Structure

  | File Name                                | Purpose                                                             |
  |------------------------------------------|---------------------------------------------------------------------|
  | `create_table_and_insert_data.sql`       | Creates `accounts` and `employees` tables and inserts sample data   |
  | `scenario1_process_monthly_interest.sql` | Applies 1% interest to all savings accounts                         |
  | `scenario1_output.png`                   | Screenshot showing updated savings account balances                 |
  | `scenario2_update_employee_bonus.sql`    | Increases salaries based on department and given bonus %            |
  | `scenario2_output.png`                   | Screenshot showing updated employee salaries                        |
  | `scenario3_transfer_funds.sql`           | Transfers funds between two accounts with validation logic          |
  | `scenario3_output.png`                   | Screenshot showing account balances post-transfer                   |


 ## Technologies Used
  - Oracle SQL / PL/SQL  
  - Oracle Live SQL  
  - Compatible with SQL Developer, SQLcl, and any PL/SQL engine
    
 ## Author
    Name: Sirimavilla Kaushik
    Date: 27-06-2025
    Language Used:PL/SQL
  
