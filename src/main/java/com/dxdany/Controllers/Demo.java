package com.dxdany.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	@GetMapping("/")
	public String Portada()
	{
		return "Portada";
		}
}
