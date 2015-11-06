<!DOCTYPE html>
<html>
<head>
<!--Import Google Icon Font-->
<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet" href="css/materialize.min.css"
	media="screen,projection" />

<!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8" />
</head>

<body>
	<!--Import jQuery before materialize.js-->
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>
	<div class="container">
		<h1>Calculadora de IMC</h1>
		<br>
		<form>
			<p>
				Nome: <input type="text" name="nome">
			</p>
			<p>
				Altura: <input type="text" name="altura">
			</p>
			<p>
				Peso: <input type="text" name="peso">
			</p>
			<input class="btn right" type="submit" value="Calcular!" step="any">
		</form>

		<p>
			 
			<%
			String nome = request.getParameter("nome");
			String pamAltura = request.getParameter("altura");
			pamAltura = pamAltura == null ? "0" : pamAltura;
			double altura = Double.parseDouble(pamAltura);
			String pamPeso = request.getParameter("peso");
			pamPeso = pamPeso == null ? "0" : pamPeso;
			double peso = Double.parseDouble(pamPeso);
			Double resultado = new Double(peso / (altura*altura));
			
			if (nome == null) {
				nome = "";
			}			
			
			out.print(nome + " está ");
			
			if(resultado < 17) {
				out.print("muito abaixo do peso.");
			} else if (resultado >= 17 && resultado <= 18.49) {
				out.print("abaixo do peso.");
			} else if (resultado >= 18.50 && resultado <= 24.99) {
				out.print("com peso normal.");
			} else if (resultado >= 25 && resultado >= 29.99) {
				out.print("acima do peso.");
			} else {
				out.print("obeso.");
			}
		%>
		
	</div>

</body>
</html>