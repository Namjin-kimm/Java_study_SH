package com.iu.start.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	public ModelAndView list(ModelAndView mv) throws Exception{
		System.out.println("list 실행");
		List<BankBookDTO> ar = bankBookService.getList();
		mv.addObject("list", ar);
		mv.setViewName("bankbook/list");
		return mv;
	}
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public ModelAndView detail(BankBookDTO bankBookDTO) throws Exception{
		System.out.println("detail 실행");
		ModelAndView mv = new ModelAndView();
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		mv.addObject("detail", bankBookDTO);
		mv.setViewName("bankbook/detail");
		
		return mv;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public void update(BankBookDTO bankBookDTO, ModelAndView mv) throws Exception{
		System.out.println("update 실행");
		mv = new ModelAndView();
		mv.addObject("bookNum", bankBookDTO.getBookNum());
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView update(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = bankBookService.setUpdate(bankBookDTO);
		System.out.println(result);
		mv.setViewName("redirect:detail?bookNum=" + bankBookDTO.getBookNum());
		return mv;
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public ModelAndView delete(BankBookDTO bankBookDTO) throws Exception{
		System.out.println("delete 실행");
		ModelAndView mv = new ModelAndView();
		int result = bankBookService.setDelete(bankBookDTO);
		System.out.println(result);
		mv.setViewName("redirect:list");
		return mv;
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add() throws Exception{
		System.out.println("add GET 실행");
	}
	
	public ModelAndView add(BankBookDTO bankBookDTO, ModelAndView mv) throws Exception{
		System.out.println("add POST 실행");
		int result = bankBookService.setBankBook(bankBookDTO);
		System.out.println(result);
		mv.setViewName("redirect:list");
		return mv;
	}
	
	

}
