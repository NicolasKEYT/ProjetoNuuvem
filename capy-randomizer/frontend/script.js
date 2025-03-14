async function getCapy() {
    const response = await fetch("http://backend:25000/capy");
    const data = await response.json();
    document.getElementById("capyImage").src = data.capybara;
}

// Carregar uma capivara aleatória ao abrir a página
getCapy();
