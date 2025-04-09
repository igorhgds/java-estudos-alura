ALTER TABLE medicos ADD COLUMN ativo boolean;
update medicos set ativo = true;