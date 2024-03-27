# PROJETO API_REST_FULL
---------------------------------------
## 1- Configurações de ambiente
### * Download JDK-> após instalado navegar até variaveis  de ambiente, criar JAVA_HOME "C:\Program Files\Java\[Loacal do jdk]"e variável Path "%JAVA_HOME%\bin". teste (java -version)(mvn -version).
---------------------------------------
### * Download vsCode-> ExtensõesVsCode 
###                             {
###                             Language Support for Java™ by Red Hat
###                             Debugger for Java
###                             Test Runner for Java
###                             Maven for Java
###                             Project Manager for Java
###                             Visual Studio IntelliCode
###                             Spring boot extension pack
###                             spring dev toos
###                             spring initializr java
###                             spring boot dashboard
###                             }
---------------------------------------
### * Opção de  ide eclipse ext->" https://www.eclipse.org/downloads/ "
---------------------------------------
### *Download mySql comunity server manter senha e usuario root
---------------------------------------
### *Download do vis. HeidSql  configurar root e colocar senha
---------------------------------------
### * Instalar o Maven   " https://www.eclipse.org/downloads/ "
###  Configurar variaveis de ambiente, MAVEN_HOME {C:/Program Files/Maven/[local do maven]},  variável Path:%MAVEN_HOME%\bin
### Ao gerar o projeto spring 
###                      {
###                         spring boot dev toos
###                         spring web
###                         spring data JPA
###                         H2 database
###                         MySqlDriver
###                      }
---------------------------------------
### * git config --global user.name / user.email
---------------------------------------
## 2 Desenolvendo aplicação
### (a)Criar pastas, {
                        controllers,
                        models,
                        repositories,
                        services,
                        config,
                        }
### (b)Dentro da pasta resource, criar pasta db->migration  [arquivo: V1.1.1__nomesarquivo.sql] para criar mapeamento de migração de banco.(Configuração para utilizar o flyway)
###(c) Criar arquivos de configuração de terminal, atraves da criação da pasta ".vscode"  com dois  arquivos .json extensions e settings.json 
