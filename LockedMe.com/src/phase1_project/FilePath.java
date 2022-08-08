package phase1_project;

public class FilePath {
	
private String path;

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}
public FilePath() {
	super();
}

public FilePath(String path) {
	super();
	this.path = path;
}
@Override
public String toString() {                  
	return "FilePath [path=" + path + "]";
}
}
