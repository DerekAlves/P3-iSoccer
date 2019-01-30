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
  #### Método 1
  * boolean login(Adm admin), possibilita o login de um administrador.
  #### Motivação
  * Possibilitar o login do administrador.
  #### Solução
  * Criar o método login, que está presente na Classe Main, pois só será usado no método menu para possibilitar o login de um administrador do sistema.
  #### Vantagens
  * Garantir que só o administrador do sistema possa fazer alterações, evitando assim que terceiros modifiquem ou tenham acesso a informações sigilosas presentes no sistema.
  #### Desvantagens
  * Se o administrador não estiver disponível, alterações e consultas não poderão ser efetuadas.

## Funcionalidade - 2. Gerenciar Funcionários:

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
* É criado o método addfunc, que cuida da adição de funcionário a uma lista, dando a opção de qual funcionário vai ser adicionado e criando assim o funcionário específico do tipo solicitado pelo administrador, portanto o método foi criado na Classe Main pois será usado no método menu, que se encontra também na classe Main.
#### Vantagens
* Reunir a criação de funcionário em um único método que irá usar o construtor específico de cada tipo de funcionário, dependendo da escolha do administrador, e assim adicionar o funcionário a uma lista de funcionários.
#### Desvantagens
* Por usar lista, alguns algoritmos de busca específicos tiveram que ser implementados.

### Método 2
* void editjog(ArrayList<Funcionarios> func), edita a situação de um jogador (Apto/Inapto).
 2. Editar situação do jogador:
    Apto, 
    inapto.
 
 #### Motivação
 * Possibilitar a edição da situação do jogador, alterar de Apto para Inapto, ou vice-versa.
 #### Solução
 * Criar o método editjog, que se encontra na classe Main, pois será utilizado no método menu para possibilitar a alteração de status de jogador.
 #### Vantagens
 * Garantir que a funcionalidade de alterar status do jogador esteja presente no sistema, garantindo assim possíveis relatórios futuros sobre jogadores aptos ou inaptos.
 #### Desvantagens
 * Criação de um novo método na main, e utilizar algoritmo de busca para encontrar um jogador específico para ser alterado (pelo fato de usar uma lista de funcionários).
  
## Funcionalidade 3 - Gerenciar sócio torcedores:
1. Criar taxas de associação.
2. Adicionar sócio:
    Sócio Júnior, Sócio Sênior, Sócio Elite.
3. Editar Situação do Sócio:
    Adimplente, 
    Inadimplente.

### Metodo 1
* void gersoc(Clube clube), gerencia os sócios.
 #### Motivação
 * Ter um método capaz de concentrar todas as funcionalidades que podem ser feitas para sócio-torcedores, como Criar novas taxas de associação, adicionar um novo sócio ao clube, e editar situação de um sócio.
 #### Solução
 * Criar o método gersoc, que se encontra na classe Main, pois será utilizado no método menu para possibilitar o gerenciamento dos sócios torcedores, ou seja, o administrador do sistema terá a opção do que fazer quando esta funcionalidade for solicitada.
 #### Vantagens
 * Garantir que a funcionalidade de gerenciar sócios esteja presente no sistema, garantindo assim alterações no sistema e possibilitar relatórios no futuro.
 #### Desvantagens
* Os sócios estão reunidos em uma lista de sócios, sendo assim para procurar um sócio específico temos que utilizar métodos para encontrar o sócio que queremos editar.
 
### Metodo 2
* void editsoc(ArrayList<Socio> soc), edita um sócio.
 
 #### Motivação
 * Possibilitar e edição do status de um sócio, Adimplente ou Inadimplente.
 #### Solução
 * Criação do método editsoc, que se encontra na classe Main, pois será utilizado no método gersoc para possibilitar a edição da situação dos sócios torcedores, ou seja, a situação poderá ser alterada pelo administrador, garantindo assim a presença da funcionalidade e possibilitando a geração de relatórios futuros.
 #### Vantagens
 * Alterar a situação do sócio, contar quantos sócios inadimplentes e adimplentes existem.
 #### Desvantagens
* Os sócios estão reunidos em uma lista de sócios, sendo assim para procurar um sócio específico temos que utilizar um método de busca para encontrarmos o sócio a ser editado.

## Funcionalidade 4 - Gerenciar Recursos Físicos:
### Método 1,
* void gerrec(Clube clube), capaz de gerenciar todos os recursos do clube, Onibus/Estádios/CT'S
  1. Ônibus:
    Adicionar (Capacidade), 
    Verificar disponibilidade.
  2. Estádio:
    Adicionar (Capacidade, Banheiros, Lanchonetes), 
    Verificar disponibilidade.
  3. Centro de treinamento:
    Adicionar (Dormitórios), 
    Verificar disponibilidade.
    
    #### Motivação
    * Garantir que o sistema seja capaz de gerenciar recursos quando solicitado pelo administrador do sistema.
    #### Solução
    * Criar o metodo gerrec, que concetra todo o gerenciamento de recursos em um só lugar, possibilitanto que o administrador do sistema escolha o que deve ser feito, sendo assim chamar um outro método.
    #### Vantagens
    * Toda o gerenciamento de recursos está concentrado em um só método, que chama outros métodos para resolver subproblemas desta funcionalidade.
    #### Desvantagens
    * Os recursos do clube estão dispostos em listas, sendo assim faz-se necessário a criação de algoritmos de busca para buscar uma instância dos objetos.

## Funcionalidade 5 - Relatórios:
* Gerar os seguintes relatórios:
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
Possibilitar que o sistema seja acessado por um usuário administrador, garantindo que alterações/consultas não sejam feitas sem o consentimento do administrador - deixando o sistema seguro.
#### Solução
Criar a classe Adm, para que o login de administrador possa ser efetuado garantindo a o acesso seguro ao sistema.
#### Vantagens
* Garantir o acesso seguro ao sistema, e que terceiros não possam modificar/acessar as informações que estão salvas no sistema.

## Clube
#### Motivação
Unir todas as informações referentes ao clube, em um só lugar. Funcionários, Sócios, Recursos...
#### Solução
Criar a classe clube, que concentra Listas de funcionários, Sócios e Recursos além dos valores padrão para associação ( Sócio Torcedores).
#### Vantagens
Unir tudo em um só lugar e evitar de passar muitos argumentos para métodos.

## Funcionários (Super Classe)
#### Motivação
Representar os dados básicos de um funcionário (Nome, Cpf, Telefone e Endereço), Além de possibilitar extensibilidade para tipos específicos de funcionários.
#### Solução
Criar a classe funcionário, onde iremos reunir todas as informações básicas sobre um funcionário padrão.
#### Vantagens
Possibilitar extensibilidade e Herança, visto que temos diversos tipos de funcionários com suas peculiaridades individuais. Além de futuramente com o uso de _instaceof_ descobrir a que tipo de funcionário o sistema está se referindo.

### Subclasses de Funcionários - Presidente - Médico - Técnico - Preparador - Motoristas - Cozinheiro - Advogado - Jogador
#### Motivação
* Criar cada tipo de funcionário acima, com suas peculiaridades e poder saber qual o tipo de funcionário com _instaceof_ além de ter o _toString_ próprio de cada funcionário possibilitando a geração de relatórios mais facilmente, e não usar if para identificar qual o tipo de funcionário, implicando assim em ter uma informação extra na Superclasse funcionários para identificar qual o tipo de funcionário.
#### Solução
* Criar todas as subclasses acima, e possibilitar a herança da _superclasse_ Funcionários.
1. O Presidente possui todas as informações da superclasse Funcionários e não possui informações extras, a justificativa para ter criado esta subclasse é poder ter o seu próprio _toString_ e possibilitar alterações no sistema mais facilmente no futuro, além de com o uso de _instaceof_ identificar se o funcionário é do tipo "Presidente".
2. O Médico, além dos atributos da Superclasse, possui o **CRM**, sendo assim se faz necessário a criação de uma subclasse que herde os valores da superclasse Funcionários e seja acrescido o **CRM**, além de ter seu próprio _toString_ e saber qual o tipo de funcionário com o uso de _instaceof_.
3. O Técnico não possui atributos extras além da classe Funcionários, classe esta que ele herda os atributos, assim se foi necessário criar a subclasse para poder ter o _toString_ próprio e com o uso de _instaceof_ identificar o tipo de funcionário, facilitando futuras alterações no sistema e facilitar na geração de relatórios.
4. Preparador, não possui atributos extras, mas se faz necessário a criação da subclasse pelos mesmos motivos das subclasses Técnico e Presidente.
5. Motoristas, possuem além os atributos herdados da superclasse, a informação da **Habilitação**, sendo assim foi necessário criar a subclasse motorista que contém a informação de **habilitação** diferenciando-a da superclasse. e o _toString/instaceof_.
6. Cozinheiro, herda os atributos da superclasse, e não possui nenhum atributo extra. a necessidade de criação da subclasse é a mesma da subclasse Preparador.
7. Advogado, não possui atributos extras, mas foi criada pelos mesmos motivos das outras subclasses que não possuem atributos extras.
8. Jogador, possui além da herança, os atributos de Tipo, e situação. que representam o tipo de jogador ( Atacante, lateral...) e a situação do jogador (Apto/Inapto) para jogar. sendo assim foi necessário criar a subclasse adicionando as informações extras além do _toString/instaceof_
#### Vantagens
* Facilidade na manutenção futura do sistema, além de remover a necessidade do uso de **ifs** para identificar o tipo de funcionário (Implicando em um atributo extra na superclasse), sendo usado _instaceof_ no lugar do **if**, ter o _toString_ único de cada classe facilitando a geração de relatórios.
#### Desvantagens
* Algumas classes foram criadas sem atributos extras, foram necessárias, mas isto aumentou considerávelmente o número de classes do sistema.

## Socio (Super Classe)
#### Motivação
Instanciar um objeto do tipo sócio, que possui as informações:
Adimplente e Inadimplente (Estática) e nome, email , cpf, telefone, endereço, valor e situação(Adimplente/Inadimplente).
#### Solução
Criar a classe Socio com todas as informações necessárias e seu construtor.
#### Vantagens
Ter todas as informações reunidas em um só lugar, possibilitar herança e extensibilidade, ter o costrutor próprio.

### Subclasses de Sócios - Junior - Sênior - Elite
#### Motivação
Facilitar a geração de relatórios, além de remover a necessidade do uso de **ifs** para identificar o funcionário gerando assim mais um atributo a ser adicionado na superclasse.
#### Solução
Criar as três subclasses proporcionando a diferença entre os sócios.
1. Júnior - não possui atributos extras além dos da superclasse, foi necessário criar a subclasse para ter o próprio _toString_, e saber qual o tipo de sócio com o uso de _instaceof_, facilitando uma futura manutenção no sistema (Criação de um novo tipo de sócio por exemplo).
2. Sênior - Diferenciar da superclasse e da subclasse Júnior, foi criada pelos mesmos motivos da subclasse Júnior.
3. Elite - Diferenciar das outras duas subclasses, tendo sido criada com o mesmo motivo das outras.
#### Vantagens
Poder diferenciar o tipo de sócio, além do uso de _toString/instaceof_, reduzindo esforço de programação e facilitando uam futura manutenção no sistema.
#### Desvantagens
Foram criadas 3 classes extras sem nenhuma diferença da superclasse, aumentando considerávelmente o número de classes no sistema, mas se faz necessário pelos motivos descritos em solução/vantagens.

## Onibus
#### Motivação
Como o clube possui recursos dp tipo ônibus, foi necessário representar este tipo de informação.
#### Solução
Criar a classe Onibus, reunindo informações sobre estes objetos e poder adicionar vários ônibus em uma lista de recursos do clube.
#### Vantagens
É uma das funcionalidades do sistema, a criação da classe se faz necessária para que essa funcionalidade esteja presente no sistema. Agrupar vários recursos do tipo ônibus - faciltar relatórios e manutenção do sistema com o uso de _toString/instaceof_.
#### Desvantagens
Criação de uma nova lista para guardar vários ônibus.

## Estádio
#### Motivação
Como o clube possui recursos do tipo estádio, e temos funcionalidades referentes ao estádio - é necessário criar uma nova classe para representar este tipo de recurso.
#### Solução
Criar a classe estádio, possibilitando a funcionalidade de recursos/relatórios.
#### Vantagens
Garantir que a funcionalidade exista, visto que é um requisito do sistema, além de poder agrupar estes recursos em uma lista, usar _toString_.
#### Desvantagens
Criação de mais uma lista para guardar vários estádios.

## CT
#### Motivação
Para o funcionamento da funcionalidade, se faz necessário criar uma classe do tipo CT.
#### Solução
Criar a subclasse ct, possibilitando a instanciação de objetos deste tipo.
#### Vantagens
Garantir a funcionalidade Recursos/Relatórios, ter o _toString_.
#### Desvantagens
Os CTS são armazenados em uma lista.

# Distribuição dos Métodos
## Métodos na Main/iSoccerE/iSoccerU
### Motivação
Distribuir os métodos de forma que reduza o esforço de programação.
### Solução
#### Os Métodos ficaram distribuidos em três classes. na main, iSoccerU e iSoccerE.
1. Os métodos da main são as funções básicas do sistema, menu, adicionar funcionario, sócio, recursos, relatorios...
2. Os métodos da iSoccerU concentram utilidades, como encontrar um funcionário/socio/em uma lista dentre outras utilidades.
3. Os métodos da iSoccerE concentram exceptions, como ler inteiro/float e ler inteiro dentro de uma margem especificada, por exemplo leia um número entre (1, 2), só seriam aceitos 1, ou 2.
##### iSoccerU e iSoccerE serão explanadas mais a frente em Interfaces. 
### Vantagens
* Facilitar a localização de métodos, evitando que fiquem amontoados em uma única classe, além de posicionar estratégicamente os métodos.

# Herança
## Funcionario
### Motivação
Temos vários tipos de funcionários, sendo necessário criar uma herança.
### Solução
Foram criadas oito subclasses que herdam os atributos da superclasse Funcionários, sendo estas Presidente, Médico, Técnico, Preparador, Motoristas, Cozinheiro, Advogado e Jogador para representar cada tipo de funcionario.
### Vantagens
Diferenciar cada funcionário, usar _toString_ diferentes para cada tipo de funcionário e poder identificar o tipo de funcionário com _instaceof_, além de poder reunir todos os tipos de funcionários em um único tipo de dado (Funcionários).
### Desvantagens
Algumas subclasses não possuem diferenças da superclasse, como já dito acima em **Subclasses de Funcionários**.

## Socio
### Motivação
Vários sócios, sendo necessário Herança, para representar diferentes tipos de Socios.
### Solução
Foram criadas tres subclasses, sendo estas Junior, Senior e Elite para representar cada tipo de socio.
### Vantagens
Saber qual o tipo de socio (_instaceof_), e ter o _toString_ de cada tipo de sócio, além de poder reunir vários tipos de Sócio em um único tipo de dado (Sócio).

# Interface

## Utilidades / iSoccerU
### Motivação
Criar uma interface para reunir funcões úteis que devem ser implementadas.
### Solução
Criar a iSoccerU reunindo todas os métodos necessários para serem usados e reusados em diversos outros métodos.
### Vantagens
Impõe a um terceiro porgramador a criar funções básicas pré-estabelecidas para serem usadas nos métodos.

## Exception / iSoccerE - A ser esclarecida Tratamento de Exceções.

# Tratamento de Exceções
## Exception / iSoccerE
### Motivação
Estabelecer métodos para garantir que exceções não ocorram, prejudicando assim a execução do sistema (se o sistema parar, todas as informações serão perdidas, visto que não há o uso de banco de dados).
### Solução
Criar a interface de Exception para garantir que métodos de exceção sejam implementados e garantir o bom funcionamento do sistema.
### Vantagens
Garantir que não ocorram exceções, que irão prejudicar o funcionamento do sistema.

# Extensibilidade

## Funcionario
### Motivação
Como temos 8 tipos de funcionários, e podem ser adicionados mais funcionários (Extensibilidade).
### Solução
Foram criadas oito subclasses, sendo estas Presidente, Médico, Técnico, Preparador, Motoristas, Cozinheiro, Advogado e Jogador para representar cada tipo de funcionario, caso seja necessário a criação de mais tipos de funcionários (o sistema já está extensível).
### Vantagens
Facilitar o esforço de programação, ao adicionar uma nova subclasse representando um novo tipo de funcionário, temos extensibilidade.

## Socio
### Motivação
Como temos 3 tipos de sócio, se faz necessário que o sistema seja extensível.
### Solução
Foram criadas tres subclasses, sendo estas Junior, Senior e Elite para representar cada tipo de socio, garantindo assim a extensibilidade.
### Vantagens
Facilitar futuras modificações com relação a sócios (Adicionar um novo tipo de sócio), tendo extensibilidade.

# Reuso

## Exceptions - iSoccerE - loadint, loaddouble, loadintmargin.
### Motivação
Ter uma função que leia os tipos de dados que serão reusados sempre que o sistema precisar de uma entrada do administrador, e garantir que esta entrada seja correta.
### Solução
Criar as funções para ler os tipos de dados, e usar em diversos momentos do sistema, como acessar opções em um menu, ou adicionar salário (Funcionario) ou custo de associação (Socio). estes métodos são usados nos métodos: menu, editsoc, gersoc, gerrec e outros, sempre que for necessário ler um inteiro, float ou um inteiro dentro de uma margem.
### Vantagens
Como usamos estes métodos em vários outros métodos, temos o Reuso. o reuso reduz a necessidade de código "Clone". reduzindo o esforço de programação.
