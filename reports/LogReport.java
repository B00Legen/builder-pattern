package reports;

public class LogReport extends Report {
	public LogReport(int id, String name, String date, String title, String content) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.title = title;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "LogReport{" +
				"id=" + id +
				", name=" + name +
				", date=" + date +
				", title=" + title +
				", content=" + content +
				"}";
	}
}
