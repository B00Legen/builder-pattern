package builders;

import reports.BudgetReport;

public class BudgetReportBuilder extends Builder {
	public BudgetReport build() {return new BudgetReport(id, name, date, title, content);}
}
