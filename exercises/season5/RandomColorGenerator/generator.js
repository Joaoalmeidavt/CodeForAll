function getRandomColor() {
    const letters = "0123456789ABCDEF";
    let color = "#";
    for (let i = 0; i < 6; i++) {
        color += letters[Math.floor(Math.random() * 16)];
    }
    return color;
}

for (let i = 1; i <= 5; i++) {
    const col = document.getElementById(`col${i}`);
    const color = getRandomColor();
    col.style.backgroundColor = color;
    
    const text = document.getElementById(`text${i}`);
    text.textContent = color; 
}

function handleClick(event){
    for (let i = 1; i <= 5; i++) {
        const col = document.getElementById(`col${i}`);
        const color = getRandomColor();
        col.style.backgroundColor = color;
        
        const text = document.getElementById(`text${i}`);
        text.textContent = color; 
    }
}

const button = document.getElementById("button");
button.addEventListener("click", handleClick);