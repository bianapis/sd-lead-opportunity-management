/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class LeadOpportunityManagementApiController {

	@Autowired
	LeadOpportunityManagementApiService service;
	
	@BQ("captures")
	@Process.ExecutePost
	public BianResponse<CaptureBaseWithStatusAndIds> executePostCaptures(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostCaptures(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("captures")
	@Process.ExecutePut
	public BianResponse<CaptureBaseWithStatusAndIds> executePutCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CaptureBaseWithStatus> bianRequest) {
		return BianResponse.forSuccess(service.executePutCaptures(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignments")
	@Process.RequestPut
	public BianResponse<AssignmentWithStatusAndIds> requestPutAssignments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<AssignmentWithStatus> bianRequest) {
		return BianResponse.forSuccess(service.requestPutAssignments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("developments")
	@Process.Record
	public BianResponse<DevelopmentRecordWithIds> recordDevelopments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Development> bianRequest) {
		return BianResponse.forSuccess(service.recordDevelopments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignments")
	@Process.RequestPost
	public BianResponse<AssignmentWithStatusAndIds> requestPostAssignments(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Assignment> bianRequest) {
		return BianResponse.forSuccess(service.requestPostAssignments(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("captures")
	@Process.RequestPost
	public BianResponse<CaptureBaseWithStatusAndIds> requestPostCaptures(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostCaptures(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("captures")
	@Process.RequestPut
	public BianResponse<CaptureBaseWithStatusAndIds> requestPutCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CaptureBaseWithStatus> bianRequest) {
		return BianResponse.forSuccess(service.requestPutCaptures(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignments")
	@Process.Retrieve
	public BianResponse<AssignmentWithStatusAndIds> retrieveAssignments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssignments(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("captures")
	@Process.Retrieve
	public BianResponse<CaptureBaseWithStatusAndIds> retrieveCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCaptures(crReferenceId, bqReferenceId));
	}
	
	@BQ("developments")
	@Process.Retrieve
	public BianResponse<DevelopmentWithIds> retrieveDevelopments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDevelopments(crReferenceId, bqReferenceId));
	}
	
	@Process.Retrieve
	public BianResponse<LeadOpportunityWithIds> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reportings")
	@Process.Retrieve
	public BianResponse<ReportingWithIds> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Process.Retrieve
	public BianResponse<UpdateWithIds> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<UpdateWithIds> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Update> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
