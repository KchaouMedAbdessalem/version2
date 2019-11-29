package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sip.ams.entities.animal;


@Controller
public class FirstController{
	
	@GetMapping("/home")
	//@ResponseBody
	public String home ()
	{
		//return " <h1> Hello Spring Boot </h1>";
		return "first/home";
	}

	@GetMapping("/acceuil")
	//@ResponseBody
	public String acceuil(@RequestParam (required=false,defaultValue ="Spring Boot") String framework,@RequestParam (required=false,defaultValue ="intermediaire") String niveau,@RequestParam (required=false,defaultValue ="1") int number,ModelMap monObj)
	
	{	
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Amine");
		names.add("Slouma");
		
	

		String ecole = "ENSI2";
		String formation = "Spring & Angular2";
		
		String ch="vous avez choisis: "+framework;
		String ch2="vous avez choisis: "+niveau;
		monObj.put("msg",ch);
		monObj.put("msg2",ch2);
		monObj.put("nbr", number);

		
		monObj.put("ec", ecole);
		monObj.put("forma", formation);
		
		
		monObj.put("names", names);
		
		
		
		ArrayList<animal> animals = new ArrayList<>();
		animals.add(new animal ("Lyon",3));
		animals.add(new animal ("Oiseau",2));
		monObj.put("animals", animals);
		
		return "first/acceuil";
	}

}
