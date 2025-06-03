<%@ page import="model.Cachorro" %>
<%
	Cachorro cachorro = (Cachorro)request.getAttribute("cachorro");
if(cachorro == null){
%>
<p>Erro: objeto não encontrado </p>
<%
}else{
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados de <%=cachorro.getNome() %></title>
<link rel="stylesheet" href="css/resultado.css">
</head>
<body>
 <div class="main">
        <div class="textMain">
            <h2>Dados do seu Cachorro</h2>
        </div>
        <div class="infoPet">
            <div>
                <p>NOME: <strong><%=cachorro.getNome() %></strong></p>
                <p>IDADE: <strong><%=cachorro.getIdade() %></strong></p>               
                <p>PESO: <strong><%=cachorro.getPeso() %></strong></p>            
            </div>
            <img src="./img/dog.png" alt="cachorro-foto">
        </div>
		<a href="/PetShops" class="btnVoltar">Voltar</a>
</div>		
</body>
</html>
<%
}
%>