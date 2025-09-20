-- If you need to delete the table, use the command
-- DROP TABLE T_ORDER_DB;
CREATE TABLE T_ORDER_DB (NR_STORE NUMBER, NR_ORDER NUMBER, NR_CLIENT NUMBER, DT_ORDER DATE, VL_TOT_ORDER NUMBER(8,2));

INSERT INTO T_ORDER_DB VALUES (1, 10, 1, TO_DATE('11062024','DDMMYYYY'), 1000);
INSERT INTO T_ORDER_DB VALUES (1, 11, 7, TO_DATE('11062024','DDMMYYYY'), 500);

--
-- Available source code for the cap_1_script_7.sql file
-- The command below lists all orders placed on DBurger on June 11, 2024
--
set serveroutput on size 1000000;

DECLARE

    v_nr_store		number(5);
	v_nr_order 	    number;
    v_nr_client 	number(10);
	v_vl_tot_order	number(10,2);

    CURSOR cOrderDBurger IS
	SELECT 	nr_store, nr_order, nr_client, vl_tot_order
	FROM	t_order_db
	WHERE	dt_order = to_date('11062024','ddmmyyyy');
	
BEGIN

    OPEN cOrderDBurger;
	LOOP
		-- Explicit cursor opening
		FETCH cOrderDBurger INTO v_nr_store, v_nr_order, v_nr_client, v_vl_tot_order;
		dbms_output.put_line('Order number: ' || v_nr_order || ' store number: ' || v_nr_store);
		IF cOrderDBurger%NOTFOUND THEN
			EXIT;
		END IF;
	END LOOP;
	CLOSE cOrderDBurger;
    
END;