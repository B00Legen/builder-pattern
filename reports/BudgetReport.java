package reports;

public class BudgetReport extends Report {
	public BudgetReport(int id, String name, String date, String title, String content) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.title = title;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "BudgetReport{" +
				"id=" + id +
				", name=" + name +
				", date=" + date +
				", title=" + title +
				", content=" + content +
				"}";
	}
}
