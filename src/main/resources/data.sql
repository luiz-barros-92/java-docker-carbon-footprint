INSERT INTO funcionario (id, nome, setor) VALUES (1, 'Funcionario-1', 'RH');
INSERT INTO funcionario (id, nome, setor) VALUES (2, 'Funcionario-2', 'Financeiro');
INSERT INTO funcionario (id, nome, setor) VALUES (3, 'Funcionario-3', 'Auxiliar Administrativo');
INSERT INTO funcionario (id, nome, setor) VALUES (4, 'Funcionario-4', 'Administrador');
INSERT INTO funcionario (id, nome, setor) VALUES (5, 'Funcionario-5', 'Gerente Operacional');
INSERT INTO funcionario (id, nome, setor) VALUES (6, 'Funcionario-6', 'Jurídico');
INSERT INTO funcionario (id, nome, setor) VALUES (7, 'Funcionario-7', 'Auxiliar de Limpeza');
INSERT INTO funcionario (id, nome, setor) VALUES (8, 'Funcionario-8', 'Analista de Compras');
INSERT INTO funcionario (id, nome, setor) VALUES (9, 'Funcionario-9', 'Auxiliar Administrativo');
INSERT INTO funcionario (id, nome, setor) VALUES (10, 'Funcionario-10', 'Auxiliar Administrativo');

-- Dados PRE_PALESTRA (Média de consumo antes da conscientização)
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-03-13', 260.0, 74.0, 'PRE_PALESTRA', 1, 37.86);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-03-13', 220.0, 74.0, 'PRE_PALESTRA', 2, 33.06);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-03-13', 400.0, 74.0, 'PRE_PALESTRA', 3, 54.66);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-03-13', 580.0, 74.0, 'PRE_PALESTRA', 4, 76.26);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-03-13', 500.0, 74.0, 'PRE_PALESTRA', 5, 66.66);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-03-13', 250.0, 74.0, 'PRE_PALESTRA', 6, 36.66);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-03-13', 0.0, 74.0, 'PRE_PALESTRA', 7, 6.66);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-03-13', 0.0, 74.0, 'PRE_PALESTRA', 8, 6.66);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-03-13', 380.0, 74.0, 'PRE_PALESTRA', 9, 52.26);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-03-13', 200.0, 74.0, 'PRE_PALESTRA', 10, 30.66);

-- Dados POS_PALESTRA (Refletindo a adesão a caronas, transporte coletivo e economia de energia)
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-04-10', 260.0, 62.0, 'POS_PALESTRA', 1, 36.78);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-04-10', 110.0, 62.0, 'POS_PALESTRA', 2, 18.78); -- Carona alguns dias
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-04-10', 0.0, 62.0, 'POS_PALESTRA', 3, 5.58); -- Migrou para transporte coletivo
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-04-10', 580.0, 62.0, 'POS_PALESTRA', 4, 75.18);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-04-10', 250.0, 62.0, 'POS_PALESTRA', 5, 35.58); -- Reduziu deslocamento
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-04-10', 0.0, 62.0, 'POS_PALESTRA', 6, 5.58); -- Bike / carona
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-04-10', 0.0, 62.0, 'POS_PALESTRA', 7, 5.58);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-04-10', 0.0, 62.0, 'POS_PALESTRA', 8, 5.58);
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-04-10', 0.0, 62.0, 'POS_PALESTRA', 9, 5.58); -- Carona
INSERT INTO medicao (data_leitura, km_rodados, kwh_consumido, tipo, funcionario_id, total_co2) VALUES ('2026-04-10', 200.0, 62.0, 'POS_PALESTRA', 10, 29.58);

SELECT setval(pg_get_serial_sequence('funcionario', 'id'), coalesce(max(id),0) + 1, false) FROM funcionario;
SELECT setval(pg_get_serial_sequence('medicao', 'id'), coalesce(max(id),0) + 1, false) FROM medicao;

