package vrs.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.integration.junit4.JMockit;
import vrs.model.VRView;
import vrs.util.VRSUtils;

@RunWith(JMockit.class)
public class TestUtils {

	@Test
	public void testConstructingVRView() {
		String appendData = "12_16_02,0,1.3,-1.5,-0.0183247,0.005234575,9.593945E-05,0.9998184,20.02101";
		VRView vv = VRSUtils.constructVRView(appendData);
		assertTrue(vv != null);
		assertTrue(vv.getPos() != null);
		assertTrue(vv.getRot() != null);
	}

}
