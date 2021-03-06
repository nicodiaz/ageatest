package main.java.ar.com.nicodp.ageatest.action;

import java.util.List;

import main.java.ar.com.nicodp.ageatest.bean.System;
import main.java.ar.com.nicodp.ageatest.service.SystemService;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * Main Action 
 * 
 * @author  Nicolás Díaz País <nico@diazpais.com.ar>
 * @package main.java.ar.com.nicodp.ageatest.action
 * @license https://raw.githubusercontent.com/nicodiaz/ageatest/master/LICENSE
 */
public class SystemsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SystemService systemService;

	private List<System> systems;

	@Override
	public String execute() throws Exception {

		setSystems(systemService.getAll());

		return SUCCESS;
	}

	public void setSystemService(SystemService systemService) {
		this.systemService = systemService;
	}

	public List<System> getSystems() {
		return systems;
	}

	public void setSystems(List<System> systems) {
		this.systems = systems;
	}

}
