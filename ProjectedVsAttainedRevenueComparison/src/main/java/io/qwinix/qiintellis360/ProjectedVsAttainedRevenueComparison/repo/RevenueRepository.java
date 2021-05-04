package io.qwinix.qiintellis360.ProjectedVsAttainedRevenueComparison.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.qwinix.qiintellis360.ProjectedVsAttainedRevenueComparison.model.Revenue;

public interface RevenueRepository extends JpaRepository<Revenue, Integer> {
	
	Revenue findByYear(String year); 

}
