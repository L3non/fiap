--
-- source code available for the file cap_1_script_5.sql
--
set serveroutput on;

DECLARE
		
		-- PL/SQL table type to store store IDs
		TYPE tb_nr_store IS TABLE OF NUMBER;
		TYPE tb_nr_stock IS TABLE OF NUMBER INDEX BY BINARY_INTEGER;

		-- Variables to store store IDs and inventory
		v_nr_store tb_nr_store;
		v_am_stock tb_nr_stock;

		-- Amount of ingredients to be added (simulating the update)
		v_am_ingredients NUMBER := 100;

		-- Local procedure to update inventory
		PROCEDURE prc_update_stock_store(p_v_nr_store IN tb_nr_store, p_v_am_ingredients IN NUMBER) IS

		BEGIN

			FOR i IN p_v_nr_store.FIRST .. p_v_nr_store.LAST LOOP
				v_am_stock(p_v_nr_store(i)) := v_am_stock(p_v_nr_store(i)) + p_v_am_ingredients;
				DBMS_OUTPUT.PUT_LINE('Updated inventory for store ID: ' || p_v_nr_store(i) || ' - New stock: ' || v_am_stock(p_v_nr_store(i)));
			END LOOP;

		END prc_update_stock_store;

BEGIN

		-- Simulation of store IDs and initial inventory
		v_nr_store := tb_nr_store(1, 2, 3, 4, 5); -- Simulating 5 stores with IDs 1 to 5
		v_am_stock(1) := 50;
		v_am_stock(2) := 60;
		v_am_stock(3) := 70;
		v_am_stock(4) := 80;
		v_am_stock(5) := 90;

		prc_update_stock_store(v_nr_store, v_am_ingredients);

END;
