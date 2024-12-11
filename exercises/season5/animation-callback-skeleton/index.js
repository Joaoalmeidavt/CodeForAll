const box = document.querySelector("#box");

function move1({ target }) {
  const actualPosition = parseInt(getComputedStyle(target).left, 10) || 0; // Ensure it's a number
  if(actualPosition < 400 - 50){
    target.style.left = actualPosition + 1 + "px";
    console.log("Moving!");
  }
}

function movement1(e) {
  setInterval(() => move1(e), 10); // Fix to avoid immediate invocation
}

let bol = false;
let halt = false;
let dx = 1;

function move2({ target }) {
  const actualPosition = parseInt(getComputedStyle(target).left, 10) || 0; // Ensure it's a number
  if(!halt){
    if(!bol){
      target.style.left = actualPosition + dx + "px";
      console.log("Moving!");
      if(actualPosition > 400 - 50){
        bol = true;
        dx = -1;
        console.log("switch");
      }
    } else {
      target.style.left = actualPosition + dx + "px";
      console.log("Moving!");
      if(actualPosition === 0){
        halt = true;
      }
    }
  } else {
    console.log("batata");
    clearInterval(si);
  }
}

function movement2(e) {
  si = setInterval(() => move2(e), 5); // Fix to avoid immediate invocation
}


box.addEventListener("click", (e) => {
  movement2(e);
});
