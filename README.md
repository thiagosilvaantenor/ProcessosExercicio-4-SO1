# Exercício 4 de Processos - Desafio: criar um Executar - Sistemas Operacionais 1

<div align="center">
  
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Windows](https://img.shields.io/badge/Windows-000?style=for-the-badge&logo=windows&logoColor=2CA5E0)

</div>

## Sobre o projeto
Este é o exercício 4, da lista de exercícios de processos em Windows e Linux, da materia de Sistemas Operacionais 1 do curso de Análise e desenvolvimento de sistemas da FATEC Zona Leste.<br>

Caso queira ver os outros exercícios:
- [Exercício 1](https://github.com/thiagosilvaantenor/ProcessosExercicio-1-SO1)
- [Exercício 2](https://github.com/thiagosilvaantenor/ProcessosExercicio-2-SO1)
- [Exercício 3](https://github.com/thiagosilvaantenor/ProcessosExercicio-3-SO1)

## Índice
=================
<!--ts-->
* [Título](#exercício-4-de-processos--desafio-criar-um-executar--sistemas-operacionais-1)
* [Sobre o Projeto](#sobre-o-projeto)
* [Índice](#índice)
* [Exercício 4](#exercício-1)
* [Status do projeto](#status-do-projeto)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Exercício 4
EXERCÍCIO 4 (DESAFIO) – Exclusivo Windows:<br>
* Utilizando o Framework Window Builder, criar, em Eclipse, um projeto Java que simula o
Executar (Run) do Windows.
* No package view, deve ser criado, com auxílio do framework, conforme figura abaixo, uma tela
com um JTextField e 3 botões (OK, Cancelar e Procurar).
* No package controller, devemos ter :
  1) Uma classe, chamada `SearchController`, que receba o `JTextField` pelo construtor, implementa
  um `ActionListener` para executar a ação do botão Procurar. No método `ActionPerformed`, deve
  ter uma busca de arquivos executáveis Windows, via `JFileChooser`, e seleciona o arquivo a ser
  executado e escreve seu caminho completo no `JTextField`.
  2) Uma classe, chamada `RunController`, que receba o `JTextField` e o próprio `JFrame` da tela pelo
  construtor, implementa um `ActionListener` para executar a ação do
  botão OK. No método `ActionPerformed`, deve tentar executar o que está escrito no `JTextField`
  (O usuário pode digitar o caminho por conta própria, ao invés de procurar). Caso o arquivo seja
  inválido, dar uma mensagem de erro. Uma vez executado, sem erro, a tela deverá ser finalizada
  pelo método `dispose()`.
  4) Uma classe, chamada `CancelController`, que receba o próprio JFrame da tela pelo construtor,
  implementa um `ActionListener` para executar a ação do botão Cancelar. O método
  `actionPerformed` deve proceder um `dispose()` da tela.

<div align="center">
  
![image](https://github.com/thiagosilvaantenor/ProcessosExercicio-4-SO1/assets/99970279/edc1c4eb-0c9d-4a23-8484-3e22f1c09999)

</div>

Dicas:
Assistir, no site do Professor, os vídeos:
1) [Eclipse Window Builder Aplicação com ActionListener implementado](https://www.youtube.com/watch?v=W0qD00A-bsk) 
2) [Introdução ao JFileChooser](https://www.youtube.com/watch?v=Kpt-nTaQChM)


## Status do projeto
🚧Em construção🚧
* Projeto está em fase inicial

## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [Window Builder](https://projects.eclipse.org/projects/tools.windowbuilder)
  - [JFileChooser](https://docs.oracle.com/javase/8/docs/api/javax/swing/JFileChooser.html) 

## Agradecimentos
Agradeço ao professor da disciplina de Sistemas Operacionais 1, [Leandro Colevati dos Santos](https://www.leandrocolevati.com.br/index.jsp), por todo o aprendizado passado.

## Autor

<div align="center">
<a href="https://www.linkedin.com/in/thiago-antenor/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
 <br />
 <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>


Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
[![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)
</div>
