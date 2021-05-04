package io.qwinix.qiintellis360.ProjectedVsAttainedRevenueComparison.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.qwinix.qiintellis360.ProjectedVsAttainedRevenueComparison.model.Revenue;
import io.qwinix.qiintellis360.ProjectedVsAttainedRevenueComparison.service.RevenueService;

@Service
public class RevenueServiceImpl implements RevenueService {

	@Autowired
	private RevenueRepository revenueRepo;

	@Override
	public List<Revenue> findAll() {
		return revenueRepo.findAll();
	}

	@Override
	public Revenue findByYear(String year) {
		Revenue response = revenueRepo.findByYear(year);
		if (response == null) {
			throw new RuntimeException("Not Found for Year: " + year);
		}
		return response;
	}

}
