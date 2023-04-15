package com.jack.JPA_4;

import java.util.Iterator;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jack.JPA_4.model.Om_Builder;
import com.jack.JPA_4.repo.BuilderRepositry;

@SpringBootApplication
public class Study4Application {
	Om_Builder builderr= new Om_Builder();
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Study4Application.class, args);

		BuilderRepositry repositry = context.getBean(BuilderRepositry.class);
	
		
		// <<<<<<<<< here CRUD is present unconmment one by one >>>>>>>>
		
		
		
		//   Insert multiple data at a time in
		//   DB============================================>>>>>>>>
	/*	   
		   //first builder
		   
		   Om_Builder builder= new Om_Builder();
		   builder.setBuilding_no(7); builder.setCust_Name("MARVEL");
		   builder.setAmount(5004500l); builder.setRera_no(32225676342l);
		   builder.setAddress("cslifornia , USA , 4563 gmt");
		   
		   //second builder
		   Om_Builder builder2= new Om_Builder();
		   builder2.setBuilding_no(9); builder2.setCust_Name("DC");
		   builder2.setAmount(78578l); builder2.setRera_no(45686746565786l);
		   builder2.setAddress("Thane , maharashtra , 400604 WEST");
		   
		   
		   //save multiple object or data at a time using itreble
		   
		   List<Om_Builder> bl =List.of(builder,builder2);
		   
		   Iterable<Om_Builder> result =repositry.saveAll(bl);
		   
		   result.forEach(Om_Builder->{ System.out.println(Om_Builder); });
		   
		   
		   Om_Builder builder3=repositry.save(builder2);
		   
		   System.out.println("SAVED >>>>>>>>>>>>>>> "+builder3);
		*/  

		// Update the user Of id 4
		// ========================================================>>>>>>>>

		/*
		   Optional<Om_Builder> op =repositry.findById(4); Om_Builder build = op.get();
		   
		   build.setCust_Name("Tony stark Marvel"); 
		   Om_Builder blt =repositry.save(build);
		   
		   System.out.println("Updated data by id : : : >"+blt);
		   
		   
		  */ 
		

		// For get the Data
		// ========================================================>>>>>>>>

		
		  Iterable<Om_Builder> itr = repositry.findAll();
		  
		  Iterator<Om_Builder> itr2 = itr.iterator();
		  
		  
		  while(itr2.hasNext()) {
			  Om_Builder buildi =itr2.next();
			  System.out.println("All info using while : : :"+buildi);
		  }
		  
		  
		  System.out.println("\n \n\n\n");
		  
		  // All builder info : : using onsumer : >>  ==========================>>>>>>>>
		  
		  itr.forEach(new Consumer<Om_Builder>() {
		  
		  @Override public void accept(Om_Builder t) { 
		
		 System.out.println("All builder info : : using onsumer : >>" +t); 
		  }
		 
		  });
		  
		  // using Irt and for each print all data ==========================>>>>>>>>
		 
		  System.out.println("\n \n\n\n");
		  System.out.println("By using for each print all data : : : >>>>");
		 itr.forEach(builderr->{System.out.println(builderr);});
		 
		 System.out.println("\n \n\n\n");
		  
		  // for delete by id =============================================>>>>>>>>
	  /*
		  repositry.deleteById(7);
		  System.out.println("deleted");
		 */ 
		   
		// For delete the All data ===============================================>>>>>>>>
		  
			
			 
			 itr.forEach(builderr->System.out.println(builderr));
			/*  
			 repositry.deleteAll();
			 System.out.println("ALL deleted ");
        */
	}

}
