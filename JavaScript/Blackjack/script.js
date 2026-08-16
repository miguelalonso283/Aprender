let num1 = document.getElementById("num1")
let num2 = document.getElementById("num2")
let numn = document.getElementById("numn")
let suma = document.getElementById("suma")
let numBanca = document.getElementById("numBanca")
let sumBanca = document.getElementById("sumBanca")
let gameOver = document.getElementById("gameOver")
hit_EL.style.display = "none"
stand_EL.style.display = "none"

let sumaRandoms = 0
let sumaRandomsBanca = 0
let cartas = []
let cartasBanca = []

function randomNum() {
    let rand1 = Math.floor(Math.random() * 11 + 1)
    let rand2 = Math.floor(Math.random() * 11 + 1)
    let randBanca = Math.floor(Math.random() * 11 + 1)
    sumaRandomsBanca += randBanca
    cartasBanca.push(randBanca)
    num1.innerText = rand1
    num2.innerText = rand2
    boton.style.display = "none"
    sumaRandoms = rand1 + rand2
    suma.textContent = "Suma: "+ sumaRandoms
    hit_EL.style.display = "inline-block"
    stand_EL.style.display = "inline-block"
    numBanca.textContent = "Número de la banca: " + randBanca
}

function hit() {
    let randn = Math.floor(Math.random() * 11 + 1)
    cartas.push(randn)
    sumaRandoms += randn 
    numn.innerText = cartas.join("\n")
    suma.textContent = "Suma: "+ sumaRandoms
    
    if (sumaRandoms > 21) {
        hit_EL.style.display = "none"
        stand_EL.style.display = "none"
        numBanca.style.display = "none"
        gameOver.innerText = "Te has pasado de 21"
    }
}

function stand() {
    hit_EL.style.display = "none"
    stand_EL.style.display = "none"
    while (sumaRandomsBanca < 18) {
        let randBancan = Math.floor(Math.random() * 11 + 1)
        cartasBanca.push(randBancan)
        sumaRandomsBanca += randBancan
        numBanca.innerText = cartasBanca.join("\n")
        sumBanca.textContent = "Suma banca: "+sumaRandomsBanca
        if (sumaRandomsBanca > sumaRandoms && sumaRandomsBanca <= 21)
            gameOver.innerText = "La banca ha ganado"
        if (sumaRandomsBanca > 21) 
            gameOver.innerText = "Has ganado, la banca se ha pasado"
        if (sumaRandomsBanca < sumaRandoms)
            gameOver.innerText = "Has ganado"
    }

}


