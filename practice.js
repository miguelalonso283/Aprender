// for (let i=10;i<=100;i+=10) {
//     console.log(i)
// }

// let messages = [
//     "Hola bro",
//     "Hola, ¿Cómo estas?",
//     "Estoy bien",
//     "Genial"
// ]

// for (let i = 0; i < messages.length; i++) {
//     console.log(messages[i])
// }

// let sentence = ["Hello","my","name","is","Miguel"]
// let greetings = document.getElementById("greetings-el")

// for (let i = 0; i < sentence.length; i++) {
//     greetings.textContent += sentence[i] + " "
// }

// let hasCompletedCourse = true
// let givesCertificate = true

// function generateCertificate() {
//     console.log("generating certificate...")
// }

// const exerciseTimeMins = 40

// const message = exerciseTimeMins < 30 ? 'You need to try harder' : exerciseTimeMins < 60 ? 'Doing good!' : 'Excellent!'
// console.log(message)

// const playerGuess = 3
// const correctAnswer = 6

// const message = playerGuess === correctAnswer ? 'Correct!' : playerGuess < correctAnswer ? 'Higher' : 'Lower'
// console.log(message)

/*
Precios:
Cafe $2
Sandwiches $5
Ensalada $4
Tarta de limon $3
*/

function selectItem(item) {

    let price = 0

    switch(item) {

        case 'Cafe':
            price = 2
        case 'Sandwich':
            price = 5
        case 'Ensalada':
            price = 4
        break
    }
    return `Has seleccionado ${item}. Serían $${price} porfavor`
}

console.log(selectItem('Sandwich'))