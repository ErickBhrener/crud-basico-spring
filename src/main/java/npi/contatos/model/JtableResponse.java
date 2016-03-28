package npi.contatos.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;




public class JtableResponse<T> implements Serializable {

	@JsonProperty("Result")
    private String result;

    @JsonProperty("Records")
    private List<T> records;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("TotalRecordCount")
    private int totalRecordCount;

    
    public JtableResponse() {
		super();
	}

	public JtableResponse(String result, List<T> records, int totalRecordCount) {
        super();
        this.result = result;
        this.records = records;
        this.totalRecordCount = totalRecordCount;
    }

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getTotalRecordCount() {
		return totalRecordCount;
	}

	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}
    

}