export async function registrarUsuario(e) {
	let datos = {};
	datos.nombre = document.getElementById("nombre").value;
	datos.email = document.getElementById("email").value;
	datos.pwd = document.getElementById("pwd").value;
	const request = await fetch('/usuario/crear' , {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(datos)
	});
	
	const usuarios = await request.json();
}