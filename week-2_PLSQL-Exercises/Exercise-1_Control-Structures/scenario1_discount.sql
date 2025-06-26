-- Scenario 1: Discount for seniors
BEGIN
    FOR cust IN (SELECT c.customer_id, l.loan_id, l.interest_rate 
    FROM customers c
    JOIN loans l ON c.customer_id = l.customer_id
    WHERE c.age > 60
    )
    LOOP
        UPDATE loans SET interest_rate = interest_rate - 1 
        WHERE loan_id = cust.loan_id;
        DBMS_OUTPUT.PUT_LINE('Discount applied to Customer ID: ' || cust.customer_id || 
                             ', New Interest Rate: ' || (cust.interest_rate - 1));
    END LOOP;
    COMMIT;
END;
/
