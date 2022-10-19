*** Variables ***
${SITE}                https://chicorei.com/
${NAVEGADOR}           Chrome
${BOTAOCOOKIE}         xpath=//button[@id='confirmPolicyButton']
${CLICACAMPOPESQUISA}  xpath=//div[@id='header-search-desktop']/form/div/label/input
${DIGITATEXTO}         css=#header-search-input-desktop
${SELECTPRIMEIROITEM}  xpath=//div[@id='header-search-desktop']/form/div/div/div/div/div/div[2]/div
${VALIDAPRECO}         xpath=//div[@id='product-main-right']/div/div[2]/div/p
${WRAPPER}             css=#my-wrapper
${TIPOCAMISA}          css=.inline-block:nth-child(2) .cr-option:nth-child(1)
${TAMANHO}             css=.cr-option-squared:nth-child(2)    
${TAMANHOP}            css=.cr-option-squared:nth-child(1)    
${COR}                 css=.cr-option:nth-child(1) > .product-color-option
${COMPRAR}             xpath=//div[@id='product-buy-button-container']/button/span[2] 
${VERSACOLA}           xpath=//div[@id='header-cart-desktop']/div/a/div
${VALIDALOYALTY}       css=#cart-loyalty > .mx-0
${FECHARPEDIDO}        xpath=//div[@id='cart-finish']/button[2]

*** Keywords ***
Clicar em "Concordar" no aviso sobre Cookies
  Open Browser                    ${SITE}  ${NAVEGADOR}
  Maximize Browser Window
  Click Element                   ${BOTAOCOOKIE}

Pesquisar por "Vira lata caramelo" e selecionar a primeira opção da lista de resultados
  Sleep                           2
  Click Element                   ${CLICACAMPOPESQUISA} 
  Input Text                      ${DIGITATEXTO}    Vira lata caramelo
  Sleep                           2
  Wait Until Element is Visible   ${SELECTPRIMEIROITEM}
  Sleep                           5
  Click Element                   ${SELECTPRIMEIROITEM}

Validar se o valor do produto é "R$ 69,99"
  Sleep                           3
  Element Should Contain          ${VALIDAPRECO}  R$ 69,99

Selecionar tamanho, cor e clicar em comprar
  Sleep                           5
  Run Keyword and Ignore Error    Scroll Element Into View   ${COMPRAR}
  Sleep                           3
  Click Element                   ${TIPOCAMISA}
  Sleep                           1
  Click Element                   ${TAMANHO}
  Sleep                           1
  Click Element                   ${COR}
  Sleep                           1
  Click Element                   ${COMPRAR}

Selecionar tamanho P, cor e clicar em comprar
  Sleep                           5
  Run Keyword and Ignore Error    Scroll Element Into View   ${COMPRAR}
  Sleep                           3
  Click Element                   ${TIPOCAMISA}
  Sleep                           1
  Click Element                   ${TAMANHOP}
  Sleep                           1
  Click Element                   ${COR}
  Sleep                           1
  Click Element                   ${COMPRAR}
  
Clicar em "Ver sacola"
  Sleep                           2
  Click Element                   ${VERSACOLA}

Validar se a mensagem "VOCÊ ESTÁ ACUMULANDO 1 PONTO NO CARTÃO FIDELIDADE!" está sendo exibida
  Sleep                           3
  Element Should Contain          ${VALIDALOYALTY}  VOCÊ ESTÁ ACUMULANDO 1 PONTO NO CARTÃO FIDELIDADE!
  
Clicar em "Fechar pedido"
  Sleep                           2
  Click Element                   ${FECHARPEDIDO}
  Sleep                           2
  Close Browser

Pesquisar por "Amarelo é desespero" e selecionar a primeira opção da lista de resultados
  Sleep                           2
  Click Element                   ${CLICACAMPOPESQUISA} 
  Input Text                      ${DIGITATEXTO}    Amarelo é desespero
  Sleep                           2
  Wait Until Element is Visible   ${SELECTPRIMEIROITEM}
  Sleep                           2
  Click Element                   ${SELECTPRIMEIROITEM}

# Validar se a mensagem "Adquira o Chico Rei Prime para desfrutar de frete grátis por 1 ano em todos os pedidos, sem valor mínimo." está sendo exibida
#   Element Should Contain          ${VALIDAPONTO}  Adquira o Chico Rei Prime para desfrutar de frete grátis por 1 ano em todos os pedidos, sem valor mínimo.

Pesquisar por "Erarr é humano" e selecionar a primeira opção da lista de resultados
  Sleep                           2
  Click Element                   ${CLICACAMPOPESQUISA} 
  Input Text                      ${DIGITATEXTO}    Erarr é humano
  Sleep                           2
  Wait Until Element is Visible   ${SELECTPRIMEIROITEM}
  Sleep                           3
  Click Element                   ${SELECTPRIMEIROITEM}

Validar se a mensagem "De segunda a sexta, das 8h às 18h." está sendo exibida
  Sleep                           2
  Page Should Contain             De segunda a sexta, das 8h às 18h.

Pesquisar por "Nem Te Vi" e selecionar a primeira opção da lista de resultados
  Sleep                           2
  Click Element                   ${CLICACAMPOPESQUISA} 
  Input Text                      ${DIGITATEXTO}    Nem Te Vi
  Sleep                           2
  Wait Until Element is Visible   ${SELECTPRIMEIROITEM}
  Sleep                           2
  Click Element                   ${SELECTPRIMEIROITEM}

Validar se a mensagem "Compre parcelado com cartão ou a vista com boleto ou depósito" está sendo exibida
  Sleep                           2
  Page Should Contain             Compre parcelado com cartão ou a vista com boleto ou depósito

Pesquisar por "Alceu Dispor" e selecionar a primeira opção da lista de resultados
  Sleep                           2
  Click Element                   ${CLICACAMPOPESQUISA} 
  Input Text                      ${DIGITATEXTO}    Alceu Dispor
  Sleep                           2
  Wait Until Element is Visible   ${SELECTPRIMEIROITEM}
  Sleep                           2
  Click Element                   ${SELECTPRIMEIROITEM}

Validar se a mensagem "Sua primeira troca na Chico Rei é por nossa conta!" está sendo exibida
  Sleep                           2
  Page Should Contain             Sua primeira troca na Chico Rei é por nossa conta!