package com.revature.synchronization;

class HundredsTable extends Thread{
    Table t;
    HundredsTable(Table t){
    this.t=t;
    }
    public void run(){
    t.printTable(100);
    }
    }


