public class Counter {
    int count; 
// Since the two threads are already started their exicution and are accessing 
// and incrementing the same resource the count value will be incorrect.
// therefore we have to SYNCHRONIZE the resource inorder not to corrupt data.
  
    public synchronized void increment(){
        count++;  // count = count + 1; here this is not simple statement, thus for example if both t1 and t2 are reading count one after the other and #eg:600, then after they both increment the value by one 
                    // since they have read the same value the value of count will be 601 instead of 602. this create inclnsistency of data, so we have to synchronise the resource (the increment method) using SYNCHRONIZED  keyword.
    }
}
