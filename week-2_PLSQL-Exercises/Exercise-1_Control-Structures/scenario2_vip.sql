-- Scenario 2: Promote to VIP
BEGIN
    FOR cust IN (SELECT customer_id FROM customers WHERE balance > 10000)
    LOOP
        UPDATE customers SET is_vip = 'TRUE'
        WHERE customer_id = cust.customer_id;
        DBMS_OUTPUT.PUT_LINE('Customer ID ' || cust.customer_id || ' promoted to VIP.');
    END LOOP;
    COMMIT;
END;
/
