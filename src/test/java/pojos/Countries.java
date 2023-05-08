package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Countries {
	private String name;

	public Countries(int id, String name, Object states) {
		this.id = id;
		this.name = name;
		this.states = states;
	}

	public Countries() {
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
					"id = '" + id + '\'' +
					",name = '" + name + '\'' +
					",states = '" + states + '\'' +
					"}";
		}
}
