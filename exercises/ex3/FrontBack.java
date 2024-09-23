class FrontBack {
	public static void main(String[] args){
		String s = "FrontBack";
		if(args.length > 0){
			s = args[0];
		}
		System.out.println(s.charAt(s.length()-1) + s.substring(1, s.length()-1) + s.charAt(0));
	}
}  
