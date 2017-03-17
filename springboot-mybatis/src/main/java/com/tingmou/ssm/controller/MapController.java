package com.tingmou.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/maps")
public class MapController {
	@RequestMapping()
	public String index() {

		return "maps/index";
	}
}
