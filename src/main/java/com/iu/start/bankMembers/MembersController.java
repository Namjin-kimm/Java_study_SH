package com.iu.start.bankMembers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member/*")
public class MembersController {
	
	@Autowired
	private BankMembersDAO bankMembersDAO;
	@Autowired
	private BankMembersService bankMembersService;
	
	
	@RequestMapping(value="logout.iu", method=RequestMethod.GET)
	public String logout(HttpSession session)throws Exception{
		System.out.println("GET 로그아웃");
		session.invalidate();
		return "redirect../";
	}
	
	@RequestMapping(value="login.iu", method=RequestMethod.GET)
	public String login() {
		System.out.println("GET 로그인 실행");
		return "member/login";
	}
	
	@RequestMapping(value="login.iu", method=RequestMethod.POST)
	public String login(HttpServletRequest request, BankMembersDTO bankMembersDTO) throws Exception {
		System.out.println("DB 로그인 실행");
		bankMembersDTO = bankMembersDAO.getLogin(bankMembersDTO);
		HttpSession session = request.getSession();
		session.setAttribute("login", bankMembersDTO);
		return "redirect../";
	}
	
}
