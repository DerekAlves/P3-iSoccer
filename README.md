# P3-iSoccer
Projeto de Software - iSoccer

# Funcionalidades

#### Método menu, reune todas as funcionalidades abaixo.
#### Motivação
* criar um método, que reuna todas as funcionalidades do sistema, e que garanta o funcionamento continuo do sistema, até que o usuário resolva parar a execução, como banco de dados não é utilizado, todas as informações do sistema serão perdidas ao finalizar a execução.
#### Solução
* Criar o método menu, reunindo todas as funcionalidades do sistema, junto de um loop(while) que garante a execução contínua do sistema, até que o usuário resolva parar a execução. o método menu está localizado na classe Main, pois será chamado no método main apenas uma vez.
#### Vantagens
* Reunir todos as funcionalidades do sistema em um único método, que garante que o usuário escolha qual funcionalidade usar em um determinado momento e o uso contínuo do sistema até que o usuário encerre a execução.
#### Desvantagens
* Como banco de dados não foi usado, ao encerrar a execução todas as informações cadastradas no sistema serão perdidas.

### Funcionalidade - 1. O sistema só é acessado fornecendo login e senha. o usuário administrador é informado no primeiro acesso ao sistema.
  * Alterar login e senha de administrador.
  #### Método login
  #### Motivação
  * Possibilitar o login do administrador.
  #### Solução
  * Criar o método login, que está presente na Classe Main, pois só será usado no método menu para possibilitar o login de um administrador do sistema.
  #### Vantagens
  * Garantir que só o administrador do sistema possa fazer alterações, evitando assim que terceiros modifiquem ou tenham acesso a informações sigilosas presentes no sistema.
  #### Desvantagens
  * Se o administrador não estiver disponível, alterações e consultas não poderão ser efetuadas.

## 2. Gerenciar Funcionários:

#### Método 1
* void addfunc(ArrayList<Funcionarios> funcionarios), adiciona um novo funcionário a uma lista de funcionários.
 1. Adição de funcionários:
    Presidente, 
    Médico, 
    Técnico, 
    Preparadores físicos, 
    Motoristas, 
    Cozinheiros, 
    Advogados, 
    Jogador.

#### Motivação
* Criar um método que reuna toda a criação de um funcionário, em um só lugar. Possibilitando que o administrador escolha qual o tipo de funcionário, e assim criar o funcionário específico, logo em seguida após o funcionário ser criado, ele será adicionado em uma lista de funcionários, para consultas futuras ou edição de informações a respeito de um funcionário.
#### Solução
* É criado o método addfunc, que cuida da adição de funcionário a uma lista, dando a opção de qual funcionário vai ser adicionado e criando assim o funcionário específico do tipo solicitado pelo administrador.
#### Vantagens
* Reunir a criação de funcionário em um único método que irá usar o construtor específico de cada tipo de funcionário, dependendo da escolha do administrador, e assim adicionar o funcionário a uma lista de funcionários.
#### Desvantagens
* Por usar lista, alguns algoritmos de busca específicos tiveram que ser implementados.

### Método 2
* void editjog(ArrayList<Funcionarios> func), edita a situação de um jogador (Apto/Inapto).
 2. Editar situação do jogador:
    Apto, 
    inapto.
  
## 3. Gerenciar sócio torcedores:

### Metodo gersoc, gerencia os sócios.
### Metodo editsoc, edita um sócio.
  1. Criar taxas de associação.
  2. Adicionar sócio:
    Sócio Júnior, Sócio Sênior, Sócio Elite.
  3. Editar Situação do Sócio:
    Adimplente, 
    Inadimplente.
  
## 4. Gerenciar Recursos Físicos:
### Método gerrec, gerencia recursos
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

## ADM
#### Motivação
Instanciar um objeto do tipo Adm, que possui login e senha para ter poderes de administrador do sistema.
#### Solução
Criar a classe adm, com suas devidas informações e contrutor.
#### Vantagens
Poder ter uma classe unica com poderes de administrador do sistema, para fazer as devidas modificações no sistema.

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

## Socio (Super Classe)
#### Motivação
Instanciar um objeto do tipo sócio, que possui as informações:
Adimplente e Inadimplente (Estática) e nome, email , cpf, telefone, endereço, valor e situação(Adimplente/Inadimplente).
#### Solução
Criar a classe Socio com todas as informações necessárias e seu construtor.
#### Vantagens
Ter todas as informações reunidas em um só lugar, possibilitar herança e extensibilidade, ter o costrutor próprio.

### Junior (Subclasse)
#### Motivação
Instanciar o objeto do tipo Junior, que possui os atributos da superclasse Socio.
#### Solução
Criar a subclasse Junior, e seu próprio construtor.
#### Vantagens
Ter o construtor próprio, e saber com facilidade qual o tipo de socio, facilitando a manutenção e reduzindo o esforço de programação.

### Senior (Subclasse)
#### Motivação
Instanciar o objeto do tipo Senior, que possui os atributos da superclasse Socio.
#### Solução
Criar a subclasse Senior, e seu próprio construtor.
#### Vantagens
Ter o construtor próprio, e saber com facilidade qual o tipo de socio, facilitando a manutenção e reduzindo o esforço de programação.

### Elite (Subclasse)
#### Motivação
Instanciar o objeto do tipo Elite, que possui os atributos da superclasse Socio.
#### Solução
Criar a subclasse Elite, e seu próprio construtor.
#### Vantagens
Ter o construtor próprio, e saber com facilidade qual o tipo de socio, facilitando a manutenção e reduzindo o esforço de programação.

## Onibus
#### Motivação
Instanciar o objeto do tipo Onibus, que possui como unico atributo a capacidade.
#### Solução
Criar a classe Onibus, para que este tipo de objeto poss ser instanciado e ter seu próprio construtor.
#### Vantagens
Ter o construtor próprio e usar estruturas de dados para armazenar o tipo de informação, facilitando a manutenção e reduzindo o esforço de programação.
#### Desvantagens
Criação de uma classe extra, aumentando o número de classes.

## Estádio
#### Motivação
Instanciar o objeto do tipo Etadio, que possui os atributos nome, capacidade, banheiros e lanchonetes.
#### Solução
Criar a classe Estadio, com seus atributos e ter seu próprio construtor além de poder armazenar esse tipo de informação em estruturas de dados.
#### Vantagens
Ter o construtor próprio, facilitando a manutenção e reduzindo o esforço de manutenção.
#### Desvantagens
Criação de uma classe extra, aumentando o número de classes.

## CT
#### Motivação
Instanciar o objeto do tipo CT, que possui os atributos nome e capacidade.
#### Solução
Criar a subclasse CT, e seu próprio construtor.
#### Vantagens
Ter o construtor próprio, facilitando a manutenção e reduzindo o esforço de programação, além de poder armazenar este tipo de dado em estruturas de dados.
#### Desvantagens
Criação de uma classe extra, aumentando o número de classes.

# Distribuição dos Métodos
## Métodos na Main/iSoccerE/iSoccerU
### Motivação
Distribuir de forma que reduza o esforço de programação os métodos
### Solução
Os Métodos ficaram distribuidos em três classes. na main, iSoccerU e iSoccerE.
Os métodos da main são as funções básicas do sistema, menu, adicionar funcionario, sócio, recursos, relatorios.
Os métodos da iSoccerU concentram utilidades, como encontrar um funcionário/socio/em uma lista dentre outras utilidades.
Os métodos da iSoccerE concentram exceptions, como ler inteiro/float e ler inteiro dentro de uma margem especificada, por exemplo leia um número entre (1, 2), só seriam aceitos 1, ou 2.
### Vantagens
Concentrar os métodos em locais chave do programa, reduzindo o esforço de programação.

# Herança
## Funcionario
### Motivação
Criar subclasses do tipo funcionario, para representar diferentes tipos de funcionarios.
### Solução
Foram criadas oito subclasses, sendo estas Presidente, Médico, Técnico, Preparador, Motoristas, Cozinheiro, Advogado e Jogador para representar cada tipo de funcionario.
### Vantagens
Saber qual o tipo de funcionario, além de poder juntar em uma unica superclasse diversas peculiaridades de cada tipo de funcionário.

## Socio
### Motivação
Criar subclasses do tipo Socio, para representar diferentes tipos de Socios.
### Solução
Foram criadas tres subclasses, sendo estas Junior, Senior e Elite para representar cada tipo de socio.
### Vantagens
Saber qual o tipo de socio, além de poder juntar em uma unica superclasse diversas peculiaridades de cada tipo de socio.

# Interface

## Utilidades / iSoccerU
### Motivação
Criar uma interface para reunir funcões úteis que devem ser implementadas.
### Solução
Criar a iSoccerU reunindo todas as funções necessárias para serem usadas e reusadas em diversos métodos.
### Vantagens
Impõe a um terceiro porgramador estabelecer funções básicas para serem usadas nos métodos.

## Exception / iSoccerE - A ser esclarecida Tratamento de Exceções.

# Tratamento de Exceções
## Exception / iSoccerE
### Motivação
Estabelecer métodos para garantir que exceções não ocorram, prejudicando assim a execução do sistema.
### Solução
Criar a interface de Exception para garantir que métodos de exceção sejam implementadose garantir o bom funcionamento do sistema.
### Vantagens
Garantir que não ocorram exceções no sistema.

# Extensibilidade

## Funcionario
### Motivação
Criar subclasses do tipo funcionario, para representar diferentes tipos de funcionarios.
### Solução
Foram criadas oito subclasses, sendo estas Presidente, Médico, Técnico, Preparador, Motoristas, Cozinheiro, Advogado e Jogador para representar cada tipo de funcionario.
### Vantagens
Saber qual o tipo de funcionario, além de poder juntar em uma unica superclasse diversas peculiaridades de cada tipo de funcionário e garantir extensibilidade reduzindo o esforço ao criar um novo tipo de funcionário, ou seja subclasse.

## Socio
### Motivação
Criar subclasses do tipo Socio, para representar diferentes tipos de Socios.
### Solução
Foram criadas tres subclasses, sendo estas Junior, Senior e Elite para representar cada tipo de socio.
### Vantagens
Saber qual o tipo de socio, além de poder juntar em uma unica superclasse diversas peculiaridades de cada tipo de socio e garantir extensibilidade reduzindo o esforço ao criar um novo tipo de socio, ou seja subclasse.

# Reuso
## Construtores de Socio e Funcionario
### Motivação
Serem utilizados em todas as subclasses.
### Solução
Criar o Construtor e usar em todas as subclasses, reduzindo o esforço e programação e clones de código.
### Vantagens
Reduzir clonagem de código e esforço de programação.

## Exceptions - iSoccerE - loadint, loaddouble, loadintmargin.
### Motivação
Ler com segurança inteiros, reais e inteiros dentro de uma margem.
### Solução
Criar as funções para ler os tipos de dados, e usar em diversos momentos do sistema, como acessar opções em um menu, ou adicionar salário (Funcionario) ou custo de associação (Socio).
### Vantagens
Usar em várias partes do código, para evitar clones.
