--
-- Source code available for the cap_1_script_1.sql file
-- 
-- Enable messages via the dbms_output package
set serveroutput on; 

declare 

	v_nr_stars number(1) := 3;	    -- creates a numeric variable and assumes the value 3
	v_nm_stars varchar2(20);		-- creates a string variable with no content (null)

begin

	if v_nr_stars = 1 then
		v_nm_stars := 'First-time customer';
	elsif v_nr_stars = 2 then	
		v_nm_stars := 'Occasional customer';
	elsif v_nr_stars = 3 then	
		v_nm_stars := 'Frequent customer';
	elsif v_nr_stars = 4 then	
		v_nm_stars := 'Loyal customer';
	elsif v_nr_stars = 5 then	
		v_nm_stars := 'VIP Client';
	else
		v_nm_stars := 'Incorrect number of stars';
	end if;
	
	dbms_output.put_line ('The customer''s star description is: ' || v_nm_stars );
	
end;