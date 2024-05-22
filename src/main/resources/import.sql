--Endereços
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (1, 'Centro', 'Rua A', '100');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (2, 'Jardim das Flores', 'Rua B', '200');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (3, 'Vila Nova', 'Rua C', '300');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (4, 'Alto da Serra', 'Rua D', '400');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (5, 'Bairro das Laranjeiras', 'Rua E', '500');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (6, 'Centro', 'Rua F', '600');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (7, 'Jardim das Rosas', 'Rua G', '700');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (8, 'Vila Maria', 'Rua H', '800');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (9, 'Alto da Colina', 'Rua I', '900');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (10, 'Bairro do Sol', 'Rua J', '1000');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (11, 'Centro', 'Rua K', '1100');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (12, 'Jardim das Palmeiras', 'Rua L', '1200');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (13, 'Vila Esperança', 'Rua M', '1300');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (14, 'Alto da Montanha', 'Rua N', '1400');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (15, 'Bairro da Lua', 'Rua O', '1500');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (16, 'Centro', 'Rua P', '1600');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (17, 'Jardim das Acácias', 'Rua Q', '1700');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (18, 'Vila dos Pássaros', 'Rua R', '1800');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (19, 'Alto da Pedra', 'Rua S', '1900');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (20, 'Bairro do Vento', 'Rua T', '2000');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (21, 'Centro', 'Rua U', '2100');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (22, 'Jardim das Estrelas', 'Rua V', '2200');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (23, 'Vila da Paz', 'Rua W', '2300');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (24, 'Alto do Horizonte', 'Rua X', '2400');
INSERT INTO cp_enderecos (cd_endereco, ds_bairro, ds_logradouro, ds_numero) VALUES (25, 'Bairro do Mar', 'Rua Y', '2500');


--Pacientes
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (1, 'Ana Silva', TO_DATE('1985-01-01', 'YYYY-MM-DD'), '11999990001', 'ana.silva@example.com', 1);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (2, 'Bruno Sousa', TO_DATE('1990-02-02', 'YYYY-MM-DD'), '11999990002', 'bruno.sousa@example.com', 2);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (3, 'Carla Pereira', TO_DATE('1982-03-03', 'YYYY-MM-DD'), '11999990003', 'carla.pereira@example.com', 3);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (4, 'Daniel Costa', TO_DATE('1979-04-04', 'YYYY-MM-DD'), '11999990004', 'daniel.costa@example.com', 4);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (5, 'Eduarda Lima', TO_DATE('1987-05-05', 'YYYY-MM-DD'), '11999990005', 'eduarda.lima@example.com', 5);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (6, 'Fernando Almeida', TO_DATE('1980-06-06', 'YYYY-MM-DD'), '11999990006', 'fernando.almeida@example.com', 6);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (7, 'Gabriela Rocha', TO_DATE('1992-07-07', 'YYYY-MM-DD'), '11999990007', 'gabriela.rocha@example.com', 7);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (8, 'Henrique Carvalho', TO_DATE('1988-08-08', 'YYYY-MM-DD'), '11999990008', 'henrique.carvalho@example.com', 8);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (9, 'Isabela Souza', TO_DATE('1995-09-09', 'YYYY-MM-DD'), '11999990009', 'isabela.souza@example.com', 9);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (10, 'João Gomes', TO_DATE('1983-10-10', 'YYYY-MM-DD'), '11999990010', 'joao.gomes@example.com', 10);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (11, 'Karina Azevedo', TO_DATE('1991-11-11', 'YYYY-MM-DD'), '11999990011', 'karina.azevedo@example.com', 11);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (12, 'Leonardo Teixeira', TO_DATE('1986-12-12', 'YYYY-MM-DD'), '11999990012', 'leonardo.teixeira@example.com', 12);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (13, 'Mariana Ribeiro', TO_DATE('1993-01-13', 'YYYY-MM-DD'), '11999990013', 'mariana.ribeiro@example.com', 13);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (14, 'Nicolas Martins', TO_DATE('1984-02-14', 'YYYY-MM-DD'), '11999990014', 'nicolas.martins@example.com', 14);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (15, 'Olivia Fernandes', TO_DATE('1990-03-15', 'YYYY-MM-DD'), '11999990015', 'olivia.fernandes@example.com', 15);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (16, 'Quitéria Lima', TO_DATE('1983-04-16', 'YYYY-MM-DD'), '11999990016', 'quiteria.lima@example.com', 16);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (17, 'Ricardo Alves', TO_DATE('1978-05-17', 'YYYY-MM-DD'), '11999990017', 'ricardo.alves@example.com', 17);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (18, 'Sabrina Souza', TO_DATE('1991-06-18', 'YYYY-MM-DD'), '11999990018', 'sabrina.souza@example.com', 18);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (19, 'Thiago Cunha', TO_DATE('1984-07-19', 'YYYY-MM-DD'), '11999990019', 'thiago.cunha@example.com', 19);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (20, 'Ursula Nunes', TO_DATE('1992-08-20', 'YYYY-MM-DD'), '11999990020', 'ursula.nunes@example.com', 20);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (21, 'Vitor Campos', TO_DATE('1987-09-21', 'YYYY-MM-DD'), '11999990021', 'vitor.campos@example.com', 21);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (22, 'Wellington Dias', TO_DATE('1983-10-22', 'YYYY-MM-DD'), '11999990022', 'wellington.dias@example.com', 22);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (23, 'Xavier Lopes', TO_DATE('1989-11-23', 'YYYY-MM-DD'), '11999990023', 'xavier.lopes@example.com', 23);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (24, 'Yasmin Santana', TO_DATE('1993-12-24', 'YYYY-MM-DD'), '11999990024', 'yasmin.santana@example.com', 24);
INSERT INTO cp_pacientes (cd_paciente, nm_paciente, dt_nascimento, nr_telefone, ds_email, cd_endereco) VALUES (25, 'Zeca Moura', TO_DATE('1988-01-25', 'YYYY-MM-DD'), '11999990025', 'zeca.moura@example.com', 25);


--Especialidade
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (1, 'Cardiologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (2, 'Dermatologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (3, 'Endocrinologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (4, 'Gastroenterologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (5, 'Geriatria');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (6, 'Ginecologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (7, 'Hematologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (8, 'Infectologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (9, 'Nefrologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (10, 'Neurologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (11, 'Oftalmologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (12, 'Ortopedia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (13, 'Otorrinolaringologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (14, 'Pediatria');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (15, 'Psiquiatria');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (16, 'Reumatologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (17, 'Urologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (18, 'Radiologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (19, 'Oncologia');
INSERT INTO cp_especialidade (cd_especialidade, nm_especialidade) VALUES (20, 'Patologia');

--Medicos
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (1, 'Dr. Afonso Medeiros', 'MASCULINO', '11999990026', 'afonso.medeiros@hospital.com', 1);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (2, 'Dr. Beatriz Figueira', 'FEMININO', '11999990027', 'beatriz.figueira@hospital.com', 2);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (3, 'Dr. Carlos Soares', 'MASCULINO', '11999990028', 'carlos.soares@hospital.com', 3);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (4, 'Dr. Daniela Fontes', 'FEMININO', '11999990029', 'daniela.fontes@hospital.com', 4);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (5, 'Dr. Eduardo Pinto', 'MASCULINO', '11999990030', 'eduardo.pinto@hospital.com', 5);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (6, 'Dr. Fernanda Moura', 'FEMININO', '11999990031', 'fernanda.moura@hospital.com', 6);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (7, 'Dr. Guilherme Neves', 'MASCULINO', '11999990032', 'guilherme.neves@hospital.com', 7);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (8, 'Dr. Helena Costa', 'FEMININO', '11999990033', 'helena.costa@hospital.com', 8);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (9, 'Dr. Igor Ferreira', 'MASCULINO', '11999990034', 'igor.ferreira@hospital.com', 9);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (10, 'Dr. Júlia Rocha', 'FEMININO', '11999990035', 'julia.rocha@hospital.com', 10);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (11, 'Dr. Kleber Santos', 'MASCULINO', '11999990036', 'kleber.santos@hospital.com', 11);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (12, 'Dr. Larissa Gomes', 'FEMININO', '11999990037', 'larissa.gomes@hospital.com', 12);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (13, 'Dr. Marcelo Lima', 'MASCULINO', '11999990038', 'marcelo.lima@hospital.com', 13);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (14, 'Dr. Natália Cunha', 'FEMININO', '11999990039', 'natalia.cunha@hospital.com', 14);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (15, 'Dr. Otávio Ramos', 'MASCULINO', '11999990040', 'otavio.ramos@hospital.com', 15);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (16, 'Dr. Paula Souza', 'FEMININO', '11999990041', 'paula.souza@hospital.com', 16);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (17, 'Dr. Rodrigo Borges', 'MASCULINO', '11999990042', 'rodrigo.borges@hospital.com', 17);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (18, 'Dr. Silvia Campos', 'FEMININO', '11999990043', 'silvia.campos@hospital.com', 18);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (19, 'Dr. Tiago Martins', 'MASCULINO', '11999990044', 'tiago.martins@hospital.com', 19);
INSERT INTO cp_medicos (cd_medico, nm_medico, ds_genero, nr_telefone, ds_email, cd_especialidade) VALUES (20, 'Dr. Ubirajara Teixeira', 'MASCULINO', '11999990045', 'ubirajara.teixeira@hospital.com', 20);


--Consultas
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (1, 1, 1, 1, TO_DATE('2024-05-01', 'YYYY-MM-DD'), '10:00', 'Consulta de rotina');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (2, 2, 2, 2, TO_DATE('2024-05-02', 'YYYY-MM-DD'), '11:00', 'Revisão dermatológica');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (3, 3, 3, 3, TO_DATE('2024-05-03', 'YYYY-MM-DD'), '12:00', 'Exames de sangue');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (4, 4, 4, 4, TO_DATE('2024-05-04', 'YYYY-MM-DD'), '13:00', 'Consulta de estômago');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (5, 5, 5, 5, TO_DATE('2024-05-05', 'YYYY-MM-DD'), '14:00', 'Acompanhamento geriátrico');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (6, 6, 6, 6, TO_DATE('2024-05-06', 'YYYY-MM-DD'), '15:00', 'Exames ginecológicos');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (7, 7, 7, 7, TO_DATE('2024-05-07', 'YYYY-MM-DD'), '16:00', 'Consulta de hematologia');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (8, 8, 8, 8, TO_DATE('2024-05-08', 'YYYY-MM-DD'), '17:00', 'Exames de infecções');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (9, 9, 9, 9, TO_DATE('2024-05-09', 'YYYY-MM-DD'), '18:00', 'Consulta de nefrologia');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (10, 10, 10, 10, TO_DATE('2024-05-10', 'YYYY-MM-DD'), '09:00', 'Consulta de neurologia');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (11, 11, 11, 11, TO_DATE('2024-05-11', 'YYYY-MM-DD'), '10:30', 'Exames oftalmológicos');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (12, 12, 12, 12, TO_DATE('2024-05-12', 'YYYY-MM-DD'), '11:30', 'Consulta ortopédica');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (13, 13, 13, 13, TO_DATE('2024-05-13', 'YYYY-MM-DD'), '12:30', 'Consulta otorrinolaringológica');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (14, 14, 14, 14, TO_DATE('2024-05-14', 'YYYY-MM-DD'), '13:30', 'Consulta pediátrica');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (15, 15, 15, 15, TO_DATE('2024-05-15', 'YYYY-MM-DD'), '14:30', 'Consulta psiquiátrica');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (16, 16, 16, 16, TO_DATE('2024-05-16', 'YYYY-MM-DD'), '15:30', 'Consulta reumatológica');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (17, 17, 17, 17, TO_DATE('2024-05-17', 'YYYY-MM-DD'), '16:30', 'Consulta urológica');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (18, 18, 18, 18, TO_DATE('2024-05-18', 'YYYY-MM-DD'), '17:30', 'Exames radiológicos');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (19, 19, 19, 19, TO_DATE('2024-05-19', 'YYYY-MM-DD'), '18:30', 'Consulta oncológica');
INSERT INTO cp_consultas (cd_consultas, cd_paciente, cd_medico, cd_especialidade, dt_consulta, hr_consulta, ds_motivo_consulta) VALUES (20, 20, 20, 20, TO_DATE('2024-05-20', 'YYYY-MM-DD'), '19:30', 'Consulta de patologia');



--Receita
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (1, 1, 'Paracetamol', '500mg', 'Tomar 1 comprimido a cada 6 horas');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (2, 2, 'Dipirona', '300mg', 'Tomar 1 comprimido a cada 8 horas');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (3, 3, 'Insulina', '10 UI', 'Aplicar subcutaneamente antes das refeições');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (4, 4, 'Omeprazol', '20mg', 'Tomar 1 comprimido ao dia antes do café da manhã');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (5, 5, 'Vitamina D', '1000 UI', 'Tomar 1 cápsula por dia após o almoço');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (6, 6, 'Paracetamol', '500mg', 'Tomar 1 comprimido de 6 em 6 horas');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (7, 7, 'Dipirona', '1g', 'Tomar 1 comprimido ao dia após as refeições');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (8, 8, 'Amoxicilina', '500mg', 'Tomar 1 comprimido de 8 em 8 horas');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (9, 9, 'Ibuprofeno', '400mg', 'Tomar 1 comprimido de 12 em 12 horas');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (10, 10, 'Atorvastatina', '20mg', 'Tomar 1 comprimido ao dia');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (11, 11, 'Omeprazol', '20mg', 'Tomar 1 comprimido antes do café da manhã');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (12, 12, 'Metformina', '850mg', 'Tomar 1 comprimido 3 vezes ao dia antes das refeições');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (13, 13, 'Losartana', '50mg', 'Tomar 1 comprimido ao dia');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (14, 14, 'Insulina', '10ml', 'Aplicar 1 vez ao dia antes do café da manhã');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (15, 15, 'Levotiroxina', '100mcg', 'Tomar 1 comprimido ao dia em jejum');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (16, 16, 'Sertralina', '50mg', 'Tomar 1 comprimido ao dia');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (17, 17, 'Risperidona', '2mg', 'Tomar 1 comprimido ao dia');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (18, 18, 'Cloridrato de Paroxetina', '20mg', 'Tomar 1 comprimido ao dia');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (19, 19, 'Amitriptilina', '25mg', 'Tomar 1 comprimido ao dia antes de dormir');
INSERT INTO cp_receita_medica (cd_receita_medica, cd_consulta, nm_medicamento, ds_dosagem, ds_instrucao_uso) VALUES (20, 20, 'Alprazolam', '0,5mg', 'Tomar 1 comprimido 3 vezes ao dia conforme necessário');