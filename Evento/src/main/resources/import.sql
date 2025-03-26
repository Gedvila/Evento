INSERT INTO tb_categoria(descricao) VALUES ('Curso');
INSERT INTO tb_categoria(descricao) VALUES ('Oficina');

INSERT INTO tb_participantes(nome,email) VALUES ('José Silva','jose@gmail.com');
INSERT INTO tb_participantes(nome,email) VALUES ('Tiago Faria','tiago@gmail.com');
INSERT INTO tb_participantes(nome,email) VALUES ('Maria do Rosário','maria@gmail.com');
INSERT INTO tb_participantes(nome,email) VALUES ('Teresa Silva','teresa@gmail.com');

INSERT INTO  tb_atividades(categoria_id,nome,descricao,preco) VALUES (1,'Curso de HTML','Aprenda HTML de forma prática',80.00);
INSERT INTO  tb_atividades(categoria_id,nome,descricao,preco) VALUES (2,'Oficina de Github','Controle versões de seus produtos',50.00);

INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES (1,1);
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES (1,2);
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES (1,3);
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES (2,3);
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES (2,4);

INSERT INTO tb_blocos(atividade_id,inicio,fim) VALUES (1,'2017-09-25T08:00:00','2017-09-25T11:00:00');
INSERT INTO tb_blocos(atividade_id,inicio,fim) VALUES (2,'2017-09-25T14:00:00','2017-09-25T18:00:00');
INSERT INTO tb_blocos(atividade_id,inicio,fim) VALUES (2,'2017-09-26T08:00:00','2017-09-26T11:00:00');