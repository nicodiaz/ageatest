package test.java.ar.com.nicodp;


import static org.junit.Assert.*;

import java.util.List;

import main.java.ar.com.nicodp.ageatest.bean.System;
import main.java.ar.com.nicodp.ageatest.service.SystemService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * Main Test Case
 * 
 * @author  Nicolás Díaz País <nico@diazpais.com.ar>
 * @package test.java.ar.com.nicodp
 * @license https://raw.githubusercontent.com/nicodiaz/ageatest/master/LICENSE
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/applicationContextTest.xml")  
public class TestSystemService {

	@Autowired
	SystemService systemService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSystemServiceInjected() {
		assertNotNull(systemService);
	}
	
	@Test
	public void testSystemsData(){
		List<System> systems = systemService.getAll();
		
		assertTrue("La lista de sistemas es vacia", systems.size() > 0);
	}
	
	@Test
	public void testNullIndex(){
		System system = systemService.get(0);
		
		assertNull(system);
	}
	
	@Test
	public void testXMLConversion(){
		System system = systemService.get(2);
		
		assertNotNull(system);
		
		String xml = systemService.getXML(system);
		assertNotNull(xml);
		assertTrue("Formato de XML incorrecto", xml.contains("<name>"));
	}
	
	
	
	

	public SystemService getSystemService() {
		return systemService;
	}

	public void setSystemService(SystemService systemService) {
		this.systemService = systemService;
	}

}
