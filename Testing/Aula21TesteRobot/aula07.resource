*** Variables ***
${SITE}  http://www.jouse.com.br
${NAVEGADOR}  Chrome
${ENTRAR}  css=.jss24:nth-child(2) > .jss14
${SELECTCOLOR}  xpath=//div[@id='__next']/main/div/div/div[2]/div/div[2]/div
${SELECTACABAMENTO}  xpath=//div[@id='__next']/main/div/div/div[2]/div[2]/div[2]/div

*** Keywords ***
Acessar a loja Jouse
  Open Browser  ${SITE}  ${NAVEGADOR}
  Maximize Browser Window
Clicar em Compre Agora
  Click Element  ${ENTRAR}
Selecionar uma cor e acabamento
  Click Element  ${SELECTCOLOR}
  Click Element  ${SELECTACABAMENTO}