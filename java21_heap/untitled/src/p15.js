class minheap{
  constructor(val){
    if(val == null){
        this.arr = [-Infinity];
        this.length = 0;
    }else{
       this.arr = [-Infinity,val];
       this.length = 1;
    }
  }

  add(val){
    this.arr.push(val);
    this.length++;
    let i = this.length;
    while(true){
      let kp = Math.floor((i)/2)
      if(this.arr[kp]>this.arr[i]){
       let temp =  this.arr[kp];
       this.arr[kp] = this.arr[i]
       this.arr[i] = temp;
       i = kp;
      }else{
        break;
      }
    }
    
  }

  size(){
    return this.length;
  }

  above(){
    console.log(this.arr[1]);
  }

  barkhast(){
     if (this.length == 0) {
    return "empty heap";
    }
   let temp = this.arr[1];
    if (this.length == 1) {
    let temp = this.arr.pop();
    this.length--;
    return temp;
    }
    this.arr[1] = this.arr[this.length];
    this.arr.pop();
    this.length--;
    let i = 1;
    while(true){  
      if(((i*2)+1) <=this.length){
        if(this.arr[(i*2)]> this.arr[i] && this.arr[(i*2)+1] >this.arr[i]){
          break;
        }else if(this.arr[(i*2)] < this.arr[i] && this.arr[(i*2)+1] < this.arr[i]){
          if(this.arr[(i*2)]>this.arr[(i*2)+1]){
            let kp = this.arr[i];
            this.arr[i] = this.arr[(i*2)+1]
            this.arr[(i*2)+1] = kp;
            i = (i*2)+1
          }else{
            let kp = this.arr[i];
            this.arr[i] = this.arr[(i*2)]
            this.arr[(i*2)] = kp;
            i = (i*2);
          }
        }else{
          if(this.arr[(i*2)]< this.arr[i] || this.arr[(i*2)+1] <this.arr[i]){
             if(this.arr[i]>this.arr[(i*2)+1]){
            let kp = this.arr[i];
            this.arr[i] = this.arr[(i*2)+1]
            this.arr[(i*2)+1] = kp;
            i = (i*2)+1
            }else{
            let kp = this.arr[i];
            this.arr[i] = this.arr[(i*2)]
            this.arr[(i*2)] = kp;
            i = (i*2);
            }
          }
        }
      }else if((i*2) <=this.length){
        ///
        if(this.arr[(i*2)]> this.arr[i]){
          break;
        }else if(this.arr[(i*2)] < this.arr[i]){
            let kp = this.arr[i];
            this.arr[i] = this.arr[(i*2)]
            this.arr[(i*2)] = kp;
            i = (i*2);
        }
      }else{
        break;
      }
    }
    return temp;
  }

  show(){
    console.log(this.arr.slice(1));
  }

  level(){
   console.log(Math.floor(Math.log2(this.length)))
  }
}

let op = new minheap();

op.add(3)
op.add(4)
op.add(2)
op.add(1)
op.add(8)
op.add(10)
op.add(15)
op.add(16)
op.add(17)
op.add(6)
op.show()
op.barkhast()
op.barkhast()
console.log(op);


