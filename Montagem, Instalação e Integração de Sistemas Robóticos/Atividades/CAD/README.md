<div align="justify">

# Construção do Chassi

Antes de iniciar a modelagem do chassi no software CAD, é importante definir alguns parâmetros do projeto. Essas decisões influenciarão diretamente as dimensões do robô, a posição dos componentes e o processo de fabricação.

Neste exemplo será desenvolvido um chassi utilizando módulos swerve, porém o procedimento pode ser adaptado para outras configurações, como robôs com tração Tank.

---

## Definições Iniciais

Antes de iniciar o projeto, defina:

- Sistema de locomoção do robô (`Swerve` ou `Tank`);
- Perfil estrutural que será utilizado no chassi;
- Dimensões desejadas para o robô.

Neste exemplo serão utilizados os seguintes parâmetros:

| Componente | Especificação |
|------------|---------------|
| Sistema de locomoção | Módulo Swerve MK4i |
| Estrutura | Tubo Linha Forja 2" × 1" perfurado nas quatro faces |
| Dimensões do chassi | **685,8 × 685,8 mm** |

Com essas definições estabelecidas, podemos iniciar a construção do modelo CAD do chassi utilizando o **Autodesk Inventor**.

---

## Download dos Componentes Comerciais

O primeiro passo consiste em obter os modelos CAD dos componentes comerciais que serão utilizados no projeto.

Na maioria dos casos, fabricantes de componentes para FRC disponibilizam gratuitamente seus modelos em formato CAD, eliminando a necessidade de modelar essas peças manualmente.

Neste exemplo serão utilizados:

- Módulo **SDS MK4i Swerve**
- Tubo estrutural **Linha Forja 2" × 1"**

### Downloads

- [Download do módulo SDS MK4i](https://www.dropbox.com/s/tp9sqh3bqfvl2w5/SDS%20MK4i%20Swerve%20Module%2C%20NEOs.STEP?dl=1)

- [Download do tubo Linha Forja 2" × 1"](https://drive.google.com/file/d/1UcgZVlp9a8qg29x84kIeoxbYTjqd8tvp/view)

</div>

> [!TIP] <div align="justify">
>
> Sempre que possível, utilize os modelos CAD oficiais disponibilizados pelos fabricantes. Isso garante maior precisão dimensional, reduz o tempo de desenvolvimento e evita erros durante a montagem do robô.

---

## Abrindo o Autodesk Inventor

Após realizar o download dos componentes, abra o **Autodesk Inventor**, software que será utilizado para desenvolver toda a estrutura do robô.

<table align="center">

<tr>

<td align="center" width="200">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/LOGO__AUTODESK.png" width="200">
</td>

</tr>

</table>

A partir deste ponto, iniciaremos a criação da estrutura do chassi, importando os componentes comerciais e definindo as restrições necessárias para a montagem do conjunto.

---

## Criando a Montagem

Com o Autodesk Inventor aberto, vamos criar o ambiente onde todos os componentes do robô serão montados.

### Etapa 1 — Criando um Novo Arquivo de Montagem

No menu inicial do Autodesk Inventor, selecione:

```txt
Novo → Montagem → Standard (mm).iam
```

Em seguida, clique em **Criar**.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img1.png" width="600">
</td>

</tr>

</table>

---

### Etapa 2 — Inserindo os Componentes

Com o ambiente de montagem criado, clique na opção **Inserir**, localizada na parte superior esquerda da tela.

Será aberta uma janela para seleção de arquivos. Localize a pasta onde foram salvos os modelos CAD do módulo **SDS MK4i** e selecione o arquivo correspondente.

Após localizar o componente, clique em **Abrir** para inseri-lo na montagem.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img2.png" width="600">
</td>

</tr>

</table>

---

### Etapa 3 — Posicionando os Módulos

Insira quatro módulos de swerve na montagem, representando cada uma das rodas do robô.

Após inserir os componentes, selecione um dos módulos, clique com o botão direito do mouse e escolha a opção **Fixar**.

Esse procedimento define o módulo como referência da montagem, impedindo que ele seja movimentado acidentalmente durante a aplicação das restrições.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img3.png" width="600">
</td>

</tr>

</table>

</div>

> [!TIP] <div align="justify">
>
> Sempre fixe apenas um componente principal da montagem. Ele servirá como referência para posicionar todos os demais elementos do robô.

---

### Etapa 4 — Aplicando Restrições

Para posicionar corretamente os módulos, acesse:

```txt
Montagem → Restringir
```

A ferramenta **Restringir** é responsável por definir a relação geométrica entre dois componentes, garantindo que permaneçam corretamente posicionados durante toda a montagem.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img4.png" width="600">
</td>

</tr>

</table>

---

### Etapa 5 — Selecionando as Faces

Com a ferramenta ativa:

1. Selecione a face do módulo que foi fixado anteriormente;
2. Em seguida, selecione a face correspondente do segundo módulo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img5.png" width="600">
</td>

</tr>

</table>

Depois de selecionar ambas as faces, altere a opção **Solução** para o **segundo modo disponível** e clique em **OK**.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img6.png" width="600">
</td>

</tr>

</table>

---

### Verificando a Montagem

Neste momento, após aplicar as primeiras restrições, sua montagem deverá apresentar uma configuração semelhante à ilustrada na imagem abaixo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img7.png" width="600">
</td>

</tr>

</table>

> [!IMPORTANT]
> <div align="justify">
>
> Neste momento, não se preocupe com o posicionamento definitivo dos módulos. O objetivo desta etapa é apenas estabelecer as primeiras referências da montagem. As dimensões finais do chassi serão definidas nas próximas etapas, quando forem aplicadas as restrições de distância entre os módulos e inseridos os tubos estruturais.
>
> </div>

---

### Etapa 6 — Alinhando os Módulos

Agora vamos alinhar todos os módulos de swerve para que compartilhem o mesmo plano de referência.

Para isso, ative novamente a ferramenta **Restringir** e selecione a face superior do módulo que foi fixado anteriormente. Em seguida, selecione a face superior do segundo módulo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img8.png" width="600">
</td>

</tr>

</table>

Repita o mesmo procedimento para os demais módulos até que todos estejam alinhados no mesmo plano.

Ao concluir esta etapa, a montagem deverá apresentar uma configuração semelhante à ilustrada abaixo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img9.png" width="600">
</td>

</tr>

</table>

---

### Etapa 7 — Definindo as Dimensões do Chassi

Com todos os módulos alinhados, podemos definir o comprimento e a largura do chassi.

Neste exemplo será utilizada uma dimensão final de **685,8 mm × 685,8 mm**.

Para isso, selecione as faces externas dos dois módulos que definirão uma das extremidades do chassi.

<table align="center">

<tr>

<td align="center" width="430">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img10.png" width="430">
</td>

<td align="center" width="430">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img11.png" width="430">
</td>

</tr>

</table>

Em seguida, configure a restrição utilizando um **Deslocamento** de **-685,8 mm**, conforme ilustrado abaixo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img12.png" width="600">
</td>

</tr>

</table>

Repita o mesmo procedimento para a outra direção do chassi, garantindo que os quatro módulos fiquem posicionados corretamente de acordo com as dimensões especificadas.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img13.png" width="600">
</td>

</tr>

</table>

</div>

> [!TIP] <div align="justify">
>
> Antes de prosseguir para a montagem da estrutura, confira se todas as restrições foram aplicadas corretamente. Movimente levemente os módulos para verificar se permanecem posicionados conforme esperado. Detectar problemas nesta etapa evita retrabalho durante a inserção dos tubos estruturais.





---

## Etapa 8 — Determinando o Comprimento dos Tubos

Antes de inserir os tubos estruturais na montagem, precisamos determinar o seu comprimento.

Como os tubos serão fixados diretamente aos módulos de swerve, a medida utilizada será a distância entre os centros dos furos de fixação localizados nas extremidades dos módulos.

Para obter essa dimensão, acesse:

```txt
Inspecionar → Medir
```

Com a ferramenta ativa, selecione os centros dos dois furos indicados na imagem.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img13.png" width="600">
</td>

</tr>

</table>

A distância encontrada é de **457,2 mm** entre os centros dos parafusos.

Essa medida será utilizada como referência para determinar o comprimento final dos tubos do chassi.

> [!TIP]
>
> Sempre utilize medidas entre centros quando o componente será parafusado. Isso garante que o modelo CAD represente corretamente a montagem física do robô.

---

## Etapa 9 — Preparando o Tubo Estrutural

Agora vamos adaptar o modelo CAD do tubo estrutural para o comprimento necessário.

Abra o arquivo do tubo através do menu:

```txt
Arquivo → Abrir
```

Selecione o modelo baixado anteriormente e abra-o para edição.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img13.png" width="600">
</td>

</tr>

</table>

---

## Etapa 10 — Criando o Esboço de Corte

Com o tubo aberto, selecione:

```txt
Iniciar Esboço 2D
```

Em seguida, escolha a face indicada na imagem.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img13.png" width="600">
</td>

</tr>

</table>

Utilizando a ferramenta **Retângulo**, desenhe um retângulo partindo da origem até a extremidade direita do tubo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img13.png" width="600">
</td>

</tr>

</table>

---

## Etapa 11 — Definindo as Dimensões

Utilize a ferramenta **Cota** para adicionar uma distância de **5 mm** entre a linha superior do retângulo e o centro do primeiro furo do tubo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img13.png" width="600">
</td>

</tr>

</table>

Em seguida, desenhe um segundo retângulo na extremidade superior do tubo.

Agora adicione uma nova cota entre os dois retângulos.

O valor deverá ser:

```txt
457,2 mm + 10 mm = 467,2 mm
```

Os **457,2 mm** correspondem à distância entre os centros dos parafusos.

Os **10 mm adicionais** representam o afastamento entre o último furo e a extremidade do tubo, sendo **5 mm em cada lado**.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img13.png" width="600">
</td>

</tr>

</table>

---

## Etapa 12 — Realizando o Corte

Retorne para a aba **Modelo 3D** e selecione a ferramenta **Extrusão**.

Selecione os dois retângulos criados anteriormente e configure:

- Operação: **Recortar**
- Distância A: **25,4 mm**

Esse valor corresponde à largura do tubo estrutural.

Após confirmar a operação, o tubo será automaticamente ajustado ao comprimento desejado.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img13.png" width="600">
</td>

</tr>

</table>

Salve o arquivo e feche a peça.

---

## Etapa 13 — Inserindo os Tubos na Montagem

Retorne ao arquivo de montagem e insira os quatro tubos laterais do chassi.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img13.png" width="600">
</td>

</tr>

</table>

---

## Etapa 14 — Aplicando as Restrições

Agora vamos posicionar corretamente cada tubo.

Primeiro, restrinja o centro do furo do tubo ao centro do parafuso correspondente no módulo de swerve.

Em seguida, restrinja a face superior do tubo à face inferior do módulo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img13.png" width="600">
</td>

</tr>

</table>

Finalize restringindo o outro extremo do tubo ao segundo módulo de swerve.

Repita exatamente o mesmo procedimento para os três tubos restantes.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img13.png" width="600">
</td>

</tr>

</table>

---

## Chassi Concluído

Com todos os tubos devidamente posicionados e restringidos, a estrutura principal do chassi estará finalizada.

A partir deste momento, o robô já possui sua base estrutural e está pronto para receber os primeiros subsistemas.

Na próxima atividade iniciaremos o desenvolvimento do **Intake**, mecanismo responsável pela coleta e manipulação das *Game Pieces* durante a partida.

> [!NOTE]
>
> Embora este tutorial utilize um chassi equipado com módulos **MK4i**, o procedimento apresentado é aplicável a qualquer configuração estrutural. Alteram-se apenas as dimensões do chassi, o modelo dos módulos de locomoção e os componentes comerciais utilizados, mantendo-se a mesma metodologia de montagem.

</div>