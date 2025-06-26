CREATE OR REPLACE PROCEDURE TransferFunds (
  from_acc IN accounts.account_id%TYPE, to_acc IN accounts.account_id%TYPE,
  amount IN NUMBER
) AS
  insufficient_balance EXCEPTION;
BEGIN
  DECLARE
    src_balance NUMBER;
  BEGIN
    SELECT balance INTO src_balance FROM accounts
    WHERE account_id = from_acc
    FOR UPDATE;
    IF src_balance < amount THEN
      RAISE insufficient_balance;
    ELSE
      UPDATE accounts
      SET balance = balance - amount
      WHERE account_id = from_acc;
      UPDATE accounts
      SET balance = balance + amount
      WHERE account_id = to_acc;
      COMMIT;
    END IF;
  END;
EXCEPTION
  WHEN insufficient_balance THEN
    DBMS_OUTPUT.PUT_LINE('Error: Insufficient balance in source account.');
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Error: One or both account IDs not found.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
BEGIN
  TransferFunds(101, 103, 2000);
END;
/
SELECT * FROM accounts
WHERE account_id IN (101, 103);