package pojos;

import java.util.List;

public class ResponseStates{
	private List<ResponseStatesItem> responseStates;

	public void setResponseStates(List<ResponseStatesItem> responseStates){
		this.responseStates = responseStates;
	}

	public List<ResponseStatesItem> getResponseStates(){
		return responseStates;
	}

	public ResponseStates() {
	}

	public ResponseStates(List<ResponseStatesItem> responseStates) {
		this.responseStates = responseStates;
	}

	@Override
 	public String toString(){
		return 
			"ResponseStates{" + 
			"responseStates = '" + responseStates + '\'' + 
			"}";
		}
}