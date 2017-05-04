DECLARE
  meuTextoGigante CLOB := 'TESTE';
BEGIN
 -- INSERT INTO TEMP VALUES ('MAGIC VALUE hohoho',meuTextoGigante);
  Insert into ecad_stage_itg_queue (ID,SYSTEM_ID,INTEGRATION_ID,START_DATE,END_DATE,OPERATION,DATA,INS_DT,STORE_ID)
  values ('12727000','ABC','NFI',to_date('11/04/17','DD/MM/RR'),to_date('14/04/17','DD/MM/RR'),'I',meuTextoGigante,sysdate,'RB');
END;
commit;
