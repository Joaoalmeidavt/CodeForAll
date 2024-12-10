class Service {
    constructor(name) {
        this.name = name;
        this.objects = [];
    }

    add(element){
        this.objects.push(element);
    }

    remove(id){
        this.objects.splice(id, 1);
    }

    destroy(){
        this.objects = [];
    }

    update(id, element){
        this.objects[id] = element;
    }

    get(id){
        return this.objects[id];
    }

    list(){
        return this.objects;
    }
}

const container = new Service("MyLittleService");

console.log(container);

container.add("Johny");
container.add("Tom");
container.add("Phil");
container.add("Ed");
container.add("Colin");

console.log(container);

container.remove(3);

console.log(container);

container.destroy();

console.log(container);

container.add("Emma");
container.add("Mel");
container.add("Melanie");
container.add("Leonardo");
container.add("Geri");

console.log(container)

container.update(3, "Victoria");

console.log(container)

console.log(container.get(2));

console.log(container.list());