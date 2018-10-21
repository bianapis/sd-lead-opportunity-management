/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface LeadOpportunityManagementApiService {

	CaptureBaseWithStatusAndIds executePostCaptures(String crReferenceId, CaptureBase request);
	
	CaptureBaseWithStatusAndIds executePutCaptures(String crReferenceId, String bqReferenceId, CaptureBaseWithStatus request);
	
	AssignmentWithStatusAndIds requestPutAssignments(String crReferenceId, String bqReferenceId, AssignmentWithStatus request);
	
	DevelopmentRecordWithIds recordDevelopments(String crReferenceId, String bqReferenceId, Development request);
	
	AssignmentWithStatusAndIds requestPostAssignments(String crReferenceId, Assignment request);
	
	CaptureBaseWithStatusAndIds requestPostCaptures(String crReferenceId, CaptureBase request);
	
	CaptureBaseWithStatusAndIds requestPutCaptures(String crReferenceId, String bqReferenceId, CaptureBaseWithStatus request);
	
	AssignmentWithStatusAndIds retrieveAssignments(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	CaptureBaseWithStatusAndIds retrieveCaptures(String crReferenceId, String bqReferenceId);
	
	DevelopmentWithIds retrieveDevelopments(String crReferenceId, String bqReferenceId);
	
	LeadOpportunityWithIds retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	ReportingWithIds retrieveReportings(String crReferenceId, String bqReferenceId);
	
	UpdateWithIds retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	UpdateWithIds update(String crReferenceId, Update request);
	
}
