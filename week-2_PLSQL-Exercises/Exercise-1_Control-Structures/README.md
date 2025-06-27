# Control Structures

    1.This project demonstrates the use of **PL/SQL procedural logic** to implement real-world banking operations.
    2.Using structured PL/SQL blocks, we automate tasks such as adjusting loan interest rates, 
      recognizing VIP customers, and issuing timely loan due date reminders.

## Project Summary
   This project simulates three such scenarios using:

   - Relational database design
   - Control structures (`FOR` loops, `IF` conditions)
   - Transactional updates
   - Dynamic message generation using `DBMS_OUTPUT`

##  Key Functionalities

  ###  1. Interest Rate Adjustment for Senior Citizens

   **Goal**: Customers aged above 60 should receive a 1% reduction on their current loan interest rate.

   **Why it matters**: This supports financial inclusivity and demonstrates how banks can implement age-based reward systems at the data layer.


  ### 2. VIP Status Assignment Based on Balance

   **Goal**: Promote customers with balances over $10,000 to VIP status.

   **Why it matters**: Recognizing and rewarding loyal or high-value customers builds trust and loyalty.   
                             This logic simulates how VIP flagging could be automated in real banking CRMs.

  ###  3. Loan Repayment Reminder System

   **Goal**: Automatically detect loans due within the next 30 days and notify customers accordingly.

   **Why it matters**: Timely reminders reduce defaults, improve repayments, and strengthen the bank-customer relationship. 
                            This use-case models real-time alert systems used in modern core banking platforms.

##  System Design Overview

  ### Tables Used

   - `customers`: Holds personal details, account balances, age, and VIP status.
   - `loans`: Stores customer-linked loans, interest rates, and repayment due dates.

  ### Logic Design

   | Component           | Description                                                                     |
   |-------------------- |---------------------------------------------------------------------------------|
   | PL/SQL Control Flow | Used to iterate over customers and loans using `FOR` loops                      |
   | Conditional Logic   | Decision-making implemented using `IF` statements                               |
   | Joins               | Used to correlate customer profiles with loan records                           |
   | Transaction Control | Data updates are wrapped in transactions (`COMMIT`) to maintain consistency     |
   | Output Logging      | Real-time result messages shown using `DBMS_OUTPUT.PUT_LINE`                    |

##  File Structure

   | File Name                           | Purpose                                                                 |
   |-------------------------------------|-------------------------------------------------------------------------|
   | `create_tables_and_sample_data.sql` | Creates `customers` and `loans` tables and inserts test data            |
   | `scenario1_discount.sql`            | Applies 1% interest discount for senior citizens (age > 60)             |
   | `scenario2_vip.sql`                 | Promotes customers to VIP if their balance exceeds $10,000              |
   | `scenario3_reminders.sql`           | Sends reminder messages for loans due in the next 30 days               |

## Technologies Used

   - **Oracle SQL / PL/SQL**
   - **Oracle Live SQL Platform** *(compatible with SQL Developer and other Oracle tools)*

## Author
    Name: Sirimavilla Kaushik
    Date: 26-06-2025
    Language Used:PL/SQL
