package app;

/**
 * @author Fabio Jaenecke (Unisys (Schweiz) GmbH)
 * @version 1.0
 *
 */
public class TestSuite {
	private String testrailString;
	private String testrailPath = "C:/documents.txt";

	public TestSuite() {
	}

	public String getTestrailPath() {
		return testrailPath;
	}

	public void setTestrailPath(String testrailPath) {
		this.testrailPath = testrailPath;
	}
	
	public String getTestrailString() {
		return testrailString;
	}

	public void setTestrailString(String testrailString) {
		this.testrailString = testrailString;
	}

}
