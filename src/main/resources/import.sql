insert into tb_cozinha (nome) values ('Tailandesa');
insert into tb_cozinha (nome) values ('Indiana');

insert into tb_forma_pagamento (descricao) values ('Cartão de crédito');

insert into tb_restaurante (nome, taxa_frete, cozinha_id, forma_pagamento_id) values ('Abzu',44.50, 1, 1);
insert into tb_restaurante (nome, taxa_frete, cozinha_id, forma_pagamento_id) values ('Cabana do Sol', 15.49, 2, 1);

insert into tb_estado (nome) values ('Maranhão');

insert into tb_cidade (nome, estado_id) values ('São Luís', 1);

insert into tb_permissao (nome, descricao) values ('Consultar Produtos', 'Permite consultar produtos totalmente');