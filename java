var nome, nomes = []
var cont = 0

while (true) {

  nome = prompt("digite um nome a salvar. digite \"fim\" para parar")
  nomes.push(nome)

  if(nome === "fim"){
    break
  }
}

while (cont < nomes.length) {
  console.log(nomes[cont])
  cont++
}
