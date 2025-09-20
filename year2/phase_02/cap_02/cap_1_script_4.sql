--
-- source code available for the file cap_1_script_4.sql
--

set serveroutput on;

DECLARE

    v_nr_week_day number(2);

BEGIN
	
	select 	to_number( to_char(sysdate, 'D') )
	into 	v_nr_week_day
	from	dual;
	
	if v_nr_week_day = 1 then
		dbms_output.put_line('It''s a Sunday');
	elsif v_nr_week_day = 7 then
		dbms_output.put_line('It''s a Saturday');
	else
		dbms_output.put_line('It''s not a Saturday or Sunday');
	end if;
	
END;
