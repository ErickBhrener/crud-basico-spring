package npi.contatos.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The data tables response.
 * @author inder
 */
public class DataTableResponse <T> implements Serializable {

	private String sEcho;

	/*
	 * Total number of records
	 */
	private int iTotalRecords;
	
	/*
	 * Total number of records after filtering. We are not filtering but datatables expects this parameter 
	 */
	private int  iTotalDisplayRecords;
	
        /*
	 * Datasource.
	 * By default, DataTables will expect a 2D array for its data source. However, Using the 'aoColumns' parameter 
	 * in the datatables call we can map properties to columns
	 * Flexjson converts the list of returned objects into a json objects array.
	 */
	private List<T> aaData;
	
	private String sColumns;

    public DataTableResponse() {
    }

    public DataTableResponse(String sEcho, int iTotalRecords, int iTotalDisplayRecords,
			List<T> aaData, String sColumns) {
		super();
		this.sEcho = sEcho;
		this.iTotalRecords = iTotalRecords;
		this.iTotalDisplayRecords = iTotalDisplayRecords;
		this.aaData = aaData;
		this.sColumns = sColumns;
	}

	public String getsEcho() {
		return sEcho;
	}

	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}

	public int getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public int getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}

	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}

	public List<T> getAaData() {
		return aaData;
	}

	public void setAaData(List<T> aaData) {
		this.aaData = aaData;
	}

	public String getsColumns() {
		return sColumns;
	}

	public void setsColumns(String sColumns) {
		this.sColumns = sColumns;
	}

	@Override
	public String toString() {
		return "DataTableResponse [sEcho=" + sEcho + ", iTotalRecords=" + iTotalRecords + ", iTotalDisplayRecords="
				+ iTotalDisplayRecords + ", aaData=" + aaData + ", sColumns=" + sColumns + "]";
	}
    
	  
}