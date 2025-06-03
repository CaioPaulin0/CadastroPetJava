const btnDog = document.getElementById("dog");
const btnCat = document.getElementById("cat");
const divPet = document.getElementById('selectPet');
const btnVoltar = document.createElement('button');
btnVoltar.innerText = "voltar";
btnVoltar.classList.add('btnVoltar')
const main = document.querySelector('.main');

const formGatoText = `
<div class='FormGato form'>
	<form action="GatoServlet" method="post">
	<div>
		<label>Nome: </label>
		<input type="text" name="nomeGato" class="form-control" required>
	</div>
	
	<div>
		<label>Idade: </label>
		<input type="number" name="idadeGato" class="form-control" required>
	</div>
	
	<div>
		<label>Peso :</label>
		<input type="number" name="pesoGato" class="form-control" required>
	</div>
	
		<button type="submit" class="btn-submit">Enviar</button>
	</form>
	</div>
    `
const divFormGato = document.createElement('div')
divFormGato.innerHTML = formGatoText;
btnCat.addEventListener("click", () => {
    btnDog.style.display = "none"
    divPet.appendChild(divFormGato)

	main.appendChild(btnVoltar);
	btnVoltar.addEventListener('click', () => {
		divPet.removeChild(divFormGato);
		btnDog.style.display = "flex";

		main.removeChild(btnVoltar);
	})
})

const formCachorroText = `
<div class='FormCachorro form'>
<form action="CachorroServlet" method="post">
	<div>
	<label>Nome: </label>
	<input type="text" name="nomeCachorro" class="form-control" required>
	</div>
	
	<div>
	<label>Idade: </label>
	<input type="number" name="idadeCachorro" class="form-control" required>
	</div>
	
	<div>
	<label>Peso: </label>
	<input type="number" name="pesoCachorro" class="form-control" required>
	</div>
	
	<button type="submit" class="btn-submit">Enviar</button>
</form>
</div>
	`
const divFormCachorro = document.createElement('div');
divFormCachorro.innerHTML = formCachorroText;
btnDog.addEventListener('click', () => {
    btnCat.style.display = "none";
    divPet.appendChild(divFormCachorro);

	main.appendChild(btnVoltar);
	btnVoltar.addEventListener('click', () => {
		divPet.removeChild(divFormCachorro);
		btnCat.style.display = "flex";

		main.removeChild(btnVoltar);
	})
})