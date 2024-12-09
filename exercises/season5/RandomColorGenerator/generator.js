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
    col.style.backgroundColor = getRandomColor();
}
