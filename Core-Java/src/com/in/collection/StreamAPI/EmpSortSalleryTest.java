package com.in.collection.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpSortSalleryTest {
	
	
	public static void main(String[] args) {
		
		List<EmpSortSallery>list = new ArrayList<EmpSortSallery>();
		list.add(new EmpSortSallery("roit", 78000));
		list.add(new EmpSortSallery("sagar", 67000));
		list.add(new EmpSortSallery("golu", 1400));
		
        List<EmpSortSallery>  list2= list.stream().sorted(Comparator.comparingDouble(EmpSortSallery::getSallery))
              .collect(Collectors.toCollection(ArrayList::new));
    
    
        
          list2.forEach(e -> System.out.println(e.getName() + " " + e.getSallery()));    
              
	} 

}
