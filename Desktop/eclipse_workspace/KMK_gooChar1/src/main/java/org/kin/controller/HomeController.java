package org.kin.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.kin.domain.searchVO;
import org.kin.proxy.timeAdvice;
import org.kin.service.chartService;
import org.kin.service.orgTblService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	orgTblService service;
	
	@Autowired
	chartService chart_service;
	
	@Autowired
	timeAdvice ta;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) throws Exception{
		logger.info("list");
		
		model.addAttribute("list",service.list());
		
		return "list";
		
	}
	
	@RequestMapping(value = "/goochar", method = RequestMethod.GET)
	public String gooChar(Model model) throws Exception{
		logger.info("gooChar In");
		
		//model.addAttribute("list",chart_service.list());
		//System.out.println("proxyTime check : " + ta.getProxyTime());
		
		searchVO vo = new searchVO();
		vo.setCDNM("");
		vo.setRollUp("all");
		vo.setRollUpOrder("F");
		vo.setGbg(33925130);
		vo.setAreaOrder_seoul(1);
		vo.setAreaOrder_busan(2);
		vo.setAreaOrder_gwangju(3);
		vo.setAreaOrder_daejeon(4);
		vo.setAreaOrder_pyeongtaek(5);
		vo.setAreaOrder_incheon(6);
		vo.setAreaOrder_asan(7);
		vo.setAreaOrder_anyang(8);
		vo.setAreaOrder_gangwon(9);
		vo.setAreaOrder_paju(10);
		
		List search = chart_service.searchList(vo);
		System.out.println("proxyTime check : " + ta.getProxyTime());
		model.addAttribute("list",search);
		model.addAttribute("proxyTime",ta.getProxyTime());
		
		return "gooCharView";
		
	}
	
	@RequestMapping(value = "/goocharView", method = RequestMethod.GET)
	public String gooChar2(Model model) throws Exception{
		logger.info("gooCharView In");
		
		return "gooCharView";
		
	}
	
}
