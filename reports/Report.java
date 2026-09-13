package reports;

public abstract class Report {
	protected int id;
	protected String name;
	protected String date;
	protected String title;
	protected String content;
	
	public int getId() {return id;}
	
	public String getName() {return name;}
	
	public String getDate() {return date;}
	
	public String getTitle() {return title;}
	
	public String getContent() {return content;}
	
	public String toString() {
		return "Report{" +
				"id=" + id +
				", name=" + name +
				", date=" + date +
				", title=" + title +
				", content=" + content +
				"}";
	}
}
