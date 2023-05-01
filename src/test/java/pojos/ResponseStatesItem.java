package pojos;

public class ResponseStatesItem{
	private Object tpcountry;
	private String name;
	private int id;

	public ResponseStatesItem() {
	}

	public ResponseStatesItem(int id,String name,Object tpcountry) {
		this.tpcountry = tpcountry;
		this.name = name;
		this.id = id;
	}

	public void setTpcountry(Object tpcountry){
		this.tpcountry = tpcountry;
	}

	public Object getTpcountry(){
		return tpcountry;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"ResponseStatesItem{" + 
			"tpcountry = '" + tpcountry + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
