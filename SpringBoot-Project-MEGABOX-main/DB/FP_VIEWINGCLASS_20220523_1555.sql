--------------------------------------------------------
--  파일이 생성됨 - 월요일-5월-23-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table FP_VIEWINGCLASS
--------------------------------------------------------

  CREATE TABLE "SUZI"."FP_VIEWINGCLASS" 
   (	"NUM" NUMBER(10,0), 
	"TAGNAME" VARCHAR2(50 BYTE), 
	"HANGLE" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into SUZI.FP_VIEWINGCLASS
SET DEFINE OFF;
Insert into SUZI.FP_VIEWINGCLASS (NUM,TAGNAME,HANGLE) values (1,'age-all','전체 관람가');
Insert into SUZI.FP_VIEWINGCLASS (NUM,TAGNAME,HANGLE) values (2,'age-12','12세이상 관람가');
Insert into SUZI.FP_VIEWINGCLASS (NUM,TAGNAME,HANGLE) values (3,'age-15','15세이상 관람가');
Insert into SUZI.FP_VIEWINGCLASS (NUM,TAGNAME,HANGLE) values (4,'age-19','19세이상 관람가');
Insert into SUZI.FP_VIEWINGCLASS (NUM,TAGNAME,HANGLE) values (5,'age-no','미정');
--------------------------------------------------------
--  DDL for Index FP_AREA_JOIN_D_AREA_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SUZI"."FP_AREA_JOIN_D_AREA_PK" ON "SUZI"."FP_VIEWINGCLASS" ("NUM") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table FP_VIEWINGCLASS
--------------------------------------------------------

  ALTER TABLE "SUZI"."FP_VIEWINGCLASS" MODIFY ("TAGNAME" NOT NULL ENABLE);
  ALTER TABLE "SUZI"."FP_VIEWINGCLASS" ADD CONSTRAINT "FP_VIEWINGCLASS_PK_NUM" PRIMARY KEY ("NUM")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "SUZI"."FP_VIEWINGCLASS" MODIFY ("NUM" NOT NULL ENABLE);
