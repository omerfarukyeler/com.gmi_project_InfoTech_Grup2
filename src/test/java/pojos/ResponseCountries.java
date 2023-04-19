package pojos;

public class ResponseCountries {
	private String name;

	public ResponseCountries(String name, int id, Object states) {
		this.name = name;
		this.id = id;
		this.states = states;
	}

	public ResponseCountries() {
	}

	private int id;
	private Object states;

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

	public void setStates(Object states){
		this.states = states;
	}

	public Object getStates(){
		return states;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",states = '" + states + '\'' + 
			"}";
		}
}
