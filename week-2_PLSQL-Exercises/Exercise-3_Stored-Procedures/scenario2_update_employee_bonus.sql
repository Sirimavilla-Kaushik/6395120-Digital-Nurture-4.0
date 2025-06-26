CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  dept_id IN employees.department_id%TYPE, bonus_pct IN NUMBER
) AS
BEGIN
  UPDATE employees SET salary = salary + (salary * bonus_pct / 100)
  WHERE department_id = dept_id;
  COMMIT;
END;
/
BEGIN
  UpdateEmployeeBonus(10, 10);
END;
/
SELECT * FROM employees
WHERE department_id = 10;