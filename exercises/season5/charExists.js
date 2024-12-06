function charExists(str, char) {
    if(str.indexOf(char) != -1){
        return true;
    }
    return false;
}

console.log(charExists("Code For All_", "A"));
console.log(charExists("Code For All_", "K"));