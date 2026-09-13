public class logReportBuilder implements builder {
	private int id;
	private String name;
	private String date;
	private String title;
	private String content;
	
	@Override
	public void setId(int id) {this.id = id}
	
	@Override
	public void setName(String name) {this.name = name}
	
	@Override
	public void setDate(String date) {this.date = date}
	
	@Override
	public void setTitle(String title) {this.title = title}
	
	@Override
	public void setContent(String content) {this.content = content}
	
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
