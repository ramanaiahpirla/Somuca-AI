package org.somuca.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MLPSOLUTION")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MLPSolution{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

}
