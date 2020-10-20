# Gestão da build com maven

### Etapas da construção de um projeto de código

-   Obtenção de dependências

-   Compilação do código fonte

-   Produção de binários

-   Atualização da documentação

-   Instalação no servidor

-   etc.

Estas etapas em grandes projetos acabam por ser coordenadas com uma ferramenta de construção, uma **build tool**. Em Java, as mais usadas são o _Maven_ e o _Gradle_.

## Maven

Baseado no conceito de "project object model" (_POM_), consegue gerir a build de um projeto, reportando e documentando o mesmo.

### Criação de um projeto

```bash

**mvn archetype:generate** -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false



```

Foi executado o _Maven goal_ _archetype:generate_ com vários parâmetros para esse _goal_. Desta forma foi criado um projeto simples de exemplo baseado neste _archetype_.

### The Pom

É o ficheiro principal da configuração de um projeto em _Maven_ (_pom.xml_). Contém a declaração das dependências, _groupId_, _artifactId_ do projeto, etc.

### Building the project

```bash

mvn package



```

Este comando vai executar uma fase do _build lifecycle_ do Maven, seguindo vários passos (_goals_) predefinidos para conseguir pegar no código compilado e colocá-lo num formato de distribuição, p.ex JAR.

### Lifecycle Phases

-   **validate**: validate the project is correct and all necessary information is available

-   **compile**: compile the source code of the project

-   **test**: test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed

-   **package**: take the compiled code and package it in its distributable format, such as a JAR.

-   **integration-test**: process and deploy the package if necessary into an environment where integration tests can be run

-   **verify**: run any checks to verify the package is valid and meets quality criteria

-   **install**: install the package into the local repository, for use as a dependency in other projects locally

-   **deploy**: done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.

There are two other Maven lifecycles of note beyond the default list above. They are

-   **clean**: cleans up artifacts created by prior builds

-   **site**: generates site documentation for this project

### Gerar documentação

```bash

mvn site



```

### Perguntas

-   **groupId -** Identifica unicamente o projeto. Deve seguir as regras de nome de package do Java ou seja, começar com o reverso do nome do domínio do qual somos donos como: org.apache.maven, podendo ter vários subgrupos derivados que como boa prática, podem seguir a estrutura do projeto. Se um projeto tem vários módulos, faz sentido adicionar ao groupId do pai o nome do módulo atual como: org.apache.maven, org.apache.maven.plugins, org.apache.maven.reporting

-   **artifactId -** O nome do ficheiro jar (código compilado) sem a versão. Se a criação do jar é nossa responsabilidade, podemos dar o nome que quisermos com letras pequenas e sem símbolos estranhos. Se é um jar externo, temos de utilizar o nome do jar original.

-   **Archetype -** É uma ferramenta de templates de projetos Maven. Basicamente é um padrão que os projetos criados usando-o, seguem. Ajuda os criadores de projetos Maven ao disponibilizar padrões para os utilizadores destes projetos seguirem permitindo parametrizar versões.

### Dependências

Adicionamos as dependências no ficheiro **_pom.xml_** sendo que ao fazer package do projeto, estas são agregadas ao código do nosso projeto.

### Executar

```bash

mvn clean package

mvn exec:java -Dexec.mainClass="weather.WeatherStarter"->package+nome da classe

mvn exec:java -Dexec.mainClass="weather.WeatherStarter" -Dexec.args="arg1 arg2 arg3" -> com argumentos



```

### Maven Goal

Cada fase do _Maven Build Lifecycle_ é feita de _goals_. Cada um destes _goals_ representa uma tarefa que é executada para avançar o estado da fase. Alguns dos _Maven_ _goals_ não estão necessariamente ligado a uma fase do _Lifecycle_ e podem ser executados através da linha de comandos.
Os principais _Maven Goals são:_

1.  compile - Executado na fase compile
2.  testcompile - Executado na fase test-compile
3.  test - Executado na fase test
4.  install - Executado na fase install
5.  jar - Executado na fase package

### Logger

O programa já tinha um logger implementando pelo que, após questionar o professor, não houve necessidade de utilizar a biblioteca **log4j2**.
