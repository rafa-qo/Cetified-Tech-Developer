*** Settings *** 
Library  SeleniumLibrary
Resource  ./aula07.resource


*** Test Cases ***
Processo de compra de uma carteira Jouse
  Acessar a loja Jouse
  Clicar em Compre Agora
  Selecionar uma cor e acabamento