-- Scenario 3: Send loan due reminders
BEGIN
    FOR l IN ( SELECT l.loan_id, c.name, l.due_date  FROM loans l
    JOIN customers c ON l.customer_id = c.customer_id
    WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || l.loan_id || 
                             ' for customer ' || l.name || 
                             ' is due on ' || TO_CHAR(l.due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/
