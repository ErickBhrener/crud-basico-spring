package npi.contatos.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * {
 *  "sEcho":1,
 *  "iColumns":7,
 *  "sColumns":"",
 *  "iDisplayStart":0,
 *  "iDisplayLength":10,
 *  "amDataProp":[0,1,2,3,4,5,6],
 *  "sSearch":"",
 *  "bRegex":false,
 *  "asSearch":["","","","","","",""],
 *  "abRegex":[false,false,false,false,false,false,false],
 *  "abSearchable":[true,true,true,true,true,true,true],
 *  "iSortingCols":1,
 *  "aiSortCol":[0],
 *  "asSortDir":["asc"],
 *  "abSortable":[true,true,true,true,true,true,true]
 * }
 *
 * @author inder
 */
public class DataTableRequest<T> implements Serializable{

	public int sEcho;
    public int iColumns;
    public String sColumns;
    public int iDisplayStart;
    public int iDisplayLength;
    public List<String> amDataProp;
    public String sSearch;
    public List<String> asSearch;
    public boolean bRegex;
    public List<Boolean> abRegex;
    public List<Boolean> abSearchable;
    public int iSortingCols;
    public List<Integer> aiSortCol;
    public List<String> asSortDir;
    public List<Boolean> abSortable;
    public String sRangeSeparator;
    public T searchObj;
    public Object extraData;
	public int getsEcho() {
		return sEcho;
	}
	public void setsEcho(int sEcho) {
		this.sEcho = sEcho;
	}
	public int getiColumns() {
		return iColumns;
	}
	public void setiColumns(int iColumns) {
		this.iColumns = iColumns;
	}
	public String getsColumns() {
		return sColumns;
	}
	public void setsColumns(String sColumns) {
		this.sColumns = sColumns;
	}
	public int getiDisplayStart() {
		return iDisplayStart;
	}
	public void setiDisplayStart(int iDisplayStart) {
		this.iDisplayStart = iDisplayStart;
	}
	public int getiDisplayLength() {
		return iDisplayLength;
	}
	public void setiDisplayLength(int iDisplayLength) {
		this.iDisplayLength = iDisplayLength;
	}
	public List<String> getAmDataProp() {
		return amDataProp;
	}
	public void setAmDataProp(List<String> amDataProp) {
		this.amDataProp = amDataProp;
	}
	public String getsSearch() {
		return sSearch;
	}
	public void setsSearch(String sSearch) {
		this.sSearch = sSearch;
	}
	public List<String> getAsSearch() {
		return asSearch;
	}
	public void setAsSearch(List<String> asSearch) {
		this.asSearch = asSearch;
	}
	public boolean isbRegex() {
		return bRegex;
	}
	public void setbRegex(boolean bRegex) {
		this.bRegex = bRegex;
	}
	public List<Boolean> getAbRegex() {
		return abRegex;
	}
	public void setAbRegex(List<Boolean> abRegex) {
		this.abRegex = abRegex;
	}
	public List<Boolean> getAbSearchable() {
		return abSearchable;
	}
	public void setAbSearchable(List<Boolean> abSearchable) {
		this.abSearchable = abSearchable;
	}
	public int getiSortingCols() {
		return iSortingCols;
	}
	public void setiSortingCols(int iSortingCols) {
		this.iSortingCols = iSortingCols;
	}
	public List<Integer> getAiSortCol() {
		return aiSortCol;
	}
	public void setAiSortCol(List<Integer> aiSortCol) {
		this.aiSortCol = aiSortCol;
	}
	public List<String> getAsSortDir() {
		return asSortDir;
	}
	public void setAsSortDir(List<String> asSortDir) {
		this.asSortDir = asSortDir;
	}
	public List<Boolean> getAbSortable() {
		return abSortable;
	}
	public void setAbSortable(List<Boolean> abSortable) {
		this.abSortable = abSortable;
	}
	public String getsRangeSeparator() {
		return sRangeSeparator;
	}
	public void setsRangeSeparator(String sRangeSeparator) {
		this.sRangeSeparator = sRangeSeparator;
	}
	public T getSearchObj() {
		return searchObj;
	}
	public void setSearchObj(T searchObj) {
		this.searchObj = searchObj;
	}
	public Object getExtraData() {
		return extraData;
	}
	public void setExtraData(Object extraData) {
		this.extraData = extraData;
	}
	@Override
	public String toString() {
		return "DataTableRequest [sEcho=" + sEcho + ", iColumns=" + iColumns + ", sColumns=" + sColumns
				+ ", iDisplayStart=" + iDisplayStart + ", iDisplayLength=" + iDisplayLength + ", amDataProp="
				+ amDataProp + ", sSearch=" + sSearch + ", asSearch=" + asSearch + ", bRegex=" + bRegex + ", abRegex="
				+ abRegex + ", abSearchable=" + abSearchable + ", iSortingCols=" + iSortingCols + ", aiSortCol="
				+ aiSortCol + ", asSortDir=" + asSortDir + ", abSortable=" + abSortable + ", sRangeSeparator="
				+ sRangeSeparator + ", searchObj=" + searchObj + ", extraData=" + extraData + "]";
	}
    
	   
}