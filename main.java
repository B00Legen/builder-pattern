public class Main {
	
	public static void main (String[] args) {
		ReportDirector director = new ReportDirector();
		ReportBuilder builder = new BudgetReportBuilder();
		Report report = director.construct(builder);
		System.out.println(report)
	}
}

