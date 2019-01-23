# P3-iSoccer
Projeto de Software - iSoccer

# Funcionalidades

## 1. O sistema só é acessado fornecendo login e senha. o usuário administrador é informado no primeiro acesso ao sistema.
  * Alterar login e senha de administrador.

## 2. Gerenciar Funcionários:

  1. Adição de funcionários:
    Presidente, 
    Médico, 
    Técnico, 
    Preparadores físicos, 
    Motoristas, 
    Cozinheiros, 
    Advogados, 
    Jogador.
    
  2. Editar situção do jogador:
    Apto, 
    inapto.
  
## 3. Gerenciar sócio torcedores:
  1. Criar taxas de associação.
  2. Adicionar sócio:
    Sócio Júnior, Sócio Sênior, Sócio Elite.
  3. Editar Situação do Sócio:
    Adimplente, 
    Inadimplente.
  
## 4. Gerenciar Recursos Físicos:
  1. Ônibus:
    Adicionar (Capacidade), 
    Verificar disponibilidade.
  2. Estádio:
    Adicionar (Capacidade, Banheiros, Lanchonetes), 
    Verificar disponibilidade.
  3. Centro de treinamento:
    Adicionar (Dormitórios), 
    Verificar disponibilidade.

## 5. Relatórios:

  1. Funcionários:
    Time (Jogadores, Técnico),
    Serviços gerais (Todos os outros funcionários descritos no item 2.1).

  2. Recursos físicos:
    Transporte, 
    Centro de treinamento (CT), 
    Estádio.

  3. Sócio torcedor, 
    Quantidade, 
    Adimplentes, 
    Inadimplentes, 
    Lista com os dados individuais.
    
# Classes
## Clube
#### Motivação
Unir todas as informações referentes ao clube, em um só lugar. Funcionários, Sócios, Recursos...
#### Solução
Criar a classe clube, que concentra Lista de funcionários, Sócios, Recursos e taxas de associação.
#### Vantagens
Unir tudo em um só lugar e evitar de passar muitos argumentos para uma função.

## Funcionários (Super Classe)
#### Motivação
Representar os dados básicos de um funcionário (Nome, Cpf, Telefone e Endereço), Além de possibilitar extensibilidade para tipos específicos de funcionários.
#### Solução
Criar a classe funcionário, reunindo todas as informações básicas de um funcionário.
#### Vantagens
Possibilitar extensibilidade e herança.

### Presidente (Subclasse)
#### Motivação
Instanciar o objeto presidente, pertencente a superclasse funcionários.
#### Solução
Criar a subclasse presidente, com seu construtor específico.
#### Vantagens
Ter o contrutor especifico da classe, e poder saber qual tipo de funcionário é, facilitando a manutenção do sistema.

### Médico (Subclasse)
#### Motivação
Instanciar o objeto médico, que possui o **CRM** além dos atributos da super classe funcionários.
#### Solução
Criar a subclasse médico, que possui o **CRM** além de todas as informações da super classe funcionário, além de possuir seu próprio construtor.
#### Vantagens
Ter o construtor especifico da classe, e saber qual o tipo de funcionário, facilitando a manutenção do sistema.
#### Desvantagens

### Técnico (Subclasse)
#### Motivação
IInstanciar o objeto do tipo técnico, pertencente a super classe funcionários.
#### Solução
Criar a subclasse técnico, e seu próprio construtor.
#### Vantagens
Ter o construtor específico da classe, e saber qual o tipo do funcionário. Reduzindo o esforço de programação e facilitando a manutenção do sistema.

### Preparador (Subclasse)
#### Motivação
Instanciar o objeto preparador, pertencente a superclasse funcionários.
#### Solução
Criar a subclasse preparador, e seu próprio construtor.
#### Vantagens
Ter o construtor especifico da classe, saber qual o tipo do funcionario. Reduzindo o esforço de programação.

### Motoristas (Subclasse)
#### Motivação
Instanciar o objeto do tipo motorista, que possui além dos dados da superclasse a informação de **Habilitação**.
#### Solução
Criar a classe motorista, adicionando a **Habilitação**, criando seu prórpio contrutor.
#### Vantagens
Adicionar a informação da **Habilitação**, ter o contrutor próprio da classe e poder saber qual o tipo de funcionário para reduzir esforço de programação e facilitar a manutenção do sistema.

### Cozinheiro (Subclasse)
#### Motivação
Instanciar o objeto da subclasse cozinheiro, que possui os dados da superclasse funcionários.
#### Solução
Criar a subclasse cozinheiro, e seu próprio contrutor.
#### Vantagens
Ter o construtor específico da classe, saber qual o tipo do funcionário facilitando a programação e manutenção.

### Advogado (Subclasse)
#### Motivação
Instanciar o objeto da subclasse Advogado, que possui os dados da superclasse funcionários.
#### Solução
Criar a subclasse Advogado, e seu próprio construtor.
#### Vantagens
Ter o construtor específico da classe, saber qual o tipo do funcionário e facilitar a manutenção/esforço de programação.

### Jogador (Subclasse)
#### Motivação
Instanciar o objeto do tipo Jogador, que possui além dos atributos da superclasse, a informação do tipo de jogador e situação (Apto/Inapto).
#### Solução
Criar a subclasse jogador, contendo o tipo e situação além do seu próprio construtor.
#### Vantagens
Ter as informações extras, além do seu construtor, saber qual o tipo de funcionário facilitando a manutenção e reduzindo o esforço de programação.


    
   
