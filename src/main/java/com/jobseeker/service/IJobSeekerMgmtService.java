package com.jobseeker.service;



import java.util.List;
import java.util.Optional;

import com.jobseeker.entity.JobSeeker;

public interface IJobSeekerMgmtService {
	
	public   String    removeJobSeekersByIds(List<Integer> ids);
	public  List<JobSeeker>  searchJobSeekersByExampleData(JobSeeker js, boolean ascORder , String ...properties );
	public  Optional<JobSeeker>  getJSById(int id);
	
	public   JobSeeker  findJsById(int id);
	
}
