public class Files {
	public static void main(String[] args) throws Exception {
		
		BufferedReader add1 = null;
		//BufferedReader temp1 = null;
		
		add1 = new BufferedReader(new FileReader("NewFiles.text"));
		
		//FileWriter outFile = new FileWriter("NewText.txt");
		//BufferedWriter outStream = new BufferedWriter(outFile);
		
		List<String> list1 = new ArrayList<String> ();
		