--
-- source code available in the file cap_1_script_8.sql
--
-- Enables 1,000,000 characters to be displayed by the dbms_output package
--
set serveroutput on size 1000000;

declare

	v_nr_stars number(1) := 3;	-- creates a numeric variable and assumes the value 3
	v_nm_stars varchar2(20);	-- creates a string variable with no content (null)

begin

	case when v_nr_stars = 1 then
			v_nm_stars := 'First-time customer';
		 when v_nr_stars = 2 then	
			v_nm_stars := 'Occasional customer';
		 when v_nr_stars = 3 then	
			v_nm_stars := 'Frequent customer';
		 when v_nr_stars = 4 then	
			v_nm_stars := 'Loyal customer';
		 when v_nr_stars = 5 then	
			v_nm_stars := 'VIP Client';
		else
			v_nm_stars := 'Incorrect number of stars';
	end case;
	
	dbms_output.put_line ('The customer''s stars description is: ' || v_nm_stars );
	
end;

		