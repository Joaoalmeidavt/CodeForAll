let player1Score = 0;  
let player2Score = 0;  

function play(){
    const plays = ["rock", "paper", "scissors"];
    return plays[Math.floor(Math.random() * 3)];
}

function getImageForPlay(play) {
    switch (play) {
        case "rock":
            return "assets/rock.png";
        case "paper":
            return "assets/paper.png";
        case "scissors":
            return "assets/scissors.png";
        default:
            return "";
    }
}

function updateScore(result) {
    if (result === "left") {
        player1Score++;  
    } else if (result === "right") {
        player2Score++;  
    }
}

function determineWinner(leftPlay, rightPlay) {
    if (leftPlay === rightPlay) {
        return "tie";  
    }
    if (
        (leftPlay === "rock" && rightPlay === "scissors") ||
        (leftPlay === "paper" && rightPlay === "rock") ||
        (leftPlay === "scissors" && rightPlay === "paper")
    ) {
        return "left";  
    } else {
        return "right";  
    }
}

function handleClick(event){

    const leftPlay = play();
    const rightPlay = play();

    document.getElementById("player1").src = getImageForPlay(leftPlay);
    document.getElementById("player2").src = getImageForPlay(rightPlay);

    const result = determineWinner(leftPlay, rightPlay);
    updateScore(result);

    document.getElementById("left-text").textContent = `Score : ${player1Score}`;
    document.getElementById("right-text").textContent = `Score : ${player2Score}`;
}

window.addEventListener("load", () => {
    const button = document.querySelector(".button-container button");
    button.addEventListener("click", handleClick);
})
