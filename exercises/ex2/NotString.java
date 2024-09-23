class NotString {
	public static void main(String[] args){
		String s = "semicolon";
		System.out.println((s.contains("not")) ? s : "not " + s);
		s = "not semicolon";
		System.out.println((s.contains("not")) ? s : "not " + s);
	}
}
