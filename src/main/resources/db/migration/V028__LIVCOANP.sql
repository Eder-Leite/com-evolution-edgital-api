-- Create table
create table LIVCOANP
(
  ncodicoanp NUMBER not null,
  ccodicoanp VARCHAR2(12) not null,
  cdesccoanp VARCHAR2(4000) not null
);
-- Add comments to the table 
comment on table LIVCOANP
  is 'Códigos ANP';
-- Add comments to the columns 
comment on column LIVCOANP.ncodicoanp
  is 'código ANP';
comment on column LIVCOANP.ccodicoanp
  is 'código literal ANP';
comment on column LIVCOANP.cdesccoanp
  is 'descrição do código ANP';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVCOANP
  add constraint PK_LIVCOANP primary key (NCODICOANP)
  using index;
  
BEGIN

DBMS_OUTPUT.PUT_LINE('LIVCOANP');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (253, '110203041', 'Nigeriano Brass Light');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (254, '110203042', 'Nigeriano Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (255, '110203043', 'Nigeriano Leve Qua Iboe');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (256, '110203044', 'Nkossa');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (257, '110203045', 'Odudu');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (258, '110203046', 'Oguendjo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (259, '110203047', 'Okan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (260, '110203048', 'Okono');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (261, '110203049', 'Oribi');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (262, '110203050', 'Palanca');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (263, '110203051', 'Pennington');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (264, '110203052', 'Rabi');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (265, '110203053', 'Ras Budran');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (266, '110203054', 'Ras Gharib');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (267, '110203055', 'Sahara Mistura');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (268, '110203056', 'Sarir');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (269, '110203057', 'Sirtica');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (270, '110203058', 'Skikda');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (271, '110203059', 'Soyo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (272, '110203060', 'Soyo 38');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (273, '110203061', 'Takula');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (274, '110203062', 'Tchatamba');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (275, '110203063', 'Ukpokiti');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (276, '110203064', 'Zaire');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (277, '110203065', 'Zafiro');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (278, '110203066', 'Zarzaitine');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (279, '110203067', 'Zeit Bay');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (280, '110203068', 'Zueitina');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (281, '110203069', 'Ea Crude');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (282, '110203070', 'Sable Crude Oil');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (283, '110203071', 'Yoho');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (284, '110203072', 'Amenan Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (285, '110203073', 'Abo 3');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (286, '110203074', 'Hungo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (287, '110203075', 'Saltpond');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (288, '110203076', 'Xicomba');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (289, '110203077', 'Bonga');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (290, '110203078', 'Mellitah');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (291, '110203079', 'Erha');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (292, '110203080', 'Kissanje');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (293, '110203081', 'Okwori');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (294, '110203082', 'Plutonio');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (295, '110203083', 'Agbami');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (296, '110203084', 'Kuito');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (297, '110203085', 'Ceiba');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (298, '110203086', 'Dalia');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (299, '110203087', 'Girassol');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (300, '110203088', 'El Sharara');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (301, '110203089', 'Mondo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (302, '110203090', 'Saxi Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (303, '110203091', 'Akpo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (304, '110203092', 'Bu Attifel');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (305, '110203093', 'Olowi');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (306, '110203094', 'Nile Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (307, '110203095', 'Etame');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (308, '110203096', 'Barrow Island');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (309, '110203097', 'Baobab');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (310, '110203098', 'Jubilee');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (311, '110203099', 'Okoro');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (312, '110203100', 'Usan Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (313, '110203101', 'Quarun');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (314, '110203102', 'Pazflor');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (315, '110203103', 'Saturno Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (316, '110203104', 'Ebome');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (317, '110204001', 'Aboozar');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (318, '110204002', 'Abu Asafah');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (319, '110204003', 'Alif');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (320, '110204004', 'Arabe Extra Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (321, '110204005', 'Arabe Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (322, '110204006', 'Arabe Medio');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (323, '110204007', 'Arabe Medio Banoco');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (324, '110204008', 'Arabe Medio Zuluf');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (325, '110204009', 'Arabe Pesado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (326, '110204010', 'Arabe Recon');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (327, '110204011', 'Arabe Super Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (328, '110204012', 'Basrah Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (329, '110204013', 'Basrah Medio');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (330, '110204014', 'Basrah Pesado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (331, '110204015', 'Burgan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (332, '110204016', 'Fao Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (333, '110204017', 'Dorood');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (334, '110204018', 'Dubai');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (335, '110204019', 'Foroozan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (336, '110204020', 'Gavarzin');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (337, '110204021', 'Iraniano Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (338, '110204022', 'Iraniano Mistura');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (339, '110204023', 'Iraniano Pesado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (340, '110204024', 'Jambur Bar Hassan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (341, '110204025', 'Kangan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (342, '110204026', 'Khafji');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (343, '110204027', 'Khafji Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (344, '110204028', 'Kirkuk');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (345, '110204029', 'Kirkuk Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (346, '110204030', 'Kuwait');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (347, '110204031', 'Lavan Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (348, '110204032', 'Marib Light');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (349, '110204033', 'Masila Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (350, '110204034', 'Murban');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (351, '110204035', 'Oman');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (352, '110204036', 'Qatar Dukhan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (353, '110204037', 'Qatar Land');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (354, '110204038', 'Qatar Marine');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (355, '110204039', 'Ratawi');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (356, '110204040', 'Rostam');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (357, '110204041', 'Rumaila');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (358, '110204042', 'Salman');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (359, '110204043', 'Sarkhoon');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (360, '110204044', 'Sirri');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (361, '110204045', 'Sorrosh');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (362, '110204046', 'Souedia');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (363, '110204047', 'Syrian Light');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (364, '110204048', 'Umm Shaif');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (365, '110204049', 'Upper Zakum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (366, '110204050', 'Zakum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (367, '110204051', 'Dsl');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (368, '110204052', 'Suedie');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (369, '110204053', 'Lower Zakum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (370, '110204054', 'Taq Taq');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (371, '110204055', 'Southern Pars');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (372, '110205001', 'Ardjuna');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (373, '110205002', 'Bekok');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (374, '110205003', 'Belida');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (375, '110205004', 'Bombay High');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (376, '110205005', 'Brunei Light');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (377, '110205006', 'Cinta');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (378, '110205007', 'Dai Hung');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (379, '110205008', 'Daquing');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (380, '110205009', 'Labuan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (381, '110205010', 'Miri Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (382, '110205011', 'Nanhai Light');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (383, '110205012', 'Pulai');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (384, '110205013', 'Shengli');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (385, '110205014', 'Sumatran Light');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (386, '110205015', 'Sumatran Heavy');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (387, '110205016', 'Taching');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (388, '110205017', 'Tapis');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (389, '110205018', 'Tiong');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (390, '110205019', 'Udang');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (391, '110205020', 'Widuri');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (392, '110205021', 'Xijiang');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (393, '110205022', 'Duri Crude Oil');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (394, '110205023', 'Bach Ho');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (395, '110205024', 'Condensado Senipah');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (396, '110205025', 'Kaji Semoga');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (397, '110205026', 'Kikeh');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (398, '110205027', 'Minas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (399, '110205028', 'Seria Light');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (400, '110205029', 'Rang Dong');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (401, '110205030', 'Ruby');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (402, '110205031', 'Chim Sao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (403, '110205032', 'Penara Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (404, '110205033', 'Oyong');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (405, '110205034', 'Champion');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (406, '110205035', 'Dulang');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (407, '110205036', 'Lalang');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (408, '110206001', 'Beatrice');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (409, '110206002', 'Beryl');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (410, '110206003', 'Black Gasoil Crude Oil');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (411, '110206004', 'Brent');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (412, '110206005', 'Ekofish');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (413, '110206006', 'Flotta');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (414, '110206007', 'Flotta Ocidental');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (415, '110206008', 'Forties');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (416, '110206009', 'Forties Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (417, '110206010', 'Gull Falks C');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (418, '110206011', 'Gull Falks');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (419, '110206012', 'Oseberg');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (420, '110206013', 'Soviet Export Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (421, '110206014', 'Statfjord Low Sulfur');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (422, '110206015', 'Statfjord');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (423, '110206016', 'Tengiz');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (424, '110206017', 'Ural');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (425, '110206018', 'Wytch Farm');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (426, '110206019', 'Azerj Light');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (427, '110206020', 'Cpc Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (428, '110206021', 'Norne Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (429, '110206022', 'Vityaz');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (430, '110206023', 'Asgard Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (431, '110206024', 'Ninian');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (432, '110206025', 'Espo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (433, '110206026', 'Zakinskaya');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (434, '110206027', 'Varandey');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (435, '110207001', 'Challis');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (436, '110207002', 'Gippsland Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (437, '110207003', 'Griffin');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (438, '110207004', 'Jabiru');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (439, '110207005', 'Laminaria');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (440, '110207006', 'Legendre');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (441, '110207007', 'North West Shelf');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (442, '110207008', 'Pluto Condensado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (443, '110207009', 'Mutineer');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (444, '110207010', 'Balnaves');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (445, '110208001', 'Mistura De Petroleos Importados');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (446, '110208002', 'Outros Petroleos Importados');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (447, '110301001', 'Mistura De Petroleos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (448, '120101001', 'Merluza');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (449, '120102001', 'Condensado Para Petroquimica');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (450, '120103001', 'Manati');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (451, '120104001', 'Condensado Camarupim');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (452, '120104002', 'Condensado Peroa');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (453, '120201001', 'Boliviano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (454, '120201002', 'Santa Rosa');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (455, '120201003', 'Terra Del Fuego');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (456, '120202001', 'Badak');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (457, '120202002', 'Carline');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (458, '120203001', 'Ar 720');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (459, '120203002', 'Argelino');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (460, '120203003', 'Oso');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (461, '120203004', 'Brega');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (462, '120203005', 'Mellitah');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (463, '120203006', 'Lion');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (464, '120203007', 'Espoir');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (465, '120203008', 'Miskar');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (466, '120204001', 'Al Khaymah');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (467, '120204002', 'Libia');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (468, '120204003', 'Margham');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (469, '120204004', 'North Field');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (470, '120204005', 'Sharjah');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (471, '120204006', 'Thamama');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (472, '120204007', 'Umm Saif');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (473, '120204008', 'Ras Gas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (474, '120204009', 'Khuff');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (475, '120204010', 'Mellitah');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (476, '120205001', 'Arum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (477, '120205002', 'Bintulu');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (478, '120205003', 'Brunei');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (479, '120205004', 'Erawan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (480, '120205005', 'Indiano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (481, '120205006', 'Pembina');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (482, '120205007', 'Terenganu');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (483, '120205008', 'Thai');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (484, '120205009', 'Condensado Senipah');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (485, '120205010', 'Anoa');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (486, '120205011', 'Malampaya');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (487, '120205012', 'Geragai');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (488, '120206001', 'Alba Field');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (489, '120206002', 'Sleipner');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (490, '120206003', 'Purovsky');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (491, '120206004', 'Snohvit');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (492, '120207001', 'Cossack');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (493, '120207002', 'Maui');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (494, '120207003', 'Bayu Undan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (495, '120207004', 'Kitan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (496, '120207005', 'Woollybutt Crude');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (497, '120207006', 'Varanus');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (498, '130101001', 'Xisto Bruto');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (499, '130201001', 'Outros Insumos Brutos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (500, '130201002', 'Etanol Anidro Insumo Para Biodiesel');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (501, '130202001', 'Gases Liquefeitos Para Reprocessamento');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (502, '130202002', 'Derivados Leves Para Reprocessamento');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (503, '130202003', 'Derivados Medios Para Reprocessamento');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (504, '130202004', 'Derivados Pesados Para Reprocessamento');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (505, '130202005', 'Gasoleo Para Reprocessamento');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (506, '130202006', 'Diluente Para Reprocessamento');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (507, '130202007', 'Residuo Para Reprocessamento');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (508, '130202008', 'Outros Produtos Para Reprocessamento');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (509, '140101001', 'Oleo De Mamona (Ricinus Communis)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (510, '140101002', 'Oleo De Palmiste');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (511, '140101003', 'Oleo De Palma/Dende (Elaeis Guineensis Ou Elaeis O');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (512, '140101004', 'Oleo De Soja (Glycine Max)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (513, '140101005', 'Oleo De Babacu (Orbinya Martiana)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (514, '140101006', 'Oleo De Colza/Canola (Bressica Campestris)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (515, '140101007', 'Oleo De Pinhao Manso');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (516, '140101008', 'Oleo De Pequi (Jatropha Curcas)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (517, '140101009', 'Oleo De Algodao (Gossypium Hirsut)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (518, '140101010', 'Oleo De Girassol (Hellanthus Annus)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (519, '140101011', 'Oleo De Nabo Forrageiro');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (520, '140101012', 'Oleo De Linhaca');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (521, '140101013', 'Oleo De Macauba');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (522, '140101014', 'Oleo De Buriti');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (523, '140101015', 'Oleo De Abacate (Persia Americana)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (524, '140101016', 'Oleo De Amendoim (Orachis Hypogeae)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (525, '140101017', 'Oleo De Andiroba (Carapa Guianersis)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (526, '140101018', 'Oleo De Coco (Cocus Numifera)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (527, '140101019', 'Oleo De Sesamo (Sesamun Indicum)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (528, '140101020', 'Sebo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (529, '140101021', 'Oleo De Fritura Usado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (530, '140101022', 'Outros Materiais Graxos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (531, '140101023', 'Gordura Bovina');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (532, '140101024', 'Gordura De Frango');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (533, '140101025', 'Gordura De Porco');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (534, '140101026', 'Acido Graxo De Oleo De Soja');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (535, '140101027', 'Acido Graxo De Oleo De Palma / Dende');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (536, '140101028', 'Oleo De Crambe');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (537, '140101029', 'Outros Acidos Graxos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (538, '140101030', 'Oleo De Milho');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (539, '140101999', 'Outros Materiais Graxos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (540, '140102001', 'Ester Metilico');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (541, '140201001', 'Cana De Acucar');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (542, '140201004', 'Outras Materias Primas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (543, '210101001', 'Gas Combustivel');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (544, '210201001', 'Propano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (545, '210201002', 'Propano Especial');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (546, '210201003', 'Propeno');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (547, '210202001', 'Butano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (548, '210202002', 'Butano Especial');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (549, '210202003', 'Butadieno');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (550, '210203001', 'Glp');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (551, '210203002', 'Glp Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (552, '210204001', 'Gas Liquefeito Intermediario');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (553, '210204002', 'Outros Gases Liquefeitos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (554, '210301001', 'Etano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (555, '210301002', 'Eteno');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (556, '210302001', 'Outros Gases');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (557, '210302002', 'Gas Intermediario');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (558, '210302003', 'Gas De Xisto');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (559, '210302004', 'Gas Acido');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (560, '220101001', 'Gas Natural Umido');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (561, '220101002', 'Gas Natural Seco');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (562, '220101003', 'Gas Natural Comprimido');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (563, '220101004', 'Gas Natural Liquefeito');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (564, '220101005', 'Gas Natural Veicular');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (565, '220101006', 'Gas Natural Veicular Padrao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (566, '220102001', 'Gasolina Natural (C5+)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (567, '220102002', 'Liquido De Gas Natural');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (568, '310101001', 'Nafta Petroquimica');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (569, '310102001', 'Nafta De Xisto');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (570, '310102002', 'Outras Naftas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (571, '310103001', 'Nafta Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (572, '320101001', 'Gasolina A Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (573, '320101002', 'Gasolina A Premium');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (574, '320101003', 'Gasolina A Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (575, '320102001', 'Gasolina C Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (576, '320102002', 'Gasolina C Aditivada');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (577, '320102003', 'Gasolina C Premium');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (578, '320102004', 'Gasolina C Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (579, '320103001', 'Gasolina Automotiva Padrao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (580, '320103002', 'Outras Gasolinas Automotivas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (581, '320201001', 'Gasolina De Aviacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (582, '320201002', 'Gasolina De Aviacao Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (583, '320301001', 'Outras Gasolinas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (584, '320301002', 'Gasolina Para Exportacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (585, '330101001', 'Aguarras Mineral');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (586, '330101002', 'Hexano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (587, '330101003', 'Diluente De Tintas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (588, '330101004', 'Solvente Para Borracha');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (589, '330101005', 'Rafinado De Pirolise');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (590, '330101006', 'Rafinado De Reforma');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (591, '330101007', 'Outros Solventes Alifaticos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (592, '330101008', 'Heptano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (593, '330101009', 'Hexeno');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (594, '330101010', 'Isopentano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (595, '330201001', 'Benzeno');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (596, '330201002', 'Tolueno');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (597, '330201003', 'Xilenos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (598, '330201004', 'Alquilbenzeno Ab9');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (599, '330201005', 'Alquilbenzeno Ab10');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (600, '330201006', 'Alquilbenzeno Ab11');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (601, '330201007', 'C9 Dihidrogenado (Ou C9 De Pirolise)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (602, '330201008', 'Solvente C9 (Ou C9 Aromatico)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (603, '330201009', 'Outros Solventes Aromaticos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (604, '330201010', 'Etilbenzeno');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (605, '340101001', 'Reformados');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (606, '340101002', 'Derivados Leves Intermediarios');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (607, '340101003', 'Outros Derivados Leves');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (608, '410101001', 'Querosene De Aviacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (609, '410101002', 'Querosene De Aviacao Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (610, '410102001', 'Querosene Iluminante');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (611, '410102002', 'Querosene Iluminante Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (612, '410103001', 'Outros Querosenes');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (613, '420101001', 'Oleo Diesel Interior (B) Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (614, '420101002', 'Oleo Diesel Interior (B) Aditivado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (615, '420101003', 'Oleo Diesel Interior Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (616, '420101004', 'Oleo Diesel Interior Comum   Enxofre 1800 Ppm');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (617, '420101005', 'Oleo Diesel Interior Aditivado   Enxofre 1800 Ppm');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (618, '420102001', 'Oleo Diesel Metropolitano (D) Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (619, '420102002', 'Oleo Diesel Metropolitano (D) Aditivado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (620, '420102003', 'Oleo Diesel Metropolitano Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (621, '420102004', 'Oleo Diesel Metropolitano Comum   Enxofre 500 Ppm');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (622, '420102005', 'Oleo Diesel Metropolitano Aditivado   Enxofre 500 Ppm');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (623, '420102006', 'Oleo Diesel S50');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (624, '420103001', 'Oleo Diesel S500 Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (625, '420103002', 'Oleo Diesel S500 Aditivado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (626, '420103003', 'Oleo Diesel S500 Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (627, '420104001', 'Oleo Diesel Automotivo Especial   Enxofre 200 Ppm');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (628, '420105001', 'Oleo Diesel A S10');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (629, '420201001', 'Oleo Diesel Maritimo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (630, '420201002', 'Oleo Diesel Maritimo Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (631, '420201003', 'Mgo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (632, '420202001', 'Oleo Diesel Nautico Especial   Enxofre 200 Ppm');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (633, '420301001', 'Oleo Diesel Padrao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (634, '420301002', 'Outros Oleos Diesel');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (635, '420301003', 'Oleo Diesel Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (636, '430101001', 'Normal Parafinas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (637, '430101002', 'Derivados Medios Intermediarios');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (638, '430101003', 'Outros Derivados Medios');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (639, '430101004', 'Oleo Comb  P/ Turbina Geradora De Energia Eletrica');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (640, '510101001', 'Oleo Combustivel A1');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (641, '510101002', 'Oleo Combustivel A2');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (642, '510101003', 'Oleo Combustivel A Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (643, '510102001', 'Oleo Combustivel B1');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (644, '510102002', 'Oleo Combustivel B2');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (645, '510102003', 'Oleo Combustivel B Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (646, '510201001', 'Oleo Combustivel Maritimo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (647, '510201002', 'Oleo Combustivel Maritimo Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (648, '510201003', 'Oleo Combustivel Maritimo Mistura (Mf)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (649, '510301001', 'Outros Oleos Combustiveis');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (650, '510301002', 'Oleos Combustiveis Para Exportacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (651, '510301003', 'Oleo Combustivel Para Geracao Eletrica');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (652, '520101001', 'Gasoleos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (653, '530101001', 'Cimentos Asfalticos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (654, '530101002', 'Asfaltos Diluidos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (655, '530101003', 'Emulsoes Asfalticas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (656, '530101018', 'Cimentos Asfalticos De Petroleo Modificados Por Polimeros Sbs');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (657, '530101019', 'Emulsoes Asfalticas Cationicas Modificadas Por Polimeros Elastomericos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (658, '530101020', 'Cimentos Asfalticos De Petroleo Modificados Por Borracha Moida De Pneus (Asfaltos Borracha)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (659, '530102001', 'Asfalto Natural');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (660, '530103001', 'Outros Asfaltos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (661, '530104001', 'Outros Insumos Para Asfaltos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (662, '540101001', 'Coque Verde');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (663, '540101002', 'Coque Calcinado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (664, '550101001', 'Residuo Aromatico (Raro)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (665, '550101002', 'Residuo Atmosferico (Rat)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (666, '550101003', 'Residuo De Vacuo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (667, '550101004', 'Residuo De Vacuo De Alto Teor De Enxogre');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (668, '550101005', 'Residuo Asfaltico(Rasf)');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (669, '560101001', 'Oleo De Xisto');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (670, '560101002', 'Derivados Pesados Intermediarios');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (671, '560101003', 'Outros Derivados Pesados');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (672, '610101001', 'Spindle');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (673, '610101002', 'Neutro Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (674, '610101003', 'Neutro Medio');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (675, '610101004', 'Neutro Pesado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (676, '610101005', 'Cilindro I');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (677, '610101006', 'Cilindro Ii');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (678, '610101007', 'Turbina Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (679, '610101008', 'Turbina Pesado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (680, '610101009', 'Bright Stock');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (681, '610101010', 'Outros Parafinicos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (682, '610201001', 'Hidrogenado Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (683, '610201002', 'Hidrogenado Medio');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (684, '610201003', 'Hidrogenado Pesado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (685, '610201004', 'Outros Naftenicos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (686, '610301001', 'Polialfaolefina');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (687, '610301002', 'Outros Sinteticos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (688, '610302001', 'Outros Sinteticos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (689, '610401001', 'Spindle Rr');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (690, '610401002', 'Neutro Leve Rr');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (691, '610401003', 'Neutro Medio Rr');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (692, '610401004', 'Neutro Pesado Rr');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (693, '610501001', 'Outros Oleos Lubrificantes Basicos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (694, '610601001', 'Oleos Basicos   Grupo Ii');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (695, '610701001', 'Oleos Basicos   Grupo Iii');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (696, '620101001', 'Hidraulico');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (697, '620101002', 'Engrenagens E Sistemas Circulatorios');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (698, '620101003', 'Processo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (699, '620101004', 'Isolante Tipo A');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (700, '620101005', 'Isolante Tipo B');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (701, '620101006', 'Textil / Amaciante De Fibras');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (702, '620101007', 'Estampagem');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (703, '620101008', 'Outros Oleos Lubrificantes Industriais');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (704, '620201001', 'Oleos Lubrificantes Para Aviacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (705, '620301001', 'Oleos Lubrificantes Maritimos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (706, '620401001', 'Oleos Lubrificantes Ferroviarios');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (707, '620501001', 'Ciclo Otto');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (708, '620501002', 'Ciclo Diesel');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (709, '620502001', 'Motores 2 Tempos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (710, '620503001', 'Transmissoes E Sistemas Hidraulicos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (711, '620504001', 'Transmissao Automatica');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (712, '620505001', 'Outros Oleos Lubrificantes Automotivos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (713, '620601001', 'Oleos Extensores E Plastificantes');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (714, '620601002', 'Pulverizacao Agricola');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (715, '620601003', 'Corrente De Motosserra');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (716, '620601004', 'Outros Oleos Lubrificantes Acabados');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (717, '630101001', 'Oleos Lubrificantes Usados Ou Contaminados');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (718, '640101001', 'Microoleosas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (719, '640201001', 'Macrooleosas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (720, '640301001', 'Vaselina');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (721, '640401001', 'Outras Parafinas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (722, '650101001', 'Graxas Minerais');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (723, '650101002', 'Outras Graxas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (724, '660101001', 'Oleos Lub  Paraf E Graxas Intermediarios');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (725, '710101001', 'Hidrogenio');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (726, '720101001', 'Enxofre Liquido');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (727, '720101002', 'Enxofre Solido');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (728, '730101001', 'Outros Sub Produtos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (729, '730101002', 'Glicerina');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (730, '740101001', 'Aditivos Para Gasolina');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (731, '740101002', 'Aditivos Para Oleo Diesel');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (732, '740101003', 'Outros Aditivos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (733, '740101004', 'Aditivos Para Etanol Hidratado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (734, '740101005', 'Aditivos Para Biodiesel');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (735, '740101006', 'Aditivos Para Lubrificantes');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (736, '740101007', 'Metil Terc Butil Eter   Mtbe');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (737, '810101001', 'Etanol Hidratado Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (738, '810101002', 'Etanol Hidratado Aditivado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (739, '810101003', 'Etanol Hidratado Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (740, '810102001', 'Etanol Anidro');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (741, '810102002', 'Etanol Anidro Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (742, '810102003', 'Etanol Anidro Padrao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (743, '810102004', 'Etanol Anidro Com Corante');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (744, '810201001', 'Alcool Metilico');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (745, '810201002', 'Outros Alcoois');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (746, '820101001', 'Biodiesel B100');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (747, '820101002', 'Mist  Diesel 98% / Biodiesel 2%   B2 Int Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (748, '820101003', 'Oleo Diesel B S1800 Nao Rodoviario   Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (749, '820101004', 'Mist  Diesel 90% / Biodiesel 10%   B10');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (750, '820101005', 'Mist  Diesel 85% / Biodiesel 15%   B15');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (751, '820101006', 'Mist  Diesel 80% / Biodiesel 20%   B5 Int Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (752, '820101007', 'Mist  Diesel 98% / Biodiesel 2%   B2 Int Aditivado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (753, '820101008', 'Mist  Diesel 98% / Biodiesel 2%   B2 Met Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (754, '820101009', 'Mist  Diesel 98% / Biodiesel 2%   B2 Met Aditivado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (755, '820101010', 'Biodiesel Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (756, '820101011', 'Oleo Diesel B S1800 Nao Rodoviario   Aditivado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (757, '820101012', 'Oleo Diesel B S500  Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (758, '820101013', 'Oleo Diesel B S500   Aditivado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (759, '820101014', 'Mist  Diesel 80% / Biodiesel 20%   B20 Int Aditiv');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (760, '820101015', 'Mist  Diesel 80% / Biodiesel 20%   B20 Met Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (761, '820101016', 'Mist  Diesel 80% / Biodiesel 20%   B20 Met Aditiv');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (762, '820101017', 'Mist  Diesel Maritimo 98% / Biodiesel 2%');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (763, '820101018', 'Mist  Diesel Maritimo 95% / Biodiesel 5%');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (764, '820101019', 'Diesel Maritimo   Dmb B2');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (765, '820101020', 'Diesel Maritimo   Dmb B5');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (766, '820101021', 'Diesel Nautico B2 Especial   200 Ppm Enxofre');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (767, '820101022', 'Diesel B2 Especial   200 Ppm Enxofre');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (768, '820101025', 'Diesel B30');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (769, '820101026', 'Diesel B4 Interior Para Geracao De Energia Eletrica');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (770, '820101027', 'Diesel B4 Metropolitano Para Geracao De Energia Eletrica');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (771, '820101028', 'Oleo Diesel B S50   Aditivado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (772, '820101029', 'Oleo Diesel B S50   Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (773, '820101030', 'Diesel B20 S50 Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (774, '820101031', 'Diesel B20 S50 Aditivado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (775, '820101032', 'Diesel B S50 Para Geracao De Energia Eletrica');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (776, '820101033', 'Oleo Diesel B S10   Aditivado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (777, '820101034', 'Oleo Diesel B S10   Comum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (778, '820101999', 'Biodiesel Fora De Especificacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (779, '910101001', 'Agua');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (1, '110101001', 'Albacora');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (2, '110101002', 'Anequim');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (3, '110101003', 'Badejo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (4, '110101004', 'Bagre');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (5, '110101005', 'Barracuda');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (6, '110101006', 'Bicudo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (7, '110101007', 'Bijupira');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (8, '110101008', 'Bonito');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (9, '110101009', 'Cabiunas Mistura');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (10, '110101010', 'Carapeba');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (11, '110101011', 'Caratinga');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (12, '110101012', 'Cherne');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (13, '110101013', 'Corvina');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (14, '110101014', 'Enchova');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (15, '110101015', 'Espadarte');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (16, '110101016', 'Espirito Santo Submarino');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (17, '110101017', 'Garoupa');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (18, '110101018', 'Garoupinha');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (19, '110101019', 'Jubarte');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (20, '110101020', 'Linguado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (21, '110101021', 'Malhado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (22, '110101022', 'Marimba');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (23, '110101023', 'Marlim');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (24, '110101024', 'Marlim Leste');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (25, '110101025', 'Marlim Sul');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (26, '110101026', 'Moreia');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (27, '110101027', 'Namorado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (28, '110101028', 'Pampo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (29, '110101029', 'Parati');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (30, '110101030', 'Pargo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (31, '110101031', 'Pirauna');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (32, '110101032', 'Polo Nordeste');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (33, '110101033', 'Roncador');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (34, '110101034', 'Trilha');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (35, '110101035', 'Vermelho');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (36, '110101036', 'Viola');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (37, '110101037', 'Voador');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (38, '110101038', 'Bijupira/Salema');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (39, '110101039', 'Marlin/Voador');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (40, '110101040', 'Roncador Leste');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (41, '110101041', 'Roncador Oeste');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (42, '110101042', 'Albacora Leste');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (43, '110101043', 'Frade');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (44, '110101044', 'Siri');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (45, '110101045', 'Roncador Mistura');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (46, '110101046', 'Jabuti');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (47, '110101047', 'Polvo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (48, '110101048', 'Rjs 609');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (49, '110101049', 'Papaterra');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (50, '110101050', 'Peregrino');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (51, '110102001', 'Bas 60');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (52, '110103001', 'Agua Grande');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (53, '110103002', 'Aratu');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (54, '110103003', 'Aracas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (55, '110103004', 'Baiano Borda Nordeste');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (56, '110103005', 'Baiano Mistura');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (57, '110103006', 'Candeias');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (58, '110103007', 'Dom Joao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (59, '110103008', 'Ilheus');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (60, '110103009', 'Miranga');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (61, '110103010', 'Miranga/Agua Grande');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (62, '110103011', 'Reconcavo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (63, '110103012', 'Uirapuru');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (64, '110103013', 'Guanambi');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (65, '110103014', 'Quiambina');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (66, '110103015', 'Juriti');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (67, '110103016', 'Tigre');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (68, '110103017', 'Bom Lugar');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (69, '110103018', 'Sempre Viva');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (70, '110104001', 'Cacao');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (71, '110104002', 'Espirito Santo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (72, '110104003', 'Fazenda Sao Rafael');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (73, '110104004', 'Lagoa Parda');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (74, '110104005', 'Golfinho');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (75, '110104006', 'Cachalote');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (76, '110104007', 'Parque Das Conchas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (77, '110104008', 'Crejoa');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (78, '110105001', 'Alto Do Rodrigues');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (79, '110105002', 'Aratum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (80, '110105003', 'Canto Do Amaro');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (81, '110105004', 'Estreito');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (82, '110105005', 'Fazenda Alegre');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (83, '110105006', 'Fazenda Belem');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (84, '110105007', 'Fazenda Pocinho');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (85, '110105008', 'Livramento');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (86, '110105009', 'Lorena');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (87, '110105010', 'Potiguar Terra');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (88, '110105011', 'Rgn Mistura');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (89, '110105012', 'Serraria');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (90, '110105013', 'Upanema');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (91, '110105014', 'Ubarana/Agulha');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (92, '110105015', 'Joao De Barro');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (93, '110105016', 'Pescada/Arabaiana');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (94, '110105017', 'Auri');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (95, '110105018', 'Bv');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (96, '110105019', 'Rt');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (97, '110105020', 'Ptx');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (98, '110105021', 'Poti');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (99, '110105022', 'Ptx 11');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (100, '110105023', 'Chaua');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (101, '110105024', 'Rv 1');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (102, '110105025', 'Koch');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (103, '110105026', '1 Fac 2 Rn');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (104, '110105027', 'Aracari');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (105, '110105028', 'Periquito');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (106, '110105029', 'Sao Manoel');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (107, '110106001', 'Alagoano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (108, '110106002', 'Camorim');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (109, '110106003', 'Castanhal');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (110, '110106004', 'Sergipano Mar');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (111, '110106005', 'Sergipano Mistura');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (112, '110106006', 'Sergipano Terra');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (113, '110106007', 'Piranema');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (114, '110106008', '1 Ww 1 Ba');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (115, '110106009', 'Tartaruga');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (116, '110106010', 'Cajueiro');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (117, '110107001', 'Caravela');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (118, '110107002', 'Coral');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (119, '110107003', 'Estrela Do Mar');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (120, '110107004', 'Tupi');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (121, '110107005', 'Tiro');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (122, '110107006', 'Urugua Tambau');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (123, '110108001', 'Atum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (124, '110108002', 'Caraunas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (125, '110108003', 'Ceara Mar');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (126, '110108004', 'Curima/Espada');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (127, '110108005', 'Espada');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (128, '110108006', 'Xareu/Atum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (129, '110109001', 'Urucu');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (130, '110110001', 'Nacional Mistura');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (131, '110110002', 'Outros Petroleos Nacionais');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (132, '110111001', 'Pau Lavado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (133, '110111002', 'Canario');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (134, '110113001', 'Jiribatuba');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (135, '110201001', 'Anaco Wax');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (136, '110201002', 'Bachaquero');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (137, '110201003', 'Bcf');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (138, '110201004', 'Bcf 22');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (139, '110201005', 'Bcf 23');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (140, '110201006', 'Bcf 24');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (141, '110201007', 'Bolivian Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (142, '110201008', 'Boliviano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (143, '110201009', 'Boscan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (144, '110201010', 'Ca�adon Seco');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (145, '110201011', 'Ca�o Limon');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (146, '110201012', 'Caranda');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (147, '110201013', 'Ceuta');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (148, '110201014', 'Chubut');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (149, '110201015', 'Coblan Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (150, '110201016', 'Corrientes');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (151, '110201017', 'Cupiagua');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (152, '110201018', 'Cusiana');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (153, '110201019', 'Escalante');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (154, '110201020', 'Furrial');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (155, '110201021', 'Guafita Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (156, '110201022', 'Guanipa');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (157, '110201023', 'Hydra');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (158, '110201024', 'Lagocinco');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (159, '110201025', 'Lagocinco Liviano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (160, '110201026', 'Lagomedio');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (161, '110201027', 'Lagotreco');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (162, '110201028', 'Lagotreco Heavy');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (163, '110201029', 'Lagotreco Medio');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (164, '110201030', 'Laguna');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (165, '110201031', 'Leona');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (166, '110201032', 'Leona 21,9');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (167, '110201033', 'Leona 24');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (168, '110201034', 'Loreto');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (169, '110201035', 'Maria Ignes');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (170, '110201036', 'Marlago');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (171, '110201037', 'Medanito');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (172, '110201038', 'Merey');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (173, '110201039', 'Merey/Leona');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (174, '110201040', 'Mesa');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (175, '110201041', 'Mescla Venezuelano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (176, '110201042', 'Monogas');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (177, '110201043', 'Oficina');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (178, '110201044', 'Oriente');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (179, '110201045', 'Orito');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (180, '110201046', 'Pilon');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (181, '110201047', 'Recon Boliviano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (182, '110201048', 'Recon Merey');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (183, '110201049', 'Rincon De Los Sauces');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (184, '110201050', 'San Sebastian');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (185, '110201051', 'Santa Barbara');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (186, '110201052', 'Santa Cruz');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (187, '110201053', 'Santa Cruz Do Sul');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (188, '110201054', 'Shiviyacu');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (189, '110201055', 'Tia Juana');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (190, '110201056', 'Tia Juana Medio');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (191, '110201057', 'Tia Juana Pesado');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (192, '110201058', 'Vasconia 29,3');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (193, '110201059', 'Vasconia Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (194, '110201060', 'Yanayacu');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (195, '110201061', 'Zuata');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (196, '110201062', 'Napo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (197, '110201063', 'South Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (198, '110201064', 'Carabobo');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (199, '110201065', 'Perenco Peru Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (200, '110201066', 'Castilla Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (201, '110201067', 'Alen Condensate');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (202, '110201068', 'Hides');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (203, '110202001', 'Cold Lake Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (204, '110202002', 'Isthmus');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (205, '110202003', 'Isthmus Maya');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (206, '110202004', 'Maya');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (207, '110202005', 'Maya Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (208, '110202006', 'Olmeca');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (209, '110202007', 'Calypso');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (210, '110202008', 'Msw Edmonton');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (211, '110202009', 'Hibernia');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (212, '110202010', 'White Rose');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (213, '110203001', 'Amna');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (214, '110203002', 'Angolano');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (215, '110203003', 'Antan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (216, '110203004', 'Arzew');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (217, '110203005', 'Belaym');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (218, '110203006', 'Bonny Leve');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (219, '110203007', 'Bonny Medio');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (220, '110203008', 'Bouri');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (221, '110203009', 'Brass Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (222, '110203010', 'Brass River');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (223, '110203011', 'Cabina/Takula');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (224, '110203012', 'Cabinda');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (225, '110203013', 'Coco');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (226, '110203014', 'Djeno Blend');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (227, '110203015', 'East Zeit Mix');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (228, '110203016', 'El Huemel');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (229, '110203017', 'El Morgan');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (230, '110203018', 'El Oriente');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (231, '110203019', 'Emeraude');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (232, '110203020', 'Es Sider');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (233, '110203021', 'Escravos');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (234, '110203022', 'Forcados');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (235, '110203023', 'Gamba');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (236, '110203024', 'Geisum');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (237, '110203025', 'Gulf Of Suez');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (238, '110203026', 'Gulf Of Suez Mix');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (239, '110203027', 'Hassi Messaoud');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (240, '110203028', 'Hassi Rmel');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (241, '110203029', 'Ima Light');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (242, '110203030', 'Kitina');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (243, '110203031', 'Kole');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (244, '110203032', 'Kutubu');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (245, '110203033', 'Lokele');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (246, '110203034', 'Lucina Marine');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (247, '110203035', 'Lucula');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (248, '110203036', 'Mandji');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (249, '110203037', 'Mbia');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (250, '110203038', 'Moanda');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (251, '110203039', 'Moudi');

insert into LIVCOANP (NCODICOANP, CCODICOANP, CDESCCOANP)
values (252, '110203040', 'Nemba');

END;  