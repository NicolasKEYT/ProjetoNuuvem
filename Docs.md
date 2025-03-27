# Descrição da Aplicação Web e Back-End  

Este projeto consiste em uma aplicação web que exibe imagens aleatórias de cachorros utilizando a **Dog API**.  

## Front-End  
O front-end foi desenvolvido com **HTML, CSS e JavaScript**, proporcionando uma interface simples e interativa.  
A página exibe uma imagem de cachorro e inclui um botão que permite ao usuário gerar uma nova imagem aleatória ao clicar.  

## Back-End  
O back-end foi implementado em **Java com Spring Boot** e atua como intermediário entre o front-end e a API externa.  
Ele possui um endpoint (`/api/dog`) que faz requisições para a **Dog API** e retorna a URL de uma imagem aleatória.  

## Containerização  
A aplicação foi preparada para execução em um ambiente **Docker**.  
O **Dockerfile** define um contêiner baseado na imagem **Alpine Linux**, instala o **OpenJDK 21** e copia o arquivo JAR gerado pelo projeto.

## Criação do Docker 
Para instalar o Docker na instância EC2, executamos os seguintes comandos:

_sudo yum update_
sudo yum search docker
sudo yum install docker
sudo usermod -a -G docker ec2-user
id ec2-user
newgrp docker
sudo systemctl enable docker.service
sudo systemctl start docker.service
docker version

## Ativação do Docker
sudo systemctl start docker
sudo systemctl status docker
sudo systemctl enable docker

## Instalação do Java
sudo yum install java-21-amazon-corretto-devel -y  
java -version

## Instalação do SpringBoot
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install springboot 3.4.4  
spring --version

## Instalação do Maven
sdk install maven
mvn -version

## Gerando o pacote
mvn clean package  # Dentro da pasta do projeto

## Execução da aplicação
java -jar target/ProjetoNuuvem-0.0.1-SNAPSHOT.jar

## Criação do Container Docker
docker build -t dog .

## Execução do Container
docker run -d --restart unless-stopped -p 8080:25000 --name cont img

## Configuração VPC
Para a configuração da VPC foi utilizado como base os laboratorios do AWS e o site a seguir: https://ougabriel.medium.com/how-to-set-up-a-customvpc-for-your-aws-project-and-deploy-ec2-instances-with-private-and-public-cdbd9afc8aaf

## Desafios 
Inicialmente tivemos dificuldade para subir os arquivos no SSH, indicar as portas que seriam utilizadas, algumas dependencias necessarias que precisaram de auxilio externo, como por exemplo o SDK com alguns problemas relaciondos ao Alpine e principalmente rodar o projeto com o backend e frontend separados dentro da instancia. 
