package main.java.ar.com.nicodp.ageatest.action;

import main.java.ar.com.nicodp.ageatest.bean.System;
import main.java.ar.com.nicodp.ageatest.service.SystemService;

import com.opensymphony.xwork2.ActionSupport;

public class XMLAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SystemService systemService;

	private System selected;

	@Override
	public String execute() throws Exception {

		// FIXME: Get the param from request
		selected = systemService.get(2);
		
		return SUCCESS;
	}

	public void setSystemService(SystemService systemService) {
		this.systemService = systemService;
	}

	public System getSelected() {
		return selected;
	}

	public void setSelected(System selected) {
		this.selected = selected;
	}


}
