package vrs.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vrs.util.VRSUtils;

@Controller
public class HomeController {

	private Logger logger = Logger.getLogger(getClass());

	// test
	@RequestMapping(value = "/homepage")
	@ResponseBody
	public Object showHome(HttpServletRequest request, HttpServletResponse response) {
		// ModelAndView mav = new ModelAndView("home");
		logger.info("Received request from:" + VRSUtils.getClientIpAddr(request));

		// return mav;
		return UUID.randomUUID().toString();
	}

}
