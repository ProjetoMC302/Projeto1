-- Database: postgres
-- DROP DATABASE postgres

-- primeiramente, inicie o psql com o usuario postgres. Para isso, no Debian, o comando eh sudo -u postgres psql
-- depois, copie o código daqui e digite enter.
-- eh necessario configurar o usuario postgres com a senha 123456, definida como padrão no projeto.

CREATE DATABASE postgres
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'en_US.UTF-8'
       LC_CTYPE = 'en_US.UTF-8'
       CONNECTION LIMIT = -1;

COMMENT ON DATABASE postgres
  IS 'Banco de Dados do Sistema Interno de Imobiliaria';

\connect postgres

-- Table: enderecos

-- DROP TABLE enderecos;

CREATE TABLE enderecos
(
  endereco_id serial PRIMARY KEY,
  cep integer,
  estado character varying(15),
  cidade character varying(30),
  rua character varying(50),
  bairro character varying(20),
  numero integer,
  complemento character varying(15)
) 
WITH (
   OIDS=FALSE
);


-- Table: pessoas

-- DROP TABLE pessoas; 
CREATE TABLE pessoas
(
  pessoa_id serial PRIMARY KEY,
  endereco_id integer,
  nome character varying(50),
  telefone character varying(20),
  documento character varying(15),
  email character varying(30)
  )
WITH (
  OIDS=FALSE
);

-- Table: condominios

-- DROP TABLE condominios;

CREATE TABLE condominios
(
  condominio_id integer PRIMARY KEY NOT NULL,
  valor_condominio float8
)
WITH (
  OIDS=FALSE
);
ALTER TABLE condominios
  OWNER TO postgres;

-- Table: gerentes

-- DROP TABLE gerentes;

CREATE TABLE gerentes
(
  gerente_id serial PRIMARY KEY,
  pessoa_id integer REFERENCES pessoas(pessoa_id),
  senha character varying(15)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.gerentes
  OWNER TO postgres;

-- Table: formas_pagamento

-- DROP TABLE formas_pagamento;

CREATE TABLE formas_pagamento
(
  forma_pagamento_id serial PRIMARY KEY, 
  forma_pagamento character varying(15)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE formas_pagamento
  OWNER TO postgres;

-- Table: tipos_imovel

-- DROP TABLE tipos_imovel;

CREATE TABLE tipos_imovel
(
  tipo_imovel_id serial PRIMARY KEY,
  tipo_imovel character varying(15)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tipos_imovel
  OWNER TO postgres;

-- Table: restricoes

-- DROP TABLE restricoes;

CREATE TABLE restricoes
(
  restricao_id serial PRIMARY KEY,
  restricao character varying(15)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE restricoes
  OWNER TO postgres;

-- Table: corretores

-- DROP TABLE corretores;

CREATE TABLE corretores
(
  corretor_id serial PRIMARY KEY,
  pessoa_id integer REFERENCES pessoas(pessoa_id),
  senha character varying(15),
  creci character varying(15),
  status boolean
)
WITH (
  OIDS=FALSE
);
ALTER TABLE corretores
  OWNER TO postgres;

-- Table: public.clientes

-- DROP TABLE public.clientes;

CREATE TABLE clientes
(
  cliente_id serial PRIMARY KEY,
  pessoa_id integer REFERENCES pessoas(pessoa_id),
  corretor_id integer REFERENCES corretores(corretor_id),
  preco_max float8
)
WITH (
  OIDS=FALSE
);
ALTER TABLE clientes
  OWNER TO postgres;

-- Table: preferencias

-- DROP TABLE preferencias;

CREATE TABLE preferencias
(
  preferencia_id serial PRIMARY KEY,
  cliente_id integer REFERENCES clientes(cliente_id),
  tipo_imovel_id integer REFERENCES tipos_imovel(tipo_imovel_id),
  restricao_id integer REFERENCES restricoes(restricao_id),
  endereco_id integer REFERENCES enderecos(endereco_id),
  aluguel boolean,
  esquina boolean,
  condominio boolean,
  area_minima_terreno double precision\
)
WITH (
  OIDS=FALSE
);
ALTER TABLE preferencias
  OWNER TO postgres;

-- Table: lazeres

-- DROP TABLE lazeres;

CREATE TABLE lazeres
(
  lazer_id serial PRIMARY KEY,
  lazer character varying(20)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE lazeres
  OWNER TO postgres;

-- Table: proprietarios

-- DROP TABLE proprietarios;

CREATE TABLE proprietarios
(
  proprietario_id serial PRIMARY KEY,
  pessoa_id integer REFERENCES pessoas(pessoa_id),
  empresa boolean
)
WITH (
  OIDS=FALSE
);
ALTER TABLE proprietarios
  OWNER TO postgres;

-- Table: imoveis

-- DROP TABLE imoveis;

CREATE TABLE imoveis
(
  imovel_id serial PRIMARY KEY,
  endereco_id integer REFERENCES enderecos(endereco_id),
  proprietario_id integer REFERENCES proprietarios(proprietario_id),
  condominio_id integer REFERENCES condominios(condominio_id),
  corretor_id integer REFERENCES corretores(corretor_id),
  tipo_imovel_id integer REFERENCES tipos_imovel(tipo_imovel_id),
  descricao text,
  diferenciais text,
  preco float8,
  iptu float8,
  aluguel boolean
)
WITH (
  OIDS=FALSE
);
ALTER TABLE imoveis
  OWNER TO postgres;

-- Table: preferencias_construcao

-- DROP TABLE preferencias_construcao;

CREATE TABLE preferencias_construcao
(
  preferencia_construcao_id serial PRIMARY KEY,
  preferencia_id integer REFERENCES preferencias(preferencia_id),
  area_minima_construida double precision,
  quantidade_banheiros integer,
  quantidade_quartos integer,
  quantidade_andares integer,
  quantidade_suites integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE preferencias_construcao
  OWNER TO postgres;

-- Table: propostas

-- DROP TABLE propostas;

CREATE TABLE propostas
(
  proposta_id serial PRIMARY KEY,
  cliente_id integer REFERENCES clientes(cliente_id),
  corretor_id integer REFERENCES corretores(corretor_id),
  proprietario_id integer REFERENCES proprietarios(proprietario_id),
  imovel_id integer REFERENCES imoveis(imovel_id),
  preco_proposta float8,
  ativo boolean
)
WITH (
  OIDS=FALSE
);
ALTER TABLE propostas
  OWNER TO postgres;

-- Table: pagamentos

-- DROP TABLE pagamentos;

CREATE TABLE pagamentos
(
  pagamento_id serial PRIMARY KEY,
  proposta_id integer REFERENCES propostas(proposta_id),
  forma_pagamento_id integer REFERENCES formas_pagamento(forma_pagamento_id),
  valor_combinado float8
)
WITH (
  OIDS=FALSE
);
ALTER TABLE pagamentos
  OWNER TO postgres;

-- Table: terrenos

-- DROP TABLE terrenos;

CREATE TABLE terrenos
(
  terreno_id serial PRIMARY KEY,
  imovel_id integer REFERENCES imoveis(imovel_id),
  area_terreno double precision
)
WITH (
  OIDS=FALSE
);
ALTER TABLE terrenos
  OWNER TO postgres;

-- Table: imoveis_construidos

-- DROP TABLE imoveis_construidos;

CREATE TABLE imoveis_construidos
(
  imovel_construido_id serial PRIMARY KEY,
  imovel_id integer REFERENCES imoveis(imovel_id),
  area_construida double precision,
  quantidade_banheiros integer,
  quantidade_quartos integer,
  quantidade_andares integer,
  quantidade_suites integer,
  vagas_automovel integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE imoveis_construidos
  OWNER TO postgres;

-- Table: casas

-- DROP TABLE casas;

CREATE TABLE casas
(
  casa_id serial PRIMARY KEY,
  imovel_construido_id integer REFERENCES imoveis_construidos(imovel_construido_id),
  esquina boolean,
  piscina boolean,
  area_terreno double precision
)
WITH (
  OIDS=FALSE
);
ALTER TABLE casas
  OWNER TO postgres;

-- Table: apartamentos

-- DROP TABLE apartamentos;

CREATE TABLE apartamentos
(
  apartamento_id serial PRIMARY KEY,
  imovel_construido_id integer REFERENCES imoveis_construidos(imovel_construido_id),
  cobertura boolean,
  quantidade_terraco integer,
  andar integer,
  elevador_servico boolean,
  elevador_social boolean
)
WITH (
  OIDS=FALSE
);
ALTER TABLE apartamentos
  OWNER TO postgres;

-- Table: cliente_formas_pagamento

-- DROP TABLE cliente_formas_pagamento;

CREATE TABLE cliente_formas_pagamento
(
  cliente_forma_pagamento_id serial PRIMARY KEY,
  cliente_id integer REFERENCES clientes(cliente_id),
  forma_pagamento_id integer REFERENCES formas_pagamento(forma_pagamento_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE cliente_formas_pagamento
  OWNER TO postgres;

-- Table: condominio_lazeres

-- DROP TABLE condominio_lazeres;

CREATE TABLE condominio_lazeres
(
  condominio_lazer_id serial PRIMARY KEY,
  condominio_id integer REFERENCES condominios(condominio_id),
  lazer_id integer REFERENCES lazeres(lazer_id))
WITH (
  OIDS=FALSE
);
ALTER TABLE condominio_lazeres
  OWNER TO postgres;

-- Table: imovel_formas_pagamento

-- DROP TABLE imovel_formas_pagamento;

CREATE TABLE imovel_formas_pagamento
(
  imovel_forma_pagamento_id serial PRIMARY KEY,
  imovel_id integer REFERENCES imoveis(imovel_id),
  forma_pagamento_id integer REFERENCES formas_pagamento(forma_pagamento_id) 
)
WITH (
  OIDS=FALSE
);
ALTER TABLE imovel_formas_pagamento
  OWNER TO postgres;

-- Table: imovel_restricoes

-- DROP TABLE imovel_restricoes;

CREATE TABLE imovel_restricoes
(
  imovel_restricaos_id serial PRIMARY KEY,
  imovel_id integer REFERENCES imoveis(imovel_id),
  restricao_id integer REFERENCES restricoes(restricao_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE imovel_restricoes
  OWNER TO postgres;

INSERT INTO lazeres (lazer) VALUES ('ACADEMIA');
INSERT INTO lazeres (lazer) VALUES ('LAGO');
INSERT INTO lazeres (lazer) VALUES ('PISCINA');
INSERT INTO lazeres (lazer) VALUES ('QUADRADEESPORTES');
INSERT INTO lazeres (lazer) VALUES ('SALAODEJOGOS');
INSERT INTO lazeres (lazer) VALUES ('SALAODEFESTA');
INSERT INTO lazeres (lazer) VALUES ('CHURRASQUEIRA');
INSERT INTO lazeres (lazer) VALUES ('SAUNA');
INSERT INTO lazeres (lazer) VALUES ('PARQUINHO');

INSERT INTO formas_pagamento (forma_pagamento) VALUES ('FINANCIAMENTO');
INSERT INTO formas_pagamento (forma_pagamento) VALUES ('PERMUTA');
INSERT INTO formas_pagamento (forma_pagamento) VALUES ('AVISTA');

INSERT INTO restricoes (restricao) VALUES ('RESIDENCIAL');
INSERT INTO restricoes (restricao) VALUES ('COMERCIAL');

INSERT INTO tipos_imovel (tipo_imovel) VALUES ('CASA');
INSERT INTO tipos_imovel (tipo_imovel) VALUES ('APARTAMENTO');
INSERT INTO tipos_imovel (tipo_imovel) VALUES ('TERRENO');
