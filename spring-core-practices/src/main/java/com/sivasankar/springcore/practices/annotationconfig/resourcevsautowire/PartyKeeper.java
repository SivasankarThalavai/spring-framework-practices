package com.sivasankar.springcore.practices.annotationconfig.resourcevsautowire;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class PartyKeeper {

	// Scenario 1 : Inject using Interface type – Using @Resource or @Inject or

	// @Autowired ---------------------- none of this will work

//	@Resource
//	private Party party;

//	@inject
//	private Party party;

//	@Autowired
//	private Party party;
//
//	public Party getParty() {
//		return party;
//	}

	@Resource
	private Organization organization;

	// @Inject
	// private Organization organization;
	//
	// @Autowired
	// private Organization organization;

	public Party getParty() {
		return organization;
	}
}
