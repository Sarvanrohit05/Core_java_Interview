package com.in.collection.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestWinner {
	
	
	public static void main(String[] args) {
   
    List<ContestWinner>list = new ArrayList();
    list.add(new ContestWinner("rohit", "7067377905"));
    list.add(new ContestWinner("sintu", "7067377944"));
    list.add(new ContestWinner("sanjay", "7067377905"));
    
    list.add(new ContestWinner("simran", "7067377905"));
    list.add(new ContestWinner("monty", "70675426677"));
    list.add(new ContestWinner("titu", "706754264545"));
    list.add(new ContestWinner("golu", "45566767322"));
    list.add(new ContestWinner("sagar", "45566767322"));
    list.add(new ContestWinner("golu", "4556676732566"));
    
    list.stream().map(e-> e.getName() + " " + e.getPhoneNo()).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), c ->{
    	Collections.shuffle(c);
    	
    	return c.stream();
    })).limit(2).forEach(c ->
    System.out.println(c)); 
    
    
    /**
	 * /**
	 * l.stream()
👉 List l ko stream mein convert kar diya.

.map(e -> e.getName() + " " + e.getPhoneNo())
👉 Har element e (maan lo ek object hai) se ek String bana raha hai:
"Name PhoneNo" format mein.
Example: "Rajput 9876543210"

.distinct()
👉 Agar same name-phone ke duplicate values hain, unko remove kar dega.
Sirf unique strings bachegi.

.collect(Collectors.collectingAndThen(Collectors.toList(), c -> {...}))
👉 Pehle saare unique strings ko ek List (c) mein collect karega.
Phir collectingAndThen ka second part chalega (jo c -> {...} hai).

Collections.shuffle(c);
👉 Ye list c ko random order mein shuffle kar deta hai (random permutation).

return c.stream();
👉 Shuffle hone ke baad list ko wapas stream mein convert kar diya.

.limit(2)
👉 Ab us shuffled stream me se sirf 2 random elements pick karega.

.forEach(c -> ...)
👉 Finally, un 2 random elements par koi kaam kar raha hai (jo ... part mein aap likhoge, jaise print karna).
	 */
	 
    
    
    
	}

}
