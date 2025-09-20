-- If you need to delete the table, use the command
-- DROP TABLE T_FUNC_DB;
CREATE TABLE T_FUNC_DB (CD_FUNC NUMBER, NM_FUNC VARCHAR2(50), VL_SALARIO_BRUTO NUMBER(8,2));
INSERT INTO T_FUNC_DB VALUES (1, 'FABIO POMPOSO', 10000);
INSERT INTO T_FUNC_DB VALUES (2, 'IONE LOREN', 12000);

--
-- Source code available for the cap_1_script_6.sql file
-- The command below increases all employees' salaries by 7%
--
set serveroutput on;

BEGIN

    UPDATE T_FUNC_DB SET VL_GROSS_SALARY = VL_GROSS_SALARY * 1.07;

    IF SQL%FOUND THEN
        dbms_output.put_line('Total number of employees with updated salary: ' || SQL%ROWCOUNT);
    COMMIT;
    ELSE
        dbms_output.put_line('No employees found to update salary');
    END IF;

END;