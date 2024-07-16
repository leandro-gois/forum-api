insert into perfil (id, nome)
values(1, 'ALUNO');

insert into usuario (id, nome, email, senha, perfil_id)
values(1, 'Leandro', 'leandro@gmail.com', '$2a$12$zVOQO0VLxxnYmio6fuvx4elJvf0LPpR3JnuAfjmyE6n9tFJdrde6m', 1);

insert into usuario (id, nome, email, senha, perfil_id)
values(2, 'Marcio', 'marcio@gmail.com', '$2a$12$zVOQO0VLxxnYmio6fuvx4elJvf0LPpR3JnuAfjmyE6n9tFJdrde6m', 1);

insert curso (id, nome, categoria)
values(1, 'Spring', 'BackEnd');