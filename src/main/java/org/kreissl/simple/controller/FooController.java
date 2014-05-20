package org.kreissl.simple.controller;

import static org.springframework.http.MediaType.TEXT_HTML_VALUE;
import static org.kreissl.simple.controller.View.FOO_URI;
import static org.kreissl.simple.controller.View.FOO_VALUE;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FooController {

	@RequestMapping(value=FOO_URI, produces=TEXT_HTML_VALUE)
	public String foo(){
		return FOO_VALUE;
	}
}
