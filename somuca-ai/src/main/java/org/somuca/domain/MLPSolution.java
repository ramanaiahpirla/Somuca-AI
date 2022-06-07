package org.somuca.domain;

import java.io.Serializable;
import java.time.Instant;

public class MLPSolution implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9037773609988187817L;

	private String solutionId;

	private String userId;

	private String name;

	private String metadata;

	private boolean active;

	private String toolkitTypeCode;

	private Long viewCount = 0L;

	private Long downloadCount = 0L;

	private Instant lastDownload;

	public String getSolutionId() {
		return solutionId;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getToolkitTypeCode() {
		return toolkitTypeCode;
	}

	public void setToolkitTypeCode(String toolkitTypeCode) {
		this.toolkitTypeCode = toolkitTypeCode;
	}

	public Long getViewCount() {
		return viewCount;
	}

	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}

	public Long getDownloadCount() {
		return downloadCount;
	}

	public void setDownloadCount(Long downloadCount) {
		this.downloadCount = downloadCount;
	}

	public Instant getLastDownload() {
		return lastDownload;
	}

	public void setLastDownload(Instant lastDownload) {
		this.lastDownload = lastDownload;
	}

}
