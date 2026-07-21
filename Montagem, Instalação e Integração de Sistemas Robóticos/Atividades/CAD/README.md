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

<td align="center" width="350">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img18.png" width="350">
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

### Etapa 22 — Ajustando os Furos da Chapa Interna

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

### Etapa 23 — Chapa de Sustenção Interna

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

### Etapa 24 — Aplicando Raios de Acabamento

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

### Etapa 25 — Editando a Chapa Externa

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

### Etapa 26 — Projetando as Geometrias dos Componentes

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

### Etapa 27 — Ajustando os Furos da Chapa Externa

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

### Etapa 28 — Completando o Esboço

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

### Etapa 29 — Limpando e Recortando o Esboço

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

### Etapa 30 — Finalizando a Chapa Externa

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

### Etapa 31 — Posicionando as Coroas da Transmissão

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

---

### Etapa 32 — Representando o Eixo do Motor

Crie a representação do eixo de saída do motor e do rolamento utilizado no eixo sextavado.

Esses componentes servirão como referência para validar o alinhamento do sistema de transmissão e garantir que a coroa, o pinhão e o eixo permaneçam corretamente posicionados dentro do conjunto.

<table align="center">

<tr>

<td align="center" width="350">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img38.png" width="350">
</td>

</tr>

</table>

---

### Etapa 33 — Montando o Conjunto de Transmissão

Insira os componentes criados na montagem e aplique as restrições necessárias para posicioná-los corretamente.

Durante essa etapa, verifique se:

- o eixo do motor permanece alinhado ao pinhão;
- o rolamento está concêntrico ao eixo sextavado;
- as coroas permanecem paralelas;
- não existem interferências entre as peças.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img39.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img40.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img41.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img42.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img43.png" width="600">
</td>

</tr>

</table>

</div>

> [!TIP] <div align="justify">
>
> Sempre valide o alinhamento dos eixos antes de prosseguir. Pequenos desalinhamentos no CAD podem resultar em montagem forçada, desgaste prematuro de rolamentos, perda de eficiência e problemas na transmissão.

---

### Etapa 34 — Criando as Chapas do Lado Oposto

Com o primeiro lado do intake definido, criaremos agora as chapas de apoio do lado oposto do mecanismo.

Utilize como base as chapas desenvolvidas anteriormente. Crie uma cópia de cada arquivo e insira essas novas peças na montagem.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img44.png" width="600">
</td>

</tr>

</table>

---

### Etapa 35 — Adaptando as Chapas do Segundo Lado

Como o conjunto de acionamento será instalado em apenas um lado do intake, as chapas do lado oposto não precisam dos alojamentos destinados ao motor e ao rolamento do eixo de saída.

Edite as cópias criadas anteriormente e remova:

- a furação do motor;
- o alojamento do rolamento;
- recortes associados exclusivamente ao acionamento.

Mantenha apenas as geometrias necessárias para:

- sustentação estrutural;
- apoio do eixo MAXSpline;
- fixação do intake ao chassi;
- alinhamento entre as laterais do mecanismo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img45.png" width="600">
</td>

</tr>

</table>

</div>

> [!IMPORTANT] <div align="justify">
>
> Evite reutilizar exatamente o mesmo arquivo da chapa original. Crie cópias independentes antes de remover as furações, pois alterações realizadas no mesmo arquivo podem ser refletidas em todas as instâncias já inseridas na montagem.

---

### Etapa 36 — Posicionando as Chapas no Chassi

Insira as chapas adaptadas no lado oposto do intake e aplique as restrições necessárias para fixá-las ao chassi.

Durante o posicionamento, garanta que as chapas permaneçam:

- paralelas às chapas do primeiro lado;
- alinhadas aos furos dos tubos estruturais;
- simétricas em relação ao centro do mecanismo;
- corretamente posicionadas em relação ao eixo MAXSpline.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img46.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img47.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img48.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img49.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img50.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img51.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img52.png" width="600">
</td>

</tr>

</table>

Após a conclusão desta etapa, os dois lados do intake deverão apresentar a mesma referência estrutural, diferenciando-se apenas pela presença do sistema de acionamento em uma das laterais.

### Etapa 37 — Montando a Coroa e o Bloco de Rolamento

Agora vamos posicionar a **coroa usinada #25 MAXSpline de 40 dentes** e o **bloco de rolamento para eixo MAXSpline com montagem lateral**.

Esses componentes fazem parte do conjunto responsável pela sustentação e transmissão de movimento do eixo principal do intake.

Durante a montagem, verifique se:

- a coroa está corretamente alinhada ao eixo MAXSpline;
- o bloco de rolamento está concêntrico ao eixo;
- não existem interferências entre os componentes;
- o conjunto permanece paralelo às chapas laterais do mecanismo;
- a posição da coroa está compatível com o alinhamento da corrente e do pinhão.

A correta instalação desses componentes é fundamental para garantir que o eixo do intake permaneça bem apoiado e que a transmissão opere de forma eficiente e sem desalinhamentos.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img53.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img54.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img55.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img56.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img57.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img58.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img59.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img60.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img61.png" width="600">
</td>

</tr>

</table>

---

### Etapa 38 — Ajustando o Comprimento do Eixo MAXSpline

Com todos os componentes posicionados, é possível determinar o comprimento final do eixo MAXSpline.

Neste momento, observe que o eixo ainda ultrapassa o perímetro do robô. Para adequá-lo ao projeto, edite a peça e remova o material excedente, deixando o eixo com **695,8 mm** de comprimento.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img62.png" width="600">
</td>

</tr>

</table>

</div>

> [!TIP] <div align="justify">
>
> Sempre defina o comprimento final dos eixos após posicionar todos os componentes da transmissão. Dessa forma, evita-se retrabalho caso ocorram alterações no projeto durante o desenvolvimento do mecanismo.

---

### Etapa 39 — Criando a Chapa Lateral do Intake

O próximo passo consiste em desenvolver a chapa lateral responsável por sustentar a extremidade do mecanismo de coleta.

Crie uma nova peça (`Standard (mm).ipt`) e desenvolva o esboço conforme ilustrado na imagem abaixo.

<table align="center">

<tr>

<td align="center" width="450">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img63.png" width="450">
</td>

</tr>

</table>

Após concluir o esboço, realize uma **Extrusão** de **5 mm**, mantendo o mesmo padrão utilizado nas demais chapas do projeto.

Salve o arquivo e retorne à montagem principal.

---

### Etapa 40 — Posicionando a Chapa Lateral

Insira a chapa recém-criada na montagem e aplique as restrições necessárias para posicioná-la conforme ilustrado na figura abaixo.

Verifique se a peça permanece:

- alinhada às chapas estruturais do intake;
- paralela ao eixo MAXSpline;
- corretamente posicionada em relação ao chassi;
- sem interferências com os demais componentes.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img64.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img65.png" width="600">
</td>

</tr>

</table>

---

### Etapa 41 — Utilizando a Ferramenta de Visibilidade

À medida que a montagem evolui, a quantidade de componentes aumenta significativamente, tornando algumas operações de edição mais difíceis.

Para facilitar o trabalho, o Autodesk Inventor permite ocultar temporariamente componentes sem removê-los da montagem.

Para isso, clique com o **botão direito do mouse** sobre a peça desejada e selecione a opção **Visibilidade**.

<table align="center">

<tr>

<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img66.png" width="400">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img67.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img68.png" width="400">
</td>

</tr>

</table>

</div>

> [!NOTE] <div align="justify">
>
> Ocultar componentes não altera a montagem nem remove restrições aplicadas às peças. Esse recurso serve apenas para facilitar a visualização e o acesso às regiões internas do mecanismo durante a modelagem e edição.

---

### Etapa 42 — Desenvolvendo a Chapa Lateral do Intake

Com a estrutura principal do mecanismo concluída, iniciaremos agora o desenvolvimento da chapa lateral responsável por definir a geometria do intake.

Essa chapa possui diversas funções importantes, entre elas:

- sustentar os eixos de coleta;
- definir a trajetória percorrida pela *Game Piece* (FUEL);
- servir como referência para posicionamento dos tubos estruturais;
- limitar o curso do mecanismo de coleta.

Para iniciar, edite a chapa lateral e crie um novo esboço.

Adicione as duas linhas indicadas na imagem:

- a primeira representa o limite frontal do robô;
- a segunda representa o plano do piso (chão).

</div>

> [!IMPORTANT] <div align="justify">
>
> Nesta etapa o projeto **não considera a instalação do Bumper**. Esse componente será levado em consideração posteriormente durante a validação das dimensões finais do robô.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img69.png" width="600">
</td>

</tr>

</table>

---

### Etapa 43 — Definindo a Geometria do Intake

Utilizando as referências criadas anteriormente, desenvolva o esboço conforme ilustrado nas figuras seguintes.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img70.png" width="600">
</td>

</tr>

</table>

Durante essa etapa serão criadas duas geometrias principais:

- um **retângulo**, representando o tubo estrutural que será instalado posteriormente;

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img71.png" width="600">
</td>

</tr>

</table>

- um **arco circular**, responsável por formar a abertura lateral utilizada para direcionar a entrada da FUEL no mecanismo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img72.png" width="600">
</td>

</tr>

</table>

Essa abertura facilita a captura da *Game Piece* mesmo quando ela não está perfeitamente alinhada com o centro do robô.

---

### Etapa 44 — Posicionando os Eixos de Coleta

Agora serão definidos os pontos de fixação dos eixos responsáveis por transportar a FUEL para o interior do robô.

Adicione as furações conforme indicado na figura abaixo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img73.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img74.png" width="600">
</td>

</tr>

</table>

Essas furações servirão como apoio para os eixos sextavados que receberão posteriormente os roletes de coleta.

O correto posicionamento desses eixos influencia diretamente a eficiência do mecanismo de coleta.

---

### Etapa 45 — Fixação dos Tubos Estruturais

Adicione também a furação destinada à fixação dos **Acopladores de Tubo 2" × 1"**.

Esses componentes serão responsáveis por conectar os tubos estruturais ao restante da montagem, aumentando a rigidez do mecanismo.

<table align="center">

<tr>

<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img75.png" width="400">
</td>

</tr>

</table>

---

### Etapa 46 — Finalizando o Perfil da Chapa

Com todas as referências concluídas, remova as linhas auxiliares que não fazem parte do contorno final da peça.

Verifique se o perfil está completamente fechado antes de prosseguir.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img76.png" width="600">
</td>

</tr>

</table>

Em seguida, realize a extrusão da peça mantendo a espessura padrão adotada no projeto.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img77.png" width="600">
</td>

</tr>

</table>

---

### Etapa 47 — Definindo a Trajetória da FUEL

Agora iniciaremos o dimensionamento do sistema de coleta.

Crie um novo esboço utilizando novamente o plano da chapa lateral.

Nesse esboço:

- a linha inferior representa o piso do campo;
- o círculo representa a FUEL utilizada durante a temporada.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img78.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img79.png" width="600">
</td>

</tr>

</table>

Essa representação será utilizada como referência para posicionar corretamente os roletes responsáveis pela coleta.

---

### Etapa 48 — Posicionando o Primeiro Rolete

Com a representação da FUEL criada, desenvolva agora o primeiro eixo de coleta.

O objetivo é garantir que o rolete permaneça em contato com a Game Piece, criando uma pequena interferência entre ambos.

Essa interferência é proposital e necessária para gerar pressão suficiente entre o rolete e a FUEL, permitindo que o atrito seja capaz de puxá-la para o interior do robô.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img80.png" width="600">
</td>

</tr>

</table>

</div>

> [!TIP] <div align="justify">
>
> Um bom intake não depende apenas da velocidade dos motores. O posicionamento dos roletes, o grau de interferência com a Game Piece e a trajetória criada ao longo do mecanismo são fatores que influenciam diretamente a eficiência da coleta. Durante o desenvolvimento do CAD, procure sempre visualizar como a peça do jogo percorrerá todo o caminho até o interior do robô.

---

### Etapa 49 — Criando as Furações de Fixação da Coroa

Com a posição da coroa definida, o próximo passo consiste em projetar sobre a chapa as furações necessárias para fixar a **coroa usinada #25 MAXSpline de 40 dentes**.

Utilize a ferramenta **Projetar Geometria** para transferir os centros dos furos da coroa para o esboço da chapa.

Esse procedimento garante que a furação permaneça perfeitamente alinhada ao componente e reduz o risco de erros dimensionais durante a fabricação.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img81.png" width="600">
</td>

</tr>

</table>

---

### Etapa 50 — Recortando as Furações

Após concluir o esboço, utilize a ferramenta **Extrusão** no modo **Recortar** para criar os furos de fixação da coroa.

Garanta que o corte atravesse completamente a espessura da chapa.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img82.png" width="600">
</td>

</tr>

</table>

---

### Etapa 51 — Inserindo o Motor Kraken X60

Retorne ao ambiente de montagem e insira o modelo CAD do **Kraken X60**.

Posicione o motor conforme ilustrado nas imagens abaixo, aplicando as restrições necessárias para alinhá-lo corretamente ao sistema de transmissão do intake.

Durante o posicionamento, verifique se:

- o eixo do motor está alinhado ao componente acionado;
- o corpo do motor não interfere nas chapas ou no chassi;
- existe espaço suficiente para a instalação elétrica;
- o conjunto permanece acessível para manutenção.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img83.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img84.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img85.png" width="600">
</td>

</tr>

</table>

---

### Etapa 52 — Criando a Furação do Motor

Com o motor corretamente posicionado, edite novamente a chapa lateral e projete as geometrias necessárias para a sua fixação.

Utilize como referência os furos do próprio modelo CAD do Kraken X60, evitando medições manuais desnecessárias.

Após concluir o esboço, realize os recortes correspondentes.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img86.png" width="600">
</td>

</tr>

</table>

</div>

> [!TIP] <div align="justify">
>
> Sempre utilize os modelos CAD oficiais dos fabricantes como referência para furações de montagem. Isso reduz erros de posicionamento e melhora a compatibilidade entre a peça projetada e o componente real.

---

### Etapa 53 — Criando o Fim de Curso Mecânico

O próximo passo consiste em adicionar um **fim de curso mecânico** para limitar o movimento de descida do intake.

Esse recurso impedirá que o mecanismo avance além do necessário, utilizando o próprio chassi como superfície de contato.

Crie a geometria conforme ilustrado abaixo, garantindo que o contato aconteça antes que qualquer outro componente do intake encoste no chão, no bumper ou na estrutura do robô.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img87.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img88.png" width="600">
</td>

</tr>

</table>

</div>

> [!IMPORTANT] <div align="justify">
>
> O fim de curso mecânico não substitui sensores ou limites definidos na programação, mas funciona como uma proteção física adicional contra movimentos excessivos e possíveis danos ao mecanismo.

---

### Etapa 54 — Aplicando Raios de Acabamento

Para concluir esta etapa, aplique raios nas arestas vivas da peça.

A utilização de raios melhora a distribuição de tensões, reduz pontos propensos a trincas e facilita o manuseio durante a montagem e manutenção do robô.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img89.png" width="600">
</td>

</tr>

</table>

---

### Etapa 55 — Restaurando a Visibilidade dos Componentes

Retorne ao ambiente de montagem e reative a visibilidade das peças ocultadas anteriormente.

Na árvore de componentes, localize os itens exibidos com o ícone transparente. Em seguida, clique com o **botão direito do mouse** sobre cada componente e selecione a opção **Visibilidade**.

<table align="center">

<tr>

<td align="center" width="200">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img90.png" width="200">
</td>

</tr>
<tr>

<td align="center" width="200">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img91.png" width="200">
</td>

</tr>
</table>


</div>

> [!NOTE] <div align="justify">
>
> Reativar a visibilidade dos componentes permite verificar o conjunto completo, identificar possíveis interferências e validar o posicionamento final das peças antes de continuar a montagem.

---

### Etapa 56 — Criando a Chapa Lateral Oposta

O próximo passo consiste em criar a chapa lateral correspondente ao outro lado do intake.

Utilize como base a chapa lateral desenvolvida anteriormente. Crie uma cópia do arquivo e insira essa nova peça na montagem.

Em seguida, aplique as restrições necessárias para posicioná-la no lado oposto do mecanismo, mantendo o alinhamento e a simetria do conjunto.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img92.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img93.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img94.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img95.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img96.png" width="600">
</td>

</tr>

</table>

Durante o posicionamento, verifique se a nova chapa permanece:

- paralela à chapa do lado oposto;
- alinhada aos eixos de coleta;
- corretamente posicionada em relação ao chassi;
- sem interferências com os demais componentes.

---

### Etapa 57 — Instalando o Segundo Motor Kraken X60

Com a segunda chapa posicionada, copie o motor **Kraken X60** já inserido anteriormente e monte-o na nova lateral do intake.

Aplique as restrições necessárias para alinhar o eixo do motor ao mecanismo correspondente.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img97.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img98.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img99.png" width="600">
</td>

</tr>

</table>

</div>

> [!IMPORTANT] <div align="justify">
>
> Antes de concluir esta etapa, confirme se os dois motores estão corretamente alinhados e se nenhum deles interfere com o chassi, as chapas laterais, os eixos ou os demais componentes do intake.

---

### Etapa 58 — Instalando os Adaptadores SplineXS para Hexagonal de 0,5"

Insira na montagem os adaptadores **SplineXS para eixo hexagonal de 0,5"**, responsáveis por realizar a interface mecânica entre os eixos dos motores Kraken X60 e os componentes de transmissão do intake.

Posicione cada adaptador no respectivo motor e aplique as restrições necessárias para mantê-lo concêntrico ao eixo de saída.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img100.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img101.png" width="600">
</td>

</tr>

</table>

</div>

> [!IMPORTANT] <div align="justify">
>
> Antes de prosseguir, confirme se o adaptador está corretamente encaixado e alinhado ao eixo do motor. Qualquer desalinhamento poderá comprometer a transmissão de torque e causar desgaste prematuro dos componentes.

---

### Etapa 59 — Criando a Polia do Eixo do Kraken X60

O próximo passo consiste em desenvolver a polia que será montada na extremidade do eixo acionado pelo Kraken X60.

Crie uma nova peça e modele a geometria da polia conforme ilustrado nas imagens abaixo.

Durante o desenvolvimento, verifique:

- o diâmetro externo da polia;
- o encaixe para o eixo hexagonal;
- a largura necessária para o elemento de transmissão;
- o alinhamento com os demais componentes do sistema.

<table align="center">

<tr>

<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img102.png" width="400">
</td>

</tr>

</table>

Após concluir a modelagem, insira a polia na montagem e aplique as restrições necessárias para posicioná-la corretamente sobre o eixo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img103.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img104.png" width="600">
</td>

</tr>

</table>

---

### Etapa 60 — Criando o Reforço Estrutural do Intake

Com as chapas laterais posicionadas, meça a distância interna entre elas.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img105.png" width="600">
</td>

</tr>

</table>

Essa dimensão será utilizada para definir o comprimento do tubo estrutural **Linha Forja 2" × 1"**, responsável por aumentar a rigidez do conjunto e reduzir deformações durante os impactos e esforços de coleta.

Crie ou edite o modelo do tubo com o comprimento obtido na medição e insira-o na montagem.

---

### Etapa 61 — Instalando os Acopladores de Tubo

Insira também os **acopladores para tubo 2" × 1"** nas extremidades do reforço estrutural.

Esses componentes serão responsáveis por conectar o tubo às chapas laterais e garantir uma fixação mais rígida e confiável.

Aplique as restrições necessárias para alinhar:

- os acopladores às extremidades do tubo;
- os furos dos acopladores às furações das chapas;
- o tubo ao plano central do mecanismo.

<table align="center">

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img106.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img107.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img108.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img109.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img110.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img111.png" width="600">
</td>

</tr>

<tr>

<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img112.png" width="600">
</td>

</tr>

</table>

</div>

> [!NOTE] <div align="justify">
>
> O tubo estrutural não atua apenas como espaçador entre as chapas. Ele também contribui para a rigidez torcional do intake, reduzindo flexões e desalinhamentos durante a coleta das FUEL.

---

### Etapa 62 — Modelando o Eixo Sextavado

Agora vamos desenvolver o eixo sextavado responsável por transmitir o movimento para os roletes de coleta.

Crie uma nova peça (`Standard (mm).ipt`) e desenvolva o esboço conforme ilustrado na figura abaixo.

<table align="center">

<tr>

<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img113.png" width="400">
</td>

</tr>

</table>

</div>

> [!NOTE] <div align="justify">
>
> O eixo sextavado é amplamente utilizado em robôs FRC por permitir a transmissão de torque sem a necessidade de chavetas ou perfis usinados, simplificando a montagem e a substituição de componentes.

---

### Etapa 63 — Criando o Corpo do Eixo

Com o perfil sextavado concluído, realize uma **Extrusão** de **661,4 mm**, obtendo o comprimento necessário para atravessar toda a largura do intake.

Para facilitar o posicionamento do eixo durante a montagem, crie um novo esboço na extremidade da peça conforme indicado na imagem.

Essa pequena geometria servirá apenas como referência para aplicação de restrições e alinhamentos no ambiente de montagem.

<table align="center">

<tr>

<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img114.png" width="400">
</td>

</tr>

</table>

---

### Etapa 64 — Extrudando a Referência

Realize uma **Extrusão** de **1 mm** utilizando o esboço criado anteriormente.

Essa pequena saliência não possui função estrutural e será utilizada exclusivamente como auxílio durante a aplicação das restrições no Inventor.

Após concluir a modelagem, salve o arquivo e retorne à montagem principal.

<table align="center">

<tr>

<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img115.png" width="400">
</td>

</tr>

</table>

---

### Etapa 65 — Instalando os Eixos de Coleta

Insira os eixos sextavados recém-criados na montagem e aplique as restrições necessárias para posicioná-los nos pontos de apoio definidos anteriormente.

Durante a montagem, verifique se:

- os eixos permanecem concêntricos aos rolamentos;
- não existem interferências com as chapas laterais;
- o comprimento é suficiente para acomodar todos os componentes de transmissão;
- as extremidades permanecem acessíveis para a instalação dos roletes e demais elementos do mecanismo.

<table align="center">

<tr> <td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img116.png" width="600">
</td> </tr>

<tr> <td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img117.png" width="600">
</td> </tr>

<tr> <td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img118.png" width="600">
</td> </tr>

<tr> <td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img119.png" width="600">
</td> </tr>

<tr> <td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img120.png" width="600">
</td> </tr>

<tr> <td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img121.png" width="600">
</td> </tr>

<tr> <td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img122.png" width="600">
</td> </tr>

</table>

</div>

> [!TIP] <div align="justify">
>
> A pequena extrusão criada na extremidade do eixo facilita a aplicação das restrições de montagem, tornando o alinhamento muito mais simples do que utilizar apenas as faces do perfil sextavado. Esse é um recurso bastante utilizado em projetos CAD para acelerar montagens complexas.
---

### Etapa 66 — Desenvolvendo a Polia do Rolete de Coleta

O próximo passo consiste em desenvolver o conjunto responsável por transmitir o movimento ao rolete que realizará a coleta das FUEL.

Para este projeto, será utilizada uma polia de **23 dentes**, responsável por transferir o movimento do sistema de transmissão para o tubo do rolete.

Abra o arquivo da polia e prepare-o para receber os componentes de apoio do eixo.

<table align="center">

<tr>
<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img123.png" width="400">
</td>
</tr>

</table>

---

### Etapa 67 — Criando o Alojamento do Rolamento

Edite a polia conforme as operações apresentadas nas imagens abaixo, criando o alojamento necessário para a instalação de um rolamento sextavado.

Esse rolamento permitirá que a polia gire livremente sobre o eixo, reduzindo atrito e evitando que o conjunto fique travado durante o funcionamento.

<table align="center">

<tr>
<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img124.png" width="400">
</td>
</tr>

<tr>
<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img125.png" width="400">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img126.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img127.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img128.png" width="600">
</td>
</tr>

</table>

</div>

> [!IMPORTANT] <div align="justify">
>
> Verifique se o alojamento do rolamento apresenta folga suficiente para a montagem, mas sem excesso. Um encaixe muito apertado pode dificultar a instalação, enquanto um encaixe muito folgado pode gerar desalinhamento e vibração.

---

### Etapa 68 — Criando o Encaixe para o Tubo

Agora desenvolva o corpo da polia responsável por realizar o encaixe com o tubo do rolete.

Essa região deverá transmitir corretamente o movimento da polia para o tubo, mantendo o alinhamento entre os dois componentes.

<table align="center">

<tr>
<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img129.png" width="400">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img130.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img131.png" width="600">
</td>
</tr>

</table>

Após concluir a modelagem, salve o arquivo e feche a peça.

---

### Etapa 69 — Inserindo a Polia e o Rolamento na Montagem

Retorne ao ambiente de montagem e insira:

- a polia modificada;
- o rolamento sextavado;
- os demais componentes necessários para o conjunto do rolete.

Aplique as restrições correspondentes para garantir que a polia e o rolamento permaneçam corretamente alinhados ao eixo.

<table align="center">

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img132.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img133.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img134.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img135.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img136.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img137.png" width="600">
</td>
</tr>

</table>

Durante a montagem, verifique se:

- o rolamento está corretamente apoiado;
- a polia gira livremente sobre o eixo;
- o encaixe com o tubo está alinhado;
- não existem interferências entre a polia, a chapa e os demais componentes;
- o conjunto possui espaço adequado para montagem e manutenção.

</div>

> [!TIP] <div align="justify">
>
> Antes de prosseguir, utilize a ferramenta de inspeção do Inventor para verificar possíveis interferências entre os componentes. Isso evita problemas de montagem e ajuda a garantir que o rolete possa girar livremente durante o funcionamento.

---

### Etapa 70 — Determinando o Comprimento do Tubo do Rolete

Com as polias já posicionadas, utilize a ferramenta de medição do Inventor para obter a distância interna entre as faces de encosto das duas polias.

Essa medida corresponderá ao comprimento final do tubo que formará o corpo do rolete de coleta.

<table align="center">

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img138.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img139.png" width="600">
</td>
</tr>

</table>

</div>

> [!TIP] <div align="justify">
>
> Realize a medição diretamente entre as superfícies onde o tubo deverá encostar. Dessa forma, o comprimento modelado representará corretamente o espaço disponível na montagem.

---

### Etapa 71 — Modelando o Tubo do Rolete

Crie uma nova peça e modele o tubo utilizando o comprimento obtido na etapa anterior.

Verifique se os diâmetros interno e externo são compatíveis com o encaixe das polias e com o material que será utilizado para aumentar a aderência sobre a FUEL.

<table align="center">

<tr>
<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img140.png" width="400">
</td>
</tr>

<tr>
<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img141.png" width="400">
</td>
</tr>

</table>

Após concluir a modelagem, salve o arquivo e retorne à montagem principal.

---

### Etapa 72 — Posicionando o Tubo na Montagem

Insira o tubo recém-criado e aplique as restrições necessárias para posicioná-lo entre as duas polias.

Durante essa etapa, verifique se:

- o tubo está concêntrico às polias;
- suas extremidades encostam corretamente nas faces de apoio;
- não existem folgas excessivas;
- o conjunto consegue girar sem interferências.

<table align="center">

<tr>
<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img142.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img143.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img144.png" width="600">
</td>
</tr>

</table>

---

### Etapa 73 — Criando os Espaçadores dos Motores Kraken X60

O próximo passo consiste em desenvolver os espaçadores responsáveis por fixar corretamente os motores Kraken X60 às chapas laterais do intake.

Meça a distância entre a face de montagem do motor e a chapa correspondente. Em seguida, crie um novo componente utilizando essa dimensão como comprimento do espaçador.

<table align="center">

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img145.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img146.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img147.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img148.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img149.png" width="600">
</td>
</tr>

</table>

Os espaçadores devem:

- manter o motor corretamente afastado da chapa;
- evitar deformações durante o aperto dos parafusos;
- garantir o alinhamento do eixo do motor;
- permitir acesso adequado para montagem e manutenção.

---

### Etapa 74 — Instalando os Anéis de Fixação MAXSpline

Insira na montagem os **Anéis de Fixação MAXSpline — Fino** e posicione-os conforme ilustrado nas imagens abaixo.

Esses componentes serão responsáveis por limitar o deslocamento axial do eixo MAXSpline, evitando que ele se movimente lateralmente durante o funcionamento do intake.

<table align="center">

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img150.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img151.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img152.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img153.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img154.png" width="600">
</td>
</tr>

</table>

</div>

> [!IMPORTANT] <div align="justify">
>
> Os anéis devem impedir o deslocamento lateral do eixo sem pressionar excessivamente os rolamentos. Um conjunto muito apertado pode aumentar o atrito e dificultar a rotação do mecanismo.

---

### Etapa 75 — Definindo o Fim de Curso de Recolhimento

Com o intake completamente montado, posicione o mecanismo na condição desejada de recolhimento.

Essa posição será utilizada como referência para criar um fim de curso mecânico que impeça o mecanismo de avançar além do ponto definido.

<table align="center">

<tr>
<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img155.png" width="400">
</td>
</tr>

</table>

---

### Etapa 76 — Criando o Batente Mecânico

Edite as duas chapas responsáveis pela fixação do intake ao chassi.

Crie um novo esboço e utilize a ferramenta **Projetar Geometria** para transferir as referências da chapa móvel do intake.

Em seguida, defina a posição do furo por onde será instalado o parafuso responsável por atuar como batente mecânico.

Após concluir o esboço, realize a extrusão no modo **Recortar**.

<table align="center">

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img156.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img157.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img158.png" width="600">
</td>
</tr>

</table>

</div>

> [!IMPORTANT] <div align="justify">
>
> O parafuso utilizado como batente deverá receber o impacto do mecanismo sem permitir contato indevido entre o intake e o chassi. Sempre que possível, utilize arruelas, espaçadores ou materiais de amortecimento para distribuir melhor os esforços.

---

# Intake Concluído

Com a instalação do tubo do rolete, dos espaçadores, dos anéis de fixação e dos batentes mecânicos, o desenvolvimento do intake está concluído.

Antes de finalizar o projeto, realize uma inspeção completa da montagem e verifique:

- alinhamento dos motores, eixos e rolamentos;
- liberdade de movimento dos roletes;
- ausência de interferências entre componentes;
- posicionamento correto dos fins de curso;
- rigidez das chapas e tubos estruturais;
- acesso para montagem, manutenção e passagem de cabos;
- respeito ao perímetro e às limitações dimensionais do robô.

<table align="center">

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img159.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img160.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img161.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img162.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img163.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img164.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="400">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img165.png" width="600">
</td>
</tr>

<tr>
<td align="center" width="600">
	<img src="https://github.com/FRCMT-Repositories/Curso-2026/blob/main/Montagem%2C%20Instala%C3%A7%C3%A3o%20e%20Integra%C3%A7%C3%A3o%20de%20Sistemas%20Rob%C3%B3ticos/Atividades/CAD/img/Intake/Img167.png" width="600">
</td>
</tr>

</table>

</div>

> [!NOTE] <div align="justify">
>
> A conclusão do CAD representa apenas uma etapa do desenvolvimento. Antes da fabricação definitiva, recomenda-se revisar as dimensões, validar os materiais escolhidos, analisar os esforços esperados e, sempre que possível, construir e testar protótipos do mecanismo.









</div>