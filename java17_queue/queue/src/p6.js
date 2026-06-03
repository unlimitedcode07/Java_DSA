
// this is js implimentation

/**
// Node class
class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

// Custom Queue class
class Queue {
    constructor() {
        this.front = this.rear = null;
        this.size = 0;
    }

    isEmpty() { return this.front === null; }

    enqueue(data) {
        const node = new Node(data);
        if (this.isEmpty()) {
            this.front = this.rear = node;
        } else {
            this.rear.next = node;
            this.rear = node;
        }
        this.size++;
    }

    dequeue() {
        if (this.isEmpty()) return null;
        this.front = this.front.next;
        if (!this.front) this.rear = null;
        this.size--;
    }

    peek() { return this.front ? this.front.data : null; }

    len() { return this.size; }
}
*/