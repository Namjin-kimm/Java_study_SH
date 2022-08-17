package com.iu.start.bankbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping(value = "delete", method = Requestmethod)
	
	

}
