package com.revature.synchronization;

	class FivesTable extends Thread{
	    Table t;
	    FivesTable(Table t){
	    this.t=t;
	    }
	    public void run(){
	    t.printTable(5);
	    }
	     
	    }


