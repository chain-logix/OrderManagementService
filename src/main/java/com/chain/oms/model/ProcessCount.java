package com.chain.oms.model;

public class ProcessCount {

	
	

	@Override
	public String toString() {
		return "ProcessCount [processName=" + processName + ", processIdCount=" + processIdCount + ", workFlowId="
				+ workFlowId + "]";
	}

	public ProcessCount(String processName, Integer processIdCount, String workFlowId) {
		super();
		this.processName = processName;
		this.processIdCount = processIdCount;
		this.workFlowId = workFlowId;
	}

	public String getWorkFlowId() {
		return workFlowId;
	}

	public void setWorkFlowId(String workFlowId) {
		this.workFlowId = workFlowId;
	}

	private String  processName;

	private Integer processIdCount;
	
	private String workFlowId;

	public ProcessCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public Integer getProcessIdCount() {
		return processIdCount;
	}

	public void setProcessIdCount(Integer processIdCount) {
		this.processIdCount = processIdCount;
	}

	
	



	
}
