package director;

import reports.LogReport;
import reports.BudgetReport;
import builders.LogReportBuilder;
import builders.BudgetReportBuilder;

public class Director {
	public LogReport constructLogReport(LogReportBuilder builder) {
		builder.setId(133);
		builder.setName("David");
		builder.setDate("31/01/2025");
		builder.setTitle("Log of all reports sent this month");
		builder.setContent("125 - 01/01/2025");
		return builder.build();
	}
	
	public BudgetReport constructBudgetReport(BudgetReportBuilder builder) {
		builder.setId(125);
		builder.setName("Ryan");
		builder.setDate("01/01/2025");
		builder.setTitle("Monthly budget report");
		builder.setContent("This month's budget increased 13% compared to the last month.");
		return builder.build();
	}
}
