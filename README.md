# ProjetoNuuvem
Senhor, Joaca PF ENTENDA. O FIM É TRISTE

# Projeto de Implantação de Aplicação Web com Docker e AWS EC2

## Descrição  
Neste projeto, você trabalhará individualmente ou em grupo (até 3 pessoas) para criar uma aplicação web com uma única tela e um back-end com pelo menos uma única rota que fornecerá os dados para a construção da página Web.  

Deverás então empacotar estas aplicações em um container Docker e implantá-la em uma instância de máquina virtual (VM) na **AWS EC2** (use a disciplina de laboratório para evitar cobranças indesejadas).  

A aplicação back-end deverá ser configurada para rodar na **porta 25.000** e a aplicação web na **porta 8080**. Para isso, será necessário configurar adequadamente:  
- **Virtual Private Cloud (VPC)**  
- **Regras de segurança** (security groups ou firewalls)  
- **Regras de roteamento** para permitir o tráfego externo para esta porta específica.  

Somente a máquina Web deverá conseguir acessar a máquina com o back-end.

---

## Requisitos  

- Criação de uma **aplicação web**.  
- Criação de uma **aplicação back-end**.  
- Criação de um **Dockerfile** para empacotar a aplicação web em um container Docker.  
- Configuração de uma instância **EC2 (AWS)**.  
- Configuração da **VPC** e das **regras de segurança** para permitir acesso à aplicação na **porta 8080** via web para os clientes e isolamento do back-end.  
- **Testes** para garantir que a aplicação esteja acessível publicamente na porta especificada.  

---

## Entrega  

A entrega final consistirá em um **vídeo** e um **relatório detalhado** contendo:  

1. Uma **breve descrição** da aplicação web e back-end desenvolvidas pelo grupo.  
2. Os **Dockerfiles** utilizados e uma explicação do processo de criação do container Docker.  
3. Uma **descrição detalhada** dos passos realizados para configurar a instância de VM, a VPC e as regras de segurança.  
4. **Prints de tela** mostrando a aplicação rodando.  
5. Uma **discussão sobre desafios encontrados** durante o projeto e como foram superados.  
6. Um **vídeo de até 3 minutos** mostrando a configuração e seu funcionamento.  
