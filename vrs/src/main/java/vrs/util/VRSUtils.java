package vrs.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import vrs.model.Position;
import vrs.model.Rotation;
import vrs.model.VRView;

public class VRSUtils {

	private static Logger logger = Logger.getLogger(VRSUtils.class);

	public static String getClientIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	public static VRView constructVRView(String appendedString) {
		try {
			String[] data = appendedString.split(",");
			VRView retval = new VRView();
			Position p = new Position();
			p.setPx(Double.parseDouble(data[1]));
			p.setPy(Double.parseDouble(data[2]));
			p.setPz(Double.parseDouble(data[3]));
			Rotation rot = new Rotation();
			rot.setRx(Double.parseDouble(data[4]));
			rot.setRy(Double.parseDouble(data[5]));
			rot.setRz(Double.parseDouble(data[6]));
			rot.setRw(Double.parseDouble(data[7]));
			retval.setPos(p);
			retval.setRot(rot);
			retval.setId(data[0]);
			retval.setTime(Double.parseDouble(data[8]));
			return retval;

		} catch (Throwable t) {
			logger.error("Failed to construct model", t);
			return null;
		}
	}

}
