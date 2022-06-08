package org.somuca.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MLPSOLUTION")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class MLPSolution{

	
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "SOLUTION_ID")
	private String solutionId;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "METADATA")
	private String metadata;
	
	@Column(name = "ACTIVE_YN")
	@Type(type = "yes_no")
	private boolean active;

	@Column(name = "TOOLKITTYPE_CODE")
	private String toolkitTypeCode;
	
	@Column(name = "VIEW_COUNT")
	private Long viewCount = 0L;
	
	@Column(name = "DOWNLOAD_COUNT")
	private Long downloadCount = 0L;
	
	@Column(name = "LAST_DOWNLOAD")
	private Instant lastDownload;


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
