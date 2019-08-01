package Composition;

public class Folder {
	public String Title;
	public String Directory;
	
	public File aFile;
	
	public Folder(String t, String s)
	{
		this.Title = t;
		this.Directory = s;
		aFile = new File("New", "txt", "123");
		aFile.play();
	}
	
	
	
}
