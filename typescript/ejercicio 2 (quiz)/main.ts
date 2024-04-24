const questions: { question: string, options: string[], correctOptionIndex: number }[] = [
  { question: "¿Cuál es la capital de Francia?", options: ["Londres", "París", "Madrid", "Berlín"], correctOptionIndex: 1 },
  { question: "¿Cuál es el río más largo del mundo?", options: ["Amazonas", "Nilo", "Misisipi", "Yangtsé"], correctOptionIndex: 0 },
  { question: "¿Quién escribió 'Don Quijote de la Mancha'?", options: ["Miguel de Cervantes", "Gabriel García Márquez", "Federico García Lorca", "Pablo Neruda"], correctOptionIndex: 0 },
  { question: "¿Cuál es el elemento más abundante en la corteza terrestre?", options: ["Hierro", "Aluminio", "Oxígeno", "Silicio"], correctOptionIndex: 3 },
  { question: "¿Cuál es la montaña más alta del mundo?", options: ["Monte Everest", "Monte Kilimanjaro", "Monte Aconcagua", "Monte K2"], correctOptionIndex: 0 },
  { question: "¿Cuál es el animal más grande del mundo?", options: ["Elefante", "Ballena azul", "Jirafa", "Tiburón ballena"], correctOptionIndex: 1 },
  { question: "¿Cuál es el planeta más grande del sistema solar?", options: ["Júpiter", "Saturno", "Urano", "Neptuno"], correctOptionIndex: 0 },
  { question: "¿Quién pintó la Mona Lisa?", options: ["Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Michelangelo"], correctOptionIndex: 0 },
  { question: "¿Cuál es el metal más caro del mundo?", options: ["Platino", "Oro", "Rodio", "Iridio"], correctOptionIndex: 2 },
  { question: "¿Cuál es la moneda oficial de Japón?", options: ["Yuan", "Yen", "Dólar", "Euro"], correctOptionIndex: 1 }
];
const correct = document.getElementById("container-correct")
const incorrect = document.getElementById("container-incorrect")
const questionElement = document.getElementById('question');
const optionsElement = document.getElementById('options');
const timerElement = document.getElementById('timer');
const scoreElement = document.getElementById('score');
const options = document.getElementById('options')!.children;

let currentQuestionIndex = 0;
let correctAnswers = 0;
let incorrectAnswers = 0;
let timer: number;

function displayQuestion() {


  const currentQuestion = questions[currentQuestionIndex];
  questionElement!.innerText = currentQuestion.question;

  optionsElement!.innerHTML = "";
  currentQuestion.options.forEach((option, index) => {
    const button = document.createElement('button');
    button.innerText = option;
    button.onclick = () => answerQuestion(index);
    optionsElement!.appendChild(button);
  });

  startTimer(timerElement!);
  correct!.innerText= `correctas: ${correctAnswers}`;
  incorrect!.innerText = `incorrectas : ${incorrectAnswers}`;
}

function startTimer(timerElement: HTMLElement) {
  let timeLeft = 20;
  timerElement.innerText = `${timeLeft}`;

  timer = setInterval(() => {
    timeLeft--;
    timerElement.innerText = `${timeLeft}`;

    if (timeLeft === 0) {
      clearInterval(timer);
      answerQuestion(-1); // Time's up, answer as incorrect
    }
  }, 1000);
}

function answerQuestion(selectedOptionIndex: number) {
  clearInterval(timer);

  const currentQuestion = questions[currentQuestionIndex];
  const correctOptionIndex = currentQuestion.correctOptionIndex;


  if (selectedOptionIndex === correctOptionIndex) {
    options[correctOptionIndex].classList.add('correct');
    correctAnswers++;
  } else if (selectedOptionIndex !== -1) {
    options[selectedOptionIndex].classList.add('incorrect');
    options[correctOptionIndex].classList.add('correct');
    incorrectAnswers++;
  } else {
    options[correctOptionIndex].classList.add('correct');
    incorrectAnswers++;
  }

  setTimeout(() => {
    resetOptions(options);
    currentQuestionIndex++;
    if (currentQuestionIndex < questions.length) {
      displayQuestion();
    } else {
      displayScore();
    }
  }, 2000);
}

function resetOptions(options: HTMLCollection) {
  for (let i = 0; i < options.length; i++) {
    options[i].classList.remove('correct', 'incorrect');
  }
}

function displayScore() {
  questionElement!.innerText = "Quiz completado";
  optionsElement!.innerHTML = "";
  timerElement!.innerText = "";
  correct!.innerText= `correctas: ${correctAnswers}`;
  incorrect!.innerText = `incorrectas : ${incorrectAnswers}`;
}

// Iniciar el quiz
displayQuestion();
