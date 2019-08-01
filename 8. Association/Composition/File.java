package Composition;

public class File {
	public String Title;
	public String Type;
	public String Size;
	
	public File(String title, String type, String sz)
	{
		this.Title = title;
		this.Type = Title;
		this.Size = sz;
		
	}
	
	public void play(){
		System.out.println("File is Created");
	}

	
}
