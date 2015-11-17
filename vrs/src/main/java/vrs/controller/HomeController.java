package vrs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vrs.util.VRSUtils;

@Controller
public class HomeController {

	private Logger logger = Logger.getLogger(getClass());
	private Map<String, List<String>> dataMap = new HashMap<>();

	// test
	@RequestMapping(value = "/homepage")
	@ResponseBody
	public Object showHome(HttpServletRequest request, HttpServletResponse response) {
		// ModelAndView mav = new ModelAndView("home");
		logger.info("Received request from:" + VRSUtils.getClientIpAddr(request));

		// return mav;
		return UUID.randomUUID().toString();
	}

	@RequestMapping(value = "/trackData")
	@ResponseBody
	public Object trackData(HttpServletRequest request, HttpServletResponse response, @RequestParam String px, @RequestParam String py, @RequestParam String pz,
			@RequestParam String rw, @RequestParam String rx, @RequestParam String ry, @RequestParam String time, @RequestParam String id, @RequestParam String rz) {

		logger.info("Received request from:" + VRSUtils.getClientIpAddr(request));
		StringBuilder sb = new StringBuilder();
		sb.append(id);
		sb.append("," + px);
		sb.append("," + py);
		sb.append("," + pz);
		sb.append("," + rx);
		sb.append("," + ry);
		sb.append("," + rz);
		sb.append("," + rw);
		sb.append("," + time);
		List<String> dataList = dataMap.get(id);
		if (dataList == null)
			dataList = new ArrayList<>();
		dataList.add(sb.toString());
		dataMap.put(id, dataList);
		logger.info("Received data is:" + sb.toString());
		return "OK";
	}

	@RequestMapping(value = "/getTrackData")
	@ResponseBody
	public Object getTrackData(HttpServletRequest request, HttpServletResponse response, @RequestParam String id) {
		StringBuilder sb = new StringBuilder();
		List<String> incomingData = dataMap.get(id);
		if (incomingData == null)
			return "INVALID_ID";
		for (String string : incomingData) {
			sb.append(string + ";");
		}
		logger.info("Received request from:" + VRSUtils.getClientIpAddr(request));
		logger.info("Returning data:" + sb.toString());
		return sb.toString();
	}

}
