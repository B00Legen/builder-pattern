package builders;

import reports.LogReport;

public class LogReportBuilder extends Builder {
	public LogReport build() {return new LogReport(id, name, date, title, content);}
}
