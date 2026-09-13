public abstract class Builder {
	protected int id;
	protected String name;
	protected String date;
	protected String title;
	protected String content;
	
	public void setId(int id) {this.id = id;}
	
	public void setName(String name) {this.name = name;}
	
	public void setDate(String date) {this.date = date;}
	
	public void setTitle(String title) {this.title = title;}
	
	public void setContent(String content) {this.content = content;}
}
