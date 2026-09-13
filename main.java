import builders.LogReportBuilder;
import builders.BudgetReportBuilder;
import reports.LogReport;
import reports.BudgetReport;
import director.Director;

public class Main {
	public static void main (String[] args) {
		Director director = new Director();
		
		LogReportBuilder log_builder = new LogReportBuilder();
		LogReport log = director.constructLogReport(log_builder);
		System.out.println(log);
		
		BudgetReportBuilder budget_builder = new BudgetReportBuilder();
		BudgetReport budget = director.constructBudgetReport(budget_builder);
		System.out.println(budget);
	}
}

