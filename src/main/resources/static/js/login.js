export async function iniciarSesion(e) {
	let datos = {};
	datos.email = document.getElementById("email").value;
	datos.pwd = document.getElementById("pwd").value;
	const request = await fetch('http://localhost:8080/usuario/login' , {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(datos)
	});
	
	const response = await request.json();
}