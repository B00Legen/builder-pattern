public class logReport {
	private final int id;
	private final String name;
	private final String date;
	private final String title;
	private final String content;
	
	public logReport(int id, String name, String date, String title, String content) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.title = title;
		this.content = content;
	}
	
	public int getId() {return id;}
	
	public String getName() {return name;}
	
	public String getDate() {return date;}
	
	public String getTitle() {return title;}
	
	public String getContent() {return content;}
}
