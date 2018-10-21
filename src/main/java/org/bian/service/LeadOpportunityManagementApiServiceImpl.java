/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class LeadOpportunityManagementApiServiceImpl implements LeadOpportunityManagementApiService {

	public CaptureBaseWithStatusAndIds executePostCaptures(String crReferenceId, CaptureBase request){
		return JsonReader.read("executePost-CaptureBaseWithStatusAndIds.json",new TypeReference<CaptureBaseWithStatusAndIds>(){});
	}
	
	public CaptureBaseWithStatusAndIds executePutCaptures(String crReferenceId, String bqReferenceId, CaptureBaseWithStatus request){
		return JsonReader.read("executePut-CaptureBaseWithStatusAndIds.json",new TypeReference<CaptureBaseWithStatusAndIds>(){});
	}
	
	public AssignmentWithStatusAndIds requestPutAssignments(String crReferenceId, String bqReferenceId, AssignmentWithStatus request){
		return JsonReader.read("requestPut-AssignmentWithStatusAndIds.json",new TypeReference<AssignmentWithStatusAndIds>(){});
	}
	
	public DevelopmentRecordWithIds recordDevelopments(String crReferenceId, String bqReferenceId, Development request){
		return JsonReader.read("record-DevelopmentRecordWithIds.json",new TypeReference<DevelopmentRecordWithIds>(){});
	}
	
	public AssignmentWithStatusAndIds requestPostAssignments(String crReferenceId, Assignment request){
		return JsonReader.read("requestPost-AssignmentWithStatusAndIds.json",new TypeReference<AssignmentWithStatusAndIds>(){});
	}
	
	public CaptureBaseWithStatusAndIds requestPostCaptures(String crReferenceId, CaptureBase request){
		return JsonReader.read("requestPost-CaptureBaseWithStatusAndIds.json",new TypeReference<CaptureBaseWithStatusAndIds>(){});
	}
	
	public CaptureBaseWithStatusAndIds requestPutCaptures(String crReferenceId, String bqReferenceId, CaptureBaseWithStatus request){
		return JsonReader.read("requestPut-CaptureBaseWithStatusAndIds.json",new TypeReference<CaptureBaseWithStatusAndIds>(){});
	}
	
	public AssignmentWithStatusAndIds retrieveAssignments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AssignmentWithStatusAndIds.json",new TypeReference<AssignmentWithStatusAndIds>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CaptureBaseWithStatusAndIds retrieveCaptures(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CaptureBaseWithStatusAndIds.json",new TypeReference<CaptureBaseWithStatusAndIds>(){});
	}
	
	public DevelopmentWithIds retrieveDevelopments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DevelopmentWithIds.json",new TypeReference<DevelopmentWithIds>(){});
	}
	
	public LeadOpportunityWithIds retrieve(String crReferenceId){
		return JsonReader.read("retrieve-LeadOpportunityWithIds.json",new TypeReference<LeadOpportunityWithIds>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ReportingWithIds retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReportingWithIds.json",new TypeReference<ReportingWithIds>(){});
	}
	
	public UpdateWithIds retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-UpdateWithIds.json",new TypeReference<UpdateWithIds>(){});
	}
	
	public UpdateWithIds update(String crReferenceId, Update request){
		return JsonReader.read("update-UpdateWithIds.json",new TypeReference<UpdateWithIds>(){});
	}
	
}
