<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">

	
	 <script type="text/javascript">
	function buscar(nome, profissao) {
		//alert(input);
		alert("Meu Nome é: " + nome.value + " .Minha Profissão é: " + profissao.value);
	}
	</script>
	 
	 
<title>Formulário Bootstrap</title>
</head>
<body>

	<br>
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">Cadastro</div>
			<div class="panel-body">
				<!--<form method="get" action="Servlet">-->
				 <form onsubmit="buscar(nome, profissao)">
					<fieldset>
						<div class="form-group">
							<label>Nome:</label> <input type="text" class="form-control" name="nome">
						</div>
						<div class="form-group">
							<label>Profissão:</label> <input type="text" class="form-control" name="profissao">
						</div>
					</fieldset>
					<input type="submit" name="Salvar" class="btn btn-primary">

				</form>

			</div>
		</div>

	</div>
	
  
</body>
</html>