-- Habilita 1.000.000 caracteres para serem exibidos pelo pacote dbms_output
set serveroutput on size 1000000;

declare

    v_client_name varchar(40) := 'Bruno';
    v_requested_burgers number(3) := 5;
    v_total_value number(7, 2) := 1000;
    v_total_discount number (7, 2) := 0;
    
begin

    if v_requested_burgers > 3 then
        v_total_discount := 10;
    else    
        v_total_discount := 0;
    end if;
    
    v_total_value := v_total_value * (1 - v_total_discount / 100);
    
    dbms_output.put_line ('The client: ' || v_client_name || ' requested: ' || v_requested_burgers || ' burguers. The total value of your order was: ' || v_total_value || ', considering the: ' || v_total_discount || '% discount.');
end;