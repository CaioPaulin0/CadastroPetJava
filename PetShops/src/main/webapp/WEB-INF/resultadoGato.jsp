<%@ page import="model.Gato" %>
<%
	Gato gato = (Gato) request.getAttribute("gato");
if(gato == null){
%>
<p>Erro: objeto não encontrado </p>
<%
}else{
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados de <%=gato.getNome() %></title>
<link rel="stylesheet" href="css/resultado.css">
</head>
<body>
 <div class="main">
        <div class="textMain">
            <h2>Dados do seu Gato</h2>
        </div>
        <div class="infoPet">
            <div>
                <p>NOME: <strong><%=gato.getNome() %></strong></p>
                <p>IDADE: <strong><%=gato.getIdade() %></strong></p>               
                <p>PESO: <strong><%=gato.getPeso() %></strong></p>            
            </div>
            <img src="./img/cat.png" alt="gato-foto">
        </div>
		<a href="/PetShops" class="btnVoltar">Voltar</a>
</div>
		
</body>
</html>
<%
}
%>