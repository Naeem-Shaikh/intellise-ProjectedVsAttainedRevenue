package io.qwinix.qiintellis360.ProjectedVsAttainedRevenueComparison.service;

import java.util.List;

import io.qwinix.qiintellis360.ProjectedVsAttainedRevenueComparison.model.Revenue;

public interface RevenueService {
	
	List<Revenue> findAll();
	
	Revenue findByYear(String year);

}
