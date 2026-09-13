public interface ReportBuilder {
	void setId(int id);
	void setName(String name);
	void setTitle(String title);
	void setContent(String content);
	void setDate(String date);
	Report build();
}
