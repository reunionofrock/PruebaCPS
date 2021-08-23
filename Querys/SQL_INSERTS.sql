SELECT *FROM PEDIDO
SELECT *FROM CLIENTE
SELECT *FROM REGION
SELECT *FROM TIPO_CLIENTE
SELECT *FROM factura




INSERT INTO CLIENTE (ID_CLIENTE, NOMBRE, APELLIDO, TELEFONO, CORREO) VALUES (0, 'JUAN','PEDRO','58698753','JUANPEDRO@MAIL.COM');
INSERT INTO CLIENTE (ID_CLIENTE, NOMBRE, APELLIDO, TELEFONO, CORREO) VALUES (2, 'PEDRO','JUAN','48652345','PEDROJUAN@MAIL.COM');
INSERT INTO CLIENTE (ID_CLIENTE, NOMBRE, APELLIDO, TELEFONO, CORREO) VALUES (3, 'JUANA','PEDRA','4568963','JUANAPEDRA@MAIL.COM');
INSERT INTO CLIENTE (ID_CLIENTE, NOMBRE, APELLIDO, TELEFONO, CORREO) VALUES (4, 'PEDRA','JUANA','7861569','PEDRAJUANA@MAIL.COM');
INSERT INTO CLIENTE (ID_CLIENTE, NOMBRE, APELLIDO, TELEFONO, CORREO) VALUES (5, 'ALEJANDRO','WILLIAM','7896632','ALEJANDROWILLIAM@MAIL.COM');
INSERT INTO CLIENTE (ID_CLIENTE, NOMBRE, APELLIDO, TELEFONO, CORREO) VALUES (6, 'WILLIAM','ALEJANDRO','48621568','WILLIAMALEJANDRO@MAIL.COM');
INSERT INTO CLIENTE (ID_CLIENTE, NOMBRE, APELLIDO, TELEFONO, CORREO) VALUES (7, 'ALEJANDRA','WILLIAMA','7892389','ALEJANDRAWILLIAMA@MAIL.COM');

INSERT INTO TIPO_CLIENTE(ID_TIPO_CLIENTE, CODIGO, DESCUENTO) VALUES (1, 'VISITANTE','0%');
INSERT INTO TIPO_CLIENTE(ID_TIPO_CLIENTE, CODIGO, DESCUENTO) VALUES (2, 'FRECUENTE','5%');
INSERT INTO TIPO_CLIENTE(ID_TIPO_CLIENTE, CODIGO, DESCUENTO) VALUES (3, 'MAYORISTA','10%');

INSERT INTO REGION(ID_REGION, NOMBRE_REGION) VALUES (1, 'NORTE_AMERICA');
INSERT INTO REGION(ID_REGION, NOMBRE_REGION) VALUES (2, 'ASIA');
INSERT INTO REGION(ID_REGION, NOMBRE_REGION) VALUES (3, 'OCEANIA');
INSERT INTO REGION(ID_REGION, NOMBRE_REGION) VALUES (4, 'AFRICA');
INSERT INTO REGION(ID_REGION, NOMBRE_REGION) VALUES (5, 'SUDAMERICA');
INSERT INTO REGION(ID_REGION, NOMBRE_REGION) VALUES (6, 'CENTROAMERICA');
INSERT INTO REGION(ID_REGION, NOMBRE_REGION) VALUES (7, 'EUROPA');


