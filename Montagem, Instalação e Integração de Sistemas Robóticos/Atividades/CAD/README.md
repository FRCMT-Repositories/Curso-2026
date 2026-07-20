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

</div>