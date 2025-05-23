create table consultas (
           id bigint primary key generated always as identity,
           medico_id bigint not null,
           paciente_id bigint not null,
           data timestamp not null,

           constraint fk_consultas_medico_id foreign key (medico_id) references medicos(id),
           constraint fk_consultas_paciente_id foreign key (paciente_id) references pacientes(id)
);
