class Solution {
    rearrangeQueue(q) {

        let stack = [];
        let half = q.len() / 2;

        // push first half into stack
        for(let i = 0; i < half; i++){
            stack.push(q.peek());
            q.dequeue();
        }

        // enqueue stack back
        while(stack.length > 0){
            q.enqueue(stack.pop());
        }

        // move first half to back
        for(let i = 0; i < half; i++){
            q.enqueue(q.peek());
            q.dequeue();
        }

        // again push first half into stack
        for(let i = 0; i < half; i++){
            stack.push(q.peek());
            q.dequeue();
        }

        // interleave
        while(stack.length > 0){

            q.enqueue(stack.pop());

            q.enqueue(q.peek());
            q.dequeue();
        }
    }
}