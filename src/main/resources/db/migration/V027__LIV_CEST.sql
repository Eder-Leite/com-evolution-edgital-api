-- Create table
create table LIV_CEST
(
  ncodi_cest NUMBER not null,
  ccodi_cest VARCHAR2(10) not null,
  ccncm_cest VARCHAR2(10) not null,
  cdesc_cest VARCHAR2(4000) not null
);
-- Add comments to the table 
comment on table LIV_CEST
  is 'Código CEST';
-- Add comments to the columns 
comment on column LIV_CEST.ncodi_cest
  is 'código  do cest';
comment on column LIV_CEST.ccodi_cest
  is 'código do cest literal';
comment on column LIV_CEST.ccncm_cest
  is 'código do ncm literal';
comment on column LIV_CEST.cdesc_cest
  is 'descrição do código cest';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIV_CEST
  add constraint PK_LIV_CEST primary key (NCODI_CEST)
  using index;
  
  
insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1, '0600100', '22071010', 'Álcool etílico não desnaturado, com um teor alcoólico em volume igual ou superior a 80% vol - Com um teor de água igual ou inferior a 1 % vol (álcool etílico anidro combustível)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (2, '0600101', '22071090', 'Álcool etílico não desnaturado, com um teor alcoólico em volume igual ou superior a 80% vol - Outros (álcool etílico hidratado combustível)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (3, '0600200', '27101259', 'Gasolina automotiva A, exceto Premium');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (4, '0600201', '27101259', 'Gasolina automotiva C, exceto Premium');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (5, '0600202', '27101259', 'Gasolina automotiva A Premium');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (6, '0600203', '27101259', 'Gasolina automotiva C Premium');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (7, '0600300', '27101251', 'Gasolina de aviação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (8, '0600400', '27101919', 'Querosenes, exceto de aviação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (9, '0600500', '27101911', 'Querosene de aviação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (10, '0600600', '2710192', 'Óleo diesel A, exceto S10 e Marítimo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (11, '0600601', '2710192', 'Óleo diesel B, exceto S10 (mistura obrigatória)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (12, '0600602', '2710192', 'Óleo diesel B, exceto S10 (misturas autorizativas)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (13, '0600603', '2710192', 'Óleo diesel B, exceto S10 (misturas experimentais)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (14, '0600604', '2710192', 'Óleo diesel A S10');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (15, '0600605', '2710192', 'Óleo diesel B S10 (mistura obrigatória)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (16, '0600606', '2710192', 'Óleo diesel B S10 (misturas autorizativas)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (17, '0600607', '2710192', 'Óleo diesel B S10 (misturas experimentais)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (18, '0600608', '2710192', 'Óleo Diesel Marítimo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (19, '0600609', '2710192', 'Outros óleos combustíveis, exceto os classificados no CEST 06.006.10 e 06.006.11');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (20, '0600610', '2710192', 'Óleo combustível derivado de xisto');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (21, '0600611', '27101922', 'Óleo combustível pesado');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (22, '0600700', '2710193', 'Óleos lubrificantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (23, '0600800', '2710199', 'Outros óleos de petróleo ou de minerais betuminosos (exceto óleos brutos) e preparações não especificadas nem compreendidas noutras posições, que contenham, como constituintes básicos, 70% ou mais, em peso, de óleos de petróleo ou de minerais betuminosos, exceto os que contenham biodiesel, exceto os resíduos de óleos e exceto as graxas lubrificantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (24, '0600801', '2710199', 'Graxa lubrificante');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (25, '0600900', '27109', 'Resíduos de óleos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (26, '0601000', '2711', 'Gás de petróleo e outros hidrocarbonetos gasosos, exceto GLP, GLGN, Gás Natural e Gás de xisto.');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (27, '0601100', '27111910', 'Gás liquefeito de petróleo em botijão de 13 Kg (GLP)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (28, '0601101', '27111910', 'Gás liquefeito de petróleo (GLP), exceto em botijão de 13 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (29, '0601102', '27111910', 'Gás liquefeito de petróleo em botijão de 13 Kg (GLGNn)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (30, '0601103', '27111910', 'Gás liquefeito de petróleo (GLGNn), exceto em botijão de 13 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (31, '0601104', '27111910', 'Gás liquefeito de petróleo em botijão de 13 Kg (GLGNi)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (32, '0601105', '27111910', 'Gás liquefeito de petróleo (GLGNi), exceto em botijão de 13 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (33, '0601106', '27111910', 'Gás liquefeito de petróleo em botijão de 13 kg (Misturas)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (34, '0601107', '27111910', 'Gás liquefeito de petróleo (Misturas), exceto em botijão de 13 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (35, '0601200', '27111100', 'Gás Natural Liquefeito');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (36, '0601300', '27112100', 'Gás Natural Gasoso');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (37, '0601400', '27112990', 'Gás de xisto');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (38, '0601500', '2713', 'Coque de petróleo e outros resíduos de óleo de petróleo ou de minerais betuminosos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (39, '0601600', '38260000', 'Biodiesel e suas misturas, que não contenham ou que contenham menos de 70%, em peso, de óleos de petróleo ou de óleos minerais betuminosos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (40, '0601700', '3403', 'Preparações lubrificantes, exceto as contendo, como constituintes de base, 70% ou mais, em peso, de óleos de petróleo ou de minerais betuminosos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (41, '0601800', '27102000', 'Óleos de petróleo ou de minerais betuminosos (exceto óleos brutos) e preparações não especificadas nem compreendidas noutras posições, que contenham, como constituintes básicos, 70% ou mais, em peso, de óleos de petróleo ou de minerais betuminosos, que contenham biodiesel, exceto os resíduos de óleos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (42, '0700100', '27160000', 'Energia elétrica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (43, '0800100', '40169990', 'Ferramentas de borracha vulcanizada não endurecida');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (44, '0800200', '44170010', 'Ferramentas, armações e cabos de ferramentas, de madeira');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (45, '0800200', '44170090', 'Ferramentas, armações e cabos de ferramentas, de madeira');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (46, '0800300', '6804', 'Mós e artefatos semelhantes, sem armação, para moer, desfibrar, triturar, amolar, polir, retificar ou cortar; pedras para amolar ou para polir, manualmente, e suas partes, de pedras naturais, de abrasivos naturais ou artificiais aglomerados ou de cerâmica, mesmo com partes de outras matérias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (47, '0800400', '8201', 'Pás, alviões, picaretas, enxadas, sachos, forcados e forquilhas, ancinhos e raspadeiras; machados, podões e ferramentas semelhantes com gume; tesouras de podar de todos os tipos; foices e foicinhas, facas para feno ou para palha, tesouras para sebes, cunhas e outras ferramentas manuais para agricultura, horticultura ou silvicultura');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (48, '0800500', '82022000', 'Folhas de serras de fita');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (49, '0800600', '82029100', 'Lâminas de serras máquinas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (50, '0800700', '8202', 'Serras manuais e outras folhas de serras (incluídas as fresas-serras e as folhas não dentadas para serrar), exceto as classificadas nos CEST 08.005.00 e 08.006.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (51, '0800800', '8203', 'Limas, grosas, alicates (mesmo cortantes), tenazes, pinças, cisalhas para metais, corta-tubos, corta-pinos, saca-bocados e ferramentas semelhantes, manuais, exceto as pinças para sobrancelhas classificadas na posição 8203.20.90');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (52, '0800900', '8204', 'Chaves de porcas, manuais (incluídas as chaves dinamométricas);
chaves de caixa intercambiáveis, mesmo com cabos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (53, '0801000', '8205', 'Ferramentas manuais (incluídos os diamantes de vidraceiro) não especificadas nem compreendidas em outras posições, lamparinas ou lâmpadas de soldar (maçaricos) e semelhantes; tornos de apertar, sargentos e semelhantes, exceto os acessórios ou partes de máquinas-ferramentas; bigornas; forjas-portáteis; mós com armação, manuais ou de pedal');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (54, '0801100', '82060000', 'Ferramentas de pelo menos duas das posições 8202 a 8205, acondicionadas em sortidos para venda a retalho');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (55, '0801200', '820740', 'Ferramentas de roscar interior ou exteriormente; de mandrilar ou de brochar; e de fresar');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (56, '0801200', '820760', 'Ferramentas de roscar interior ou exteriormente; de mandrilar ou de brochar; e de fresar');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (57, '0801200', '820770', 'Ferramentas de roscar interior ou exteriormente; de mandrilar ou de brochar; e de fresar');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (58, '0801300', '8207', 'Outras ferramentas intercambiáveis para ferramentas manuais, mesmo mecânicas, ou para máquinas-ferramentas (por exemplo, de embutir, estampar, puncionar, furar, tornear, aparafusar), incluídas as fieiras de estiragem ou de extrusão, para metais, e as ferramentas de perfuração ou de sondagem, exceto forma ou gabarito de produtos em epoxy e as classificadas no CEST 08.012.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (59, '0801400', '8208', 'Facas e lâminas cortantes, para máquinas ou para aparelhos mecânicos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (60, '0801500', '82090011', 'Plaquetas ou pastilhas intercambiáveis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (61, '0801600', '820900', 'Outras plaquetas, varetas, pontas e objetos semelhantes para ferramentas, não montados, de ceramais (“cermets”), exceto as classificadas no CEST 08.015.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (62, '0801700', '8211', 'Facas de lâmina cortante ou serrilhada, incluídas as podadeiras de lâmina móvel, e suas lâminas, exceto as de uso doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (63, '0801800', '8213', 'Tesouras e suas lâminas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (64, '0801900', '8467', 'Ferramentas pneumáticas, hidráulicas ou com motor (elétrico ou não elétrico) incorporado, de uso manual, exceto o descrito no CEST 08.019.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (65, '0801901', '84678100', 'Moto-serras portáteis de corrente, com motor incorporado, não elétrico, de uso agrícola');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (66, '0802000', '9015', 'nstrumentos e aparelhos de geodesia, topografia, agrimensura, nivelamento, fotogrametria, hidrografia, oceanografia, hidrologia, meteorologia ou de geofísica, exceto bussolas; telêmetros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (67, '0802100', '90172000', 'Instrumentos de desenho, de traçado ou de cálculo; metros, micrômetros, paquímetros, calibres e semelhantes; partes e acessórios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (68, '0802100', '901730', 'Instrumentos de desenho, de traçado ou de cálculo; metros, micrômetros, paquímetros, calibres e semelhantes; partes e acessórios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (69, '0802100', '901780', 'Instrumentos de desenho, de traçado ou de cálculo; metros, micrômetros, paquímetros, calibres e semelhantes; partes e acessórios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (70, '0802100', '90179090', 'Instrumentos de desenho, de traçado ou de cálculo; metros, micrômetros, paquímetros, calibres e semelhantes; partes e acessórios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (71, '0802200', '90251190', 'Termômetros, suas partes e acessórios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (72, '0802200', '90259010', 'Termômetros, suas partes e acessórios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (73, '0802300', '902519', 'Pirômetros, suas partes e acessórios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (74, '0802300', '90259090', 'Pirômetros, suas partes e acessórios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (75, '0900100', '8539', 'Lâmpadas elétricas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (76, '0900200', '8540', 'Lâmpadas eletrônicas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (77, '0900300', '85041000', 'Reatores para lâmpadas ou tubos de descargas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (78, '0900400', '853650', '“Starter”');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (79, '0900500', '85395000', 'Lâmpadas de LED (Diodos Emissores de Luz)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (80, '1000100', '2522', 'Cal');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (81, '1000200', '3816001', 'Argamassas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (82, '1000200', '38245000', 'Argamassas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (83, '1000300', '32149000', 'Outras argamassas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (84, '1000400', '391000', 'Silicones em formas primárias, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (85, '1000500', '3916', 'Revestimentos de PVC e outros plásticos; forro, sancas e afins de PVC, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (86, '1000600', '3917', 'Tubos, e seus acessórios (por exemplo, juntas, cotovelos, flanges, uniões), de plásticos, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (87, '1000700', '3918', 'Revestimento de pavimento de PVC e outros plásticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (88, '1000800', '3919', 'Chapas, folhas, tiras, fitas, películas e outras formas planas, autoadesivas, de plásticos, mesmo em rolos, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (89, '1000900', '3919', 'Veda rosca, lona plástica para uso na construção, fitas isolantes e afins');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (90, '1000900', '3920', 'Veda rosca, lona plástica para uso na construção, fitas isolantes e afins');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (91, '1000900', '3921', 'Veda rosca, lona plástica para uso na construção, fitas isolantes e afins');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (92, '1001000', '3921', 'Telha de plástico, mesmo reforçada com fibra de vidro');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (93, '1001100', '3921', 'Cumeeira de plástico, mesmo reforçada com fibra de vidro');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (94, '1001200', '3921', 'Chapas, laminados plásticos em bobina, para uso na construção, exceto os descritos no CEST 10.010.00 e 10.011.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (95, '1001300', '3922', 'Banheiras, boxes para chuveiros, pias, lavatórios, bidês, sanitários e seus assentos e tampas, caixas de descarga e artigos semelhantes para usos sanitários ou higiênicos, de plásticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (96, '1001400', '3924', 'Artefatos de higiene/toucador de plástico, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (97, '1001500', '39251000', 'Caixa d’água, inclusive sua tampa, de plástico, mesmo reforçadas com fibra de vidro');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (98, '1001600', '392590', 'Outras telhas, cumeeira e caixa d’água, inclusive sua tampa, de plástico, mesmo reforçadas com fibra de vidro');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (99, '1001700', '39251000', 'Artefatos para apetrechamento de construções, de plásticos, não especificados nem compreendidos em outras posições, incluindo persianas, sancas, molduras, apliques e rosetas, caixilhos de polietileno e outros plásticos, exceto os descritos nos CEST 10.015.00 e 10.016.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (100, '1001700', '392590', 'Artefatos para apetrechamento de construções, de plásticos, não especificados nem compreendidos em outras posições, incluindo persianas, sancas, molduras, apliques e rosetas, caixilhos de polietileno e outros plásticos, exceto os descritos nos CEST 10.015.00 e 10.016.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (101, '1001800', '39252000', 'Portas, janelas e seus caixilhos, alizares e soleiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (102, '1001900', '39253000', 'Postigos, estores (incluídas as venezianas) e artefatos semelhantes e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (103, '1002000', '392690', 'Outras obras de plástico, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (104, '1002100', '4814', 'Papel de parede e revestimentos de parede semelhantes; papel para vitrais');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (105, '1002200', '68101900', 'Telhas de concreto');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (106, '1002300', '6811', 'Telha, cumeeira e caixa d’água, inclusive sua tampa, de fibrocimento, cimento-celulose');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (107, '1002400', '6811', 'Caixas d’água, tanques e reservatórios e suas tampas, telhas, calhas, cumeeiras e afins, de fibrocimento, cimento-celulose ou semelhantes, contendo ou não amianto, exceto os descritos no CEST 10.023.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (108, '1002500', '69010000', 'Tijolos, placas (lajes), ladrilhos e outras peças cerâmicas de farinhas siliciosas fósseis (“kieselghur”, tripolita, diatomita, por exemplo) ou de terras siliciosas semelhantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (109, '1002600', '6902', 'Tijolos, placas (lajes), ladrilhos e peças cerâmicas semelhantes, para uso na construção, refratários, que não sejam de farinhas siliciosas fósseis nem de terras siliciosas semelhantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (110, '1002700', '6904', 'Tijolos para construção, tijoleiras, tapa-vigas e produtos semelhantes, de cerâmica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (111, '1002800', '6905', 'Telhas, elementos de chaminés, condutores de fumaça, ornamentos arquitetônicos, de cerâmica, e outros produtos cerâmicos para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (112, '1002900', '69060000', 'Tubos, calhas ou algerozes e acessórios para canalizações, de cerâmica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (113, '1003000', '6907', 'Ladrilhos e placas de cerâmica, exclusivamente para pavimentação ou revestimento');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (114, '1003001', '6907', 'Cubos, pastilhas e artigos semelhantes de cerâmica, mesmo com suporte, exceto os descritos CEST 10.030.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (115, '1003100', '6910', 'Pias, lavatórios, colunas para lavatórios, banheiras, bidês, sanitários, caixas de descarga, mictórios e aparelhos fixos semelhantes para usos sanitários, de cerâmica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (116, '1003200', '69120000', 'Artefatos de higiene/toucador de cerâmica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (117, '1003300', '7003', 'Vidro vazado ou laminado, em chapas, folhas ou perfis, mesmo com camada absorvente, refletora ou não, mas sem qualquer outro trabalho');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (118, '1003400', '7004', 'Vidro estirado ou soprado, em folhas, mesmo com camada absorvente, refletora ou não, mas sem qualquer outro trabalho');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (119, '1003500', '7005', 'Vidro flotado e vidro desbastado ou polido em uma ou em ambas as faces, em chapas ou em folhas, mesmo com camada absorvente, refletora ou não, mas sem qualquer outro trabalho');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (120, '1003600', '70071900', 'Vidros temperados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (121, '1003700', '70072900', 'Vidros laminados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (122, '1003800', '7008', 'Vidros isolantes de paredes múltiplas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (123, '1003900', '7016', 'Blocos, placas, tijolos, ladrilhos, telhas e outros artefatos, de vidro prensado ou moldado, mesmo armado, para uso na construção; cubos, pastilhas e outros artigos semelhantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (124, '1004000', '72142000', 'Barras próprias para construções, exceto vergalhões');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (125, '1004100', '73089010', 'Outras barras próprias para construções, exceto vergalhões');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (126, '1004200', '72142000', 'Vergalhões');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (127, '1004300', '7213', 'Outros vergalhões');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (128, '1004300', '73089010', 'Outros vergalhões');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (129, '1004400', '72171090', 'Fios de ferro ou aço não ligados, não revestidos, mesmo polidos; cordas, cabos, tranças (entrançados), lingas e artefatos semelhantes, de ferro ou aço, não isolados para usos elétricos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (130, '0100100', '38151210', 'Catalisadores em colmeia cerâmica ou metálica para conversão catalítica de gases de escape de veículos e outros catalisadores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (131, '0100100', '38151290', 'Catalisadores em colmeia cerâmica ou metálica para conversão catalítica de gases de escape de veículos e outros catalisadores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (132, '0100200', '3917', 'Tubos e seus acessórios (por exemplo, juntas, cotovelos, flanges, uniões), de plásticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (133, '0100300', '39181000', 'Protetores de caçamba');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (134, '0100400', '39233000', 'Reservatórios de óleo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (135, '0100500', '39263000', 'Frisos, decalques, molduras e acabamentos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (136, '0100600', '40103', 'Correias de transmissão de borracha vulcanizada, de matérias têxteis, mesmo impregnadas, revestidas ou recobertas, de plástico, ou estratificadas com plástico ou reforçadas com metal ou com outras matérias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (137, '0100600', '59100000', 'Correias de transmissão de borracha vulcanizada, de matérias têxteis, mesmo impregnadas, revestidas ou recobertas, de plástico, ou estratificadas com plástico ou reforçadas com metal ou com outras matérias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (138, '0100700', '40169300', 'Juntas, gaxetas e outros elementos com função semelhante de vedação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (139, '0100700', '4823909', 'Juntas, gaxetas e outros elementos com função semelhante de vedação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (140, '0100800', '40161010', 'Partes de veículos automóveis, tratores e máquinas autopropulsadas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (141, '0100900', '40169990', 'Tapetes, revestimentos, mesmo confeccionados, batentes, buchas e coxins');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (142, '0100900', '57050000', 'Tapetes, revestimentos, mesmo confeccionados, batentes, buchas e coxins');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (143, '0101000', '59039000', 'Tecidos impregnados, revestidos, recobertos ou estratificados, com plástico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (144, '0101100', '59090000', 'Mangueiras e tubos semelhantes, de matérias têxteis, mesmo com reforço ou acessórios de outras matérias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (145, '0101200', '63061', 'Encerados e toldos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (146, '0101300', '65061000', 'Capacetes e artefatos de uso semelhante, de proteção, para uso em motocicletas, incluídos ciclomotores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (147, '0101400', '6813', 'Guarnições de fricção (por exemplo, placas, rolos, tiras, segmentos, discos, anéis, pastilhas), não montadas, para freios, embreagens ou qualquer outro mecanismo de fricção, à base de amianto, de outras substâncias minerais ou de celulose, mesmo combinadas com têxteis ou outras matérias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (148, '0101500', '70071100', 'Vidros de dimensões e formatos que permitam aplicação automotiva');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (149, '0101500', '70072100', 'Vidros de dimensões e formatos que permitam aplicação automotiva');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (150, '0101600', '70091000', 'Espelhos retrovisores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (151, '0101700', '70140000', 'Lentes de faróis, lanternas e outros utensílios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (152, '0101800', '73110000', 'Cilindro de aço para GNV (gás natural veicular)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (153, '0101900', '73110000', 'Recipientes para gases comprimidos ou liquefeitos, de ferro fundido, ferro ou aço, exceto o descrito no item 18.0');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (154, '0102000', '7320', 'Molas e folhas de molas, de ferro ou aço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (155, '0102100', '7325', 'Obras moldadas, de ferro fundido, ferro ou aço, exceto as do código 7325.91.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (156, '0102200', '780600', 'Peso de chumbo para balanceamento de roda');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (157, '0102300', '80070090', 'Peso para balanceamento de roda e outros utensílios de estanho');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (158, '0102400', '830120', 'Fechaduras e partes de fechaduras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (159, '0102400', '830160', 'Fechaduras e partes de fechaduras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (160, '0102500', '830170', 'Chaves apresentadas isoladamente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (161, '0102600', '83021000', 'Dobradiças, guarnições, ferragens e artigos semelhantes de metais comuns');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (162, '0102600', '83023000', 'Dobradiças, guarnições, ferragens e artigos semelhantes de metais comuns');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (163, '0102700', '831000', 'Triângulo de segurança');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (164, '0102800', '84073', 'Motores de pistão alternativo dos tipos utilizados para propulsão de veículos do Capítulo 87');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (165, '0102900', '840820', 'Motores dos tipos utilizados para propulsão de veículos automotores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (166, '0103000', '84099', 'Partes reconhecíveis como exclusiva ou principalmente destinadas aos motores das posições 8407 ou 8408');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (167, '0103100', '84122', 'Motores hidráulicos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (168, '0103200', '841330', 'Bombas para combustíveis, lubrificantes ou líquidos de arrefecimento, próprias para motores de ignição por centelha ou por compressão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (169, '0103300', '84141000', 'Bombas de vácuo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (170, '0103400', '8414801', 'Compressores e turbocompressores de ar');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (171, '0103400', '8414802', 'Compressores e turbocompressores de ar');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (172, '0103500', '84139190', 'Partes das bombas, compressores e turbocompressores dos CEST 01.032.00, 01.033.00 e 01.034.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (173, '0103500', '84149010', 'Partes das bombas, compressores e turbocompressores dos CEST 01.032.00, 01.033.00 e 01.034.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (174, '0103500', '8414903', 'Partes das bombas, compressores e turbocompressores dos CEST 01.032.00, 01.033.00 e 01.034.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (175, '0103500', '8414909', 'Partes das bombas, compressores e turbocompressores dos CEST 01.032.00, 01.033.00 e 01.034.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (176, '0103600', '841520', 'Máquinas e aparelhos de ar condicionado');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (177, '0103700', '84212300', 'Aparelhos para filtrar óleos minerais nos motores de ignição por centelha ou por compressão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (178, '0103800', '84212990', 'Filtros a vácuo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (179, '0103900', '84219', 'Partes dos aparelhos para filtrar ou depurar líquidos ou gases');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (180, '0104000', '84241000', 'Extintores, mesmo carregados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (181, '0104100', '84213100', 'Filtros de entrada de ar para motores de ignição por centelha ou por compressão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (182, '0104200', '84213920', 'Depuradores por conversão catalítica de gases de escape');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (183, '0104300', '84254200', 'Macacos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (184, '0104400', '84311010', 'Partes para macacos do CEST 01.043.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (185, '0104500', '8431492', 'Partes reconhecíveis como exclusiva ou principalmente destinadas às máquinas agrícolas ou rodoviárias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (186, '0104501', '84339090', 'Partes reconhecíveis como exclusiva ou principalmente destinadas às máquinas agrícolas ou rodoviárias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (187, '0104600', '84811000', 'Válvulas redutoras de pressão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (188, '0104700', '84812', 'Válvulas para transmissão óleo-hidráulicas ou pneumáticas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (189, '0104800', '84818092', 'Válvulas solenoides');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (190, '0104900', '8482', 'Rolamentos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (191, '0105000', '8483', 'Árvores de transmissão (incluídas as árvores de “cames” e virabrequins) e manivelas; mancais e “bronzes”; engrenagens e rodas de fricção; eixos de esferas ou de roletes; redutores, multiplicadores, caixas de transmissão e variadores de velocidade, incluídos os conversores de torque; volantes e polias, incluídas as polias para cadernais; embreagens e dispositivos de acoplamento, incluídas as juntas de articulação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (192, '0105100', '8484', 'Juntas metaloplásticas; jogos ou sortidos de juntas de composições diferentes, apresentados em bolsas, envelopes ou embalagens semelhantes; juntas de vedação mecânicas (selos mecânicos)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (193, '0105200', '850520', 'Acoplamentos, embreagens, variadores de velocidade e freios, eletromagnéticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (194, '0105300', '850710', 'Acumuladores elétricos de chumbo, do tipo utilizado para o arranque dos motores de pistão, exceto os classificados no CEST 01.053.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (195, '0105301', '85071010', 'Acumuladores elétricos de chumbo, do tipo utilizado para o arranque dos motores de pistão e de capacidade inferior ou igual a 20 Ah e tensão inferior ou igual a 12 V');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (196, '0105400', '8511', 'Aparelhos e dispositivos elétricos de ignição ou de arranque para motores de ignição por centelha ou por compressão (por exemplo, magnetos, dínamos-magnetos, bobinas de ignição, velas de ignição ou de aquecimento, motores de arranque);
geradores (dínamos e alternadores, por exemplo) e conjuntores-disjuntores utilizados com estes motores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (197, '0105500', '851220', 'Aparelhos elétricos de iluminação ou de sinalização (exceto os da posição 8539), limpadores de para-brisas, degeladores e desembaçadores (desembaciadores) elétricos e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (198, '0105500', '851240', 'Aparelhos elétricos de iluminação ou de sinalização (exceto os da posição 8539), limpadores de para-brisas, degeladores e desembaçadores (desembaciadores) elétricos e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (199, '0105500', '85129000', 'Aparelhos elétricos de iluminação ou de sinalização (exceto os da posição 8539), limpadores de para-brisas, degeladores e desembaçadores (desembaciadores) elétricos e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (200, '0105600', '85171213', 'Telefones móveis do tipo dos utilizados em veículos automóveis.');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (201, '0105700', '8518', 'Alto-falantes, amplificadores elétricos de audiofrequência e partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (202, '0105800', '85185000', 'Aparelhos elétricos de amplificação de som para veículos automotores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (203, '0105900', '851981', 'Aparelhos de reprodução de som');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (204, '0106000', '8525501', 'Aparelhos transmissores (emissores) de radiotelefonia ou radiotelegrafia (rádio receptor/transmissor)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (205, '0106000', '85256010', 'Aparelhos transmissores (emissores) de radiotelefonia ou radiotelegrafia (rádio receptor/transmissor)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (206, '0106100', '85272100', 'Aparelhos receptores de radiodifusão que só funcionem com fonte externa de energia combinados com um aparelho de gravação ou de reprodução de som, do tipo utilizado em veículos automóveis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (207, '0106200', '85272900', 'Outros aparelhos receptores de radiodifusão que só funcionem com fonte externa de energia, do tipo utilizado em veículos automóveis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (208, '0106201', '85219090', 'Outros aparelhos videofônicos de gravação ou de reprodução, mesmo incorporando um receptor de sinais videofônicos, dos tipos utilizados exclusivamente em veículos automotores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (209, '0106300', '85291090', 'Antenas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (210, '0106400', '853400', 'Circuitos impressos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (211, '0106500', '853530', 'Interruptores e seccionadores e comutadores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (212, '0106500', '853650', 'Interruptores e seccionadores e comutadores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (213, '0106600', '85361000', 'Fusíveis e corta-circuitos de fusíveis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (214, '0106700', '85362000', 'Disjuntores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (215, '0106800', '85364', 'Relés');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (216, '0106900', '8538', 'Partes reconhecíveis como exclusivas ou principalmente destinados aos aparelhos dos CEST 01.065.00, 01.066.00, 01.067.00 e 01.068.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (217, '0107000', '853910', 'Faróis e projetores, em unidades seladas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (218, '0107100', '85392', 'Lâmpadas e tubos de incandescência, exceto de raios ultravioleta ou infravermelhos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (219, '0107200', '85442000', 'Cabos coaxiais e outros condutores elétricos coaxiais');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (220, '0107300', '85443000', 'Jogos de fios para velas de ignição e outros jogos de fios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (221, '0107400', '8707', 'Carroçarias para os veículos automóveis das posições 8701 a 8705, incluídas as cabinas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (222, '0107500', '8708', 'Partes e acessórios dos veículos automóveis das posições 8701 a 8705');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (223, '0107600', '87141', 'Parte e acessórios de motocicletas (incluídos os ciclomotores)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (224, '0107700', '87169090', 'Engates para reboques e semirreboques');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (225, '0107800', '902610', 'Medidores de nível; Medidores de vazão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (226, '0107900', '902620', 'Aparelhos para medida ou controle da pressão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (227, '0108000', '9029', 'Contadores, indicadores de velocidade e tacômetros, suas partes e acessórios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (228, '0108100', '90303321', 'Amperímetros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (229, '0108200', '90318040', 'Aparelhos digitais, de uso em veículos automóveis, para medida e indicação de múltiplas grandezas tais como: velocidade média, consumos instantâneo e médio e autonomia (computador de bordo)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (230, '0108300', '9032892', 'Controladores eletrônicos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (231, '0108400', '91040000', 'Relógios para painéis de instrumentos e relógios semelhantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (232, '0108500', '94012000', 'Assentos e partes de assentos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (233, '0108500', '94019090', 'Assentos e partes de assentos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (234, '0108600', '96138000', 'Acendedores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (235, '0108700', '4009', 'Tubos de borracha vulcanizada não endurecida, mesmo providos de seus acessórios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (236, '0108800', '45049000', 'Juntas de vedação de cortiça natural e de amianto');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (237, '0108800', '68129910', 'Juntas de vedação de cortiça natural e de amianto');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (238, '0108900', '48234000', 'Papel-diagrama para tacógrafo, em disco');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (239, '0109000', '39191010', 'Fitas, tiras, adesivos, autocolantes, de plástico, refletores, mesmo em rolos; placas metálicas com película de plástico refletora, próprias para colocação em carrocerias, para-choques de veículos de carga, motocicletas, ciclomotores, capacetes, bonés de agentes de trânsito e de condutores de veículos, atuando como dispositivos refletivos de segurança rodoviários');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (240, '0109000', '39191020', 'Fitas, tiras, adesivos, autocolantes, de plástico, refletores, mesmo em rolos; placas metálicas com película de plástico refletora, próprias para colocação em carrocerias, para-choques de veículos de carga, motocicletas, ciclomotores, capacetes, bonés de agentes de trânsito e de condutores de veículos, atuando como dispositivos refletivos de segurança rodoviários');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (241, '0109000', '39191090', 'Fitas, tiras, adesivos, autocolantes, de plástico, refletores, mesmo em rolos; placas metálicas com película de plástico refletora, próprias para colocação em carrocerias, para-choques de veículos de carga, motocicletas, ciclomotores, capacetes, bonés de agentes de trânsito e de condutores de veículos, atuando como dispositivos refletivos de segurança rodoviários');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (242, '0109000', '39199010', 'Fitas, tiras, adesivos, autocolantes, de plástico, refletores, mesmo em rolos; placas metálicas com película de plástico refletora, próprias para colocação em carrocerias, para-choques de veículos de carga, motocicletas, ciclomotores, capacetes, bonés de agentes de trânsito e de condutores de veículos, atuando como dispositivos refletivos de segurança rodoviários');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (243, '0109000', '39199020', 'Fitas, tiras, adesivos, autocolantes, de plástico, refletores, mesmo em rolos; placas metálicas com película de plástico refletora, próprias para colocação em carrocerias, para-choques de veículos de carga, motocicletas, ciclomotores, capacetes, bonés de agentes de trânsito e de condutores de veículos, atuando como dispositivos refletivos de segurança rodoviários');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (244, '0109000', '39199090', 'Fitas, tiras, adesivos, autocolantes, de plástico, refletores, mesmo em rolos; placas metálicas com película de plástico refletora, próprias para colocação em carrocerias, para-choques de veículos de carga, motocicletas, ciclomotores, capacetes, bonés de agentes de trânsito e de condutores de veículos, atuando como dispositivos refletivos de segurança rodoviários');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (245, '0109000', '87082999', 'Fitas, tiras, adesivos, autocolantes, de plástico, refletores, mesmo em rolos; placas metálicas com película de plástico refletora, próprias para colocação em carrocerias, para-choques de veículos de carga, motocicletas, ciclomotores, capacetes, bonés de agentes de trânsito e de condutores de veículos, atuando como dispositivos refletivos de segurança rodoviários');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (246, '0109100', '84123110', 'Cilindros pneumáticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (247, '0109200', '84131900', 'Bomba elétrica de lavador de para-brisa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (248, '0109200', '84135090', 'Bomba elétrica de lavador de para-brisa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (249, '0109200', '84138100', 'Bomba elétrica de lavador de para-brisa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (250, '0109300', '84136019', 'Bomba de assistência de direção hidráulica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (251, '0109300', '84137010', 'Bomba de assistência de direção hidráulica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (252, '0109400', '84145910', 'Motoventiladores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (253, '0109400', '84145990', 'Motoventiladores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (254, '0109500', '84213990', 'Filtros de pólen do ar-condicionado');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (255, '0109600', '85011019', '“Máquina” de vidro elétrico de porta');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (256, '0109700', '85013110', 'Motor de limpador de para-brisa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (257, '0109800', '85045000', 'Bobinas de reatância e de autoindução');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (258, '0109900', '850720', 'Baterias de chumbo e de níquel-cádmio');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (259, '0109900', '850730', 'Baterias de chumbo e de níquel-cádmio');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (260, '0110000', '85123000', 'Aparelhos de sinalização acústica (buzina)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (261, '0110100', '9032898', 'Instrumentos para regulação de grandezas não elétricas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (262, '0110100', '9032899', 'Instrumentos para regulação de grandezas não elétricas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (263, '0110200', '90271000', 'Analisadores de gases ou de fumaça (sonda lambda)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (264, '0110300', '40081100', 'Perfilados de borracha vulcanizada não endurecida');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (265, '0110400', '56012219', 'Artefatos de pasta de fibra de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (266, '0110500', '57032000', 'Tapetes/carpetes - nailón');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (267, '0110600', '57033000', 'Tapetes de matérias têxteis sintéticas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (268, '0110700', '59119000', 'Forração interior capacete');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (269, '0110800', '69039099', 'Outros para-brisas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (270, '0110900', '70072900', 'Moldura com espelho');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (271, '0111000', '73145000', 'Corrente de transmissão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (272, '0111100', '73151100', 'Corrente transmissão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (273, '0111200', '73151210', 'Outras correntes de transmissão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (274, '0111300', '84189900', 'Condensador tubular metálico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (275, '0111400', '841950', 'Trocadores de calor');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (276, '0111500', '84249090', 'Partes de aparelhos mecânicos de pulverizar ou dispersar');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (277, '0111600', '84254910', 'Macacos manuais para veículos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (278, '0111700', '84314100', 'Caçambas, pás, ganchos e tenazes para máquinas rodoviárias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (279, '0111800', '85016100', 'Geradores de corrente alternada de potência não superior a 75 kva');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (280, '0111900', '85311090', 'Aparelhos elétricos para alarme de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (281, '0112000', '90141000', 'Bússolas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (282, '0112100', '90251990', 'Indicadores de temperatura');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (283, '0112200', '90259010', 'Partes de indicadores de temperatura');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (284, '0112300', '902690', 'Partes de aparelhos de medida ou controle');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (285, '0112400', '90321010', 'Termostatos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (286, '0112500', '90321090', 'Instrumentos e aparelhos para regulação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (287, '0112600', '90322000', 'Pressostatos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (288, '0112700', '871690', 'Peças para reboques e semirreboques, exceto os itens classificados no CEST 01.077.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (289, '0112800', '73229010', 'Geradores de ar quente a combustível líquido, com capacidade superior ou igual a 1.500 kcal/h, mas inferior ou igual a 10.400 kcal/h, do tipo dos utilizados em veículos automóveis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (290, '0199900', 'NT', 'Outras peças, partes e acessórios para veículos automotores não relacionados nos demais itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (291, '0200100', '2205', 'Aperitivos, amargos, bitter e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (292, '0200100', '22089000', 'Aperitivos, amargos, bitter e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (293, '0200200', '22089000', 'Batida e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (294, '0200300', '22089000', 'Bebida ice');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (295, '0200400', '220720', 'Cachaça e aguardentes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (296, '0200400', '22084000', 'Cachaça e aguardentes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (297, '0200500', '2205', 'Catuaba e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (298, '0200500', '22060090', 'Catuaba e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (299, '0200500', '22089000', 'Catuaba e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (300, '0200600', '22082000', 'Conhaque, brandy e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (301, '0200700', '22060090', 'Cooler');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (302, '0200700', '22089000', 'Cooler');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (303, '0200800', '22085000', 'Gim (gin) e genebra');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (304, '0200900', '2205', 'Jurubeba e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (305, '0200900', '22060090', 'Jurubeba e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (306, '0200900', '22089000', 'Jurubeba e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (307, '0201000', '22087000', 'Licores e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (308, '0201100', '22082000', 'Pisco');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (309, '0201200', '22084000', 'Rum');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (310, '0201300', '22060090', 'Saquê');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (311, '0201400', '22089000', 'Steinhaeger');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (312, '0201500', '22089000', 'Tequila');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (313, '0201600', '220830', 'Uísque');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (314, '0201700', '2205', 'Vermute e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (315, '0201800', '22086000', 'Vodka');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (316, '0201900', '22089000', 'Derivados de vodka');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (317, '0202000', '22089000', 'Arak');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (318, '0202100', '22082000', 'Aguardente vínica / grappa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (319, '0202200', '22060010', 'Sidra e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (320, '0202300', '2205', 'Sangrias e coquetéis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (321, '0202300', '22060090', 'Sangrias e coquetéis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (322, '0202300', '22089000', 'Sangrias e coquetéis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (323, '0202400', '2204', 'Vinhos de uvas frescas, incluindo os vinhos enriquecidos com álcool; mostos de uvas.');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (324, '0299900', '2205', 'Outras bebidas alcoólicas não especificadas nos itens anteriores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (325, '0299900', '2206', 'Outras bebidas alcoólicas não especificadas nos itens anteriores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (326, '0299900', '2207', 'Outras bebidas alcoólicas não especificadas nos itens anteriores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (327, '0299900', '2208', 'Outras bebidas alcoólicas não especificadas nos itens anteriores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (328, '0300100', '22011000', 'Água mineral, gasosa ou não, ou potável, naturais, em garrafa de vidro, retornável ou não, com capacidade de até 500 ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (329, '0300200', '22011000', 'Água mineral, gasosa ou não, ou potável, naturais, em embalagem com capacidade igual ou superior a 5.000 ml; exceto as classificadas no CEST 03.024.00 e 03.025.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (330, '0300300', '22011000', 'Água mineral, gasosa ou não, ou potável, naturais, em embalagem de vidro, não retornável, com capacidade de até 300 ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (331, '0300400', '22011000', 'Água mineral, gasosa ou não, ou potável, naturais, em garrafa plástica de 1.500 ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (332, '0300500', '22011000', 'Água mineral, gasosa ou não, ou potável, naturais, em copos plásticos e embalagem plástica com capacidade de até 500 ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (333, '0300600', '22011000', 'Outras águas minerais, potáveis ou naturais, gasosas ou não, inclusive gaseificadas; exceto as classificadas no CEST 03.024.00 e 03.025.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (334, '0300700', '22021000', 'Águas minerais, potáveis ou naturais, gasosas ou não, inclusive gaseificadas ou aromatizadas artificialmente, exceto os refrescos e refrigerantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (335, '0300800', '22029900', 'Outras águas minerais, potáveis ou naturais, gasosas ou não, inclusive gaseificadas ou aromatizadas artificialmente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (336, '0301000', '2202', 'Refrigerantes em garrafa com capacidade igual ou superior a 600 ml, exceto os classificados no CEST 03.011.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (337, '0301100', '2202', 'Demais refrigerantes, exceto os classificados no CEST 03.010.00 e 03.011.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (338, '0301101', '2202', 'Espumantes sem álcool');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (339, '0301200', '21069010', 'Xarope ou extrato concentrado destinados ao preparo de refrigerante em máquina “pré-mix” ou “post-mix”');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (340, '0301300', '210690', 'Bebidas energéticas em embalagem com capacidade inferior a 600ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (341, '0301300', '22029900', 'Bebidas energéticas em embalagem com capacidade inferior a 600ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (342, '0301400', '210690', 'Bebidas energéticas em embalagem com capacidade igual ou superior a 600ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (343, '0301400', '22029900', 'Bebidas energéticas em embalagem com capacidade igual ou superior a 600ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (344, '0301500', '210690', 'Bebidas hidroeletrolíticas (isotônicas) em embalagem com capacidade inferior a 600ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (345, '0301500', '22029900', 'Bebidas hidroeletrolíticas (isotônicas) em embalagem com capacidade inferior a 600ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (346, '0301600', '210690', 'Bebidas hidroeletrolíticas (isotônicas) em embalagem com capacidade inferior a 600ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (347, '0301600', '22029900', 'Bebidas hidroeletrolíticas (isotônicas) em embalagem com capacidade igual ou superior a 600ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (348, '0302100', '22030000', 'Cerveja');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (349, '0302200', '22029100', 'Cerveja sem álcool');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (350, '0302300', '22030000', 'Chope');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (351, '0302400', '22011000', 'Água mineral em embalagens retornáveis com capacidade igual ou superior a 10 (dez) e inferior a 20 (vinte) litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (352, '0302500', '22011000', 'Água mineral em embalagens retornáveis com capacidade igual ou superior a 20 (vinte) litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (353, '0400100', '2402', 'Charutos, cigarrilhas e cigarros, de tabaco ou dos seus sucedâneos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (354, '0400200', '24031', 'Tabaco para fumar, mesmo contendo sucedâneos de tabaco em qualquer proporção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (355, '0500100', '2523', 'Cimento');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (356, '1004400', '7312', 'Fios de ferro ou aço não ligados, não revestidos, mesmo polidos; cordas, cabos, tranças (entrançados), lingas e artefatos semelhantes, de ferro ou aço, não isolados para usos elétricos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (357, '1004500', '72172010', 'Outros fios de ferro ou aço, não ligados, galvanizados com teor de carbono superior ou igual a 0,6%, em peso');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (358, '1004501', '72172090', 'Outros fios de ferro ou aço, não ligados, galvanizados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (359, '1004600', '7307', 'Acessórios para tubos (inclusive uniões, cotovelos, luvas ou mangas), de ferro fundido, ferro ou aço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (360, '1004700', '73083000', 'Portas e janelas, e seus caixilhos, alizares e soleiras de ferro fundido, ferro ou aço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (361, '1004800', '73084000', 'Material para andaimes, para armações (cofragens) e para escoramentos, (inclusive armações prontas, para estruturas de concreto armado ou argamassa armada), eletrocalhas e perfilados de ferro fundido, ferro ou aço, próprios para construção, exceto treliças de aço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (362, '1004800', '730890', 'Material para andaimes, para armações (cofragens) e para escoramentos, (inclusive armações prontas, para estruturas de concreto armado ou argamassa armada), eletrocalhas e perfilados de ferro fundido, ferro ou aço, próprios para construção, exceto treliças de aço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (363, '1004900', '73084000', 'Treliças de aço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (364, '1005000', '73089090', 'Telhas metálicas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (365, '1005100', '7310', 'Caixas diversas (tais como caixa de correio, de entrada de água, de energia, de instalação) de ferro fundido, ferro ou aço; próprias para a construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (366, '1005200', '73130000', 'Arame farpado, de ferro ou aço, arames ou tiras, retorcidos, mesmo farpados, de ferro ou aço, dos tipos utilizados em cercas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (367, '1005300', '7314', 'Telas metálicas, grades e redes, de fios de ferro ou aço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (368, '1005400', '73151100', 'Correntes de rolos, de ferro fundido, ferro ou aço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (369, '1005500', '73151290', 'Outras correntes de elos articulados, de ferro fundido, ferro ou aço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (370, '1005600', '73158200', 'Correntes de elos soldados, de ferro fundido, de ferro ou aço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (371, '1005700', '731700', 'Tachas, pregos, percevejos, escápulas, grampos ondulados ou biselados e artefatos semelhantes, de ferro fundido, ferro ou aço, mesmo com a cabeça de outra matéria, exceto cobre');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (372, '1005800', '7318', 'Parafusos, pinos ou pernos, roscados, porcas, tira-fundos, ganchos roscados, rebites, chavetas, cavilhas, contrapinos, arruelas (incluídas as de pressão) e artefatos semelhantes, de ferro fundido, ferro ou aço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (373, '1005900', '7323', 'Palha de ferro ou aço, exceto os de uso doméstico classificados na posição NCM 7323.10.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (374, '1005901', '7323', 'Esponjas, esfregões, luvas e artefatos semelhantes para limpeza, polimento e usos semelhantes, de ferro ou aço, exceto os de uso doméstico classificados na posição NCM 7323.10.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (375, '1006000', '7324', 'Artefatos de higiene ou de toucador, e suas partes, de ferro fundido, ferro ou aço, incluídas as pias, banheiras, lavatórios, cubas, mictórios, tanques e afins de ferro fundido, ferro ou aço, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (376, '1006100', '7325', 'Outras obras moldadas, de ferro fundido, ferro ou aço, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (377, '1006200', '7326', 'Abraçadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (378, '1006300', '7407', 'Barras de cobre');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (379, '1006400', '74111010', 'Tubos de cobre e suas ligas, para instalações de água quente e gás, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (380, '1006500', '7412', 'Acessórios para tubos (por exemplo, uniões, cotovelos, luvas ou mangas) de cobre e suas ligas, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (381, '1006600', '7415', 'Tachas, pregos, percevejos, escápulas e artefatos semelhantes, de cobre, ou de ferro ou aço com cabeça de cobre, parafusos, pinos ou pernos, roscados, porcas, ganchos roscados, rebites, chavetas, cavilhas, contrapinos, arruelas (incluídas as de pressão), e artefatos semelhantes, de cobre');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (382, '1006700', '74182000', 'Artefatos de higiene/toucador de cobre, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (383, '1006800', '76071990', 'Manta de subcobertura aluminizada');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (384, '1006900', '7608', 'Tubos de alumínio e suas ligas, para refrigeração e ar condicionado, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (385, '1007000', '76090000', 'Acessórios para tubos (por exemplo, uniões, cotovelos, luvas ou mangas), de alumínio, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (386, '1007100', '7610', 'Construções e suas partes (por exemplo, pontes e elementos de pontes, torres, pórticos ou pilones, pilares, colunas, armações, estruturas para telhados, portas e janelas, e seus caixilhos, alizares e soleiras, balaustradas), de alumínio, exceto as construções pré-fabricadas da posição 9406; chapas, barras, perfis, tubos e semelhantes, de alumínio, próprios para construções');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (387, '1007200', '76152000', 'Artefatos de higiene/toucador de alumínio, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (388, '1007300', '7616', 'Outras obras de alumínio, próprias para construções, incluídas as persianas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (389, '1007400', '83024100', 'Outras guarnições, ferragens e artigos semelhantes de metais comuns, para construções, inclusive puxadores.');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (390, '1007500', '8301', 'Fechaduras e ferrolhos (de chave, de segredo ou elétricos), de metais comuns, incluídas as suas partes fechos e armações com fecho, com fechadura, de metais comuns chaves para estes artigos, de metais comuns; exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (391, '1007600', '83021000', 'Dobradiças de metais comuns, de qualquer tipo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (392, '1007700', '8307', 'Tubos flexíveis de metais comuns, mesmo com acessórios, para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (393, '1007800', '8311', 'Fios, varetas, tubos, chapas, eletrodos e artefatos semelhantes, de metais comuns ou de carbonetos metálicos, revestidos exterior ou interiormente de decapantes ou de fundentes, para soldagem (soldadura) ou depósito de metal ou de carbonetos metálicos fios e varetas de pós de metais comuns aglomerados, para metalização por projeção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (394, '1007900', '8481', 'Torneiras, válvulas (incluídas as redutoras de pressão e as termostáticas) e dispositivos semelhantes, para canalizações, caldeiras, reservatórios, cubas e outros recipientes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (395, '1008000', '7009', 'Espelhos de vidro, mesmo emoldurados, exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (396, '1100100', '28289011', 'Água sanitária, branqueador e outros alvejantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (397, '1100100', '28289019', 'Água sanitária, branqueador e outros alvejantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (398, '1100100', '32064100', 'Água sanitária, branqueador e outros alvejantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (399, '1100100', '34022000', 'Água sanitária, branqueador e outros alvejantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (400, '1100100', '38089419', 'Água sanitária, branqueador e outros alvejantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (401, '1100200', '34012090', 'Sabões em pó, flocos, palhetas, grânulos ou outras formas semelhantes, para lavar roupas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (402, '1100300', '34012090', 'Sabões líquidos para lavar roupas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (403, '1100400', '34022000', 'Detergentes em pó, flocos, palhetas, grânulos ou outras formas semelhantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (404, '1100500', '34022000', 'Detergentes líquidos, exceto para lavar roupa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (405, '1100600', '34022000', 'Detergente líquido para lavar roupa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (406, '1100700', '3402', 'Outros agentes orgânicos de superfície (exceto sabões);
preparações tensoativas, preparações para lavagem (incluídas as preparações auxiliares para lavagem) e preparações para limpeza (inclusive multiuso e limpadores), mesmo contendo sabão, exceto os produtos descritos nos CEST 11.001.00, 11.004.00, 11.005.00 e 11.006.00; em embalagem de conteúdo inferior ou igual a 50 litros ou 50 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (407, '1100800', '38099190', 'Amaciante/suavizante');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (408, '1100900', '39241000', 'Esponjas para limpeza');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (409, '1100900', '39249000', 'Esponjas para limpeza');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (410, '1100900', '68053010', 'Esponjas para limpeza');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (411, '1704404', '11010010', 'Farinha de trigo especial, em embalagem superior a 25 kg e inferior ou igual a 50 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (412, '1704405', '11010010', 'Farinha de trigo comum, em embalagem igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (413, '1704406', '11010010', 'Farinha de trigo comum, em embalagem superior a 5 kg e inferior ou igual a 25 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (414, '1704407', '11010010', 'Farinha de trigo comum, em embalagem superior a 25 kg e inferior ou igual a 50 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (415, '1704408', '11010010', 'Farinha de trigo doméstica especial, em embalagem superior a 5 kg e inferior e igual a 10 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (416, '1704409', '11010010', 'Farinha de trigo doméstica com fermento, em embalagem superior a 5 kg e inferior e igual a 10 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (417, '1704410', '11010010', 'Farinha de trigo especial, em embalagem superior a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (418, '1704411', '11010010', 'Farinha de trigo comum, em embalagem inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (419, '1704412', '11010010', 'Farinha de trigo comum, em embalagem superior a 1 kg e inferior a 5 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (420, '1704413', '11010010', 'Farinha de trigo comum, em embalagem superior a 50 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (421, '1704414', '11010010', 'Farinha de trigo doméstica especial, em embalagem inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (422, '1704415', '11010010', 'Farinha de trigo doméstica especial, em embalagem superior a 1 kg e inferior a 5 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (423, '1704416', '11010010', 'Farinha de trigo doméstica especial, em embalagem igual a 5 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (424, '1704417', '11010010', 'Farinha de trigo doméstica especial, em embalagem superior a 10 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (425, '1704418', '11010010', 'Farinha de trigo doméstica com fermento, em embalagem inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (426, '1704419', '11010010', 'Farinha de trigo doméstica com fermento, em embalagem superior a 1 kg e inferior a 5 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (427, '1704420', '11010010', 'Farinha de trigo doméstica com fermento, em embalagem igual a 5 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (428, '1704421', '11010010', 'Farinha de trigo doméstica com fermento, em embalagem superior a 10 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (429, '1704422', '11010010', 'Outras farinhas de trigo, em embalagem inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (430, '1704423', '11010010', 'Outras farinhas de trigo, em embalagem superior a 1 kg e inferior a 5 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (431, '1704424', '11010010', 'Outras farinhas de trigo, em embalagem igual a 5 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (432, '1704425', '11010010', 'Outras farinhas de trigo, em embalagem superior a 5 Kg e inferior ou igual a 25 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (433, '1704426', '11010010', 'Outras farinhas de trigo, em embalagem superior a 25 Kg e inferior ou igual a 50 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (434, '1704427', '11010010', 'Outras farinhas de trigo, em embalagem superior a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (435, '1704500', '11010020', 'Farinha de mistura de trigo com centeio (méteil)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (436, '1704600', '19012000', 'Misturas e preparações para bolos, em embalagem inferior 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (437, '1704600', '19019090', 'Misturas e preparações para bolos, em embalagem inferior 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (438, '1704601', '19012000', 'Misturas e preparações para bolos, em embalagem igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (439, '1704601', '19019090', 'Misturas e preparações para bolos, em embalagem igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (440, '1704602', '19012000', 'Misturas e preparações para bolos, em embalagem superior a 5 kg e inferior ou igual a 25 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (441, '1704602', '19019090', 'Misturas e preparações para bolos, em embalagem superior a 5 kg e inferior ou igual a 25 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (442, '1704603', '19012000', 'Misturas e preparações para bolos, em embalagem superior a 25 kg e inferior ou igual a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (443, '1704603', '19019090', 'Misturas e preparações para bolos, em embalagem superior a 25 kg e inferior ou igual a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (444, '1704604', '19012000', 'Misturas e preparações para bolos, em embalagem superior a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (445, '1704604', '19019090', 'Misturas e preparações para bolos, em embalagem superior a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (446, '1704605', '19012000', 'Misturas e preparações para pães com menos de 80% de farinha de trigo na sua composição final, em embalagem inferior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (447, '1704605', '19019090', 'Misturas e preparações para pães com menos de 80% de farinha de trigo na sua composição final, em embalagem inferior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (448, '1704606', '19012000', 'Misturas e preparações para pães com menos de 80% de farinha de trigo na sua composição final, em embalagem igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (449, '1704606', '19019090', 'Misturas e preparações para pães com menos de 80% de farinha de trigo na sua composição final, em embalagem igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (450, '1704607', '19012000', 'Misturas e preparações para pães com menos de 80% de farinha de trigo na sua composição final, em embalagem superior a 5 kg e inferior ou igual a 25 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (451, '1704607', '19019090', 'Misturas e preparações para pães com menos de 80% de farinha de trigo na sua composição final, em embalagem superior a 5 kg e inferior ou igual a 25 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (452, '1704608', '19012000', 'Misturas e preparações para pães com menos de 80% de farinha de trigo na sua composição final, em embalagem superior a 25 kg e inferior ou igual a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (453, '1704608', '19019090', 'Misturas e preparações para pães com menos de 80% de farinha de trigo na sua composição final, em embalagem superior a 25 kg e inferior ou igual a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (454, '1704609', '19012000', 'Misturas e preparações para pães com menos de 80% de farinha de trigo na sua composição final, em embalagem superior a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (455, '1704609', '19019090', 'Misturas e preparações para pães com menos de 80% de farinha de trigo na sua composição final, em embalagem superior a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (456, '1704610', '19012000', 'Misturas e preparações para pães com, no mínimo, 80% de farinha de trigo na sua composição final, em embalagem inferior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (457, '1704610', '19019090', 'Misturas e preparações para pães com, no mínimo, 80% de farinha de trigo na sua composição final, em embalagem inferior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (458, '1704611', '19012000', 'Misturas e preparações para pães com, no mínimo, 80% de farinha de trigo na sua composição final, em embalagem igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (459, '1704611', '19019090', 'Misturas e preparações para pães com, no mínimo, 80% de farinha de trigo na sua composição final, em embalagem igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (460, '1704612', '19012000', 'Misturas e preparações para pães com, no mínimo, 80% de farinha de trigo na sua composição final, em embalagem superior a 5 kg e inferior ou igual a 25 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (461, '1704612', '19019090', 'Misturas e preparações para pães com, no mínimo, 80% de farinha de trigo na sua composição final, em embalagem superior a 5 kg e inferior ou igual a 25 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (462, '1704613', '19012000', 'Misturas e preparações para pães com, no mínimo, 80% de farinha de trigo na sua composição final, em embalagem superior a 25 kg e inferior ou igual a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (463, '1704613', '19019090', 'Misturas e preparações para pães com, no mínimo, 80% de farinha de trigo na sua composição final, em embalagem superior a 25 kg e inferior ou igual a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (464, '1704614', '19012000', 'Misturas e preparações para pães com, no mínimo, 80% de farinha de trigo na sua composição final, em embalagem superior a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (465, '1704614', '19019090', 'Misturas e preparações para pães com, no mínimo, 80% de farinha de trigo na sua composição final, em embalagem superior a 50 Kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (466, '1704700', '19023000', 'Massas alimentícias tipo instantânea');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (467, '1704800', '1902', 'Massas alimentícias, cozidas ou recheadas (de carne ou de outras substâncias) ou preparadas de outro modo, exceto as descritas nos CEST 17.047.00, 17.048.01, e 17.048.02');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (468, '1704801', '19024000', 'Cuscuz');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (469, '1704802', '19022000', 'Massas alimentícias recheadas (mesmo cozidas ou preparadas de outro modo)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (470, '1704900', '19021', 'Massas alimentícias do tipo comum, não cozidas, nem recheadas, nem preparadas de outro modo, exceto a descrita no CEST 17.049.03');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (471, '1704901', '19021', 'Massas alimentícias do tipo sêmola, não cozidas, nem recheadas, nem preparadas de outro modo, exceto a descrita no CEST 17.049.04');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (472, '1707903', '16023220', 'Outras preparações e conservas de carne, de miudezas ou de sangue, todas de aves da posição 01.05: de galos e de galinhas, com conteúdo de carne ou de miudezas superior ou igual a 57 %, em peso, cozidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (473, '1707904', '16024100', 'Outras preparações e conservas de carne, de miudezas ou de sangue, da espécie suína: pernas e respectivos pedaços');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (474, '1707905', '16024900', 'Outras preparações e conservas de carne, de miudezas ou de sangue, da espécie suína: outras, incluindo as misturas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (475, '1707906', '16025000', 'Outras preparações e conservas de carne, de miudezas ou de sangue, da espécie bovina, exceto os descritos no CEST 17.079.07');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (476, '1707907', '16025000', 'Apresuntado');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (477, '1708000', '1604', 'Preparações e conservas de peixes; caviar e seus sucedâneos preparados a partir de ovas de peixe; exceto os descritos nos CEST 17.080.01 e 17.081.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (478, '1708001', '16042010', 'Outras preparações e conservas de atuns');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (479, '1708100', '1604', 'Sardinha em conserva');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (480, '1708200', '1605', 'Crustáceos, moluscos e outros invertebrados aquáticos, preparados ou em conservas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (481, '1708300', '02102000', 'Carne de gado bovino, ovino e bufalino e produtos comestíveis resultantes da matança desse gado submetidos à salga, secagem ou desidratação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (482, '1708300', '02109900', 'Carne de gado bovino, ovino e bufalino e produtos comestíveis resultantes da matança desse gado submetidos à salga, secagem ou desidratação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (483, '1708300', '1502', 'Carne de gado bovino, ovino e bufalino e produtos comestíveis resultantes da matança desse gado submetidos à salga, secagem ou desidratação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (484, '1708400', '0201', 'Carne de gado bovino, ovino e bufalino e demais produtos comestíveis resultantes da matança desse gado frescos, refrigerados ou congelados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (485, '1708400', '0202', 'Carne de gado bovino, ovino e bufalino e demais produtos comestíveis resultantes da matança desse gado frescos, refrigerados ou congelados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (486, '1708400', '0204', 'Carne de gado bovino, ovino e bufalino e demais produtos comestíveis resultantes da matança desse gado frescos, refrigerados ou congelados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (487, '1708400', '0206', 'Carne de gado bovino, ovino e bufalino e demais produtos comestíveis resultantes da matança desse gado frescos, refrigerados ou congelados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (488, '1708500', '0204', 'Carnes de animais das espécies caprina, frescas, refrigeradas ou congeladas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (489, '1708600', '02109900', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados ou salmourados resultantes do abate de caprinos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (490, '1708600', '15021019', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados ou salmourados resultantes do abate de caprinos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (491, '1708600', '15029000', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados ou salmourados resultantes do abate de caprinos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (492, '1708700', '0207', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados, em salmoura, simplesmente temperados, secos ou defumados, resultantes do abate de aves, exceto os descritos no CEST 17.087.02');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (493, '1708700', '0209', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados, em salmoura, simplesmente temperados, secos ou defumados, resultantes do abate de aves, exceto os descritos no CEST 17.087.02');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (494, '1708700', '02109900', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados, em salmoura, simplesmente temperados, secos ou defumados, resultantes do abate de aves, exceto os descritos no CEST 17.087.02');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (495, '1708700', '1501', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados, em salmoura, simplesmente temperados, secos ou defumados, resultantes do abate de aves, exceto os descritos no CEST 17.087.02');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (496, '1708701', '0203', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados, em salmoura, simplesmente temperados, secos ou defumados, resultantes do abate de suínos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (497, '1708701', '0206', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados, em salmoura, simplesmente temperados, secos ou defumados, resultantes do abate de suínos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (498, '1708701', '0209', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados, em salmoura, simplesmente temperados, secos ou defumados, resultantes do abate de suínos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (499, '1708701', '02101', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados, em salmoura, simplesmente temperados, secos ou defumados, resultantes do abate de suínos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (500, '1708701', '02109900', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados, em salmoura, simplesmente temperados, secos ou defumados, resultantes do abate de suínos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (501, '1708701', '1501', 'Carnes e demais produtos comestíveis frescos, resfriados, congelados, salgados, em salmoura, simplesmente temperados, secos ou defumados, resultantes do abate de suínos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (502, '1708702', '02071', 'Carnes de aves inteiras e com peso unitário superior a 3 kg, temperadas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (503, '1708702', '02072', 'Carnes de aves inteiras e com peso unitário superior a 3 kg, temperadas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (504, '1708800', '0710', 'Produtos hortícolas, cozidos em água ou vapor, congelados, em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (505, '1708801', '0710', 'Produtos hortícolas, cozidos em água ou vapor, congelados, em embalagens de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (506, '1708900', '0811', 'Frutas, não cozidas ou cozidas em água ou vapor, congeladas, mesmo adicionadas de açúcar ou de outros edulcorantes, em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (507, '1708901', '0811', 'Frutas, não cozidas ou cozidas em água ou vapor, congeladas, mesmo adicionadas de açúcar ou de outros edulcorantes, em embalagens de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (508, '1709000', '2001', 'Produtos hortícolas, frutas e outras partes comestíveis de plantas, preparados ou conservados em vinagre ou em ácido acético, em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (509, '1709001', '2001', 'Produtos hortícolas, frutas e outras partes comestíveis de plantas, preparados ou conservados em vinagre ou em ácido acético, em embalagens de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (510, '1709100', '2004', 'Outros produtos hortícolas preparados ou conservados, exceto em vinagre ou em ácido acético, congelados, com exceção dos produtos da posição 20.06, em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (511, '1709101', '2004', 'Outros produtos hortícolas preparados ou conservados, exceto em vinagre ou em ácido acético, congelados, com exceção dos produtos da posição 20.06, em embalagens de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (512, '1709200', '2005', 'Outros produtos hortícolas preparados ou conservados, exceto em vinagre ou em ácido acético, não congelados, com exceção dos produtos da posição 20.06, excluídos batata, inhame e mandioca fritos, em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (513, '1709201', '2005', 'Outros produtos hortícolas preparados ou conservados, exceto em vinagre ou em ácido acético, não congelados, com exceção dos produtos da posição 20.06, excluídos batata, inhame e mandioca fritos, em embalagens de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (514, '1709300', '20060000', 'Produtos hortícolas, frutas, cascas de frutas e outras partes de plantas, conservados com açúcar (passados por calda, glaceados ou cristalizados), em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (515, '1709301', '20060000', 'Produtos hortícolas, frutas, cascas de frutas e outras partes de plantas, conservados com açúcar (passados por calda, glaceados ou cristalizados), em embalagens de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (516, '1709400', '2007', 'Doces, geleias, “marmelades”, purês e pastas de frutas, obtidos por cozimento, com ou sem adição de açúcar ou de outros edulcorantes, em embalagens de conteúdo inferior ou igual a 1 kg, exceto as embalagens individuais de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (517, '1709401', '2007', 'Doces, geleias, “marmelades”, purês e pastas de frutas, obtidos por cozimento, com ou sem adição de açúcar ou de outros edulcorantes, em embalagens de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (518, '1709500', '2008', 'Frutas e outras partes comestíveis de plantas, preparadas ou conservadas de outro modo, com ou sem adição de açúcar ou de outros edulcorantes ou de álcool, não especificadas nem compreendidas em outras posições, excluídos os amendoins e castanhas tipo aperitivo, da posição 2008.1, em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (519, '1709501', '2008', 'Frutas e outras partes comestíveis de plantas, preparadas ou conservadas de outro modo, com ou sem adição de açúcar ou de outros edulcorantes ou de álcool, não especificadas nem compreendidas em outras posições, excluídos os amendoins e castanhas tipo aperitivo, da posição 2008.1, em embalagens superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (520, '1709600', '0901', 'Café torrado e moído, em embalagens de conteúdo inferior ou igual a 2 kg, exceto os classificados nos CEST 17.096.04 e 17.096.05');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (521, '1709601', '0901', 'Café torrado e moído, em embalagens de conteúdo superior a 2 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (522, '1709602', '0901', 'Café torrado em grão, em embalagens de conteúdo inferior ou igual a 2 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (523, '1709603', '0901', 'Café torrado em grão, em embalagens de conteúdo superior a 2 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (524, '1709604', '0901', 'Café torrado e moído, em cápsulas, exceto os descritos no CEST 17.096.05');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (525, '1709605', '0901', 'Café descafeinado torrado e moído, em cápsulas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (526, '1709700', '0902', 'Chá, mesmo aromatizado');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (527, '1709700', '12119090', 'Chá, mesmo aromatizado');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (528, '1709700', '21069090', 'Chá, mesmo aromatizado');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (529, '1709800', '090300', 'Mate');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (530, '1709900', '17011', 'Açúcar refinado, em embalagens de conteúdo inferior ou igual a 2 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (531, '1709900', '17019900', 'Açúcar refinado, em embalagens de conteúdo inferior ou igual a 2 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (532, '1709901', '17011', 'Açúcar refinado, em embalagens de conteúdo superior a 2 kg e inferior ou igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (533, '1709901', '17019900', 'Açúcar refinado, em embalagens de conteúdo superior a 2 kg e inferior ou igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (534, '1709902', '17011', 'Açúcar refinado, em embalagens de conteúdo superior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (535, '1709902', '17019900', 'Açúcar refinado, em embalagens de conteúdo superior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (536, '1710000', '17019100', 'Açúcar refinado adicionado de aromatizante ou de corante em embalagens de conteúdo inferior ou igual a 2 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (537, '1710001', '17019100', 'Açúcar refinado adicionado de aromatizante ou de corante em embalagens de conteúdo superior a 2 kg e inferior ou igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (538, '1710002', '17019100', 'Açúcar refinado adicionado de aromatizante ou de corante em embalagens de conteúdo superior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (539, '1710100', '17011', 'Açúcar cristal, em embalagens de conteúdo inferior ou igual a 2 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (540, '1710100', '17019900', 'Açúcar cristal, em embalagens de conteúdo inferior ou igual a 2 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (541, '1710101', '17011', 'Açúcar cristal, em embalagens de conteúdo superior a 2 kg e inferior ou igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (542, '1710101', '17019900', 'Açúcar cristal, em embalagens de conteúdo superior a 2 kg e inferior ou igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (543, '1710102', '17011', 'Açúcar cristal, em embalagens de conteúdo superior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (544, '1710102', '17019900', 'Açúcar cristal, em embalagens de conteúdo superior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (545, '1710200', '17019100', 'Açúcar cristal adicionado de aromatizante ou de corante, em embalagens de conteúdo inferior ou igual a 2 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (546, '1710201', '17019100', 'Açúcar cristal adicionado de aromatizante ou de corante, em embalagens de conteúdo superior a 2 kg e inferior ou igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (547, '1710202', '170191', 'Açúcar cristal adicionado de aromatizante ou de corante, em embalagens de conteúdo superior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (548, '1710300', '17011', 'Outros tipos de açúcar, em embalagens de conteúdo inferior ou igual a 2 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (549, '1710300', '17019900', 'Outros tipos de açúcar, em embalagens de conteúdo inferior ou igual a 2 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (550, '1710301', '17011', 'Outros tipos de açúcar, em embalagens de conteúdo superior a 2 kg e inferior ou igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (551, '1710301', '17019900', 'Outros tipos de açúcar, em embalagens de conteúdo superior a 2 kg e inferior ou igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (552, '1710302', '17011', 'Outros tipos de açúcar, em embalagens de conteúdo superior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (553, '1710302', '17019900', 'Outros tipos de açúcar, em embalagens de conteúdo superior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (554, '1710400', '17019100', 'Outros tipos de açúcar adicionado de aromatizante ou de corante, em embalagens de conteúdo inferior ou igual a 2 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (555, '1710401', '17019100', 'Outros tipos de açúcar adicionado de aromatizante ou de corante, em embalagens de conteúdo superior a 2 kg e inferior ou igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (556, '1710402', '17019100', 'Outros tipos de açúcar adicionado de aromatizante ou de corante, em embalagens de conteúdo superior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (557, '1710500', '1702', 'Outros açúcares em embalagens de conteúdo inferior ou igual a 2 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (558, '1710501', '1702', 'Outros açúcares, em embalagens de conteúdo superior a 2 kg e inferior ou igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (559, '1710502', '1702', 'Outros açúcares, em embalagens de conteúdo superior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (560, '1710600', '20081900', 'Milho para pipoca (micro-ondas)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (561, '1710700', '21011', 'Extratos, essências e concentrados de café e preparações à base destes extratos, essências ou concentrados ou à base de café, em embalagens de conteúdo inferior ou igual a 500 g, exceto os classificados no CEST 17.107.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (562, '1710701', '21011', 'Extratos, essências e concentrados de café e preparações à base destes extratos, essências ou concentrados ou à base de café, em cápsulas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (563, '1704902', '19021', 'Massas alimentícias do tipo granoduro, não cozidas, nem recheadas, nem preparadas de outro modo, exceto a descrita no CEST 17.049.05');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (564, '1704903', '19021900', 'Massas alimentícias do tipo comum, não cozidas, nem recheadas, nem preparadas de outro modo, que não contenham ovos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (565, '1704904', '19021900', 'Massas alimentícias do tipo sêmola, não cozidas, nem recheadas, nem preparadas de outro modo, que não contenham ovos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (566, '1704905', '19021900', 'Massas alimentícias do tipo granoduro, não cozidas, nem recheadas, nem preparadas de outro modo, que não contenham ovos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (567, '1705000', '190520', 'Pães industrializados, inclusive de especiarias, exceto panetones e bolo de forma');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (568, '1705100', '19052090', 'Bolo de forma, inclusive de especiarias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (569, '1705200', '19052010', 'Panetones');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (570, '1705300', '19053100', 'Biscoitos e bolachas derivados de farinha de trigo; (exceto dos tipos “cream cracker”, “água e sal”, “maisena”, “maria” e outros de consumo popular que não sejam adicionados de cacau, nem recheados, cobertos ou amanteigados, independentemente de sua denominação comercial)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (571, '1705301', '19053100', 'Biscoitos e bolachas derivados de farinha de trigo dos tipos “maisena” e “maria” e outros de consumo popular que não sejam adicionados de cacau, nem recheados, cobertos ou amanteigados, independentemente de sua denominação comercial, exceto o CEST 17.053.02');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (572, '1705302', '19053100', 'Biscoitos e bolachas derivados de farinha de trigo dos tipos "cream cracker" e "água e sal" de consumo popular');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (573, '1705400', '19053100', 'Biscoitos e bolachas não derivados de farinha de trigo; (exceto dos tipos "cream cracker", "água e sal", "maisena" e "maria" e outros de consumo popular que não sejam adicionados de cacau, nem recheados, cobertos ou amanteigados, independentemente de sua denominação comercial)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (574, '1705401', '19053100', 'Biscoitos e bolachas não derivados de farinha de trigo dos tipos "maisena" e "maria" e outros de consumo popular que não sejam adicionados de cacau, nem recheados, cobertos ou amanteigados, independentemente de sua denominação comercial, exceto o CEST 17.054.02');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (575, '1705402', '19053100', 'Biscoitos e bolachas não derivados de farinha de trigo dos tipos "cream cracker" e "água e sal" de consumo popular');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (576, '1705600', '19059020', 'Biscoitos e bolachas derivados de farinha de trigo dos tipos “cream cracker” e “água e sal”');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (577, '1705601', '19059020', 'Biscoitos e bolachas não derivados de farinha de trigo dos tipos “cream cracker” e “água e sal”');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (578, '1705602', '19059020', 'Outras bolachas, exceto casquinhas para sorvete e os biscoitos e bolachas relacionados nos CEST 17.056.00 e 17.056.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (579, '1705700', '19053200', '“Waffles” e “wafers” - sem cobertura');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (580, '1705800', '19053200', '“Waffles” e “wafers” - com cobertura');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (581, '1705900', '19054000', 'Torradas, pão torrado e produtos semelhantes torrados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (582, '1706000', '19059010', 'Outros pães de forma');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (583, '1706200', '19059090', 'Outros pães, exceto pão francês de até 200 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (584, '1706201', '19059090', 'Outros bolos industrializados e produtos de panificação não especificados anteriormente; exceto casquinhas para sorvete e pães');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (585, '1706300', '19051000', 'Pão denominado knackebrot');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (586, '1706400', '190590', 'Demais pães industrializados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (587, '1706500', '15079011', 'Óleo de soja refinado, em recipientes com capacidade inferior ou igual a 5 litros, exceto as embalagens individuais de conteúdo inferior ou igual a 15 mililitros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (588, '1706600', '1508', 'Óleo de amendoim refinado, em recipientes com capacidade inferior ou igual a 5 litros, exceto as embalagens individuais de conteúdo inferior ou igual a 15 mililitros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (589, '1706700', '1509', 'Azeites de oliva, em recipientes com capacidade inferior a 2 litros, exceto as embalagens individuais de conteúdo inferior ou igual a 20 mililitros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (590, '1706701', '1509', 'Azeites de oliva, em recipientes com capacidade igual ou superior a 2 litros e inferior ou igual a 5 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (591, '1706702', '1509', 'Azeites de oliva, em recipientes com capacidade superior a 5 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (592, '1706800', '15100000', 'Outros óleos e respectivas frações, obtidos exclusivamente a partir de azeitonas, mesmo refinados, mas não quimicamente modificados, e misturas desses óleos ou frações com óleos ou frações da posição 15.09, em recipientes com capacidade inferior ou igual a 5 litros, exceto as embalagens individuais de conteúdo inferior ou igual a 15 mililitros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (593, '1706900', '15121911', 'Óleo de girassol em recipientes com capacidade inferior ou igual a 5 litros, exceto as embalagens individuais de conteúdo inferior ou igual a 15 mililitros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (594, '1706901', '15122910', 'Óleo de algodão refinado em recipientes com capacidade inferior ou igual a 5 litros, exceto as embalagens individuais de conteúdo inferior ou igual a 15 mililitros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (595, '1707000', '15141', 'Óleo de canola, em recipientes com capacidade inferior ou igual a 5 litros, exceto as embalagens individuais de conteúdo inferior ou igual a 15 mililitros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (596, '1707100', '15151900', 'Óleo de linhaça refinado, em recipientes com capacidade inferior ou igual a 5 litros, exceto as embalagens individuais de conteúdo inferior ou igual a 15 mililitros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (597, '1707200', '15152910', 'Óleo de milho refinado, em recipientes com capacidade inferior ou igual a 5 litros, exceto as embalagens individuais de conteúdo inferior ou igual a 15 mililitros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (598, '1707300', '15122990', 'Outros óleos refinados, em recipientes com capacidade inferior ou igual a 5 litros, exceto as embalagens individuais de conteúdo inferior ou igual a 15 mililitros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (599, '1707400', '15179010', 'Misturas de óleos refinados, para consumo humano, em recipientes com capacidade inferior ou igual a 5 litros, exceto as embalagens individuais de conteúdo inferior ou igual a 15 mililitros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (600, '1707500', '1511', 'Outros óleos vegetais comestíveis não especificados anteriormente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (601, '1707500', '1513', 'Outros óleos vegetais comestíveis não especificados anteriormente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (602, '1707500', '1514', 'Outros óleos vegetais comestíveis não especificados anteriormente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (603, '1707500', '1515', 'Outros óleos vegetais comestíveis não especificados anteriormente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (604, '1707500', '1516', 'Outros óleos vegetais comestíveis não especificados anteriormente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (605, '1707500', '1518', 'Outros óleos vegetais comestíveis não especificados anteriormente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (606, '1707600', '16010000', 'Enchidos (embutidos) e produtos semelhantes, de carne, miudezas ou sangue; exceto salsicha, linguiça e mortadela');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (607, '1707700', '16010000', 'Salsicha e linguiça, exceto as descritas nos CEST 17.077.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (608, '1707701', '16010000', 'Salsicha em lata');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (609, '1707800', '16010000', 'Mortadela');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (610, '1707900', '1602', 'Outras preparações e conservas de carne, miudezas ou de sangue, exceto as descritas nos CEST 17.079.01, 17.079.02, 17.079.03, 17.079.04, 17.079.05, 17.079.06 e 17.079.07');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (611, '1707901', '16023100', 'Outras preparações e conservas de carne, de miudezas ou de sangue, de aves da posição 01.05: de peruas e de perus.');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (612, '1707902', '16023210', 'Outras preparações e conservas de carne, de miudezas ou de sangue, de aves da posição 01.05: de galos e de galinhas, com conteúdo de carne ou de miudezas superior ou igual a 57 %, em peso, não cozidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (613, '1100900', '68053090', 'Esponjas para limpeza');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (614, '1101000', '2207', 'Álcool etílico para limpeza');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (615, '1101000', '22089000', 'Álcool etílico para limpeza');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (616, '1101100', '73231000', 'Esponjas e palhas de aço; esponjas para limpeza, polimento ou uso semelhantes; todas de uso doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (617, '1101200', '39232', 'Sacos de lixo de conteúdo igual ou inferior a 100 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (618, '1200100', '8504', 'Transformadores, bobinas de reatância e de auto indução, inclusive os transformadores de potência superior a 16 KVA, classificados nas posições 8504.33.00 e 8504.34.00; exceto os demais transformadores da subposição 8504.3, os reatores para lâmpadas elétricas de descarga classificados no código 8504.10.00, os carregadores de acumuladores do código 8504.40.10, os equipamentos de alimentação ininterrupta de energia (UPS ou “no break”), no código 8504.40.40 e os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (619, '1200200', '8516', 'Aquecedores elétricos de água, incluídos os de imersão, chuveiros ou duchas elétricos, torneiras elétricas, resistências de aquecimento, inclusive as de duchas e chuveiros elétricos e suas partes; exceto outros fornos, fogareiros (incluídas as chapas de cocção), grelhas e assadeiras, classificados na posição 8516.60.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (620, '1200300', '8535', 'Aparelhos para interrupção, seccionamento, proteção, derivação, ligação ou conexão de circuitos elétricos (por exemplo, interruptores, comutadores, corta-circuitos, para-raios, limitadores de tensão, eliminadores de onda, tomadas de corrente e outros conectores, caixas de junção), para tensão superior a 1.000V, exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (621, '1200400', '8536', 'Aparelhos para interrupção, seccionamento, proteção, derivação, ligação ou conexão de circuitos elétricos (por exemplo, interruptores, comutadores, relés, corta-circuitos, eliminadores de onda, plugues e tomadas de corrente, suportes para lâmpadas e outros conectores, caixas de junção), para uma tensão não superior a 1.000V; conectores para fibras ópticas, feixes ou cabos de fibras ópticas; exceto “starter” classificado na subposição 8536.50 e os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (622, '1200500', '8538', 'Partes reconhecíveis como exclusiva ou principalmente destinadas aos aparelhos das posições 8535 e 8536');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (623, '1200600', '74130000', 'Cabos, tranças e semelhantes, de cobre, não isolados para usos elétricos, exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (624, '1200700', '7605', 'Fios, cabos (incluídos os cabos coaxiais) e outros condutores, isolados ou não, para usos elétricos (incluídos os de cobre ou alumínio, envernizados ou oxidados anodicamente), mesmo com peças de conexão, inclusive fios e cabos elétricos, para tensão não superior a 1000V, para uso na construção; fios e cabos telefônicos e para transmissão de dados; cabos de fibras ópticas, constituídos de fibras embainhadas individualmente, mesmo com condutores elétricos ou munidos de peças de conexão; cordas, cabos, tranças');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (625, '1200700', '7614', 'Fios, cabos (incluídos os cabos coaxiais) e outros condutores, isolados ou não, para usos elétricos (incluídos os de cobre ou alumínio, envernizados ou oxidados anodicamente), mesmo com peças de conexão, inclusive fios e cabos elétricos, para tensão não superior a 1000V, para uso na construção; fios e cabos telefônicos e para transmissão de dados; cabos de fibras ópticas, constituídos de fibras embainhadas individualmente, mesmo com condutores elétricos ou munidos de peças de conexão; cordas, cabos, tranças');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (626, '1200700', '8544', 'Fios, cabos (incluídos os cabos coaxiais) e outros condutores, isolados ou não, para usos elétricos (incluídos os de cobre ou alumínio, envernizados ou oxidados anodicamente), mesmo com peças de conexão, inclusive fios e cabos elétricos, para tensão não superior a 1000V, para uso na construção; fios e cabos telefônicos e para transmissão de dados; cabos de fibras ópticas, constituídos de fibras embainhadas individualmente, mesmo com condutores elétricos ou munidos de peças de conexão; cordas, cabos, tranças');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (627, '1200800', '8546', 'Isoladores de qualquer matéria, para usos elétricos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (628, '1200900', '8547', 'Peças isolantes inteiramente de matérias isolantes, ou com simples peças metálicas de montagem (suportes roscados, por exemplo) incorporadas na massa, para máquinas, aparelhos e instalações elétricas; tubos isoladores e suas peças de ligação, de metais comuns, isolados interiormente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (629, '1300100', '3003', 'Medicamentos de referência - positiva, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (630, '1300100', '3004', 'Medicamentos de referência - positiva, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (631, '1300101', '3003', 'Medicamentos de referência - negativa, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (632, '1300101', '3004', 'Medicamentos de referência - negativa, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (633, '1300102', '3003', 'Medicamentos de referência - neutra, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (634, '1300102', '3004', 'Medicamentos de referência - neutra, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (635, '1300200', '3003', 'Medicamentos genérico - positiva, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (636, '1300200', '3004', 'Medicamentos genérico - positiva, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (637, '1300201', '3003', 'Medicamentos genérico - negativa, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (638, '1300201', '3004', 'Medicamentos genérico - negativa, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (639, '1300202', '3003', 'Medicamentos genérico - neutra, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (640, '1300202', '3004', 'Medicamentos genérico - neutra, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (641, '1300300', '3003', 'Medicamentos similar - positiva, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (642, '1300300', '3004', 'Medicamentos similar - positiva, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (643, '1300301', '3003', 'Medicamentos similar - negativa, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (644, '1300301', '3004', 'Medicamentos similar - negativa, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (645, '1300302', '3003', 'Medicamentos similar - neutra, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (646, '1300302', '3004', 'Medicamentos similar - neutra, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (647, '1300400', '3003', 'Outros tipos de medicamentos - positiva, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (648, '1300400', '3004', 'Outros tipos de medicamentos - positiva, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (649, '1300401', '3003', 'Outros tipos de medicamentos - negativa, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (650, '1300401', '3004', 'Outros tipos de medicamentos - negativa, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (651, '1300402', '3003', 'Outros tipos de medicamentos - neutra, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (652, '1300402', '3004', 'Outros tipos de medicamentos - neutra, exceto para uso veterinário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (653, '1300500', '30066000', 'Preparações químicas contraceptivas à base de hormônios, de outros produtos da posição 29.37 ou de espermicidas - positiva');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (654, '1300501', '30066000', 'Preparações químicas contraceptivas à base de hormônios, de outros produtos da posição 29.37 ou de espermicidas - negativa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (655, '1300600', '2936', 'Provitaminas e vitaminas, naturais ou reproduzidas por síntese (incluídos os concentrados naturais), bem como os seus derivados utilizados principalmente como vitaminas, misturados ou não entre si, mesmo em quaisquer soluções - neutra');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (656, '1300700', '300630', 'Preparações opacificantes (contrastantes) para exames radiográficos e reagentes de diagnóstico concebidos para serem administrados ao paciente - positiva');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (657, '1300701', '300630', 'Preparações opacificantes (contrastantes) para exames radiográficos e reagentes de diagnóstico concebidos para serem administrados ao paciente - negativa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (658, '1300800', '3002', 'Antissoro, outras frações do sangue, produtos imunológicos modificados, mesmo obtidos por via biotecnológica, exceto para uso veterinário - positiva');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (659, '1300801', '3002', 'Antissoro, outras frações do sangue, produtos imunológicos modificados, mesmo obtidos por via biotecnológica, exceto para uso veterinário - negativa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (660, '1300900', '3002', 'Vacinas e produtos semelhantes, exceto para uso veterinário - positiva;');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (661, '1300901', '3002', 'Vacinas e produtos semelhantes, exceto para uso veterinário - negativa;');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (662, '1301000', '30051010', 'Curativos (pensos) adesivos e outros artigos com uma camada adesiva, impregnados ou recobertos de substâncias farmacêuticas - Lista Positiva');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (663, '1301001', '30051010', 'Curativos (pensos) adesivos e outros artigos com uma camada adesiva, impregnados ou recobertos de substâncias farmacêuticas - Lista Negativa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (664, '1301100', '3005', 'Algodão, atadura, esparadrapo, gazes, pensos, sinapismos, e outros, acondicionados para venda a retalho para usos medicinais, cirúrgicos ou dentários, não impregnados ou recobertos de substâncias farmacêuticas - Lista Neutra');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (665, '1301200', '40151100', 'Luvas cirúrgicas e luvas de procedimento - neutra');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (666, '1301200', '40151900', 'Luvas cirúrgicas e luvas de procedimento - neutra');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (667, '1301300', '40141000', 'Preservativo – neutra');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (668, '1301400', '901831', 'Seringas, mesmo com agulhas - neutra');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (669, '1301500', '9018321', 'Agulhas para seringas - neutra');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (670, '1301600', '39269090', 'Contraceptivos (dispositivos intrauterinos - DIU) - neutra');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (671, '1301600', '90189099', 'Contraceptivos (dispositivos intrauterinos - DIU) - neutra');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (672, '1400100', '7013', 'Objetos de vidro para serviço de mesa ou de cozinha');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (673, '1400200', '70133700', 'Outros copos, exceto de vitrocerâmica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (674, '1400300', '70134290', 'Objetos para serviço de mesa (exceto copos) ou de cozinha, exceto de vitrocerâmica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (675, '1400400', '3919', 'Lonas plásticas, exceto as para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (676, '1400400', '3920', 'Lonas plásticas, exceto as para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (677, '1400400', '3921', 'Lonas plásticas, exceto as para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (678, '1400500', '3924', 'Artefatos de higiene/toucador de plástico, exceto os para uso na construção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (679, '1400600', '39241000', 'Serviços de mesa e outros utensílios de mesa ou de cozinha, de plástico, não descartáveis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (680, '1400601', '39241000', 'Serviços de mesa e outros utensílios de mesa ou de cozinha, de plástico, descartáveis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (681, '1400700', '69111010', 'Artigos para serviço de mesa ou de cozinha, de porcelana, inclusive os descartáveis – estojos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (682, '1400800', '69111090', 'Artigos para serviço de mesa ou de cozinha, de porcelana, inclusive os descartáveis – avulsos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (683, '1400900', '69120000', 'Artigos para serviço de mesa ou de cozinha, de cerâmica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (684, '1401000', '69120000', 'Velas para filtros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (685, '1401100', '4823209', 'Filtros descartáveis para coar café ou chá');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (686, '1401200', '48236', 'Bandejas, travessas, pratos, xícaras ou chávenas, taças, copos e artigos semelhantes, de papel ou cartão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (687, '1401300', '48131000', 'Papel para cigarro');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (688, '1600100', '40111000', 'Pneus novos, dos tipos utilizados em automóveis de passageiros (incluídos os veículos de uso misto - camionetas e os automóveis de corrida)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (689, '1600200', '4011', 'Pneus novos, dos tipos utilizados em caminhões (inclusive para os fora-de-estrada), ônibus, aviões, máquinas de terraplenagem, de construção e conservação de estradas, máquinas e tratores agrícolas, pá-carregadeira');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (690, '1600300', '40114000', 'Pneus novos para motocicletas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (691, '1600400', '4011', 'Outros tipos de pneus novos, exceto os itens classificados no CEST 16.005.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (692, '1600500', '40115000', 'Pneus novos de borracha dos tipos utilizados em bicicletas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (693, '1600600', '40121', 'Pneus recauchutados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (694, '1600700', '401290', 'Protetores de borracha, exceto os itens classificados no CEST 16.007.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (695, '1600701', '401290', 'Protetores de borracha para bicicletas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (696, '1600800', '4013', 'Câmaras de ar de borracha, exceto os itens classificados no CEST 16.009.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (697, '1600900', '40132000', 'Câmaras de ar de borracha dos tipos utilizados em bicicletas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (698, '1700100', '17049010', 'Chocolate branco, em embalagens de conteúdo inferior ou igual a 1 kg, excluídos os ovos de páscoa de chocolate.');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (699, '1700200', '18063110', 'Chocolates contendo cacau, em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (700, '1700200', '18063220', 'Chocolates contendo cacau, em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (701, '1700300', '18063210', 'Chocolate em barras, tabletes ou blocos ou no estado líquido, em pasta, em pó, grânulos ou formas semelhantes, em recipientes ou embalagens imediatas de conteúdo inferior ou igual a 2 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (702, '1700300', '18063220', 'Chocolate em barras, tabletes ou blocos ou no estado líquido, em pasta, em pó, grânulos ou formas semelhantes, em recipientes ou embalagens imediatas de conteúdo inferior ou igual a 2 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (703, '1700400', '18069000', 'Chocolates e outras preparações alimentícias contendo cacau, em embalagens de conteúdo inferior ou igual a 1 kg, excluídos os achocolatados em pó e ovos de páscoa de chocolate.');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (704, '1700500', '17049010', 'Ovos de páscoa de chocolate branco');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (705, '1700501', '18069000', 'Ovos de páscoa de chocolate');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (706, '1700600', '18069000', 'Achocolatados em pó, em embalagens de conteúdo inferior ou igual a 1 kg, exceto os classificados no CEST 17.006.02');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (707, '1700601', '18061000', 'Cacau em pó, com adição de açúcar ou de outros edulcorantes, em embalagens de conteúdo inferior ou igual a 1kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (708, '1700602', '18069000', 'Achocolatados em pó, em cápsulas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (709, '1700700', '18069000', 'Caixas de bombons contendo cacau, em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (710, '1700800', '17049090', 'Bombons, inclusive à base de chocolate branco sem cacau');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (711, '1700900', '18069000', 'Bombons, balas, caramelos, confeitos, pastilhas e outros produtos de confeitaria, contendo cacau');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (712, '1701000', '2009', 'Sucos de frutas ou de produtos hortícolas; mistura de sucos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (713, '1701100', '20098', 'Água de coco');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (714, '1701200', '04021', 'Leite em pó, blocos ou grânulos, exceto creme de leite');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (715, '1701200', '04022', 'Leite em pó, blocos ou grânulos, exceto creme de leite');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (716, '1701200', '04029', 'Leite em pó, blocos ou grânulos, exceto creme de leite');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (717, '1701300', '19011020', 'Farinha láctea');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (718, '1701400', '19011010', 'Leite modificado para alimentação de crianças');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (719, '1701500', '19011090', 'Preparações para alimentação infantil à base de farinhas, grumos, sêmolas ou amidos e outros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (720, '1701600', '04011010', 'Leite “longa vida” (UHT - “Ultra High Temperature”), em recipiente de conteúdo inferior ou igual a 2 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (721, '1701600', '04012010', 'Leite “longa vida” (UHT - “Ultra High Temperature”), em recipiente de conteúdo inferior ou igual a 2 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (722, '1701601', '04011010', 'Leite “longa vida” (UHT - “Ultra High Temperature”), em recipiente de conteúdo superior a 2 litros e inferior ou igual a 5 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (723, '1701601', '04012010', 'Leite “longa vida” (UHT - “Ultra High Temperature”), em recipiente de conteúdo superior a 2 litros e inferior ou igual a 5 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (724, '1701700', '04014010', 'Leite em recipiente de conteúdo inferior ou igual a 1 litro');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (725, '1701700', '04015010', 'Leite em recipiente de conteúdo inferior ou igual a 1 litro');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (726, '1701701', '04014010', 'Leite em recipiente de conteúdo superior a 1 litro e inferior ou igual a 5 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (727, '1701701', '04015010', 'Leite em recipiente de conteúdo superior a 1 litro e inferior ou igual a 5 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (728, '1701800', '04011090', 'Leite do tipo pasteurizado em recipiente de conteúdo inferior ou igual a 1 litro');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (729, '1701800', '04012090', 'Leite do tipo pasteurizado em recipiente de conteúdo inferior ou igual a 1 litro');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (730, '1701801', '04011090', 'Leite do tipo pasteurizado em recipiente de conteúdo superior a 1 litro e inferior ou igual a 5 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (731, '1701801', '04012090', 'Leite do tipo pasteurizado em recipiente de conteúdo superior a 1 litro e inferior ou igual a 5 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (732, '1701900', '0401402', 'Creme de leite, em recipiente de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (733, '1701900', '04022130', 'Creme de leite, em recipiente de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (734, '1701900', '04022930', 'Creme de leite, em recipiente de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (735, '1701900', '04029', 'Creme de leite, em recipiente de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (736, '1701901', '0401402', 'Creme de leite, em recipiente de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (737, '1701901', '04022130', 'Creme de leite, em recipiente de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (738, '1701901', '04022930', 'Creme de leite, em recipiente de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (739, '1701901', '04029', 'Creme de leite, em recipiente de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (740, '1701902', '040110', 'Outros cremes de leite, em recipiente de conteúdo inferior ou igual a 1kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (741, '1701902', '040120', 'Outros cremes de leite, em recipiente de conteúdo inferior ou igual a 1kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (742, '1701902', '040150', 'Outros cremes de leite, em recipiente de conteúdo inferior ou igual a 1kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (743, '1701902', '040210', 'Outros cremes de leite, em recipiente de conteúdo inferior ou igual a 1kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (744, '1701902', '04022920', 'Outros cremes de leite, em recipiente de conteúdo inferior ou igual a 1kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (745, '1702000', '04029', 'Leite condensado, em recipiente de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (746, '1702001', '04029', 'Leite condensado, em recipiente de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (747, '1702100', '0403', 'Iogurte e leite fermentado em recipiente de conteúdo inferior ou igual a 2 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (748, '1702101', '0403', 'Iogurte e leite fermentado em recipiente de conteúdo superior a 2 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (749, '1702200', '04039000', 'Coalhada');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (750, '1702300', '0406', 'Requeijão e similares, em recipiente de conteúdo inferior ou igual a 1 kg, exceto as embalagens individuais de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (751, '1702301', '0406', 'Requeijão e similares, em recipiente de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (752, '1702400', '0406', 'Queijos, exceto os dos CEST 17.024.01, 17.024.02, 17.024.03 e 17.024.04');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (753, '1702401', '04061010', 'Queijo muçarela');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (754, '1702402', '04061090', 'Queijo minas frescal');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (755, '1702403', '04061090', 'Queijo ricota');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (756, '1702404', '04061090', 'Queijo petit suisse');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (757, '1702500', '04051000', 'Manteiga, em embalagem de conteúdo inferior ou igual a 1 kg, exceto as embalagens individuais de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (758, '1702501', '04051000', 'Manteiga, em embalagem de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (759, '1702502', '04059090', 'Manteiga de garrafa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (760, '1702600', '15171000', 'Margarina e creme vegetal em recipiente de conteúdo inferior ou igual a 500 g, exceto as embalagens individuais de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (761, '1702700', '15171000', 'Margarina e creme vegetal, em recipiente de conteúdo superior a 500 g e inferior ou igual a 1 kg, exceto as embalagens individuais de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (762, '1702701', '15171000', 'Margarina e creme vegetal, em recipiente de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (763, '1702702', '151790', 'Outras margarinas e cremes vegetais em recipiente de conteúdo inferior a 1 kg, exceto as embalagens individuais de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (764, '1702800', '15162000', 'Gorduras e óleos vegetais e respectivas frações, parcial ou totalmente hidrogenados, interesterificados, reesterificados ou elaidinizados, mesmo refinados, mas não preparados de outro modo, em recipiente de conteúdo inferior ou igual a 1 kg, exceto as embalagens individuais de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (765, '1702801', '15162000', 'Gorduras e óleos vegetais e respectivas frações, parcial ou totalmente hidrogenados, interesterificados, reesterificados ou elaidinizados, mesmo refinados, mas não preparados de outro modo, em recipiente de conteúdo superior a 1 kg, exceto as embalagens individuais de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (766, '1702900', '19019020', 'Doces de leite');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (767, '1703000', '19041000', 'Produtos à base de cereais, obtidos por expansão ou torrefação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (768, '1703000', '19049000', 'Produtos à base de cereais, obtidos por expansão ou torrefação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (769, '1703100', '19059090', 'Salgadinhos diversos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (770, '1703200', '20052000', 'Batata frita, inhame e mandioca fritos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (771, '1703300', '20081', 'Amendoim e castanhas tipo aperitivo, em embalagem de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (772, '1703301', '20081', 'Amendoim e castanhas tipo aperitivo, em embalagem de conteúdo superior a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (773, '1703400', '21032010', 'Catchup em embalagens imediatas de conteúdo inferior ou igual a 650 g, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (774, '1703500', '21039021', 'Condimentos e temperos compostos, incluindo molho de pimenta e outros molhos, em embalagens imediatas de conteúdo inferior ou igual a 1 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 3 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (775, '1703500', '21039091', 'Condimentos e temperos compostos, incluindo molho de pimenta e outros molhos, em embalagens imediatas de conteúdo inferior ou igual a 1 kg, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 3 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (776, '1703600', '21031010', 'Molhos de soja preparados em embalagens imediatas de conteúdo inferior ou igual a 650 g, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (777, '1703700', '21033010', 'Farinha de mostarda em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (778, '1703800', '21033021', 'Mostarda preparada em embalagens imediatas de conteúdo inferior ou igual a 650 g, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (779, '1703900', '21039011', 'Maionese em embalagens imediatas de conteúdo inferior ou igual a 650 g, exceto as embalagens contendo envelopes individualizados (sachês) de conteúdo inferior ou igual a 10 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (780, '1704000', '2002', 'Tomates preparados ou conservados, exceto em vinagre ou em ácido acético, em embalagens de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (781, '1704100', '21032010', 'Molhos de tomate em embalagens imediatas de conteúdo inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (782, '1704200', '17049090', 'Barra de cereais');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (783, '1704200', '19042000', 'Barra de cereais');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (784, '1704200', '19049000', 'Barra de cereais');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (785, '1704300', '18063120', 'Barra de cereais contendo cacau');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (786, '1704300', '18063220', 'Barra de cereais contendo cacau');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (787, '1704300', '18069000', 'Barra de cereais contendo cacau');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (788, '1704400', '11010010', 'Farinha de trigo especial, em embalagem inferior ou igual a 1 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (789, '1704401', '11010010', 'Farinha de trigo especial, em embalagem superior a 1 kg e inferior a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (790, '1704402', '11010010', 'Farinha de trigo especial, em embalagem igual a 5 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (791, '1704403', '11010010', 'Farinha de trigo especial, em embalagem superior a 5 kg e inferior ou igual a 25 kg');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (792, '2103600', '85043', 'Outros transformadores, exceto os classificados nos códigos 8504.33.00 e 8504.34.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (793, '2103700', '85044010', 'Carregadores de acumuladores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (794, '2103800', '85044040', 'Equipamentos de alimentação ininterrupta de energia (UPS ou “no break”)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (795, '2103900', '85078000', 'Outros acumuladores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (796, '2104000', '8508', 'Aspiradores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (797, '2104100', '8509', 'Aparelhos eletromecânicos de motor elétrico incorporado, de uso doméstico e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (798, '2104200', '85098010', 'Enceradeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (799, '2104300', '85161000', 'Chaleiras elétricas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (800, '2104400', '85164000', 'Ferros elétricos de passar');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (801, '2104500', '85165000', 'Fornos de micro-ondas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (802, '2104600', '85166000', 'Outros fornos; fogareiros (incluídas as chapas de cocção), grelhas e assadeiras, exceto os portáteis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (803, '2104700', '85166000', 'Outros fornos; fogareiros (incluídas as chapas de cocção), grelhas e assadeiras, portáteis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (804, '2104800', '85167100', 'Outros aparelhos eletrotérmicos de uso doméstico - Cafeteiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (805, '2104900', '85167200', 'Outros aparelhos eletrotérmicos de uso doméstico - Torradeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (806, '2105000', '851679', 'Outros aparelhos eletrotérmicos de uso doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (807, '2105100', '85169000', 'Partes das chaleiras, ferros, fornos e outros aparelhos eletrotérmicos da posição 85.16, descritos nos CEST 21.043.00, 21.044.00, 21.045.00, 21.046.00, 21.047.00, 21.048.00, 21.049.00 e 21.050.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (808, '2105200', '85171100', 'Aparelhos telefônicos por fio com unidade auscultador - microfone sem fio');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (809, '2105300', '8517123', 'Telefones para redes celulares, exceto por satélite, os de uso automotivo e os classificados no CEST 21.053.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (810, '2105301', '85171231', 'Telefones para redes celulares portáteis, exceto por satélite');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (811, '2105400', '851712', 'Outros telefones para outras redes sem fio, exceto para redes de celulares e os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (812, '2105500', '85171891', 'Outros aparelhos telefônicos não combinados com outros aparelhos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (813, '2105501', '85171899', 'Outros aparelhos telefônicos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (814, '2105600', '8517625', 'Aparelhos para transmissão ou recepção de voz, imagem ou outros dados em rede com fio, exceto os classificados nos códigos 8517.62.51, 8517.62.52 e 8517.62.53');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (815, '2105700', '8518', 'Microfones e seus suportes; alto-falantes, mesmo montados nos seus receptáculos, fones de ouvido (auscultadores), mesmo combinados com microfone e conjuntos ou sortidos constituídos por um microfone e um ou mais alto-falantes, amplificadores elétricos de audiofrequência, aparelhos elétricos de amplificação de som; suas partes e acessórios; exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (816, '2105800', '8519', 'Aparelhos de radiodifusão suscetíveis de funcionarem sem fonte externa de energia. Aparelhos de gravação de som; aparelhos de reprodução de som; aparelhos de gravação e de reprodução de som; partes e acessórios; exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (817, '2105800', '8522', 'Aparelhos de radiodifusão suscetíveis de funcionarem sem fonte externa de energia. Aparelhos de gravação de som; aparelhos de reprodução de som; aparelhos de gravação e de reprodução de som; partes e acessórios; exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (818, '2105800', '85271', 'Aparelhos de radiodifusão suscetíveis de funcionarem sem fonte externa de energia. Aparelhos de gravação de som; aparelhos de reprodução de som; aparelhos de gravação e de reprodução de som; partes e acessórios; exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (819, '2105900', '85198190', 'Outros aparelhos de gravação de som; aparelhos de reprodução de som; aparelhos de gravação e de reprodução de som; partes e acessórios; exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (820, '2106000', '85219010', 'Gravador-reprodutor e editor de imagem e som, em discos, por meio magnético, óptico ou optomagnético, exceto de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (821, '2106100', '85219090', 'Outros aparelhos videofônicos de gravação ou reprodução, mesmo incorporando um receptor de sinais videofônicos, exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (822, '2106200', '85235110', 'Cartões de memória ("memory cards")');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (823, '2106300', '85235200', 'Cartões inteligentes ("smart cards")');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (824, '2106400', '85235200', 'Cartões inteligentes ("sim cards")');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (825, '2106500', '8525802', 'Câmeras fotográficas digitais e câmeras de vídeo e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (826, '2106600', '85279', 'Outros aparelhos receptores para radiodifusão, mesmo combinados num invólucro, com um aparelho de gravação ou de reprodução de som, ou com um relógio, inclusive caixa acústica para Home Theaters classificados na posição 8518');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (827, '2106700', '85284929', 'Monitores e projetores que não incorporem aparelhos receptores de televisão, policromáticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (828, '2106700', '85285920', 'Monitores e projetores que não incorporem aparelhos receptores de televisão, policromáticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (829, '2106700', '852869', 'Monitores e projetores que não incorporem aparelhos receptores de televisão, policromáticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (830, '2106701', '85286200', 'Projetores capazes de serem conectados diretamente a uma máquina automática para processamento de dados da posição 84.71 e concebidos para serem utilizados com esta máquina');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (831, '2106800', '85285220', 'Outros monitores capazes de serem conectados diretamente a uma máquina automática para processamento de dados da posição 84.71 e concebidos para serem utilizados com esta máquina, policromáticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (832, '2106900', '85287', 'Aparelhos receptores de televisão, mesmo que incorporem um aparelho receptor de radiodifusão ou um aparelho de gravação ou reprodução de som ou de imagens - Televisores de CRT (tubo de raios catódicos)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (833, '2107000', '85287', 'Aparelhos receptores de televisão, mesmo que incorporem um aparelho receptor de radiodifusão ou um aparelho de gravação ou reprodução de som ou de imagens - Televisores de LCD (Display de Cristal Líquido)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (834, '2107100', '85287', 'Aparelhos receptores de televisão, mesmo que incorporem um aparelho receptor de radiodifusão ou um aparelho de gravação ou reprodução de som ou de imagens - Televisores de Plasma');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (835, '2107200', '85287', 'Outros aparelhos receptores de televisão não dotados de monitores ou display de vídeo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (836, '2107300', '85287', 'Outros aparelhos receptores de televisão não relacionados nos CEST 21.069.00, 21.070.00, 21.071.00 e 21.072.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (837, '2107400', '900659', 'Câmeras fotográficas dos tipos utilizadas para preparação de clichês ou cilindros de impressão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (838, '2107500', '90064000', 'Câmeras fotográficas para filmes de revelação e copiagem instantâneas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (839, '2107600', '90189050', 'Aparelhos de diatermia');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (840, '2107700', '90191000', 'Aparelhos de massagem');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (841, '2107800', '90328911', 'Reguladores de voltagem eletrônicos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (842, '2107900', '95045000', 'Consoles e máquinas de jogos de vídeo, exceto os classificados na subposição 9504.30');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (843, '2108000', '8517621', 'Multiplexadores e concentradores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (844, '2108100', '85176222', 'Centrais automáticas privadas, de capacidade inferior ou igual a 25 ramais');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (845, '2108200', '85176239', 'Outros aparelhos para comutação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (846, '2108300', '8517624', 'Roteadores digitais, em redes com ou sem fio');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (847, '2108400', '85176262', 'Aparelhos emissores com receptor incorporado de sistema troncalizado (“trunking”), de tecnologia celular');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (848, '2108500', '8517629', 'Outros aparelhos de recepção, conversão e transmissão ou regeneração de voz, imagens ou outros dados, incluindo os aparelhos de comutação e roteamento');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (849, '2108600', '85177021', 'Antenas próprias para telefones celulares portáteis, exceto as telescópicas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (850, '2108700', '821490', 'Aparelhos ou máquinas de barbear, máquinas de cortar o cabelo ou de tosquiar e aparelhos de depilar, e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (851, '2400200', '32041700', 'Xadrez e pós assemelhados, exceto pigmentos à base de dióxido de titânio classificados no código 3206.11.19');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (852, '2400200', '3206', 'Xadrez e pós assemelhados, exceto pigmentos à base de dióxido de titânio classificados no código 3206.11.19');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (853, '2400300', '3204', 'Corantes para aplicação em bases, tintas e vernizes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (854, '2400300', '32050000', 'Corantes para aplicação em bases, tintas e vernizes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (855, '2400300', '3206', 'Corantes para aplicação em bases, tintas e vernizes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (856, '2400300', '3212', 'Corantes para aplicação em bases, tintas e vernizes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (857, '2500100', '87021000', 'Veículos automóveis para transporte de 10 pessoas ou mais, incluindo o motorista, unicamente com motor de pistão, de ignição por compressão (diesel ou semidiesel), com volume interno de habitáculo, destinado a passageiros e motorista, superior a 6 m³, mas inferior a 9 m³');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (858, '2500200', '87024090', 'Veículos automóveis para transporte de 10 pessoas ou mais, incluindo o motorista, unicamente com motor elétrico para propulsão, com volume interno de habitáculo, destinado a passageiros e motorista, superior a 6 m³, mas inferior a 9 m³');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (859, '2500300', '87032100', 'Automóveis unicamente com motor de pistão alternativo de ignição por centelha (faísca*), de cilindrada não superior a 1000 cm³');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (860, '2500400', '87032210', 'Automóveis unicamente com motor de pistão alternativo de ignição por centelha (faísca*), de cilindrada superior a 1000 cm³, mas não superior a 1500 cm³, com capacidade de transporte de pessoas sentadas inferior ou igual a 6, incluído o condutor, exceto carro celular');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (861, '2500500', '87032290', 'Outros automóveis unicamente com motor de pistão alternativo de ignição por centelha (faísca*), de cilindrada superior a 1000 cm³, mas não superior a 1500 cm³, exceto carro celular');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (862, '2500600', '87032310', 'Automóveis unicamente com motor de pistão alternativo de ignição por centelha (faísca*), de cilindrada superior a 1500 cm³, mas não superior a 3000 cm³, com capacidade de transporte de pessoas sentadas inferior ou igual a 6, incluído o condutor, exceto carro celular, carro funerário e automóveis de corrida');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (863, '2500700', '87032390', 'Outros automóveis unicamente com motor de pistão alternativo de ignição por centelha (faísca*), de cilindrada superior a 1500 cm³, mas não superior a 3000 cm³, exceto carro celular, carro funerário e automóveis de corrida');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (864, '2500800', '87032410', 'Automóveis unicamente com motor de pistão alternativo de ignição por centelha (faísca*), de cilindrada superior a 3000 cm³, com capacidade de transporte de pessoas sentadas inferior ou igual a 6, incluído o condutor, exceto carro celular, carro funerário e automóveis de corrida');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (865, '2500900', '87032490', 'Outros automóveis unicamente com motor de pistão alternativo de ignição por centelha (faísca*), de cilindrada superior a 3000 cm³, exceto carro celular, carro funerário e automóveis de corrida');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (866, '2501000', '87033210', 'Automóveis unicamente com motor diesel ou semidiesel, de cilindrada superior a 1500 cm³, mas não superior a 2500 cm³, com capacidade de transporte de pessoas sentadas inferior ou igual a 6, incluído o condutor, exceto ambulância, carro celular e carro funerário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (867, '2501100', '87033290', 'Outros automóveis unicamente com motor diesel ou semidiesel, de cilindrada superior a 1500 cm³, mas não superior a 2500 cm³, exceto ambulância, carro celular e carro funerário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (868, '2501200', '87033310', 'Automóveis unicamente com motor diesel ou semidiesel, de cilindrada superior a 2500 cm³, com capacidade de transporte de pessoas sentadas inferior ou igual a 6, incluído o condutor, exceto carro celular e carro funerário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (869, '2501300', '87033390', 'Outros automóveis unicamente com motor diesel ou semidiesel, de cilindrada superior a 2500 cm³, exceto carro celular e carro funerário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (870, '2501400', '87042110', 'Veículos automóveis para transporte de mercadorias, de peso em carga máxima não superior a 5 toneladas, chassis com motor diesel ou semidiesel e cabina, exceto caminhão de peso em carga máxima superior a 3,9 toneladas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (871, '2501500', '87042120', 'Veículos automóveis para transporte de mercadorias, de peso em carga máxima não superior a 5 toneladas, com motor diesel ou semidiesel, com caixa basculante, exceto caminhão de peso em carga máxima superior a 3,9 toneladas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (872, '2501600', '87042130', 'Veículos automóveis para transporte de mercadorias, de peso em carga máxima não superior a 5 toneladas, frigoríficos ou isotérmicos, com motor diesel ou semidiesel, exceto caminhão de peso em carga máxima superior a 3,9 toneladas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (873, '2501700', '87042190', 'Outros veículos automóveis para transporte de mercadorias, de peso em carga máxima não superior a 5 toneladas, com motor diesel ou semidiesel, exceto carro-forte para transporte de valores e caminhão de peso em carga máxima superior a 3,9 toneladas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (874, '2501800', '87043110', 'Veículos automóveis para transporte de mercadorias, de peso em carga máxima não superior a 5 toneladas, com motor a explosão, chassis e cabina, exceto caminhão de peso em carga máxima superior a 3,9 toneladas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (875, '2501900', '87043120', 'Veículos automóveis para transporte de mercadorias, de peso em carga máxima não superior a 5 toneladas, com motor explosão com caixa basculante, exceto caminhão de peso em carga máxima superior a 3,9 toneladas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (876, '2502000', '87043130', 'Veículos automóveis para transporte de mercadorias, de peso em carga máxima não superior a 5 toneladas, frigoríficos ou isotérmicos com motor explosão, exceto caminhão de peso em carga máxima superior a 3,9 toneladas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (877, '2502100', '87043190', 'Outros veículos automóveis para transporte de mercadorias, de peso em carga máxima não superior a 5 toneladas, com motor a explosão, exceto carro-forte para transporte de valores e caminhão de peso em carga máxima superior a 3,9 toneladas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (878, '2502200', '87022000', 'Veículos automóveis para transporte de 10 pessoas ou mais, incluindo o motorista, com motor de pistão, de ignição por compressão (diesel ou semidiesel) e um motor elétrico, com volume interno de habitáculo, destinado a passageiros e motorista, superior a 6 m³, mas inferior a 9 m³');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (879, '2502300', '87023000', 'Veículos automóveis para transporte de 10 pessoas ou mais, incluindo o motorista, com motor de pistão alternativo, de ignição por centelha (faísca) e um motor elétrico, com volume interno de habitáculo, destinado a passageiros e motorista, superior a 6 m³, mas inferior a 9 m³');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (880, '2502400', '87029000', 'Outros veículos automóveis para transporte de 10 pessoas ou mais, incluindo o motorista, com volume interno de habitáculo, destinado a passageiros e motorista, superior a 6 m³, mas inferior a 9 m³');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (881, '2502500', '87034000', 'Automóveis equipados para propulsão, simultaneamente, com um motor de pistão alternativo de ignição por centelha (faísca*) e um motor elétrico, exceto os suscetíveis de serem carregados por conexão a uma fonte externa de energia elétrica, o carro celular e o carro funerário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (882, '2502600', '87035000', 'Automóveis equipados para propulsão, simultaneamente, com um motor de pistão por compressão (diesel ou semidiesel) e um motor elétrico, exceto os suscetíveis de serem carregados por conexão a uma fonte externa de energia elétrica, exceto o carro celular e o carro funerário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (883, '2502700', '87036000', 'Automóveis equipados para propulsão, simultaneamente, com um motor de pistão alternativo de ignição por centelha (faísca*) e um motor elétrico, suscetíveis de serem carregados por conexão a uma fonte externa de energia elétrica, exceto o carro celular e o carro funerário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (884, '2502800', '87037000', 'Automóveis equipados para propulsão, simultaneamente, com um motor de pistão por compressão (diesel ou semidiesel) e um motor elétrico, suscetíveis de serem carregados por conexão a uma fonte externa de energia elétrica, exceto o carro celular e o carro funerário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (885, '2502900', '87038000', 'Outros veículos, equipados unicamente com motor elétrico para propulsão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (886, '2600100', '8711', 'Motocicletas (incluídos os ciclomotores) e outros ciclos equipados com motor auxiliar, mesmo com carro lateral; carros laterais');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (887, '2800100', '33030010', 'Perfumes (extratos)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (888, '2800200', '33030020', 'Águas-de-colônia');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (889, '2800300', '33041000', 'Produtos de maquiagem para os lábios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (890, '2800400', '33042010', 'Sombra, delineador, lápis para sobrancelhas e rímel');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (891, '2800500', '33042090', 'Outros produtos de maquiagem para os olhos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (892, '2800600', '33043000', 'Preparações para manicuros e pedicuros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (893, '2800700', '33049100', 'Pós para maquiagem, incluindo os compactos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (894, '2800800', '33049910', 'Cremes de beleza, cremes nutritivos e loções tônicas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (895, '2800900', '33049990', 'Outros produtos de beleza ou de maquiagem preparados e preparações para conservação ou cuidados da pele, exceto as preparações antissolares e os bronzeadores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (896, '2801000', '33049990', 'Preparações antissolares e os bronzeadores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (897, '2801100', '33051000', 'Xampus para o cabelo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (898, '2801200', '33052000', 'Preparações para ondulação ou alisamento, permanentes, dos cabelos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (899, '2801300', '33059000', 'Outras preparações capilares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (900, '2801400', '33059000', 'Tintura para o cabelo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (901, '2801500', '33071000', 'Preparações para barbear (antes, durante ou após)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (902, '2801600', '33072010', 'Desodorantes corporais e antiperspirantes, líquidos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (903, '2801700', '33072090', 'Outros desodorantes corporais e antiperspirantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (904, '2801800', '33079000', 'Outros produtos de perfumaria ou de toucador preparados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (905, '2801900', '33079000', 'Outras preparações cosméticas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (906, '2802000', '34011190', 'Sabões de toucador, em barras, pedaços ou figuras moldadas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (907, '2802100', '34011900', 'Outros sabões, produtos e preparações orgânicos tensoativos, inclusive papel, pastas (ouates), feltros e falsos tecidos, impregnados, revestidos ou recobertos de sabão ou de detergentes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (908, '2802200', '34012010', 'Sabões de toucador sob outras formas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (909, '2802300', '34013000', 'Produtos e preparações orgânicos tensoativos para lavagem da pele, em forma de líquido ou de creme, acondicionados para venda a retalho, mesmo contendo sabão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (910, '2802400', '48182000', 'Lenços de papel, incluindo os de desmaquiar');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (911, '2802401', '48182000', 'Toalhas de mão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (912, '2802500', '82141000', 'Apontadores de lápis para maquiagem');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (913, '2802501', '82141000', 'Espátulas, abre-cartas e raspadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (914, '2802502', '82141000', 'Lâminas de espátulas, de abre-cartas, de raspadeiras e de apontadores de lápis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (915, '2802600', '82142000', 'Utensílios e sortidos de utensílios de manicuros ou de pedicuros (incluindo as limas para unhas)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (916, '2802700', '96032900', 'Escovas e pincéis de barba, escovas para cabelos, para cílios ou para unhas e outras escovas de toucador de pessoas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (917, '2802701', '96032900', 'Vassouras e escovas, mesmo constituindo partes de máquinas, de aparelhos ou de veículos, vassouras mecânicas de uso manual não motorizadas, pincéis e espanadores; cabeças preparadas para escovas, pincéis e artigos semelhantes; bonecas e rolos para pintura; rodos de borracha ou de matérias flexíveis semelhantes, outros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (918, '2802800', '96033000', 'Pincéis para aplicação de produtos cosméticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (919, '2802801', '96033000', 'Pincéis e escovas, para artistas e pincéis de escrever');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (920, '2802900', '96161000', 'Vaporizadores de toucador, suas armações e cabeças de armações');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (921, '2803000', '96162000', 'Borlas ou esponjas para pós ou para aplicação de outros cosméticos ou de produtos de toucador');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (922, '2803100', '42021', 'Malas e maletas de toucador');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (923, '2803200', '9615', 'Pentes, travessas para cabelo e artigos semelhantes; grampos (alfinetes) para cabelo; pinças (“pinceguiches”), onduladores, bobs (rolos) e artefatos semelhantes para penteados, e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (924, '2803300', '39233000', 'Mamadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (925, '2803300', '39241000', 'Mamadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (926, '2803300', '39249000', 'Mamadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (927, '2803300', '40149090', 'Mamadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (928, '2803300', '70102000', 'Mamadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (929, '2803400', '40149090', 'Chupetas e bicos para mamadeiras e para chupetas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (930, '2803500', '12119090', 'Outras plantas e partes, para perfumaria, medicina e semelhantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (931, '2803600', '39262000', 'Vestuário e seus acessórios, de plásticos, inclusive luvas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (932, '2803700', '39264000', 'Estatuetas e outros objetos de ornamentação, de plásticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (933, '2803800', '39269090', 'Outras obras de plásticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (934, '2803900', '42022210', 'Bolsas de folhas de plástico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (935, '2804000', '42022220', 'Bolsas de matérias têxteis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (936, '2804100', '42022900', 'Bolsas de outras matérias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (937, '2804200', '42023900', 'Artigos de bolsos/bolsas, de outras matérias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (938, '2804300', '42029200', 'Outros artefatos, de folhas de plásticos ou matérias têxteis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (939, '2804400', '42029900', 'Outros artefatos, de outras matérias');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (940, '2804500', '48192000', 'Caixas e cartonagens, dobráveis, de papel/cartão, não ondulados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (941, '2804600', '48194000', 'Outros sacos, bolsas e cartuchos, de papel ou cartão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (942, '2804700', '48211000', 'Etiquetas de papel ou cartão, impressas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (943, '2804800', '49111090', 'Outros impressos publicitários, catálogos comerciais e semelhantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (944, '2804900', '61159900', 'Outras meias de malha de outras matérias têxteis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (945, '2805000', '62171000', 'Outros acessórios confeccionados, de vestuário');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (946, '2805100', '63026000', 'Roupas de toucador/cozinha, de tecidos atoalhados de algodão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (947, '2805200', '63079090', 'Outros artefatos têxteis confeccionados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (948, '2805300', '65069900', 'Chapéus e outros artefatos de outras matérias, exceto de malha');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (949, '2805400', '95059000', 'Artigos para outras festas, carnaval ou outros divertimentos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (950, '2805500', '33', 'Produtos destinados à higiene bucal');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (951, '2805600', '33', 'Outros produtos cosméticos e de higiene pessoal não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (952, '2805600', '34', 'Outros produtos cosméticos e de higiene pessoal não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (953, '2805700', '14', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (954, '2805700', '39', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (955, '2805700', '40', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (956, '2805700', '44', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (957, '2805700', '48', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (958, '2805700', '63', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (959, '2108700', '8510', 'Aparelhos ou máquinas de barbear, máquinas de cortar o cabelo ou de tosquiar e aparelhos de depilar, e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (960, '2108800', '84145', 'Ventiladores, exceto os de uso agrícola');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (961, '2108900', '84145990', 'Ventiladores de uso agrícola');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (962, '2109000', '84146000', 'Coifas com dimensão horizontal máxima não superior a 120 cm');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (963, '2109100', '84149020', 'Partes de ventiladores ou coifas aspirantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (964, '2109200', '841510', 'Máquinas e aparelhos de ar condicionado contendo um ventilador motorizado e dispositivos próprios para modificar a temperatura e a umidade, incluídos as máquinas e aparelhos em que a umidade não seja regulável separadamente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (965, '2109200', '84158', 'Máquinas e aparelhos de ar condicionado contendo um ventilador motorizado e dispositivos próprios para modificar a temperatura e a umidade, incluídos as máquinas e aparelhos em que a umidade não seja regulável separadamente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (966, '2109300', '84151011', 'Aparelhos de ar-condicionado tipo Split System (sistema com elementos separados) com unidade externa e interna');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (967, '2109400', '84151019', 'Aparelhos de ar-condicionado com capacidade inferior ou igual a 30.000 frigorias/hora');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (968, '2109500', '84151090', 'Aparelhos de ar-condicionado com capacidade acima de 30.000 frigorias/hora');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (969, '2109600', '84159010', 'Unidades evaporadoras (internas) de aparelho de ar-condicionado do tipo Split System (sistema com elementos separados), com capacidade inferior ou igual a 30.000 frigorias/hora');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (970, '2109700', '84159020', 'Unidades condensadoras (externas) de aparelho de ar-condicionado do tipo Split System (sistema com elementos separados), com capacidade inferior ou igual a 30.000 frigorias/hora');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (971, '2109800', '84212100', 'Aparelhos elétricos para filtrar ou depurar água (purificadores de água refrigerados), exceto os itens classificados no CEST 21.098.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (972, '2109801', '84212100', 'Outros aparelhos elétricos para filtrar ou depurar água');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (973, '2109900', '84243010', 'Lavadora de alta pressão e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (974, '2109900', '84243090', 'Lavadora de alta pressão e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (975, '2109900', '84249090', 'Lavadora de alta pressão e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (976, '2110000', '84672100', 'Furadeiras elétricas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (977, '2110100', '85162', 'Aparelhos elétricos para aquecimento de ambientes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (978, '2110200', '85163100', 'Secadores de cabelo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (979, '2110300', '85163200', 'Outros aparelhos para arranjos do cabelo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (980, '2110400', '8527', 'Aparelhos receptores para radiodifusão, mesmo combinados num mesmo invólucro, com um aparelho de gravação ou de reprodução de som, ou com um relógio, exceto os classificados na posição 8527.1, 8527.2 e 8527.9 que sejam de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (981, '2110500', '84796000', 'Climatizadores de ar');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (982, '2110600', '84159090', 'Outras partes para máquinas e aparelhos de ar-condicionado que contenham um ventilador motorizado e dispositivos próprios para modificar a temperatura e a umidade, incluindo as máquinas e aparelhos em que a umidade não seja regulável separadamente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (983, '2110700', '85258019', 'Câmeras de televisão e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (984, '2110800', '84231000', 'Balanças de uso doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (985, '2110900', '8540', 'Tubos e válvulas, eletrônicos, de cátodo quente, cátodo frio ou fotocátodo (por exemplo, tubos e válvulas, de vácuo, de vapor ou de gás, ampolas retificadoras de vapor de mercúrio, tubos catódicos, tubos e válvulas para câmeras de televisão)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (986, '2111000', '8517', 'Aparelhos elétricos para telefonia; outros aparelhos para transmissão ou recepção de voz, imagens ou outros dados, incluídos os aparelhos para comunicação em redes por fio ou redes sem fio (tal como uma rede local (LAN) ou uma rede de área estendida (WAN), incluídas suas partes, exceto os de uso automotivo e os classificados nos códigos 8517.62.51, 8517.62.52 e 8517.62.53');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (987, '2111100', '8517', 'Interfones, seus acessórios, tomadas e “plugs”');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (988, '2111200', '8529', 'Partes reconhecíveis como exclusiva ou principalmente destinadas aos aparelhos das posições 8525 a 8528; exceto as de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (989, '2111300', '8531', 'Aparelhos elétricos de sinalização acústica ou visual (por exemplo, campainhas, sirenes, quadros indicadores, aparelhos de alarme para proteção contra roubo ou incêndio);
exceto os de uso automotivo e os classificados nas posições 8531.10 e 8531.80.00.');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (990, '2111400', '853110', 'Aparelhos elétricos de alarme, para proteção contra roubo ou incêndio e aparelhos semelhantes, exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (991, '2111500', '85318000', 'Outros aparelhos de sinalização acústica ou visual, exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (992, '2111600', '853400', 'Circuitos impressos, exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (993, '2111700', '85414011', 'Diodos emissores de luz (LED), exceto diodos “laser”');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (994, '2111700', '85414021', 'Diodos emissores de luz (LED), exceto diodos “laser”');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (995, '2111700', '85414022', 'Diodos emissores de luz (LED), exceto diodos “laser”');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (996, '2111800', '85437092', 'Eletrificadores de cercas eletrônicos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (997, '2111900', '90303', 'Aparelhos e instrumentos para medida ou controle da tensão, intensidade, resistência ou da potência, sem dispositivo registrador; exceto os de uso automotivo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (998, '2112000', '903089', 'Analisadores lógicos de circuitos digitais, de espectro de frequência, frequencímetros, fasímetros, e outros instrumentos e aparelhos de controle de grandezas elétricas e detecção');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (999, '2112100', '910700', 'Interruptores horários e outros aparelhos que permitam acionar um mecanismo em tempo determinado, munidos de maquinismo de aparelhos de relojoaria ou de motor síncrono');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1000, '2112200', '9405', 'Aparelhos de iluminação (incluídos os projetores) e suas partes, não especificados nem compreendidos em outras posições; anúncios, cartazes ou tabuletas e placas indicadoras luminosos, e artigos semelhantes, contendo uma fonte luminosa fixa permanente, e suas partes não especificadas nem compreendidas em outras posições, com exceção dos itens classificados nos CEST 21.123.00, 21.124.00 e 21.125.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1001, '2112300', '940510', 'Lustres e outros aparelhos elétricos de iluminação, próprios para serem suspensos ou fixados no teto ou na parede, exceto os dos tipos utilizados na iluminação pública; e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1002, '2112300', '94059', 'Lustres e outros aparelhos elétricos de iluminação, próprios para serem suspensos ou fixados no teto ou na parede, exceto os dos tipos utilizados na iluminação pública; e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1003, '2112400', '94052000', 'Abajures de cabeceiras, de escritório e lampadários de interior, elétricos e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1004, '2112400', '94059', 'Abajures de cabeceiras, de escritório e lampadários de interior, elétricos e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1005, '2112500', '940540', 'Outros aparelhos elétricos de iluminação e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1006, '2112500', '94059', 'Outros aparelhos elétricos de iluminação e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1007, '2112600', '85423190', 'Microprocessador');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1008, '2200100', '2309', 'Ração tipo “pet” para animais domésticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1009, '2300100', '210500', 'Sorvetes de qualquer espécie');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1010, '2300200', '1806', 'Preparados para fabricação de sorvete em máquina');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1011, '2300200', '1901', 'Preparados para fabricação de sorvete em máquina');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1012, '2300200', '2106', 'Preparados para fabricação de sorvete em máquina');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1013, '2400100', '3208', 'Tintas, vernizes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1014, '2400100', '3209', 'Tintas, vernizes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1015, '2400100', '321000', 'Tintas, vernizes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1016, '2400200', '2821', 'Xadrez e pós assemelhados, exceto pigmentos à base de dióxido de titânio classificados no código 3206.11.19');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1017, '1710800', '210120', 'Extratos, essências e concentrados de chá ou de mate e preparações à base destes extratos, essências ou concentrados ou à base de chá ou de mate, em embalagens de conteúdo inferior ou igual a 500 g, exceto as bebidas prontas à base de mate ou chá e os itens classificados no CEST 17.108.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1018, '1710801', '210120', 'Extratos, essências e concentrados de chá ou de mate e preparações à base destes extratos, essências ou concentrados ou à base de chá ou de mate, em cápsulas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1019, '1710900', '19019090', 'Preparações em pó para cappuccino e similares, em embalagens de conteúdo inferior ou igual a 500 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1020, '1710900', '21011190', 'Preparações em pó para cappuccino e similares, em embalagens de conteúdo inferior ou igual a 500 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1021, '1710900', '21011200', 'Preparações em pó para cappuccino e similares, em embalagens de conteúdo inferior ou igual a 500 g');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1022, '1711000', '22021000', 'Refrescos e outras bebidas prontas para beber, à base de chá e mate');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1023, '1711100', '22021000', 'Refrescos e outras bebidas não alcoólicas, exceto os refrigerantes e as demais bebidas nos CEST 03.007.00 e 17.110.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1024, '1711200', '22029900', 'Néctares de frutas e outras bebidas não alcoólicas prontas para beber, exceto isotônicos e energéticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1025, '1711300', '210120', 'Bebidas prontas à base de mate ou chá');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1026, '1711300', '22029900', 'Bebidas prontas à base de mate ou chá');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1027, '1711400', '22029900', 'Bebidas prontas à base de café');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1028, '1711500', '22029900', 'Bebidas alimentares prontas à base de soja, leite ou cacau, inclusive os produtos denominados bebidas lácteas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1029, '1900100', '32131000', 'Tinta guache');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1030, '1900200', '39162000', 'Espiral - perfil para encadernação, de plástico e outros materiais classificados nas posições 3901 a 3914');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1031, '1900300', '39161000', 'Outros espirais - perfil para encadernação, de plástico e outros materiais classificados nas posições 3901 a 3914');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1032, '1900300', '391690', 'Outros espirais - perfil para encadernação, de plástico e outros materiais classificados nas posições 3901 a 3914');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1033, '1900400', '39261000', 'Artigos de escritório e artigos escolares de plástico e outros materiais classificados nas posições 3901 a 3914, exceto estojos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1034, '1900500', '42021', 'Maletas e pastas para documentos e de estudante, e artefatos semelhantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1035, '1900500', '42029', 'Maletas e pastas para documentos e de estudante, e artefatos semelhantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1036, '1900501', '42021', 'Baús, malas e maletas para viagem');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1037, '1900501', '42029', 'Baús, malas e maletas para viagem');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1038, '1900600', '39269090', 'Prancheta de plástico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1039, '1900700', '48022090', 'Bobina para fax');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1040, '1900700', '48119090', 'Bobina para fax');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1041, '1900800', '4802549', 'Papel seda');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1042, '1900900', '48025499', 'Bobina para máquina de calcular, PDV ou equipamentos similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1043, '1900900', '48025799', 'Bobina para máquina de calcular, PDV ou equipamentos similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1044, '1900900', '48162000', 'Bobina para máquina de calcular, PDV ou equipamentos similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1045, '1901000', '4802569', 'Cartolina escolar e papel cartão, brancos e coloridos; recados auto adesivos (LP note);
papéis de presente, todos cortados em tamanho pronto para uso escolar e doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1046, '1901000', '4802579', 'Cartolina escolar e papel cartão, brancos e coloridos; recados auto adesivos (LP note);
papéis de presente, todos cortados em tamanho pronto para uso escolar e doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1047, '1901000', '4802589', 'Cartolina escolar e papel cartão, brancos e coloridos; recados auto adesivos (LP note);
papéis de presente, todos cortados em tamanho pronto para uso escolar e doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1048, '1901100', '37031010', 'Papel fotográfico, exceto: (i) os papéis fotográficos emulsionados com haleto de prata tipo brilhante, matte ou lustre, em rolo e, com largura igual ou superior a 102 mm e comprimento inferior ou igual a 350 m, (ii) os papéis fotográficos emulsionados com haleto de prata tipo brilhante ou fosco, em folha e com largura igual ou superior a 152 mm e comprimento inferior ou igual a 307 mm, (iii) papel de qualidade fotográfica com tecnologia “Thermo-autochrome”, que submetido a um processo de aquecimento seja ca');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1049, '1901100', '37031029', 'Papel fotográfico, exceto: (i) os papéis fotográficos emulsionados com haleto de prata tipo brilhante, matte ou lustre, em rolo e, com largura igual ou superior a 102 mm e comprimento inferior ou igual a 350 m, (ii) os papéis fotográficos emulsionados com haleto de prata tipo brilhante ou fosco, em folha e com largura igual ou superior a 152 mm e comprimento inferior ou igual a 307 mm, (iii) papel de qualidade fotográfica com tecnologia “Thermo-autochrome”, que submetido a um processo de aquecimento seja ca');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1050, '1901100', '37032000', 'Papel fotográfico, exceto: (i) os papéis fotográficos emulsionados com haleto de prata tipo brilhante, matte ou lustre, em rolo e, com largura igual ou superior a 102 mm e comprimento inferior ou igual a 350 m, (ii) os papéis fotográficos emulsionados com haleto de prata tipo brilhante ou fosco, em folha e com largura igual ou superior a 152 mm e comprimento inferior ou igual a 307 mm, (iii) papel de qualidade fotográfica com tecnologia “Thermo-autochrome”, que submetido a um processo de aquecimento seja ca');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1051, '1901100', '37039010', 'Papel fotográfico, exceto: (i) os papéis fotográficos emulsionados com haleto de prata tipo brilhante, matte ou lustre, em rolo e, com largura igual ou superior a 102 mm e comprimento inferior ou igual a 350 m, (ii) os papéis fotográficos emulsionados com haleto de prata tipo brilhante ou fosco, em folha e com largura igual ou superior a 152 mm e comprimento inferior ou igual a 307 mm, (iii) papel de qualidade fotográfica com tecnologia “Thermo-autochrome”, que submetido a um processo de aquecimento seja ca');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1052, '1901100', '37040000', 'Papel fotográfico, exceto: (i) os papéis fotográficos emulsionados com haleto de prata tipo brilhante, matte ou lustre, em rolo e, com largura igual ou superior a 102 mm e comprimento inferior ou igual a 350 m, (ii) os papéis fotográficos emulsionados com haleto de prata tipo brilhante ou fosco, em folha e com largura igual ou superior a 152 mm e comprimento inferior ou igual a 307 mm, (iii) papel de qualidade fotográfica com tecnologia “Thermo-autochrome”, que submetido a um processo de aquecimento seja ca');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1053, '1901100', '48022010', 'Papel fotográfico, exceto: (i) os papéis fotográficos emulsionados com haleto de prata tipo brilhante, matte ou lustre, em rolo e, com largura igual ou superior a 102 mm e comprimento inferior ou igual a 350 m, (ii) os papéis fotográficos emulsionados com haleto de prata tipo brilhante ou fosco, em folha e com largura igual ou superior a 152 mm e comprimento inferior ou igual a 307 mm, (iii) papel de qualidade fotográfica com tecnologia “Thermo-autochrome”, que submetido a um processo de aquecimento seja ca');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1054, '1901100', '48022090', 'Papel fotográfico, exceto: (i) os papéis fotográficos emulsionados com haleto de prata tipo brilhante, matte ou lustre, em rolo e, com largura igual ou superior a 102 mm e comprimento inferior ou igual a 350 m, (ii) os papéis fotográficos emulsionados com haleto de prata tipo brilhante ou fosco, em folha e com largura igual ou superior a 152 mm e comprimento inferior ou igual a 307 mm, (iii) papel de qualidade fotográfica com tecnologia “Thermo-autochrome”, que submetido a um processo de aquecimento seja ca');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1055, '1901200', '48101390', 'Papel almaço');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1056, '1901300', '48169010', 'Papel hectográfico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1057, '1901400', '39202019', 'Papel celofane e tipo celofane');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1058, '1901500', '48062000', 'Papel impermeável');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1059, '1901600', '48081000', 'Papel crepon');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1060, '1901700', '48102290', 'Papel fantasia');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1061, '1901800', '4809', 'Papel-carbono, papel autocopiativo (exceto os vendidos em rolos de diâmetro igual ou superior a 60 cm e os vendidos em folhas de formato igual ou superior a 60 cm de altura e igual ou superior a 90 cm de largura) e outros papéis para cópia ou duplicação (incluídos os papéis para estênceis ou para chapas ofsete), estênceis completos e chapas ofsete, de papel, em folhas, mesmo acondicionados em caixas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1062, '1901800', '4816', 'Papel-carbono, papel autocopiativo (exceto os vendidos em rolos de diâmetro igual ou superior a 60 cm e os vendidos em folhas de formato igual ou superior a 60 cm de altura e igual ou superior a 90 cm de largura) e outros papéis para cópia ou duplicação (incluídos os papéis para estênceis ou para chapas ofsete), estênceis completos e chapas ofsete, de papel, em folhas, mesmo acondicionados em caixas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1063, '1901900', '4817', 'Envelopes, aerogramas, bilhetes-postais não ilustrados e cartões para correspondência, de papel ou cartão, caixas, sacos e semelhantes, de papel ou cartão, contendo um sortido de artigos para correspondência');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1064, '1902000', '48201000', 'Livros de registro e de contabilidade, blocos de notas, de encomendas, de recibos, de apontamentos, de papel para cartas, agendas e artigos semelhantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1065, '1902100', '48202000', 'Cadernos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1066, '1902200', '48203000', 'Classificadores, capas para encadernação (exceto as capas para livros) e capas de processos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1067, '1902300', '48204000', 'Formulários em blocos tipo “manifold”, mesmo com folhas intercaladas de papel-carbono');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1068, '1902400', '48205000', 'Álbuns para amostras ou para coleções');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1069, '1902500', '48209000', 'Pastas para documentos, outros artigos escolares, de escritório ou de papelaria, de papel ou cartão e capas para livros, de papel ou cartão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1070, '1902600', '49090000', 'Cartões postais impressos ou ilustrados, cartões impressos com votos ou mensagens pessoais, mesmo ilustrados, com ou sem envelopes, guarnições ou aplicações (conhecidos como cartões de expressão social - de época/sentimento)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1071, '1902700', '96081000', 'Canetas esferográficas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1072, '1902800', '96082000', 'Canetas e marcadores, com ponta de feltro ou com outras pontas porosas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1073, '1902900', '96083000', 'Canetas tinteiro');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1074, '1903000', '9608', 'Outras canetas; sortidos de canetas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1075, '1903100', '480256', 'Papel cortado “cutsize” (tipo A3, A4, ofício I e II, carta e outros)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1076, '1903200', '52105990', 'Papel camurça');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1077, '1903300', '76071190', 'Papel laminado e papel espelho');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1078, '2000100', '12119090', 'Henna (embalagens de conteúdo inferior ou igual a 200 g)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1079, '2000101', '12119090', 'Henna (embalagens de conteúdo superior a 200 g)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1080, '2000200', '27121000', 'Vaselina');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1081, '2000300', '28142000', 'Amoníaco em solução aquosa (amônia)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1082, '2000400', '28470000', 'Peróxido de hidrogênio, em embalagens de conteúdo inferior ou igual a 500 ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1083, '2000500', '30067000', 'Lubrificação íntima');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1084, '2000600', '3301', 'Óleos essenciais (desterpenados ou não), incluídos os chamados “concretos” ou “absolutos”; resinoides; oleorresinas de extração; soluções concentradas de óleos essenciais em gorduras, em óleos fixos, em ceras ou em matérias análogas, obtidas por tratamento de flores através de substâncias gordas ou por maceração; subprodutos terpênicos residuais da desterpenação dos óleos essenciais; águas destiladas aromáticas e soluções aquosas de óleos essenciais, em embalagens de conteúdo inferior ou igual a 500 ml');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1085, '2000700', '33030010', 'Perfumes (extratos)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1086, '2000800', '33030020', 'Águas-de-colônia');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1087, '2000900', '33041000', 'Produtos de maquilagem para os lábios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1088, '2001000', '33042010', 'Sombra, delineador, lápis para sobrancelhas e rímel');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1089, '2001100', '33042090', 'Outros produtos de maquilagem para os olhos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1090, '2001200', '33043000', 'Preparações para manicuros e pedicuros, incluindo removedores de esmalte à base de acetona');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1091, '2001300', '33049100', 'Pós, incluídos os compactos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1092, '2001400', '33049910', 'Cremes de beleza, cremes nutritivos e loções tônicas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1093, '2001500', '33049990', 'Outros produtos de beleza ou de maquilagem preparados e preparações para conservação ou cuidados da pele, exceto as preparações solares e antissolares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1094, '2001600', '33049990', 'Preparações solares e antissolares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1095, '2001700', '33051000', 'Xampus para o cabelo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1096, '2001800', '33052000', 'Preparações para ondulação ou alisamento, permanentes, dos cabelos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1097, '2001900', '33053000', 'Laquês para o cabelo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1098, '2002000', '33059000', 'Outras preparações capilares, incluindo máscaras e finalizadores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1099, '2002100', '33059000', 'Condicionadores');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1100, '2002200', '33059000', 'Tintura para o cabelo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1101, '2002300', '33061000', 'Dentifrícios');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1102, '2002400', '33062000', 'Fios utilizados para limpar os espaços interdentais (fios dentais)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1103, '2002500', '33069000', 'Outras preparações para higiene bucal ou dentária');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1104, '2002600', '33071000', 'Preparações para barbear (antes, durante ou após)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1105, '2002700', '33072010', 'Desodorantes (desodorizantes) corporais líquidos, exceto os classificados no CEST 20.027.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1106, '2002701', '33072010', 'Loções e óleos desodorantes hidratantes líquidos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1107, '2002800', '33072010', 'Antiperspirantes líquidos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1108, '2002900', '33072090', 'Outros desodorantes (desodorizantes) corporais, exceto os classificados no CEST 20.029.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1109, '2002901', '33072090', 'Outras loções e óleos desodorantes hidratantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1110, '2003000', '33072090', 'Outros antiperspirantes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1111, '2003100', '33073000', 'Sais perfumados e outras preparações para banhos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1112, '2003200', '33079000', 'Outros produtos de perfumaria preparados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1113, '2003201', '33079000', 'Outros produtos de toucador preparados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1114, '2003300', '33079000', 'Soluções para lentes de contato ou para olhos artificiais');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1115, '2003400', '34011190', 'Sabões de toucador em barras, pedaços ou figuras moldados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1116, '2003500', '34011900', 'Outros sabões, produtos e preparações, em barras, pedaços ou figuras moldados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1117, '2003501', '34011900', 'Lenços umedecidos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1118, '2003600', '34012010', 'Sabões de toucador sob outras formas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1119, '2003700', '34013000', 'Produtos e preparações orgânicos tensoativos para lavagem da pele, na forma de líquido ou de creme, acondicionados para venda a retalho, mesmo contendo sabão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1120, '2003800', '40149010', 'Bolsa para gelo ou para água quente');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1121, '2003900', '40149090', 'Chupetas e bicos para mamadeiras e para chupetas, de borracha');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1122, '2004000', '39249000', 'Chupetas e bicos para mamadeiras e para chupetas, de silicone');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1123, '2004000', '39269040', 'Chupetas e bicos para mamadeiras e para chupetas, de silicone');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1124, '2004000', '39269090', 'Chupetas e bicos para mamadeiras e para chupetas, de silicone');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1125, '2004100', '42021', 'Malas e maletas de toucador');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1126, '2004200', '48181000', 'Papel higiênico - folha simples');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1127, '2004300', '48181000', 'Papel higiênico - folha dupla e tripla');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1128, '2004400', '48182000', 'Lenços (incluídos os de maquilagem) e toalhas de mão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1129, '2004500', '48182000', 'Papel toalha de uso institucional do tipo comercializado em rolos igual ou superior a 80 metros e do tipo comercializado em folhas intercaladas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1130, '2004600', '48183000', 'Toalhas e guardanapos de mesa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1131, '2004700', '48189090', 'Toalhas de cozinha (papel toalha de uso doméstico)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1132, '2004800', '96190000', 'Fraldas, exceto os descritos no CEST 20.048.01');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1133, '2004801', '96190000', 'Fraldas de fibras têxteis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1134, '2004900', '96190000', 'Tampões higiênicos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1135, '2005000', '96190000', 'Absorventes higiênicos externos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1136, '2005100', '56012190', 'Hastes flexíveis (uso não medicinal)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1137, '2005200', '56039290', 'Sutiã descartável, assemelhados e papel para depilação');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1138, '2005300', '82032090', 'Pinças para sobrancelhas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1139, '2005400', '82141000', 'Espátulas (artigos de cutelaria)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1140, '2005500', '82142000', 'Utensílios e sortidos de utensílios de manicuros ou de pedicuros (incluídas as limas para unhas)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1141, '2005600', '90251110', 'Termômetros, inclusive o digital');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1142, '2005600', '90251990', 'Termômetros, inclusive o digital');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1143, '2005700', '96032', 'Escovas e pincéis de barba, escovas para cabelos, para cílios ou para unhas e outras escovas de toucador de pessoas, incluídas as que sejam partes de aparelhos, exceto escovas de dentes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1144, '2005800', '96032100', 'Escovas de dentes, incluídas as escovas para dentaduras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1145, '2005900', '96033000', 'Pincéis para aplicação de produtos cosméticos');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1146, '2006000', '96050000', 'Sortidos de viagem, para toucador de pessoas para costura ou para limpeza de calçado ou de roupas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1147, '2006100', '9615', 'Pentes, travessas para cabelo e artigos semelhantes; grampos (alfinetes) para cabelo; pinças (pinceguiches), onduladores, bobes (rolos) e artefatos semelhantes para penteados, e suas partes, exceto os classificados na posição 8516 e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1148, '2006200', '96162000', 'Borlas ou esponjas para pós ou para aplicação de outros cosméticos ou de produtos de toucador');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1149, '2006300', '39233000', 'Mamadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1150, '2006300', '39241000', 'Mamadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1151, '2006300', '39249000', 'Mamadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1152, '2006300', '40149090', 'Mamadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1153, '2006300', '70102000', 'Mamadeiras');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1154, '2006400', '82121020', 'Aparelhos e lâminas de barbear');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1155, '2006400', '82122010', 'Aparelhos e lâminas de barbear');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1156, '2100100', '73211100', 'Fogões de cozinha de uso doméstico e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1157, '2100100', '73218100', 'Fogões de cozinha de uso doméstico e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1158, '2100100', '73219000', 'Fogões de cozinha de uso doméstico e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1159, '2100200', '84181000', 'Combinações de refrigeradores e congeladores (“freezers”), munidos de portas exteriores separadas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1160, '2100300', '84182100', 'Refrigeradores do tipo doméstico, de compressão');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1161, '2100400', '84182900', 'Outros refrigeradores do tipo doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1162, '2100500', '84183000', 'Congeladores (“freezers”) horizontais tipo arca, de capacidade não superior a 800 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1163, '2100600', '84184000', 'Congeladores (“freezers”) verticais tipo armário, de capacidade não superior a 900 litros');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1164, '2100700', '841850', 'Outros móveis (arcas, armários, vitrines, balcões e móveis semelhantes) para a conservação e exposição de produtos, que incorporem um equipamento para a produção de frio');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1165, '2100800', '8418699', 'Mini adega e similares');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1166, '2100900', '84186999', 'Máquinas para produção de gelo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1167, '2101000', '84189900', 'Partes dos refrigeradores, congeladores, mini adegas e similares, máquinas para produção de gelo e bebedouros descritos nos CEST 21.002.00, 21.003.00, 21.004.00, 21.005.00, 21.006.00, 21.007.00, 21.008.00, 21.009.00 e 21.013.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1168, '2101100', '842112', 'Secadoras de roupa de uso doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1169, '2101200', '84211990', 'Outras secadoras de roupas e centrífugas de uso doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1170, '2101300', '84186931', 'Bebedouros refrigerados para água');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1171, '2101400', '84219', 'Partes das secadoras de roupas e centrífugas de uso doméstico e dos aparelhos para filtrar ou depurar água, descritos nos CEST 21.011.00 e 21.012.00 e 21.098.00');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1172, '2101500', '84221100', 'Máquinas de lavar louça do tipo doméstico e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1173, '2101500', '84229010', 'Máquinas de lavar louça do tipo doméstico e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1174, '2101600', '844331', 'Máquinas que executem pelo menos duas das seguintes funções: impressão, cópia ou transmissão de telecópia (fax), capazes de ser conectadas a uma máquina automática para processamento de dados ou a uma rede');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1175, '2101700', '844332', 'Outras impressoras, máquinas copiadoras e telecopiadores (fax), mesmo combinados entre si, capazes de ser conectados a uma máquina automática para processamento de dados ou a uma rede');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1176, '2101800', '84439', 'Partes e acessórios de máquinas e aparelhos de impressão por meio de blocos, cilindros e outros elementos de impressão da posição 8442; e de outras impressoras, máquinas copiadoras e telecopiadores (fax), mesmo combinados entre si');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1177, '2101900', '84501100', 'Máquinas de lavar roupa, mesmo com dispositivos de secagem, de uso doméstico, de capacidade não superior a 10 kg, em peso de roupa seca, inteiramente automáticas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1178, '2102000', '84501200', 'Outras máquinas de lavar roupa, mesmo com dispositivos de secagem, de uso doméstico, com secador centrífugo incorporado');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1179, '2102100', '84501900', 'Outras máquinas de lavar roupa, mesmo com dispositivos de secagem, de uso doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1180, '2102200', '845020', 'Máquinas de lavar roupa, mesmo com dispositivos de secagem, de uso doméstico, de capacidade superior a 10 kg, em peso de roupa seca');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1181, '2102300', '845090', 'Partes de máquinas de lavar roupa, mesmo com dispositivos de secagem, de uso doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1182, '2102400', '84512100', 'Máquinas de secar de uso doméstico de capacidade não superior a 10 kg, em peso de roupa seca');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1183, '2102500', '84512990', 'Outras máquinas de secar de uso doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1184, '2102600', '845190', 'Partes de máquinas de secar de uso doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1185, '2102700', '84521000', 'Máquinas de costura de uso doméstico');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1186, '2102800', '847130', 'Máquinas automáticas para processamento de dados, portáteis, de peso não superior a 10 kg, contendo pelo menos uma unidade central de processamento, um teclado e uma tela');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1187, '2102900', '84714', 'Outras máquinas automáticas para processamento de dados');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1188, '2103000', '84715010', 'Unidades de processamento, de pequena capacidade, exceto as das subposições 8471.41 ou 8471.49, podendo conter, no mesmo corpo, um ou dois dos seguintes tipos de unidades: unidade de memória, unidade de entrada e unidade de saída; baseadas em microprocessadores, com capacidade de instalação, dentro do mesmo gabinete, de unidades de memória da subposição 8471.70, podendo conter múltiplos conectores de expansão (“slots”), e valor FOB inferior ou igual a US$ 12.500,00, por unidade');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1189, '2103100', '8471605', 'Unidades de entrada, exceto as classificadas no código 8471.60.54');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1190, '2103200', '84716090', 'Outras unidades de entrada ou de saída, podendo conter, no mesmo corpo, unidades de memória');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1191, '2103300', '847170', 'Unidades de memória');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1192, '2103400', '847190', 'Outras máquinas automáticas para processamento de dados e suas unidades; leitores magnéticos ou ópticos, máquinas para registrar dados em suporte sob forma codificada, e máquinas para processamento desses dados, não especificadas nem compreendidas em outras posições');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1193, '2103500', '847330', 'Partes e acessórios das máquinas da posição 84.71');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1194, '2805700', '65', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1195, '2805700', '67', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1196, '2805700', '70', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1197, '2805700', '82', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1198, '2805700', '90', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1199, '2805700', '96', 'Outros artigos destinados a cuidados pessoais não relacionados em outros itens deste anexo');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1200, '2805800', '39', 'Acessórios (por exemplo, bijuterias, relógios, óculos de sol, bolsas, mochilas, frasqueiras, carteiras, porta-cartões, porta-documentos, porta-celulares e embalagens presenteáveis (por exemplo, caixinhas de papel), entre outros itens assemelhados)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1201, '2805800', '42', 'Acessórios (por exemplo, bijuterias, relógios, óculos de sol, bolsas, mochilas, frasqueiras, carteiras, porta-cartões, porta-documentos, porta-celulares e embalagens presenteáveis (por exemplo, caixinhas de papel), entre outros itens assemelhados)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1202, '2805800', '48', 'Acessórios (por exemplo, bijuterias, relógios, óculos de sol, bolsas, mochilas, frasqueiras, carteiras, porta-cartões, porta-documentos, porta-celulares e embalagens presenteáveis (por exemplo, caixinhas de papel), entre outros itens assemelhados)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1203, '2805800', '90', 'Acessórios (por exemplo, bijuterias, relógios, óculos de sol, bolsas, mochilas, frasqueiras, carteiras, porta-cartões, porta-documentos, porta-celulares e embalagens presenteáveis (por exemplo, caixinhas de papel), entre outros itens assemelhados)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1204, '2805800', '91', 'Acessórios (por exemplo, bijuterias, relógios, óculos de sol, bolsas, mochilas, frasqueiras, carteiras, porta-cartões, porta-documentos, porta-celulares e embalagens presenteáveis (por exemplo, caixinhas de papel), entre outros itens assemelhados)');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1205, '2805900', '61', 'Vestuário e seus acessórios; calçados, polainas e artefatos semelhantes, e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1206, '2805900', '62', 'Vestuário e seus acessórios; calçados, polainas e artefatos semelhantes, e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1207, '2805900', '64', 'Vestuário e seus acessórios; calçados, polainas e artefatos semelhantes, e suas partes');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1208, '2806000', '42', 'Outros artigos de vestuário em geral, exceto os relacionados no item anterior');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1209, '2806000', '52', 'Outros artigos de vestuário em geral, exceto os relacionados no item anterior');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1210, '2806000', '55', 'Outros artigos de vestuário em geral, exceto os relacionados no item anterior');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1211, '2806000', '58', 'Outros artigos de vestuário em geral, exceto os relacionados no item anterior');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1212, '2806000', '63', 'Outros artigos de vestuário em geral, exceto os relacionados no item anterior');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1213, '2806000', '65', 'Outros artigos de vestuário em geral, exceto os relacionados no item anterior');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1214, '2806100', '39', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1215, '2806100', '40', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1216, '2806100', '52', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1217, '2806100', '56', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1218, '2806100', '62', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1219, '2806100', '63', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1220, '2806100', '66', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1221, '2806100', '69', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1222, '2806100', '70', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1223, '2806100', '73', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1224, '2806100', '76', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1225, '2806100', '82', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1226, '2806100', '83', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1227, '2806100', '84', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1228, '2806100', '91', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1229, '2806100', '94', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1230, '2806100', '96', 'Artigos de casa');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1231, '2806200', '13', 'Produtos das indústrias alimentares e bebidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1232, '2806200', '15', 'Produtos das indústrias alimentares e bebidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1233, '2806200', '16', 'Produtos das indústrias alimentares e bebidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1234, '2806200', '17', 'Produtos das indústrias alimentares e bebidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1235, '2806200', '18', 'Produtos das indústrias alimentares e bebidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1236, '2806200', '19', 'Produtos das indústrias alimentares e bebidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1237, '2806200', '20', 'Produtos das indústrias alimentares e bebidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1238, '2806200', '21', 'Produtos das indústrias alimentares e bebidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1239, '2806200', '22', 'Produtos das indústrias alimentares e bebidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1240, '2806200', '23', 'Produtos das indústrias alimentares e bebidas');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1241, '2806300', '22', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1242, '2806300', '27', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1243, '2806300', '28', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1244, '2806300', '29', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1245, '2806300', '33', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1246, '2806300', '34', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1247, '2806300', '35', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1248, '2806300', '38', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1249, '2806300', '39', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1250, '2806300', '63', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1251, '2806300', '68', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1252, '2806300', '73', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1253, '2806300', '84', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1254, '2806300', '85', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1255, '2806300', '96', 'Produtos de limpeza e conservação doméstica');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1256, '2806400', '39', 'Artigos infantis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1257, '2806400', '49', 'Artigos infantis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1258, '2806400', '95', 'Artigos infantis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1259, '2806400', '96', 'Artigos infantis');

insert into LIV_CEST (NCODI_CEST, CCODI_CEST, CCNCM_CEST, CDESC_CEST)
values (1260, '2899900', 'NT', 'Outros produtos comercializados pelo sistema de marketing direto porta-a-porta a consumidor final não relacionados em outros itens deste anexo');  