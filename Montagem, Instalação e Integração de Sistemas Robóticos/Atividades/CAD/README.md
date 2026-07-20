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

### Etapa 8 — Determinando o Comprimento dos Tubos

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
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img14.png" width="600">
</td>

</tr>

</table>

A distância encontrada é de **457,2 mm** entre os centros dos parafusos.

Essa medida será utilizada como referência para determinar o comprimento final dos tubos do chassi.

> [!TIP]
>
> Sempre utilize medidas entre centros quando o componente será parafusado. Isso garante que o modelo CAD represente corretamente a montagem física do robô.

---

### Etapa 9 — Preparando o Tubo Estrutural

Agora vamos adaptar o modelo CAD do tubo estrutural para o comprimento necessário.

Abra o arquivo do tubo através do menu:

```txt
Arquivo → Abrir
```

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img15.png" width="600">
</td>

</tr>

</table>

Selecione o modelo baixado anteriormente e abra-o para edição.

---

### Etapa 10 — Criando o Esboço de Corte

Com o tubo aberto, selecione:

```txt
Iniciar Esboço 2D
```

Em seguida, escolha a face indicada na imagem.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img16.png" width="600">
</td>

</tr>

</table>

Utilizando a ferramenta **Retângulo**, desenhe um retângulo partindo da origem até a extremidade direita do tubo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img17.png" width="600">
</td>

</tr>

</table>

---

### Etapa 11 — Definindo as Dimensões

Utilize a ferramenta **Cota** para adicionar uma distância de **5 mm** entre a linha superior do retângulo e o centro do primeiro furo do tubo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img18.png" width="600">
</td>

</tr>

</table>

Em seguida, desenhe um segundo retângulo na extremidade superior do tubo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img19.png" width="600">
</td>

</tr>

</table>

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
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img20.png" width="600">
</td>

</tr>

</table>

---

### Etapa 12 — Realizando o Corte

Retorne para a aba **Modelo 3D** e selecione a ferramenta **Extrusão**.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img21.png" width="600">
</td>

</tr>

</table>

Selecione os dois retângulos criados anteriormente e configure:

- Operação: **Recortar**
- Distância A: **25,4 mm**

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img22.png" width="600">
</td>

</tr>

</table>

Esse valor corresponde à largura do tubo estrutural.

Após confirmar a operação, o tubo será automaticamente ajustado ao comprimento desejado.

Salve o arquivo e feche a peça.

---

### Etapa 13 — Inserindo os Tubos na Montagem

Retorne ao arquivo de montagem e insira os quatro tubos laterais do chassi.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img23.png" width="600">
</td>

</tr>

</table>

---

### Etapa 14 — Aplicando as Restrições

Agora vamos posicionar corretamente cada tubo.

Primeiro, restrinja o centro do furo do tubo ao centro do parafuso correspondente no módulo de swerve.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img24.png" width="600">
</td>

</tr>

</table>

Em seguida, restrinja a face superior do tubo à face inferior do módulo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img25.png" width="600">
</td>

</tr>

</table>

Finalize restringindo o outro extremo do tubo ao segundo módulo de swerve.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img26.png" width="600">
</td>

</tr>

</table>

Repita exatamente o mesmo procedimento para os três tubos restantes.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Img27.png" width="600">
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

# Construção do Intake

Com a estrutura do chassi concluída, iniciaremos agora o desenvolvimento do primeiro subsistema do robô: o **Intake**.

O intake é o mecanismo responsável pela coleta das *Game Pieces* presentes no campo, sendo um dos principais sistemas responsáveis pela interação do robô com o jogo.

Neste projeto serão utilizados componentes comerciais amplamente empregados por equipes da FIRST Robotics Competition. A utilização desses componentes reduz o tempo de fabricação, aumenta a confiabilidade do sistema e permite que a equipe concentre seus esforços no desenvolvimento da estrutura e da estratégia do robô.

---

## Download dos Componentes

Antes de iniciar a modelagem, faça o download dos componentes comerciais que serão utilizados durante a montagem.

### Sistema de Acionamento

- [**Motor Kraken X60**](https://wcproducts.info/files/frc/cad/WCP-0940.STEP)

- [**Motor NEO com Redução MAXPlanetary (2 estágios)**](https://revrobotics.com/content/cad/MAXPlanetary%202-Stage.STEP)

---

### Transmissão

- [**Coroa MAXSpline #25 – 40 dentes**](https://revrobotics.com/content/cad/REV-21-3370.STEP)

- [**Pinhão #25 – 14 dentes (Hexagonal 1/2")**](https://s3.amazonaws.com/docusync-files/72aae5dfe3a24481234619e8146f0983a984abef2d032e28b7412a1ecb7ba2ef/am-4773%2014T%2025%20Chain%20500in%20Hex%20Symmetrical.STEP)

---

### Sistema de Eixos

- [**Eixo MAXSpline**](https://www.revrobotics.com/content/cad/REV-21-2520.STEP)

- [**Bloco de Rolamento MAXSpline**](https://revrobotics.com/content/cad/REV-21-3297.STEP)

- [**Adaptador MAXSpline para Hexagonal 1/2"**](https://wcproducts.info/files/frc/cad/WCP-1118.step)
  
  
- [**Anel de Fixação MAXSpline**](https://www.revrobotics.com/content/cad/REV-21-3476.STEP)

---

### Estrutura

- [**Acoplador para Tubo 2" × 1"**](https://cdn.andymark.com/media/W1siZiIsIjIwMjMvMDUvMzEvMTEvMTUvNDQvZmZlYmUxMmItMDBkMi00Y2Y1LWFmZDQtZTlkNjMwOWQ4Zjg1L2FtLTQ3NjIgVHViZSBQbHVnIGZvciAyeDF4LjEyNS5TVEVQIl1d/am-4762%20Tube%20Plug%20for%202x1x.125.STEP?sha=92282de41545b7d6)

---

## Materiais de Fabricação

Todas as chapas utilizadas neste projeto possuem **espessura de 5 mm**.

Dependendo da disponibilidade da equipe, elas podem ser fabricadas utilizando materiais como:

- Alumínio;
- Policarbonato;
- MAX Composite;
- Outros materiais estruturais equivalentes.

A escolha do material dependerá dos requisitos de resistência, peso, facilidade de fabricação e recursos disponíveis na equipe.

</div>

> [!TIP] <div align="justify">
>
> Procure manter todos os arquivos CAD organizados em uma estrutura de pastas desde o início do projeto.
>
> Uma sugestão é separar os componentes por categorias, como:
>
> ```txt
> Projeto
> ├── Chassi
> ├── Intake
> ├── Elevator
> ├── Hand
> ├── Motores
> ├── Transmissão
> └── Componentes Comerciais
> ```
>
> Essa organização facilita futuras modificações, reduz o tempo de procura por arquivos e torna o projeto muito mais fácil de compartilhar com outros integrantes da equipe.

---

## Preparando a Montagem

Crie um novo arquivo de montagem (`Standard (mm).iam`) e insira o chassi desenvolvido anteriormente.

Em seguida, importe todos os componentes comerciais baixados nesta etapa.

Não se preocupe com o posicionamento inicial dos componentes. Nesta fase, o objetivo é apenas reunir todos os elementos necessários para o desenvolvimento do mecanismo.

Ao final desta etapa, sua montagem deverá apresentar uma configuração semelhante à ilustrada abaixo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img1.png" width="600">
</td>

</tr>

</table>

---

### Etapa 15 — Desenvolvendo as Chapas Laterais do Intake

Com os principais componentes comerciais já inseridos na montagem, o próximo passo consiste em desenvolver a estrutura responsável por sustentar todo o mecanismo do intake.

Neste projeto, essa estrutura será composta por duas chapas laterais, responsáveis por:

- fixar o intake ao chassi;
- suportar o motor responsável pela articulação do mecanismo;
- alojar os rolamentos do eixo MAXSpline;
- garantir o correto alinhamento entre todos os componentes.

As chapas serão fixadas utilizando os próprios furos existentes nos tubos estruturais do chassi.

---

### Etapa 16 — Criando as Chapas

Crie uma nova peça (`Standard (mm).ipt`) e desenvolva o esboço conforme ilustrado na imagem abaixo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img2.png" width="600">
</td>

</tr>

</table>

Após concluir o esboço, realize uma **Extrusão** de **5 mm**, correspondente à espessura adotada para todas as chapas deste projeto.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img3.png" width="600">
</td>

</tr>

</table>

Salve duas cópias da peça, representando as chapas laterais do mecanismo.

Exemplo:

```txt
CHAPA LATERAL ESQ
CHAPA LATERAL DIR
```

Após salvar os arquivos, feche-os para retornar ao ambiente de montagem.

---

### Etapa 17 — Posicionando as Chapas

Retorne ao arquivo de montagem e insira as chapas criadas anteriormente.

Em seguida, aplique as restrições necessárias para posicioná-las conforme ilustrado na figura abaixo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img4.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img5.png" width="600">
</td>

</tr>

</table>

Neste momento, as chapas servirão apenas como referência para o posicionamento dos demais componentes do mecanismo.

---

### Etapa 18 — Posicionando o Motor de Articulação

O próximo componente a ser instalado será o motor responsável pela abertura e fechamento do intake.

Posicione o conjunto **NEO + MAXPlanetary** restringindo inicialmente a face frontal do redutor com a face interna da chapa lateral.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img6.png" width="600">
</td>

</tr>

</table>

Em seguida, aplique as demais restrições indicadas nas imagens abaixo até que o conjunto permaneça completamente definido.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img7.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img8.png" width="600">
</td>

</tr>

</table>

---

### Etapa 19 — Instalando os Rolamentos

Com o motor posicionado, instale os blocos de rolamento responsáveis por sustentar o eixo MAXSpline.

Os rolamentos deverão permanecer alinhados ao eixo de saída do redutor, garantindo que o sistema opere sem desalinhamentos durante a movimentação.

Posicione o primeiro rolamento conforme indicado.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img9.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img10.png" width="600">
</td>

</tr>

</table>

Posicionamento do segundo rolamento

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img11.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img12.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img13.png" width="600">
</td>

</tr>

</table>

---

### Etapa 20 — Instalando o Eixo MAXSpline

Com ambos os rolamentos posicionados, insira o eixo MAXSpline.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img14.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img15.png" width="600">
</td>

</tr>

</table>

Nesta etapa, o objetivo é apenas validar o alinhamento entre:

- redutor;
- rolamentos;
- eixo principal.

---

### Etapa 21 — Adaptando as Chapas

Com todos os componentes posicionados, podemos iniciar a usinagem das chapas laterais.

Dê um duplo clique sobre a chapa interna para editá-la.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img16.png" width="600">
</td>

</tr>

</table>

Crie o esboço estrutural ilustrado abaixo e realize a extrusão mantendo a espessura de **5 mm**.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img17.png" width="600">
</td>

</tr>

</table>

Na sequência, desenvolva o segundo esboço responsável pelos alojamentos do motor e do rolamento.

Para garantir total precisão entre as peças, utilize a ferramenta **Projetar Geometria**, importando diretamente as bordas e centros dos furos dos componentes posicionados na montagem.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img18.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img19.png" width="600">
</td>

</tr>

</table>

</div>

> [!TIP] <div align="justify">
>
> A ferramenta **Projetar Geometria** é uma das mais importantes durante o desenvolvimento de mecanismos. Ela permite utilizar diretamente a geometria dos componentes já posicionados na montagem como referência para o esboço, eliminando medições manuais e garantindo que furos, eixos e alojamentos permaneçam perfeitamente alinhados.

Continue o desenvolvimento do esboço conforme ilustrado nas figuras seguintes.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img20.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img21.png" width="600">
</td>

</tr>

</table>

Utilize o comando de `APAGAR` para remover as linhas desnecessárias.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img22.png" width="600">
</td>

</tr>

</table>

---

## Etapa 22 — Ajustando os Furos da Chapa Interna

Com as geometrias do motor e do rolamento já projetadas sobre a chapa, aumente ligeiramente o diâmetro dos furos correspondentes ao eixo do motor e ao tubo MAXSpline.

Esse ajuste é importante para criar uma folga de montagem adequada, evitando interferências entre os componentes e facilitando a fabricação e a instalação das peças no robô real.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img23.png" width="600">
</td>

</tr>

</table>

</div>

> [!IMPORTANT] <div align="justify">
>
> A folga adicionada aos furos deve ser suficiente apenas para permitir a montagem e compensar pequenas variações de fabricação. Evite aumentar excessivamente os diâmetros, pois isso pode reduzir a precisão do posicionamento e comprometer a rigidez do conjunto.

---

## Etapa 23 — Chapa de Sustenção Interna

Após concluir os ajustes do esboço, utilize a ferramenta **Extrusão** para criar a chapa responsavel por segurar o motor e o tubo MAXSpline.

Para este exemplo, estamos considerando um material na espessura de `5 mm`

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img24.png" width="600">
</td>

</tr>

</table>

---

## Etapa 24 — Aplicando Raios de Acabamento

Após realizar os recortes, aplique um raio de `5 mm` na aresta interna gerada e nas demais quinas vivas da peça.

A utilização de raios reduz a concentração de tensões, diminui a possibilidade de trincas e pontos de ruptura e torna o componente mais seguro durante a fabricação, montagem e manutenção do robô.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img25.png" width="600">
</td>

</tr>

</table>

 </div>

> [!TIP]  <div align="justify">
>
> Evite manter cantos internos perfeitamente retos em regiões submetidas a esforço. Sempre que o processo de fabricação permitir, utilize raios para melhorar a distribuição das tensões no material.

---

## Etapa 25 — Editando a Chapa Externa

Com a chapa interna concluída, dê início à edição da chapa externa do intake.

Crie o esboço conforme a geometria apresentada abaixo e realize a extrusão mantendo a mesma espessura de `5 mm`.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img26.png" width="600">
</td>

</tr>

</table>

---

## Etapa 26 — Projetando as Geometrias dos Componentes

Crie um novo esboço sobre a face da chapa externa e utilize novamente a ferramenta **Projetar Geometria**.

Projete as referências relacionadas ao eixo do motor, ao tubo MAXSpline, aos rolamentos e aos demais elementos necessários para o posicionamento correto dos furos e recortes.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img27.png" width="600">
</td>

</tr>

</table>

---

## Etapa 27 — Ajustando os Furos da Chapa Externa

Assim como realizado na chapa interna, aumente ligeiramente o diâmetro dos furos correspondentes ao eixo do motor e ao tubo MAXSpline.

Esse ajuste garante a folga necessária para a montagem e reduz o risco de interferência entre as peças.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img28.png" width="600">
</td>

</tr>

</table>

---

## Etapa 28 — Completando o Esboço

Adicione as demais geometrias necessárias para definir o formato final da chapa externa.

Utilize cotas, restrições geométricas e referências projetadas para manter o esboço totalmente definido e coerente com a posição dos componentes da montagem.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img29.png" width="600">
</td>

</tr>

</table>

---

## Etapa 29 — Limpando e Recortando o Esboço

Remova todas as linhas auxiliares ou segmentos que não fazem parte do contorno final da peça.

Antes de executar a extrusão, verifique se os perfis desejados estão completamente fechados. Em seguida, utilize a ferramenta **Extrusão** no modo **Recortar** para concluir os furos e alojamentos da chapa externa.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img30.png" width="600">
</td>

</tr>

</table>

---

## Etapa 30 — Finalizando a Chapa Externa

Aplique raios nas quinas e arestas vivas da chapa externa, seguindo o mesmo padrão utilizado na chapa interna.

Além de melhorar o acabamento, esse procedimento reduz pontos de concentração de tensão e facilita a fabricação e o manuseio da peça.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img31.png" width="600">
</td>

</tr>

</table>

---

## Etapa 31 — Posicionando as Coroas da Transmissão

Com as chapas laterais concluídas, iniciaremos a montagem do sistema de transmissão responsável pela movimentação do intake.

Nesta etapa serão utilizados:

- Coroa usinada `#25 MAXSpline` de `40 dentes`;
- Pinhão `#25` de `14 dentes`, com hub simétrico para eixo hexagonal de `0,5"`.

Posicione os dois componentes conforme ilustrado abaixo, garantindo que permaneçam alinhados ao eixo de articulação e ao eixo de saída do motor.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img32.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img33.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img34.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img35.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img36.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img37.png" width="600">
</td>

</tr>

</table>

</div>

> [!NOTE] <div align="justify">
>
> A relação entre a coroa de `40 dentes` e o pinhão de `14 dentes` produz uma redução aproximada de:
>
> ```txt
> 40 ÷ 14 ≈ 2,86:1
> ```
>
> Isso significa que o eixo do intake terá maior torque e menor velocidade em comparação com o eixo de entrada do motor. Essa relação ainda deve ser analisada em conjunto com a redução existente no MAXPlanetary.




</div>