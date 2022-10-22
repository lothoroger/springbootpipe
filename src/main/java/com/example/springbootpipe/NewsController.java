package com.example.springbootpipe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/news")
public class NewsController {

		@GetMapping("/headline")
		@ResponseBody
		public String getLatestNews() {
				return "Australia flags new corporate penalties for privacy breaches";
		}
}
