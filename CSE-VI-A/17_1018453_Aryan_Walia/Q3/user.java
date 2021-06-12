package Validate;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class user extends ActionSupport{
	private String name;
	private String pass;
	public String execute() {
		return "success";
	}
	public void validate() {
		if(name==null || name.trim().equals("")) {
			addFieldError("name","Enter a username");
		}
		if(pass==null || pass.length()==0){
			addFieldError("pass","Enter password");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setAge(String pass) {
		this.pass = pass;
	}
}
	