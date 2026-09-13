public class ReportDirector {
	public Report construct(ReportBuilder builder) {
		builder.setId(10);
		builder.setName("David");
		builder.setTitle("Budget change of this year");
		builder.setContent("15% Increase in the last year income!");
		builder.setDate("13/01/26");
		return builder.build();
	}
}
