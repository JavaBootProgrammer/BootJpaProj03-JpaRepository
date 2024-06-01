package com.jobseeker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobseeker.entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {

}
