package encapsulamento;

public class GettersSetters {

	private int varInt;

	private Integer varInteger;

	private long varlong;

	private Long varLong;

	private String varArrayString[];

	// Metodos Get e Set
	public void setVarInt(int varInt) {

		this.varInt = varInt;
	}

	public int getVarInt() {

		return varInt;
	}

	public void setVarInteger(Integer varInteger) {

		this.varInteger = varInteger;
	}

	public Integer getVarInteger() {

		return varInteger;
	}

	// automaticos
	public long getVarlong() {
		return varlong;
	}

	public void setVarlong(long varlong) {
		this.varlong = varlong;
	}

	public Long getVarLong() {
		return varLong;
	}

	public void setVarLong(Long varLong) {
		this.varLong = varLong;
	}

	public String[] getVarArrayString() {
		return varArrayString;
	}

	public void setVarArrayString(String[] varArrayString) {
		this.varArrayString = varArrayString;
	}

}
